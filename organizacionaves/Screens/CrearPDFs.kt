@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.organizacionaves.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaPDF(
    navController: NavController,
    viewModel: CrearPDFViewModel
) {

    val verde_Pastel: Color = Color(android.graphics.Color.parseColor("#baffc9"))
    val azul_oscuro: Color = Color(android.graphics.Color.parseColor("#0081a7"))
    val verde_agua: Color = Color(android.graphics.Color.parseColor("#00afb9"))
    val amarillo_Pastel: Color = Color(android.graphics.Color.parseColor("#f0eac5"))
    val azul_Pastel: Color = Color(android.graphics.Color.parseColor("#83c4d4"))
    val morado_Pastel: Color = Color(android.graphics.Color.parseColor("#bccaeb"))


    val preguEscritas = Preguntas_Base().obtenerPreguntasEscritas()
    val seccionComida = Preguntas_Base().obtenerPreguntasAlimentacion()
    val pregOpMult = Preguntas_Base().obtenerPreguntasMultiples()
    val respuestasMult = Preguntas_Base().obtenerRespuestasMultiples()


    val preguntasMult = remember { mutableStateListOf(PregMult() )}
    preguntasMult.addAll(List(9) { PregMult() })


    for(i in pregOpMult.indices){
        preguntasMult[i].quest = pregOpMult[i]
        preguntasMult[i].answrs.addAll(respuestasMult[i])

    }

    //Cambiar la lista creando 15 radio button states y agregandolos a la lista abajo
    val radioButtonsList1 = remember { (viewModel.radioButtonsState1) }
    val radioButtonsList2 = remember { (viewModel.radioButtonsState2) }
    val radioButtonsList3 = remember { (viewModel.radioButtonsState3) }
    val radioButtonsList4 = remember { (viewModel.radioButtonsState4) }
    val radioButtonsList5 = remember { (viewModel.radioButtonsState5) }
    val radioButtonsList6 = remember { (viewModel.radioButtonsState6) }
    val radioButtonsList7 = remember { (viewModel.radioButtonsState7) }
    val radioButtonsList8 = remember { (viewModel.radioButtonsState8) }
    val checkBoxList = remember { (viewModel.checkBoxState) }
    //radioButtonsList.addAll(List(15) { viewModel.radioButtonsState })

    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()


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
                        navController.popBackStack()
                    }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Regresar"
                        )
                    }

                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
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
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
                //.padding(start = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(9) {count ->
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(morado_Pastel)
                        .fillMaxWidth(.95f)

                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)

                    ) {
                        Text(
                            text = preguEscritas[count],
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp),
                            fontSize = 18.sp

                        )
                        OutlinedTextField(
                            value = viewModel.arregloCuadrosTexto[count],
                            onValueChange = {viewModel.arregloCuadrosTexto[count] = it},
                            label = { Text("Respuesta") },
                            singleLine = false,
                            modifier = Modifier.padding(end = 8.dp)
                        )
                        Spacer(modifier = Modifier.padding(8.dp))

                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))
            }

            items(6) {count ->

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(amarillo_Pastel)
                        .fillMaxWidth(.95f)

                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ) {
                        Text(
                            text = seccionComida[count],
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp),
                            fontSize = 18.sp

                        )
                        OutlinedTextField(
                            value = viewModel.arregloCuadrosTexto[count+9],
                            onValueChange = {viewModel.arregloCuadrosTexto[count+9] = it},
                            label = { Text("Consumo diario (%)") },
                            singleLine = false,
                            modifier = Modifier.padding(end = 8.dp)
                        )
                        Spacer(modifier = Modifier.padding(8.dp))

                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))
            }

            item {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(verde_Pastel)
                        .fillMaxWidth(.95f)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                            .fillMaxSize()
                    ) {
                        Text(
                            text = pregOpMult[0],
                            //modifier = Modifier.padding(5.dp),
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp)
                        )
                        LazyRow(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            item {
                                DisposableEffect(radioButtonsList1[3]) {
                                    onDispose {
                                        if (!radioButtonsList1[3].isChecked) {
                                            // Borrar el contenido del cuadro de texto
                                            viewModel.arregloCuadrosTexto[15] = ""
                                        }
                                    }
                                }
                                Text(
                                    text = respuestasMult[0][0],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList1[0].isChecked,
                                    onClick = {
                                        radioButtonsList1.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList1[0].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                                Text(
                                    text = respuestasMult[0][1],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList1[1].isChecked,
                                    onClick = {
                                        radioButtonsList1.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList1[1].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                                Text(
                                    text = respuestasMult[0][2],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList1[2].isChecked,
                                    onClick = {
                                        radioButtonsList1.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList1[2].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                                Text(
                                    text = respuestasMult[0][3],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList1[3].isChecked,
                                    onClick = {
                                        radioButtonsList1.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList1[3].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                                OutlinedTextField(
                                    value = viewModel.arregloCuadrosTexto[15],
                                    onValueChange = { text ->
                                        viewModel.arregloCuadrosTexto[15] = text
                                    },
                                    label = { Text("Respuesta") },
                                    singleLine = false,
                                    enabled = radioButtonsList1[3].isChecked,
                                    modifier = Modifier.padding(end = 8.dp)
                                )
                            }

                        }
                        Spacer(modifier = Modifier.padding(8.dp))
                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(verde_Pastel)
                        .fillMaxWidth(.95f)

                ){
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ){
                        Text(text = pregOpMult[1],
                            //modifier = Modifier.padding(5.dp),
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp)
                        )
                        LazyRow(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            items(3) {
                                Text(
                                    text = respuestasMult[1][it],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList2[it].isChecked,
                                    onClick = {
                                        radioButtonsList2.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList2[it].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                            }
                        }
                        //Spacer(modifier = Modifier.padding(8.dp))
                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(verde_Pastel)
                        .fillMaxWidth(.95f)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ) {
                        Text(text = preguntasMult[2].quest,
                            //modifier = Modifier.padding(5.dp),
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp)
                        )
                        LazyRow(verticalAlignment = Alignment.CenterVertically) {
                            item() {
                                DisposableEffect(radioButtonsList3[0]) {
                                    onDispose {
                                        if (!radioButtonsList3[0].isChecked) {
                                            // Borrar el contenido del cuadro de texto
                                            viewModel.arregloCuadrosTexto[18] = ""
                                        }
                                    }
                                }
                                Text(
                                    text = respuestasMult[2][0],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList3[0].isChecked,
                                    onClick = {
                                        radioButtonsList3.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList3[0].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                                OutlinedTextField(
                                    value = viewModel.arregloCuadrosTexto[18],
                                    onValueChange = { text ->
                                        viewModel.arregloCuadrosTexto[18] = text
                                    },
                                    label = { Text("¿Cuales?") },
                                    singleLine = false,
                                    enabled = radioButtonsList3[0].isChecked,
                                    modifier = Modifier.padding(end = 8.dp)
                                )
                                Text(
                                    text = respuestasMult[2][1],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList3[1].isChecked,
                                    onClick = {
                                        radioButtonsList3.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList3[1].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                            }

                        }
                        Spacer(modifier = Modifier.padding(8.dp))
                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(verde_Pastel)
                        .fillMaxWidth(.95f)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ) {
                        Text(
                            text = pregOpMult[3],
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp),
                            fontSize = 18.sp

                        )
                        LazyRow {
                            items(8) {
                                Text(
                                    text = respuestasMult[3][it],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                Checkbox(checked = checkBoxList[it].isChecked,
                                    onCheckedChange = { isChecked ->
                                        checkBoxList[it].isChecked = isChecked
                                })
                            }
                        }
                        //Spacer(modifier = Modifier.padding(8.dp))
                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(verde_Pastel)
                        .fillMaxWidth(.95f)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ) {
                        Text(text = preguntasMult[4].quest,
                            //modifier = Modifier.padding(5.dp),
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp)
                        )
                        LazyRow(verticalAlignment = Alignment.CenterVertically) {
                            item() {
                                DisposableEffect(radioButtonsList4[0]) {
                                    onDispose {
                                        if (!radioButtonsList4[0].isChecked) {
                                            // Borrar el contenido del cuadro de texto
                                            viewModel.arregloCuadrosTexto[19] = ""
                                        }
                                    }
                                }
                                Text(
                                    text = respuestasMult[4][0],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList4[0].isChecked,
                                    onClick = {
                                        radioButtonsList4.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList4[0].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                                OutlinedTextField(
                                    value = viewModel.arregloCuadrosTexto[19],
                                    onValueChange = { text ->
                                        viewModel.arregloCuadrosTexto[19] = text
                                    },
                                    label = { Text("¿De que tipo?") },
                                    singleLine = false,
                                    enabled = radioButtonsList4[0].isChecked,
                                    modifier = Modifier.padding(end = 8.dp)
                                )
                                Text(
                                    text = respuestasMult[4][1],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList4[1].isChecked,
                                    onClick = {
                                        radioButtonsList4.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList4[1].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                            }

                        }
                        Spacer(modifier = Modifier.padding(8.dp))
                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(verde_Pastel)
                        .fillMaxWidth(.95f)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ) {
                        Text(text = preguntasMult[5].quest,
                            //modifier = Modifier.padding(5.dp),
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp)
                        )
                        LazyRow(verticalAlignment = Alignment.CenterVertically) {
                            item() {
                                DisposableEffect(radioButtonsList5[0]) {
                                    onDispose {
                                        if (!radioButtonsList5[0].isChecked) {
                                            // Borrar el contenido del cuadro de texto
                                            viewModel.arregloCuadrosTexto[20] = ""
                                        }
                                    }
                                }
                                Text(
                                    text = respuestasMult[5][0],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList5[0].isChecked,
                                    onClick = {
                                        radioButtonsList5.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList5[0].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                                OutlinedTextField(
                                    value = viewModel.arregloCuadrosTexto[20],
                                    onValueChange = { text ->
                                        viewModel.arregloCuadrosTexto[20] = text
                                    },
                                    label = { Text("¿Cuanto tiempo?") },
                                    singleLine = false,
                                    enabled = radioButtonsList5[0].isChecked,
                                    modifier = Modifier.padding(end = 8.dp)
                                )
                                Text(
                                    text = respuestasMult[5][1],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList5[1].isChecked,
                                    onClick = {
                                        radioButtonsList5.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList5[1].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                            }

                        }
                        Spacer(modifier = Modifier.padding(8.dp))
                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(verde_Pastel)
                        .fillMaxWidth(.95f)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ) {
                        Text(text = preguntasMult[6].quest,
                            //modifier = Modifier.padding(5.dp),
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp)
                        )
                        LazyRow(verticalAlignment = Alignment.CenterVertically) {
                            item() {
                                DisposableEffect(radioButtonsList6[0]) {
                                    onDispose {
                                        if (!radioButtonsList6[0].isChecked) {
                                            // Borrar el contenido del cuadro de texto
                                            viewModel.arregloCuadrosTexto[21] = ""
                                        }
                                    }
                                }
                                Text(
                                    text = respuestasMult[6][0],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList6[0].isChecked,
                                    onClick = {
                                        radioButtonsList6.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList6[0].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                                OutlinedTextField(
                                    value = viewModel.arregloCuadrosTexto[21],
                                    onValueChange = { text ->
                                        viewModel.arregloCuadrosTexto[21] = text
                                    },
                                    label = { Text("Frecuencia") },
                                    singleLine = false,
                                    enabled = radioButtonsList6[0].isChecked,
                                    modifier = Modifier.padding(end = 8.dp)
                                )
                                Text(
                                    text = respuestasMult[6][1],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList6[1].isChecked,
                                    onClick = {
                                        radioButtonsList6.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList6[1].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                            }

                        }
                        Spacer(modifier = Modifier.padding(8.dp))
                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))
                //Aqui va la siguiente box
            }

            items(11) {count ->
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(verde_Pastel)
                        .fillMaxWidth(.95f)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ) {
                        Text(
                            text = preguEscritas[count+11],
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp),
                            fontSize = 18.sp

                        )
                        OutlinedTextField(
                            value = viewModel.arregloCuadrosTexto[count+22],
                            onValueChange = {viewModel.arregloCuadrosTexto[count+22] = it},
                            label = { Text("Respuesta") },
                            singleLine = false,
                            modifier = Modifier.padding(end = 8.dp)
                        )
                        Spacer(modifier = Modifier.padding(8.dp))

                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))
            }

            item{
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(verde_Pastel)
                        .fillMaxWidth(.95f)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ) {
                        Text(text = preguntasMult[7].quest,
                            //modifier = Modifier.padding(5.dp),
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp)
                        )
                        LazyRow(verticalAlignment = Alignment.CenterVertically) {
                            item() {
                                DisposableEffect(radioButtonsList7[0]) {
                                    onDispose {
                                        if (!radioButtonsList7[0].isChecked) {
                                            // Borrar el contenido del cuadro de texto
                                            viewModel.arregloCuadrosTexto[33] = ""
                                        }
                                    }
                                }
                                Text(
                                    text = respuestasMult[7][0],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList7[0].isChecked,
                                    onClick = {
                                        radioButtonsList7.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList7[0].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                                OutlinedTextField(
                                    value = viewModel.arregloCuadrosTexto[33],
                                    onValueChange = { text ->
                                        viewModel.arregloCuadrosTexto[33] = text
                                    },
                                    label = { Text("¿Cuales y que dosis?") },
                                    singleLine = false,
                                    enabled = radioButtonsList7[0].isChecked,
                                    modifier = Modifier.padding(end = 8.dp)
                                )
                                Text(
                                    text = respuestasMult[7][1],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList7[1].isChecked,
                                    onClick = {
                                        radioButtonsList7.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList7[1].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                            }

                        }
                        Spacer(modifier = Modifier.padding(8.dp))
                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))
                //Aqui va la siguiente box
            }

            items(12) {count ->
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(azul_Pastel)
                        .fillMaxWidth(.95f)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ) {
                        Text(
                            text = preguEscritas[count+22],
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp),
                            fontSize = 18.sp

                        )
                        OutlinedTextField(
                            value = viewModel.arregloCuadrosTexto[count+34],
                            onValueChange = {viewModel.arregloCuadrosTexto[count+34] = it},
                            label = { Text("Respuesta") },
                            singleLine = false,
                            modifier = Modifier.padding(end = 8.dp)
                        )
                        Spacer(modifier = Modifier.padding(8.dp))

                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))
            }

            item{
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(azul_Pastel)
                        .fillMaxWidth(.95f)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ) {
                        Text(text = preguntasMult[8].quest,
                            //modifier = Modifier.padding(5.dp),
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp)
                        )
                        LazyRow(verticalAlignment = Alignment.CenterVertically) {
                            item() {
                                Text(
                                    text = respuestasMult[8][0],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList8[0].isChecked,
                                    onClick = {
                                        radioButtonsList8.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList8[0].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                                Text(
                                    text = respuestasMult[8][1],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList8[1].isChecked,
                                    onClick = {
                                        radioButtonsList8.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList8[1].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                                Text(
                                    text = respuestasMult[8][2],
                                    //modifier = Modifier.padding(5.dp),
                                    modifier = Modifier
                                        .padding(16.dp)
                                )
                                RadioButton(
                                    selected = radioButtonsList8[2].isChecked,
                                    onClick = {
                                        radioButtonsList8.replaceAll { select ->
                                            select.copy(
                                                isChecked = select.radioButtonNumber == radioButtonsList8[2].radioButtonNumber
                                            )
                                        }
                                    },
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                            }

                        }
                        Spacer(modifier = Modifier.padding(8.dp))
                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .background(azul_Pastel)
                        .fillMaxWidth(.95f)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp)
                    ) {
                        Text(
                            text = "Notas",
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .padding(bottom = 8.dp)
                                .padding(top = 16.dp),
                            fontSize = 18.sp

                        )
                        OutlinedTextField(
                            value = viewModel.arregloCuadrosTexto[46],
                            onValueChange = {viewModel.arregloCuadrosTexto[46] = it},
                            singleLine = false,
                            modifier = Modifier.padding(end = 8.dp)
                        )
                        Spacer(modifier = Modifier.padding(8.dp))

                    }
                }
                Spacer(modifier = Modifier.padding(8.dp))
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Text(text = "Esta es la segunda pantalla")

        //Questionnaire(viewModel = CrearPDFViewModel())
        /*Button(onClick = { /*TODO*/ }) {
            Text(text = "Crear PDF")
        }*/
    }
}

class PregMult(){
    var quest = ""
        set(value) {
            field = value
        }
    var answrs =  mutableStateListOf<String>()

    var cuadroExtra = false
    var pos = 0

    fun coloVa (pre: String){
        answrs.add(pre)
    }
}

class CheckboxStates {
    var checkbox1 by mutableStateOf(false)
    var checkbox2 by mutableStateOf(false)
    var checkbox3 by mutableStateOf(false)
    var checkbox4 by mutableStateOf(false)
    var checkbox5 by mutableStateOf(false)
    var checkbox6 by mutableStateOf(false)
    var checkbox7 by mutableStateOf(false)
    var checkbox8 by mutableStateOf(false)
    var checkbox9 by mutableStateOf(false)

    fun onCheckboxClicked(checkboxNumber: Int) {
        when (checkboxNumber) {
            1 -> {
                checkbox2 = false
                checkbox3 = false
                checkbox4 = false
                checkbox5 = false
                checkbox6 = false
                checkbox7 = false
                checkbox8 = false
                checkbox9 = false
            }
            2 -> {
                checkbox1 = false
                checkbox3 = false
                checkbox4 = false
                checkbox5 = false
                checkbox6 = false
                checkbox7 = false
                checkbox8 = false
                checkbox9 = false
            }
            3 -> {
                checkbox1 = false
                checkbox2 = false
                checkbox4 = false
                checkbox5 = false
                checkbox6 = false
                checkbox7 = false
                checkbox8 = false
                checkbox9 = false
            }
            4 -> {
                checkbox1 = false
                checkbox2 = false
                checkbox3 = false
                checkbox5 = false
                checkbox6 = false
                checkbox7 = false
                checkbox8 = false
                checkbox9 = false
            }
            5 -> {
                checkbox1 = false
                checkbox2 = false
                checkbox3 = false
                checkbox4 = false
                checkbox6 = false
                checkbox7 = false
                checkbox8 = false
                checkbox9 = false
            }
            6 -> {
                checkbox1 = false
                checkbox2 = false
                checkbox3 = false
                checkbox4 = false
                checkbox5 = false
                checkbox7 = false
                checkbox8 = false
                checkbox9 = false
            }
            7 -> {
                checkbox1 = false
                checkbox2 = false
                checkbox3 = false
                checkbox4 = false
                checkbox5 = false
                checkbox6 = false
                checkbox8 = false
                checkbox9 = false
            }
            8 -> {
                checkbox1 = false
                checkbox2 = false
                checkbox3 = false
                checkbox4 = false
                checkbox5 = false
                checkbox6 = false
                checkbox7 = false
                checkbox9 = false
            }
            9 -> {
                checkbox1 = false
                checkbox2 = false
                checkbox3 = false
                checkbox4 = false
                checkbox5 = false
                checkbox6 = false
                checkbox7 = false
                checkbox8 = false
            }
        }
    }
}
