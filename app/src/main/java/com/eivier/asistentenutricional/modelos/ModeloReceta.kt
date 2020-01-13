package com.eivier.asistentenutricional.modelos

data class ModeloReceta(
    var nombre: String,
    var dificultad: String,
    var tiempo: String,
    var porciones: String,
    var ingredientes: String,
    var preparacion: String,
    var imagen: String
) {

    override fun toString(): String {
        return "ModeloReceta(nombre='$nombre', dificultad='$dificultad', tiempo='$tiempo', " +
                "porciones='$porciones', ingredientes='$ingredientes', " +
                "preparacion='$preparacion')"
    }
}
