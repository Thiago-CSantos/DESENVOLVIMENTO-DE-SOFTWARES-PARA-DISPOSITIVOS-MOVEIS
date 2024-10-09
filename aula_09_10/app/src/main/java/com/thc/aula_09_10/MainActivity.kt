package com.thc.aula_09_10

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.thc.aula_09_10.retrofit.InicializarRetrofit
import retrofit2.Call
import retrofit2.Response

class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_layout )

        val call: Call<List<String>> = InicializarRetrofit()
            .service.listRepos(getString(R.string.thiago_csantos))

        val response: Response<List<String>> = call.execute()
        Toast.makeText(this, "Exemplo de retrofit", Toast.LENGTH_SHORT).show()


    }

}