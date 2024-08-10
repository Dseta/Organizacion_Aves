package com.example.organizacionaves.Screens

public class Preguntas_Base {

    fun obtenerPreguntasEscritas(): List<String> {
        val preguntasEscritas = listOf(
            "Nombre del Propietario", //1
            "Domicilio",
            "Teléfono",
            "Nombre Ave",
            "Especie",
            "Edad",
            "Tiempo de tenerla",
            "Procedencia",
            "Sexo",
            "Frecuencia de alimentación",
            "Ubicación de la jaula o si esta libre",
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
            "Usa aromatizantes?", //*
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
            listOf("Fresco", "Congelado", "Temperatura Ambiente"),
            listOf("Si", "No"),
            listOf("Humedad", "Ruido", "Corrientes de aire", "Vapores", "Humo", "Desinfectantes", "Limpiadores",
                "Solventes"),
            listOf("Si", "No"),
            listOf("Si", "No"),
            listOf("Si", "No"),
            listOf("Si", "No"),
            listOf("Favorable", "Reservado", "Desfavorable"),
        )
        // Por ejemplo:
        return respuestasMultiples
    }
}