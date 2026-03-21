package com.example.a1labo

fun main(){
    val programas = listOf("Notion 2026", "Facebook 2026", "Spotify 2026")

    val compu = computadora(
        ram = 16,
        almacenamiento = 256,
        sitemaOperativo = "Windows",
        programasInstalados = programas
    )

    compu.encenderComputadora()

    println("----Datos Iniciales----")
    println("RAM: ${compu.ram} GB")
    println("Almacenamiento: ${compu.almacenamiento} GB")
    println("Sistema Operativo: ${compu.sitemaOperativo}")
    println("Programas del 2026: ${compu.obtenerProgramas()}")

    compu.actualizar(nuevaRam = 34, nuevoAlma = 213, nuevoSO = "Ubuntu")

    println("----Datos Actualizados----")
    println("Nueva RAM: ${compu.ram} GB")
    println("Nuevo Almacenamiento: ${compu.almacenamiento} GB")
    println("Nuevo Sistema Operativo: ${compu.sitemaOperativo}")
    println("Nuevo Programas del 2026: ${compu.obtenerProgramas()}")

    compu.apagarComputadora()

}