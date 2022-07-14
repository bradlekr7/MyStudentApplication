package com.example.mystudentapplication

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitClient {

    @GET("StudentModel.json")

     fun getAllstudents(@Query()) : Response<StudentModel>


    }
