package com.example.organizacionaves.Screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VisualizarPDF(navegarBackStack: () -> Unit) {
    Scaffold(
        modifier = androidx.compose.ui.Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Visualizar Historia Clínica")
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

                }
            )
        }
    ) { innerPadding ->
        PantallaDelPDF(
            modifier = androidx.compose.ui.Modifier.padding(innerPadding)
        )
    }
}




