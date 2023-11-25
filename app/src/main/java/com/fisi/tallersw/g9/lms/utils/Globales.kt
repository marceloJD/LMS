package com.fisi.tallersw.g9.lms.utils

import com.fisi.tallersw.g9.lms.models.Credenciales

class Globales private constructor() {
    // Propiedades y métodos de la clase
    var credenciales= Credenciales()
    var usuario = ""
    var clave = ""
    companion object {
        // La instancia única del Singleton
        private var instance: Globales? = null

        // Función para obtener la instancia del Singleton
        fun getInstance(): Globales {
            if (instance == null) {
                instance = Globales()
            }
            return instance!!
        }
    }
}