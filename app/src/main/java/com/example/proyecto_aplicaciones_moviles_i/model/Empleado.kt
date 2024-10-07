package com.example.proyecto_aplicaciones_moviles_i.model

import java.time.LocalDate

data class Empleado(
    val idEmpleado: Int,
    val idPersona: Int,
    val tipoEmpleado: Int,
    var sueldo: Double,
    var fechaContratacion: LocalDate

)