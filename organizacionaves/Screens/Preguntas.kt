package com.example.organizacionaves.Screens

public class Preguntas_Base {

    fun obtenerPreguntasEscritas(): List<String> {
        val preguntasEscritas = listOf(
            "Nombre del Propietario", //0
            "Domicilio",
            "Teléfono",
            "Nombre Ave",
            "Especie",
            "Edad",
            "Tiempo de tenerla",
            "Procedencia",
            "Sexo",
            "¿Cuanto tiempo lleva ofreciendo la dieta actual?", //10
            "Frecuencia de alimentación",
            "Ubicación de la jaula o si esta libre",
            "De que tipo?", //12
            "Tamaño de la jaula y material", // 32
            "No de perchas, material y grosor",
            "No de comederos, bebederos y material",//35
            "Juguetes", // 38
            "Higiene de jaula y accesorios",
            "Convivencia con animales y personas",
            "Última visita al MVZ",
            "Motivo",
            "Dx",
            "Tx",
            "Motivo actual de la consulta", //46
            "Estado mental",
            "%Deshidratación",
            "Peso",
            "Condición Corporal", "FC", "FR", "T°",
            "Cabeza", "Celoma", "Miembros",
            "Cloaca", "Diagnóstico presuntivo",
            )
        // Por ejemplo:
        return preguntasEscritas
    }

    fun obtenerPreguntasMultiples(): List<String> {

        val preguntasOpcionMultiple = listOf(
            "Agua: ", // 25
            "Conservación de los alimentos: ",
            "Contacto con plantas", //*
            "Donde se encuentra el ave hay",
            "Toma el sol", // *
            "Se baña", //*
            "Ha ofrecido algún medicamento / remedio casero", //*
            "Pronóstico",
        )
        // Por ejemplo:
        return preguntasOpcionMultiple
    }

    fun obtenerPreguntasAlimentacion(): List<String> {

        val preguntasSeccionComida = listOf(
            "Semillas",
            "Frutas y verduras",
            "Cereales, pasta, arroz, pan, etc",
            "Alimento vivo",
            "Suplementos",
            "Otros"
        )
        // Por ejemplo:
        return preguntasSeccionComida
    }

    fun obtenerRespuestasMultiples(): List<List<String>> {

        val respuestasMultiples = listOf(
            listOf("Purificada", "Llave", "Pozo","Otro"),
            listOf("Fresco","Refrigerado", "Congelado", "Temperatura Ambiente"),
            listOf("Si", "No"),
            listOf("Humedad", "Ruido", "Corrientes de aire", "Vapores", "Humo", "Desinfectantes", "Limpiadores",
                "Solventes"),
            listOf("Si", "No"),
            listOf("Si", "No"),
            listOf("Si", "No"),
            listOf("Favorable", "Reservado", "Desfavorable"),
        )
        // Por ejemplo:
        return respuestasMultiples
    }

    fun posicionamientoPDF(): List<List<Float>> {

        val coordenadas = listOf(
            listOf(900f, 248f), //Nombre del Propietario
            listOf(270f, 298f), //Domicilio
            listOf(1615f, 298f),    //Teléfono
            listOf(370f, 346f), //Nombre Ave
            listOf(1100f, 346f),    //Especie
            listOf(220f, 393f), //Edad
            listOf(770f, 393f), //Tiempo de tenerla
            listOf(1210f, 393f),    //Procedencia
            listOf(1750f, 393f),    //Sexo
            listOf(415f, 636f), //Semillas
            listOf(1675f, 636f), //(%) Semillas
            listOf(415f, 686f), //Frutas y verduras
            listOf(1675f, 686f), //(%) Frutas y verduras
            listOf(415f, 736f), //Cereales, pasta, arroz, pan, etc
            listOf(1675f, 736f), //(%) Cereales, pasta, arroz, pan, etc
            listOf(415f, 786f), //Alimento vivo
            listOf(1675f, 786f), //(%) Alimento vivo
            listOf(415f, 834f), //Suplementos
            listOf(1675f, 834f), //(%) Suplementos
            listOf(415f, 883f), //Otros
            listOf(1675f, 883f), //(%) Otros
            //Aqui estan las coordenadas de la segunda pagina
            listOf(950f, 980f), //Tiempo dieta actual
            listOf(555f, 1370f),    //Tamano Jaula
            listOf(225f, 1418f),    //No de perchas
            listOf(1400f, 1418f),   //No de comederos
            listOf(255f, 1468f),    //Juguetes
            listOf(1595f, 1468f),   //Higiene Jaula
            listOf(1270f, 1515f),   //Convivencia animales
            listOf(430f, 1562f),    //Ultima visita MVZ
            listOf(1053f, 1562f),   //Motivo
            listOf(155f, 1612f),    //Dx
            listOf(970f, 1612f),    //Tx
            listOf(545f, 1661f),    //Motivo actual
            //
            listOf(340f, 230f), //Estado mental
            listOf(790f, 230f), //Deshidratacion
            listOf(990f, 230f), //Peso
            listOf(1510f, 230f),    //Condicion Corporal
            listOf(1730f, 230f),    //FC
            listOf(150f, 312f), //FR
            listOf(500f, 312f), //T°
            //Aqui estan las coordenadas de la seccion de varias lineas
            listOf(240f, 389f), //Cabeza
            listOf(260f, 729f), //Celoma
            listOf(295f, 1069f),    //Miembros
            listOf(240f, 1411f),    //Cloaca
            listOf(490f, 1595f),    //Diagnóstico presuntivo
            listOf(250f,1859f), //Manejos
            listOf(210f,1911f), //Notas
        )
        // Por ejemplo:
        return coordenadas
    }
}