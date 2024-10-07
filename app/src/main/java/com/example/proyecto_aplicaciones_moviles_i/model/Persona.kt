package com.example.proyecto_aplicaciones_moviles_i.model

data class Persona(
    val idPersona: Int,
    var nombres: String,
    var apellidos: String,
    var edad: Int,
    var correo: String,
    var idGenero: Int
)
