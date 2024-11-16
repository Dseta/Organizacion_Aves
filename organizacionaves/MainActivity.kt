package com.example.organizacionaves

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.organizacionaves.Screens.CrearPDFViewModel
import com.example.organizacionaves.Screens.Navegation
import com.example.organizacionaves.Screens.PermisosViewModel
import com.example.organizacionaves.ui.theme.OrganizacionAvesTheme

class MainActivity : ComponentActivity() {
    private val viewModel: CrearPDFViewModel by viewModels()
    private val permisosViewModel: PermisosViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrganizacionAvesTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Navegation(viewModel, permisosViewModel)
                }
            }
        }
    }
}

