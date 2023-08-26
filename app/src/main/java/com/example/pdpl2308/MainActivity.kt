package com.example.pdpl2308

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.pdpl2308.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding){
            buttonTest1.setOnClickListener{
                Toast.makeText(this@MainActivity, "Selamat mengunakan Aplikasi Kami  :" + binding.inpNama.text, Toast.LENGTH_SHORT).show()
            }
        }
    }


}