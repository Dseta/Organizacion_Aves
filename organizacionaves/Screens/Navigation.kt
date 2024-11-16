package com.example.organizacionaves.Screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navegation(viewModel: CrearPDFViewModel, permisosViewModel: PermisosViewModel) {
    val navController = rememberNavController()
    val navegarBackStack = {navController.navigateUp()}

    NavHost(navController = navController, startDestination = AppScreens.PantallaInicial.route){
        composable(route = AppScreens.PantallaInicial.route){
            CuerpoPantalla(
                permisosViewModel,
                navegarCrearPDF = {navController.navigate(route = AppScreens.CrearPDFs.route)},
                navegarVerPDF = {navController.navigate(route = AppScreens.VerPDFs.route)}
            )
        }

        composable(route = AppScreens.CrearPDFs.route){
            PantallaPDF(
                viewModel,
                permisosViewModel,
                navegarBackStack = { navegarBackStack() }
            )
        }

        composable(route = AppScreens.VerPDFs.route){
            VisualizarPDF(navegarBackStack = { navegarBackStack() })
        }
    }
}