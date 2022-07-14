package com.example.mystudentapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitClient {

    @GET("StudentModel.json")

     fun getAllstudents(@Query(StudentModel("", 10, "", ""))) : Call<StudentModel>


    }
