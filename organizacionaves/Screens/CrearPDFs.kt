@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.organizacionaves.Screens

import android.Manifest
import android.annotation.SuppressLint
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("StateFlowValueCalledInComposition")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaPDF(
    viewModel: CrearPDFViewModel,
    permisosViewModel: PermisosViewModel,
    navegarBackStack: () -> Unit
) {

    val context = LocalContext.current
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    var showDialog by remember { mutableStateOf(false) }
    var preguntaNoTerminada by remember { mutableStateOf("") }

    val verdePastel: Color = Color(android.graphics.Color.parseColor("#baffc9"))
    val amarilloPastel: Color = Color(android.graphics.Color.parseColor("#f0eac5"))
    val azulPastel: Color = Color(android.graphics.Color.parseColor("#83c4d4"))
    val moradoPastel: Color = Color(android.graphics.Color.parseColor("#bccaeb"))

    val preguEscritas = Preguntas_Base().obtenerPreguntasEscritas()
    val seccionComida = Preguntas_Base().obtenerPreguntasAlimentacion()
    val pregOpMult = Preguntas_Base().obtenerPreguntasMultiples()
    val respuestasMult = Preguntas_Base().obtenerRespuestasMultiples()

    val listaRespuestaParaImprimir = remember {
        mutableStateListOf<String>()
    }

    val radioButtonsList1 = remember { (viewModel.radioButtonsState1) }
    val radioButtonsList2 = remember { (viewModel.radioButtonsState2) }
    val radioButtonsList3 = remember { (viewModel.radioButtonsState3) }
    val radioButtonsList4 = remember { (viewModel.radioButtonsState4) }
    val radioButtonsList5 = remember { (viewModel.radioButtonsState5) }
    val radioButtonsList6 = remember { (viewModel.radioButtonsState6) }
    val radioButtonsList7 = remember { (viewModel.radioButtonsState7) }
    val radioButtonsList8 = remember { (viewModel.radioButtonsState8) }

    val checkBoxList = remember { (viewModel.checkBoxState) }

    val listaRadioButtons = mutableListOf(
        radioButtonsList1,
        radioButtonsList2,
        radioButtonsList3,
        radioButtonsList4,
        radioButtonsList5,
        radioButtonsList6,
        radioButtonsList7,
        radioButtonsList8
    )

    val modifierBoxesVerdePastel = Modifier
        .clip(RoundedCornerShape(15.dp))
        .background(MaterialTheme.colorScheme.primaryContainer)
        .fillMaxWidth(.95f)

    val modifierBoxesAmarilloPastel = Modifier
        .clip(RoundedCornerShape(15.dp))
        .background(MaterialTheme.colorScheme.secondaryContainer)
        .fillMaxWidth(.95f)

    val modifierBoxesMoradoPastel = Modifier
        .clip(RoundedCornerShape(15.dp))
        .background(MaterialTheme.colorScheme.tertiaryContainer)
        .fillMaxWidth(.95f)

    val modifierBoxesAzulPastel = Modifier
        .clip(RoundedCornerShape(15.dp))
        .background(MaterialTheme.colorScheme.surface)
        .fillMaxWidth(.95f)

    val listaComposableDeCuadros = listOf(
        BloqueDePreguntasData(
            modifier = modifierBoxesMoradoPastel,
            title = preguEscritas[0],
            radioButtonsText = null,
            textFieldText = 0,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesMoradoPastel,
            title = preguEscritas[1],
            radioButtonsText = null,
            textFieldText = 1,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesMoradoPastel,
            title = preguEscritas[2],
            radioButtonsText = null,
            textFieldText = 2,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesMoradoPastel,
            title = preguEscritas[3],
            radioButtonsText = null,
            textFieldText = 3,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesMoradoPastel,
            title = preguEscritas[4],
            radioButtonsText = null,
            textFieldText = 4,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesMoradoPastel,
            title = preguEscritas[5],
            radioButtonsText = null,
            textFieldText = 5,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesMoradoPastel,
            title = preguEscritas[6],
            radioButtonsText = null,
            textFieldText = 6,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesMoradoPastel,
            title = preguEscritas[7],
            radioButtonsText = null,
            textFieldText = 7,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesMoradoPastel,
            title = preguEscritas[8],
            radioButtonsText = null,
            textFieldText = 8,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        // Seccion de comida
        BloqueDePreguntasData(
            modifier = modifierBoxesAmarilloPastel,
            title = seccionComida[0],
            radioButtonsText = null,
            textFieldText = 9,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null,
            isThisSeccionComida = true,
            secondPositionTextField = 10

        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAmarilloPastel,
            title = seccionComida[1],
            radioButtonsText = null,
            textFieldText = 11,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null,
            isThisSeccionComida = true,
            secondPositionTextField = 12
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAmarilloPastel,
            title = seccionComida[2],
            radioButtonsText = null,
            textFieldText = 13,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null,
            isThisSeccionComida = true,
            secondPositionTextField = 14
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAmarilloPastel,
            title = seccionComida[3],
            radioButtonsText = null,
            textFieldText = 15,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null,
            isThisSeccionComida = true,
            secondPositionTextField = 16
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAmarilloPastel,
            title = seccionComida[4],
            radioButtonsText = null,
            textFieldText = 17,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null,
            isThisSeccionComida = true,
            secondPositionTextField = 18
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAmarilloPastel,
            title = seccionComida[5],
            radioButtonsText = null,
            textFieldText = 19,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null,
            isThisSeccionComida = true,
            secondPositionTextField = 20
        ),
        // Seccion preguntas opcion multiple
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[9],
            radioButtonsText = null,
            textFieldText = 21,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = pregOpMult[0],
            radioButtonsText = respuestasMult[0],
            textFieldText = null,
            positionTextField = null,
            radioButtonsList = listaRadioButtons[0],
            sugerenciaDeRespuestaOutlineTextField = null,
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = pregOpMult[1],
            radioButtonsText = respuestasMult[1],
            textFieldText = null,
            positionTextField = null,
            radioButtonsList = listaRadioButtons[1],
            sugerenciaDeRespuestaOutlineTextField = null,
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[10],
            radioButtonsText = null,
            textFieldText = 22,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[11],
            radioButtonsText = null,
            textFieldText = 23,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = pregOpMult[2],
            radioButtonsText = respuestasMult[2],
            textFieldText = 24,
            positionTextField = 0,
            radioButtonsList = listaRadioButtons[2],
            sugerenciaDeRespuestaOutlineTextField = "Cuáles?",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null,
            indexToUpdate = 24
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = pregOpMult[3],
            radioButtonsText = respuestasMult[3],
            textFieldText = null,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = null,
            isThisQuestionTheCheckBoxOne = true,
            checkBoxes = checkBoxList
        ),
        BloqueDePreguntasData( ///////////////////////////
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[12],
            radioButtonsText = null,
            textFieldText = 25,
            positionTextField = 0,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null,
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = pregOpMult[4],
            radioButtonsText = respuestasMult[4],
            textFieldText = 26,
            positionTextField = 0,
            radioButtonsList = listaRadioButtons[3],
            sugerenciaDeRespuestaOutlineTextField = "¿Cuanto tiempo?",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null,
            indexToUpdate = 26
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = pregOpMult[5],
            radioButtonsText = respuestasMult[5],
            textFieldText = 27,
            positionTextField = 0,
            radioButtonsList = listaRadioButtons[4],
            sugerenciaDeRespuestaOutlineTextField = "Frecuencia",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null,
            indexToUpdate = 27
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[13],
            radioButtonsText = null,
            textFieldText = 28,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[14],
            radioButtonsText = null,
            textFieldText = 29,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[15],
            radioButtonsText = null,
            textFieldText = 30,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[16],
            radioButtonsText = null,
            textFieldText = 31,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[17],
            radioButtonsText = null,
            textFieldText = 32,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[18],
            radioButtonsText = null,
            textFieldText = 33,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[19],
            radioButtonsText = null,
            textFieldText = 34,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[20],
            radioButtonsText = null,
            textFieldText = 35,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[21],
            radioButtonsText = null,
            textFieldText = 36,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[22],
            radioButtonsText = null,
            textFieldText = 37,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = preguEscritas[23],
            radioButtonsText = null,
            textFieldText = 38,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesVerdePastel,
            title = pregOpMult[6],
            radioButtonsText = respuestasMult[6],
            textFieldText = 39,
            positionTextField = 0,
            radioButtonsList = listaRadioButtons[5],
            sugerenciaDeRespuestaOutlineTextField = "¿Cuáles y que dosis?",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null,
            indexToUpdate = 39
        ),
        //Seccion solo para el doctor

        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = preguEscritas[24],
            radioButtonsText = null,
            textFieldText = 40,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = preguEscritas[25],
            radioButtonsText = null,
            textFieldText = 41,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = preguEscritas[26],
            radioButtonsText = null,
            textFieldText = 42,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = preguEscritas[27],
            radioButtonsText = null,
            textFieldText = 43,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = preguEscritas[28],
            radioButtonsText = null,
            textFieldText = 44,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = preguEscritas[29],
            radioButtonsText = null,
            textFieldText = 45,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = preguEscritas[30],
            radioButtonsText = null,
            textFieldText = 46,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = preguEscritas[31],
            radioButtonsText = null,
            textFieldText = 47,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = preguEscritas[32],
            radioButtonsText = null,
            textFieldText = 48,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = preguEscritas[33],
            radioButtonsText = null,
            textFieldText = 49,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = preguEscritas[34],
            radioButtonsText = null,
            textFieldText = 50,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = preguEscritas[35],
            radioButtonsText = null,
            textFieldText = 51,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "Respuesta",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = pregOpMult[7],
            radioButtonsText = respuestasMult[7],
            textFieldText = null,
            positionTextField = null,
            radioButtonsList = listaRadioButtons[6],
            sugerenciaDeRespuestaOutlineTextField = null,
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = "Manejos:",
            radioButtonsText = null,
            textFieldText = 52,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
        BloqueDePreguntasData(
            modifier = modifierBoxesAzulPastel,
            title = "Notas:",
            radioButtonsText = null,
            textFieldText = 53,
            positionTextField = null,
            radioButtonsList = null,
            sugerenciaDeRespuestaOutlineTextField = "",
            isThisQuestionTheCheckBoxOne = false,
            checkBoxes = null
        ),
    )

    val writePermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission(),
        onResult = { isGranted ->
            permisosViewModel.onPermissionResult(
                permission = Manifest.permission.WRITE_EXTERNAL_STORAGE,
                isGranted = isGranted
            )
        }
    )

    val readPermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission(),
        onResult = { isGranted ->
            permisosViewModel.onPermissionResult(
                permission = Manifest.permission.READ_EXTERNAL_STORAGE,
                isGranted = isGranted
            )
        }
    )

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection),
            //containerColor = verde_agua,
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Llenar Historia Clinica")
                },
                navigationIcon = {
                    IconButton(onClick = {
                        navegarBackStack()
                    }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Regresar"
                        )
                    }

                },
                actions = {
                    IconButton(onClick = {
                        writePermissionLauncher.launch(
                            Manifest.permission.WRITE_EXTERNAL_STORAGE
                        )
                        readPermissionLauncher.launch(
                            Manifest.permission.READ_EXTERNAL_STORAGE
                        )
                        //Ciclar a travez de la lista de preguntas
                        val (variable, pregunta) = comprobarTextFields(viewModel,preguEscritas,seccionComida)
                        preguntaNoTerminada = pregunta ?: ""

                        if (!variable) {
                            showDialog = true
                        }
                        else{
                            GeneradorPDF(context, viewModel, listaRespuestaParaImprimir)
                        }

                    }) {
                        Icon(
                            imageVector = Icons.Default.Done,
                            contentDescription = "Concluir el llenado"
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        }

    ) {
        AlertaContinuar(
            showDialog = showDialog,
            onDismiss = { showDialog = false },
            onContinue = {
                showDialog = false
                // Lógica para continuar de todos modos
                GeneradorPDF(context, viewModel, listaRespuestaParaImprimir)
            },
            text = "La pregunta "+ preguntaNoTerminada + ". No ha sido llenada ¿Deseas continuar?"
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
                //.padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            items(listaComposableDeCuadros) { bloque ->

                BloqueDePreguntas(
                    modifier = bloque.modifier,
                    title = bloque.title,
                    radioButtonsText = bloque.radioButtonsText,
                    textFieldText = bloque.textFieldText,
                    positionTextField = bloque.positionTextField,
                    radioButtonsList = bloque.radioButtonsList,
                    sugerenciaDeRespuestaOutlineTextField = bloque.sugerenciaDeRespuestaOutlineTextField,
                    isThisQuestionTheCheckBoxOne = bloque.isThisQuestionTheCheckBoxOne,
                    checkBoxes = bloque.checkBoxes,
                    viewModel = viewModel,
                    isThisSeccionComida = bloque.isThisSeccionComida,
                    secondPositionTextField = bloque.secondPositionTextField
                )
            }

            item{
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(MaterialTheme.colorScheme.tertiaryContainer)
                        .fillMaxWidth(.95f)
                ){
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ){
                        Text(text = "Agregar fotos para el PDF",
                            modifier = Modifier.padding(8.dp))

                        PictureSelector(crearPDFViewModel = viewModel)
                        Spacer(modifier = Modifier.padding(8.dp))
                    }
                }

                //Spacer(modifier = Modifier.padding(16.dp))

            }

        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}

fun comprobarTextFields(
    crearPDFViewModel: CrearPDFViewModel,
    preguEscritas: List<String>,
    seccionComida: List<String>,
): Pair<Boolean, String?> {
    val anyChecked = crearPDFViewModel.checkBoxState.any { it.isChecked }

    //Seccion de preguntas 1
    for (i in 0..8) {
        if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
            return Pair(false, preguEscritas[i])
        }
    }

    for (i in 9..20) {
        if (i == 9 || i == 10) {
            val question = 0
            if (i % 2 == 1) {
                if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
                    return Pair(false, seccionComida[question])
                }
            }
            if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
                return Pair(false, "Consumo diario (%) de " + seccionComida[question])
            }
        }
        if (i == 11 || i == 12) {
            val question = 1
            if (i % 2 == 1) {
                if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
                    return Pair(false, seccionComida[question])
                }
            }
            if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
                return Pair(false, "Consumo diario (%) de " + seccionComida[question])
            }
        }
        if (i == 13 || i == 14) {
            val question = 2
            if (i % 2 == 1) {
                if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
                    return Pair(false, seccionComida[question])
                }
            }
            if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
                return Pair(false, "Consumo diario (%) de " + seccionComida[question])
            }
        }
        if (i == 15 || i == 16) {
            val question = 3
            if (i % 2 == 1) {
                if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
                    return Pair(false, seccionComida[question])
                }
            }
            if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
                return Pair(false, "Consumo diario (%) de " + seccionComida[question])
            }
        }
        if (i == 17 || i == 18) {
            val question = 4
            if (i % 2 == 1) {
                if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
                    return Pair(false, seccionComida[question])
                }
            }
            if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
                return Pair(false, "Consumo diario (%) de " + seccionComida[question])
            }
        }
        if (i == 19 || i == 20) {
            val question = 5
            if (i % 2 == 1) {
                if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
                    return Pair(false, seccionComida[question])
                }
            }
            if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
                return Pair(false, "Consumo diario (%) de " + seccionComida[question])
            }
        }

    }

    for (i in 21..23) {
        if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true) {
            return Pair(false, preguEscritas[i - 12])
        }
    }

    if (
        crearPDFViewModel.radioButtonsState3[0].isChecked &&
        crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(24)?.isEmpty() == true
    ){
        return Pair(false, "Cuales Plantas")
    }

    if (anyChecked) {
        if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(25)?.isEmpty() == true){
            return Pair(false, preguEscritas[12])
        }
    }

    if (
        crearPDFViewModel.radioButtonsState4[0].isChecked &&
        crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(26)?.isEmpty() == true
    ){
        return Pair(false, "Cuanto tiempo toma el sol")
    }

    if (
        crearPDFViewModel.radioButtonsState5[0].isChecked &&
        crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(27)?.isEmpty() == true
    ){
        return Pair(false, "Frecuencia que se baña")
    }

    for (i in 28..38){
        if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true){
            return Pair(false, preguEscritas[i-15])
        }
    }

    if (
        crearPDFViewModel.radioButtonsState6[0].isChecked &&
        crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(39)?.isEmpty() == true
    ){
        return Pair(false, "Cuales medicamentos y que dosis")
    }

    for (i in 40..52){
        if (i<= 51){
            if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true){
                return Pair(false, preguEscritas[i-16])
            }
        }
        if (crearPDFViewModel.arregloCuadrosTexto.value.getOrNull(i)?.isEmpty() == true){
            return Pair(false, "Manejos")
        }
    }
    return Pair(true, null)
}

@Composable
fun BloqueDePreguntas(
    modifier: Modifier = Modifier,
    title: String,
    radioButtonsText: List<String>? = emptyList(),
    textFieldText: Int?,
    positionTextField: Int?,
    radioButtonsList: SnapshotStateList<ToggleableInfo>?,
    sugerenciaDeRespuestaOutlineTextField: String?,
    isThisQuestionTheCheckBoxOne: Boolean,
    checkBoxes: SnapshotStateList<CheckBoxToggleableInfo>?,
    viewModel: CrearPDFViewModel,
    indexToUpdate: Int? = null,
    isThisSeccionComida: Boolean = false,
    secondPositionTextField: Int? = null,
) {
    val textFieldValue by viewModel.arregloCuadrosTexto.collectAsState()
    val textFieldValue2 by viewModel.arregloCuadrosTexto.collectAsState()

    val textFieldKey = remember(textFieldText, radioButtonsList?.getOrNull(0)?.isChecked) {
        mutableStateOf(textFieldValue.getOrNull(textFieldText ?: 0) ?: "")
    }

    val checkboxStates = checkBoxes
    val listSize = radioButtonsText?.size

    Box(modifier = modifier) {
        Column(
            modifier = Modifier.padding(start = 8.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                modifier = Modifier
                    .padding(start = 16.dp)
                    .padding(bottom = 8.dp)
                    .padding(top = 16.dp),
                fontSize = 18.sp
            )
            if(isThisSeccionComida){
                if (sugerenciaDeRespuestaOutlineTextField != null) {
                    BloqueSeccionComida(
                        texto1 = textFieldValue[textFieldText!!],
                        onTextoChange1 = {
                            val updatedList =viewModel.arregloCuadrosTexto.value.toMutableList()
                            updatedList[textFieldText] = it
                            viewModel.updateArregloCuadrosTexto(updatedList)
                        },
                        etiqueta = sugerenciaDeRespuestaOutlineTextField,
                        texto2 = textFieldValue2[secondPositionTextField!!],
                        onTextoChange2 = {
                            val updatedList =viewModel.arregloCuadrosTexto.value.toMutableList()
                            updatedList[secondPositionTextField] = it
                            viewModel.updateArregloCuadrosTexto(updatedList)
                        }
                    )
                }
            }
            else{
                Column(verticalArrangement =  Arrangement.Center) {
                    if (radioButtonsText != null) {
                        for(it in 0 until listSize!!) {
                            Row(horizontalArrangement = Arrangement.Center) {
                                if (isThisQuestionTheCheckBoxOne) {
                                    BloqueSeccionCheckbox(
                                        texto = radioButtonsText[it],
                                        checkBox = checkboxStates?.get(it) ?:
                                        CheckBoxToggleableInfo(isChecked = false, checkBoxNumber = -1),
                                        onCheckBoxChange = { isChecked ->
                                            val updatedItem = checkboxStates?.get(it)?.copy(isChecked = isChecked)
                                            if (updatedItem != null) {
                                                checkboxStates[it] = updatedItem
                                            }
                                        }
                                    )

                                } else {
                                    if (radioButtonsList != null && it <radioButtonsList.size) {
                                        val radioButton = radioButtonsList[it]
                                        val isEnabled = radioButton.isChecked

                                        SeccionRadioButton(
                                            texto = radioButtonsText[it],
                                            selected = radioButton.isChecked,
                                            onClick = {
                                                radioButtonsList.replaceAll { select ->
                                                select.copy(
                                                    isChecked = select.radioButtonNumber == radioButton.radioButtonNumber
                                                )
                                                }
                                            }
                                        )

                                        if (positionTextField != null && it == positionTextField && textFieldText != null) {
                                            if (sugerenciaDeRespuestaOutlineTextField != null) {
                                                RadioButtonTextField(
                                                    value = textFieldKey,
                                                    onValueChange = {
                                                        textFieldKey.value = it
                                                        val updatedList = viewModel.arregloCuadrosTexto.value.toMutableList()
                                                        updatedList[textFieldText] = it
                                                        viewModel.updateArregloCuadrosTexto(updatedList)
                                                    },
                                                    label = sugerenciaDeRespuestaOutlineTextField,
                                                    isEnabled = isEnabled,
                                                    onLaunchedEffect = {
                                                        val updatedList = viewModel.arregloCuadrosTexto.value.toMutableList()
                                                        if (indexToUpdate != null && indexToUpdate < updatedList.size) {
                                                            updatedList[indexToUpdate] = ""
                                                            viewModel.updateArregloCuadrosTexto(updatedList)
                                                        }
                                                    }
                                                )

                                            }
                                        }

                                    }
                                }
                            }
                            if (it < listSize-1){
                                HorizontalDivider(
                                    thickness = 2.dp,
                                    modifier = Modifier.padding(16.dp),
                                    color = MaterialTheme.colorScheme.onPrimaryContainer
                                )
                            }

                        }
                    } else if (textFieldText != null) {
                        if (sugerenciaDeRespuestaOutlineTextField != null) {
                            OutlinedTextFieldSolo(
                                texto1 = textFieldValue[textFieldText],
                                onTextoChange1 = {
                                    val updatedList =viewModel.arregloCuadrosTexto.value.toMutableList()
                                    updatedList[textFieldText] = it
                                    viewModel.updateArregloCuadrosTexto(updatedList)
                                },
                                etiqueta = sugerenciaDeRespuestaOutlineTextField,
                            )
                        }

                    }
                }
            }
            Spacer(modifier = Modifier.padding(8.dp))
        }
    }
    Spacer(modifier = Modifier.padding(16.dp))
}

@Composable
fun BloqueSeccionComida(
    modifier: Modifier = Modifier,
    texto1: String,
    onTextoChange1: (String) -> Unit,
    etiqueta: String,
    texto2: String,
    onTextoChange2: (String) -> Unit,
) {
    OutlinedTextField(
        value = texto1,
        onValueChange = onTextoChange1,
        label = {
            Text(text = etiqueta)
        },
        singleLine = false,
        modifier = Modifier.padding(end = 8.dp),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Next
        )
    )
    Text(
        text = "Consumo Diario (%)",
        modifier = Modifier
            .padding(start = 16.dp)
            .padding(bottom = 8.dp)
            .padding(top = 16.dp),
        fontSize = 18.sp
    )
    OutlinedTextField(
        value = texto2,
        onValueChange = onTextoChange2,
        label = {
            Text(text = "Respuesta")
        },
        singleLine = false,
        modifier = Modifier.padding(end = 8.dp),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Next
        )
    )
}

@Composable
fun BloqueSeccionCheckbox(
    modifier: Modifier = Modifier,
    texto: String,
    checkBox: CheckBoxToggleableInfo,
    onCheckBoxChange: (Boolean) -> Unit,
    ) {

    Text(
        text = texto,
        modifier = Modifier.padding(16.dp)
    )

    Checkbox(
        checked = checkBox.isChecked,
        onCheckedChange = { isChecked -> onCheckBoxChange(isChecked) }
    )


}

@Composable
fun RadioButtonTextField(
    modifier: Modifier = Modifier,
    value: MutableState<String>,
    onValueChange: (String) -> Unit,
    label: String,
    isEnabled: Boolean,
    onLaunchedEffect: () -> Unit
    ) {
    OutlinedTextField(
        value = value.value,
        onValueChange = onValueChange,
        label = {
            Text(text = label)
        },
        singleLine = false,
        enabled = isEnabled,
        modifier = Modifier.padding(end = 8.dp),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Next
        )
    )

    // Side effect to clear the text field when disabled
    if (!isEnabled) {
        LaunchedEffect(isEnabled) {
            value.value = ""
            onLaunchedEffect()
        }
    }
}

@Composable
fun SeccionRadioButton(
    modifier: Modifier = Modifier,
    texto: String,
    selected: Boolean,
    onClick: () -> Unit,
) {
    Text(
        text = texto,
        modifier = Modifier.padding(16.dp)
    )
    RadioButton(
        selected = selected,
        onClick = onClick,
        modifier = Modifier.padding(top = 4.dp)
    )
}

@Composable
fun OutlinedTextFieldSolo(
    modifier: Modifier = Modifier,
    texto1: String,
    onTextoChange1: (String) -> Unit,
    etiqueta: String,
) {
    OutlinedTextField(
        value = texto1,
        onValueChange = onTextoChange1,
        label = {
            Text(etiqueta)
        },
        singleLine = false,
        modifier = Modifier.padding(end = 8.dp),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Next
        )
    )
}