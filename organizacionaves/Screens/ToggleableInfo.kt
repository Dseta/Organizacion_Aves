package com.example.organizacionaves.Screens

data class ToggleableInfo(
    val isChecked: Boolean,
    val radioButtonNumber: Int
)

data class CheckBoxToggleableInfo(
    var isChecked: Boolean,
    val checkBoxNumber: Int
)
