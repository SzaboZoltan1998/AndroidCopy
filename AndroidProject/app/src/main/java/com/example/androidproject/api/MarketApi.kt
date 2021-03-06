package com.example.androidproject.api

import android.net.http.HttpResponseCache
import com.example.androidproject.model.*
import com.example.androidproject.utils.Constants
import retrofit2.Response
import retrofit2.http.*

interface MarketApi {
    @POST(Constants.LOGIN_URL)
    suspend fun login(@Body request: LoginRequest): LoginResponse

    @GET(Constants.GET_PRODUCT_URL)
    suspend fun getProducts(@Header("token") token: String): ProductResponse

    @POST(Constants.REGISTER_URL)
    suspend fun register(@Body request: RegisterRequest) : RegisterResponse

    @GET(Constants.ACTIVATE_URL)
    suspend fun activate(@Query("username") userName: String) : HttpResponseCache

    @POST(Constants.CHANGE_PROFILE_URL)
    suspend fun change(@Body request: UpdateUserDataRequest):UpdateUserDataRespons

    @POST(Constants.RESET_PASSWORD_URL)
    suspend fun resetPassword(@Body request: ResetPasswordRequest):ResetPasswordResponse

    @GET(Constants.RESET_PASSWORD_URL)
    suspend fun resetPasswordT(@Header("token") token: String,@Header("password") password: String):ResetPasswordResponse
}