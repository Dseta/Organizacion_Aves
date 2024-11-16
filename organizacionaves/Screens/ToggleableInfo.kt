package com.example.organizacionaves.Screens

import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier

data class ToggleableInfo(
    var isChecked: Boolean,
    val radioButtonNumber: Int
)

data class CheckBoxToggleableInfo(
    var isChecked: Boolean,
    val checkBoxNumber: Int
)

data class BloqueDePreguntasData(
    val modifier: Modifier = Modifier,
    val title: String,
    val radioButtonsText: List<String>? = emptyList(),
    val textFieldText: Int?,
    val positionTextField: Int?,
    val radioButtonsList: SnapshotStateList<ToggleableInfo>?,
    val sugerenciaDeRespuestaOutlineTextField: String?,
    val isThisQuestionTheCheckBoxOne: Boolean,
    val checkBoxes: SnapshotStateList<CheckBoxToggleableInfo>?,
    val indexToUpdate: Int? = null,
    val isThisSeccionComida: Boolean = false,
    val secondPositionTextField: Int? = null,
)