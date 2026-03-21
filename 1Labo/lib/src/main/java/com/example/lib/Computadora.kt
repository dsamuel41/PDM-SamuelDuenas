package com.example.lib

class computadora(
    var ram: Int,
    var almacenamiento: Int,
    var sitemaOperativo: String,
    var programasInstalados: List<String>
){
    fun encenderComputadora(){
        println("encendida")
    }

    fun apagarComputadora(){
        println("apagada")
    }

    fun actualizar(nuevaRam: Int, nuevoAlma: Int, nuevoSO: String){
        ram = nuevaRam
        almacenamiento = nuevoAlma
        sitemaOperativo = nuevoSO
        println("actualizada")
    }

    fun obtenerProgramas(): List<String> {
        return programasInstalados.filter {  it.contains(other = "2026") }
    }
}