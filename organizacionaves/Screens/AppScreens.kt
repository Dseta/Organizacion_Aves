package com.example.organizacionaves.Screens

sealed class AppScreens (val route: String){
    object PantallaInicial : AppScreens("pantalla_inicial")
    object CrearPDFs : AppScreens("crear_pdfs")
    object VerPDFs : AppScreens("ver_pdfs")
}