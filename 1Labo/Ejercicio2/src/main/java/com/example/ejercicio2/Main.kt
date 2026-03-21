package com.example.ejercicio2

fun main(){

    val calc = Calculadora(
        marca = "Apple",
        anosDeVida = 6,
        precio = 56.24
    )

    println("--Calculadora ${calc.marca}---")
    println("Años de vida ${calc.anosDeVida}")
    println("Precio: ${calc.precio}")

    println("--Operaciones---")
    println("10 + 2 ${calc.sumar(10.0,2.0)}")
    println("10 - 2 ${calc.restar(10.0,2.0)}")
    println("10 * 2 ${calc.multiplicar(10.0,2.0)}")
    println("10 / 2 ${calc.dividir(10.0,2.0)}")

    println("Division entre cero")
    println("10/0 = ${calc.dividir(10.0, 0.0)}")
}