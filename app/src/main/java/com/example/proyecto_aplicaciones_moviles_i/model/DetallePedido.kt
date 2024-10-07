package com.example.proyecto_aplicaciones_moviles_i.model

data class DetallePedido(
    val idDetallePedido: Int,
    val idPedido: Int,
    val idProducto: Int,
    val cantidad: Int,
    val precioUnidad: Double
)
