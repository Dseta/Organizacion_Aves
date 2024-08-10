package com.example.organizacionaves.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun VisualizarPDF(navController: NavController) {
    Column {
        Text(text = "Esta es la tercera pantalla")
    }
}

class Preguntas(){
    val questions = listOf(
        "¿Cuál es tu color favorito?",
        "¿Cuál es tu comida favorita?",
        "¿Cuál es tu película favorita?",
        "¿Cuál es tu canción favorita?",
        "¿Cuál es tu libro favorito?",
        "¿Cuál es tu deporte favorito?",
        "¿Cuál es tu animal favorito?",
        "¿Cuál es tu lugar favorito para vacacionar?",
        "¿Cuál es tu hobby favorito?",
        "¿Cuál es tu juego de mesa favorito?",
    )

    /*Cantidad de cuadros de texto necesitados:
    Primera seccion 15
    Seccion de comida = 16
    Tercera seccion = 18
    Cuarta seccion = aprox 33
    Total aprox = 82
     */

    val preguEscritas1 = listOf(
        "No de Paciente", //1
        "Nombre del propietario",
        "Domicilio, calle/num",
        "Delegacion",
        "Tel",
        "Email",
        "Nombre Ave",
        "Especie",
        "Ident", // 9
        /*
        "Tiempo de tenerla", //14
        "Como se entero del hospital", // 16
        "Ubicacion de la jaula:",// 29 Especial
        "Si esta libre donde pasa el mayor tiempo?", // 30, Solo si 29 es "afuera"
        "Tamaño de la jaula y material", // 32
        "No de perchas, grosor, apariencia y material", //34
        "No de comederos y bebederos tamaño y material",//35
        "Frecuencia de higiene de jaula y accesorios", //39
        "Convivencia con otros animales y/o animales", //40
        "Ultima visita al veterinario", //42
        "Motivo", // 43
        "Diagnostico", //44
        "Tratamiento", //45
         */
        //--Primera hoja 46 preguntas
        //--Segunda hoja 16 preguntas

    )

    val preguEscritas2 = listOf(
        "Tiempo de Tenerla",
        "Como se entero del hospital"
    )

    val preguntasEscritas3 = listOf(
        "Ubicación de la jaula",
        "Tamaño de la jaula y material", // 32
        "No de perchas, grosor, apariencia y material",
        "No de comederos y bebederos tamaño y material"
    )

    val preguntasEscritas4 = listOf(
        "Ultima visita al veterinario",
        "Motivo", //5
        "Diagnostico",
        "Tratamiento", //5
    )

    val preguntasEscritas5 = listOf(
        "Peso real",
        "Peso ideal", //
        "T",
        "Deshidratación",
        "FC",//
        "Fr y Aparato respiratorio",
        "Cabeza y cuello",
        "Condición Corporal",
        "Cavidad torácica y Celoma",
        "Extremidades",
        "Cloaca",
        "Dx Presuntivo",
        "Tratamiento sugerido",
    )

    val pregOpMult = listOf(
        "Edad", //10
        "Edad Reproductiva",
        "Sexo",
        "Metodo de sexado", // 13
        "Procedencia", // 15 *Crearle una opcion especial para dos cuadros de texto
        "Agua: ", // 25
        "Conservación del alimento: ",
        "Frecuencia: ",
        "Alojamiento: ",//28
        "Sale de la jaula", //30
        "Contacto con plantas", // 31
        "Puede extender sus alas adentro?", // 33
        "Donde se encuentra el ave hay", //36 - --Arreglarla para que el que tipo sea el cuadro de texto
        "Toma el sol", // 37 --Arreglarla para que el cuanto tiempo sea el cuadro de texto
        "Juguetes", // 38 --Arreglarla para que el cuales sea el cuadro de texto
        "Sanos", //41 --Arreglarla para que el quienes sea el cuadro de texto
        "Motivo actual de la consulta", //46
        "Inspeccion General",
        "Pronostico",
        "Tratamiento y manejo integral en consultorio",

        )

    val respuestasMult = listOf(
        listOf("Confirmada", "Aproximada", "No se sabe"),
        listOf("Polluelo", "Juvenil", "Adulto", "Senil"),
        listOf("Macho", "Hembra", "No se sabe"),
        listOf("Molecular", "Endoscopia", "Otro"),
        listOf("Comprada en", "Regalo", "Herencia", "Adopción", "Otra"),
        listOf("Purificada", "Llave", "Pozo"),
        listOf("Fresco", "Refrigerado", "Congelado", "T. Ambiente"),
        listOf( "1", "2", "3", "Todo el día"),
        listOf("Interior", "Exterior", "Jaula", "Libre", "Otro"),
        listOf("Si", "No"),
        listOf("Si", "No"),
        listOf("Si", "No"),
        listOf("Humedad", "Ruido", "Corrientes de aire", "Vapores/Humo", "Aerosoles/Perfumes", "Desinfectantes", "Limpiadores",
            "Solventes", "Aromatizantes"),
        listOf("Si", "No"),
        listOf("Si", "No"),
        listOf("Sanos", "Enfermos"),
        listOf("Revisión", "Otro"),
        listOf("Alerta y responsivo", "Deprimido", "En shock", "Agresivo", "Sociable", "Temeroso", "Otro"),
        listOf("Favorable", "Reservado", "Desfavorable"),
        listOf("Hospitalización", "Corte de uñas", "Corte de alas", "Desparasitación", "Aplicación de Vitaminas(ADE)",
            "Aplicación de gel en MPs", "Arreglo de pico", "Otro"),
    )

    val seccionComida = listOf(
        "Croquetas", //17
        "Semillas",
        "Frutas",
        "Vegetales",
        "Cereal, pasta, arroz y pan",
        "Alimento vivo",
        "Suplementos (vit, min)",
        "Otro" //24
    )
}