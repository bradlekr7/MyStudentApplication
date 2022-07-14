package com.example.mystudentapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CompanionObject {
    val BASE_URL = "https://mocki.io/v1/abb92e67-c508-4b16-bdb2-0573b53cd364"

    fun create(): RetrofitClient {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        return retrofit.create(RetrofitClient::class.java)
    }
}
