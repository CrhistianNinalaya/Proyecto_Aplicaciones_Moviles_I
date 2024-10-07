package com.example.proyecto_aplicaciones_moviles_i.model

import java.time.LocalDate

data class Pedido(
    val idPedido: Int,
    val idCliente: Int,
    val idEmpleado: Int,
    var fecPedido: LocalDate,
    var montoTotal: Double
)
