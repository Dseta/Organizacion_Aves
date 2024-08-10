package com.example.organizacionaves.Screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navegation(viewModel: CrearPDFViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.PantallaInicial.route){
        composable(route = AppScreens.PantallaInicial.route){
            CuerpoPantalla(navController)
        }

        composable(route = AppScreens.CrearPDFs.route){
            PantallaPDF(navController, viewModel)
        }

        composable(route = AppScreens.VerPDFs.route){
            VisualizarPDF(navController)
        }
    }
}