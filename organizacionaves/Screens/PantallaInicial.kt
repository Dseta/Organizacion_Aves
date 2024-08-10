package com.example.organizacionaves.Screens

import androidx.compose.foundation.layout.Arrangement
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
import androidx.navigation.NavController


@Composable
fun CuerpoPantalla(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()

    ) {
        Text(
            text = "Manejo de \nHistorias Clínicas ",
            fontSize = 30.sp,
            modifier = Modifier
                .alpha(0.60f)
                .padding(bottom = 100.dp)

        )
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()

        ) {

            //Spacer(modifier = Modifier.width(2.dp))
            Button(onClick = { navController.navigate(route = AppScreens.CrearPDFs.route) }) {
                Text("LLenar Historia Clínica")

            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = { navController.navigate(route = AppScreens.VerPDFs.route) }) {
                Text("Ver Historias Clínicas")
            }
        }

    }
}
