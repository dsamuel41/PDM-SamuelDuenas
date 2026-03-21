package com.example.ejercicio3

fun main(){
    val ciclo01 = listOf(

        //Alumnos de moviles
        Estudiantes("juan perez", "GA125478", "programacion de moviles"),
        Estudiantes("carlos hermandez", "GA896541", "programacion de moviles"),
        Estudiantes("lila lopez", "GA365471", "programacion de moviles"),

        //Alumnos de analisis
        Estudiantes("Carlos Diaz", "GA213658", "Analisis numerico"),
        Estudiantes("Laura torres", "GA146359", "Analisis numerico"),
        Estudiantes("Jazmin urrutia", "GA000014", "Analisis numerico")
    )

    println("Estudiantes de moviles")
    val dispositivosMoviles = ciclo01.filter {
        it.asignatura == "Programacion de moviles"
    }

    dispositivosMoviles.forEach {
        println("Nombre: ${it.nombre} | Carnet: ${it.carnet}")
    }
    println("Total: ${dispositivosMoviles.size} estudiantes")
}