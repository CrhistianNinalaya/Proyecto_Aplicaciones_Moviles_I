package com.example.proyecto_aplicaciones_moviles_i.model

data class Producto(
    val idProducto: Int,
    var nombre: String,
    var descripcion: String,
    var precio: Double,
    var stock: Int,
    var idTalla: Int,
    var idGrosorTela: Int
)
