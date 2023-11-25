package com.fisi.tallersw.g9.lms.screens.auth

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.fisi.tallersw.g9.lms.models.Credenciales

class AuthLoginViewModel:ViewModel() {
    var credenciales by mutableStateOf( Credenciales())
}