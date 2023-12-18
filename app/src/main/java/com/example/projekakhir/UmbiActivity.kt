package com.example.projekakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projekakhir.api.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UmbiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_umbi)

        val detailsayur = findViewById<RecyclerView>(R.id.rvhijau)
        ApiConfig.getService().getDetail4().enqueue(object : Callback<ResponseUmbi> {
            override fun onResponse(
                call: Call<ResponseUmbi>, response: Response<ResponseUmbi>
            ) {
                if (response.isSuccessful) {
                    val responseSayur = response.body()
                    val datasayur = responseSayur?.data
                    val sayurAdapter = SayurAdapter(datasayur)
                    detailsayur.apply {
                        layoutManager = LinearLayoutManager(this@UmbiActivity)
                        setHasFixedSize(true)
                        sayurAdapter.notifyDataSetChanged()
                        adapter = sayurAdapter
                    }
                }
            }

            override fun onFailure(call: Call<ResponseUmbi>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

/*val cardView1: CardView = findViewById(R.id.cdHij1)
        cardView1.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }*/