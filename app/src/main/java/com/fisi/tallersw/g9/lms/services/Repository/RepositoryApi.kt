package com.fisi.tallersw.g9.lms.services.Repository

import com.fisi.tallersw.g9.lms.models.AuthBody
import com.fisi.tallersw.g9.lms.models.Authresponse
import com.fisi.tallersw.g9.lms.services.RetrofitInterfaces.IApi

class RepositoryApi (
    private val api : IApi
){
    suspend fun auth(body: AuthBody):Authresponse{
        return api.auth(body)
    }
}