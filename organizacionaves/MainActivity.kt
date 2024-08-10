package com.example.organizacionaves

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.organizacionaves.Screens.CrearPDFViewModel
import com.example.organizacionaves.Screens.Navegation
import com.example.organizacionaves.ui.theme.OrganizacionAvesTheme

class MainActivity : ComponentActivity() {
    private val viewModel: CrearPDFViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrganizacionAvesTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Navegation(viewModel)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Column (
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
        Row (
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()

        ) {

            //Spacer(modifier = Modifier.width(2.dp))
            Button(onClick = { /*TODO*/ }) {
                Text("LLenar Historia Clínica")

            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = { /*TODO*/ }) {
                Text("Ver Historias Clínicas")
            }
        }

    }

}
