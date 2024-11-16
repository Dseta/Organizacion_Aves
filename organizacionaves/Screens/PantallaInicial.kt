package com.example.organizacionaves.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CuerpoPantalla(permisosViewModel: PermisosViewModel, navegarCrearPDF: () -> Unit, navegarVerPDF: () -> Unit) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            //modifier = Modifier.border(color = Color.Magenta, width = 2.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Manejo de Historias Clínicas ",
                fontSize = 30.sp,
                modifier = Modifier
                    .alpha(0.60f)
                    .padding(bottom = 100.dp)
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()

        ) {

            Button(onClick = { navegarCrearPDF() }) {
                Text("LLenar Historia Clínica")

            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = { navegarVerPDF() }) {
                Text("Ver Historias Clínicas")
            }
        }

    }
}

