package com.piyush.printit;

import okhttp3.MultipartBody;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface api {

    @GET("signup")
    void signUp(@Query("username")String username, @Query("password")String password);

    @GET("login")
    void login(@Query("username")String username, @Query("password")String password);

    @Multipart
    @POST("submit")
    void submit(MultipartBody.Part file, @Query("token")String token);

    @GET("list")
    void list(@Query("token")String token);
}
