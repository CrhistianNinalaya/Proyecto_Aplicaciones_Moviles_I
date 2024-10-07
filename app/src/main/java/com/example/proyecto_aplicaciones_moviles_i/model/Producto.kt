package com.example.proyecto_aplicaciones_moviles_i.model

data class Producto(
    val idProducto: Int,
    var nombre: String,
    var descripcion: String,
    var precio: Double,
    var stock: Int,
    val idtalla: Int,
    val idGrosor: Int
)
