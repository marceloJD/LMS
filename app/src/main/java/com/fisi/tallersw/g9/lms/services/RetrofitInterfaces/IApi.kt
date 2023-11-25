package com.fisi.tallersw.g9.lms.services.RetrofitInterfaces

import com.fisi.tallersw.g9.lms.models.AuthBody
import com.fisi.tallersw.g9.lms.models.Authresponse
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface IApi {
    companion object{
        var intancia = Retrofit.Builder()
            .baseUrl("https://7048-2001-1388-303-fffd-ca4-f99c-b3a1-bfc5.ngrok-free.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().build())
            .build()
            .create(IApi::class.java)
    }
    @POST("api/auth")
    fun auth(@Body body: AuthBody): Authresponse

}