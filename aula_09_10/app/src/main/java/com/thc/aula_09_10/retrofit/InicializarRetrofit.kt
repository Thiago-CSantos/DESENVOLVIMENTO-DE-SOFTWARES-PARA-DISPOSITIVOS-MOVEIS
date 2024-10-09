package com.thc.aula_09_10.retrofit

import retrofit2.Retrofit

class InicializarRetrofit {

    val retrofit:Retrofit = Retrofit.Builder().baseUrl("https://api.github.com/").build();

    val service:GitHubService = retrofit.create(GitHubService::class.java)

}