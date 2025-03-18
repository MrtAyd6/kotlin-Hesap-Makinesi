package com.example.hesapmakinesi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun topla(view : View){
        if(binding.editText1.text.toString() != "" && binding.editText2.text.toString() != ""){
            val sayi1 = binding.editText1.text.toString().toDouble()
            val sayi2 = binding.editText2.text.toString().toDouble()
            val sonuc = sayi1 + sayi2

            binding.textView.text = "Sonuc: ${sonuc}"
        }else{
            binding.textView.text = "Numaraları giriniz!"
        }
    }

    fun cıkar(view : View){
        if(binding.editText1.text.toString() != "" && binding.editText2.text.toString() != ""){
            var sayi1 = binding.editText1.text.toString().toDouble()
            var sayi2 = binding.editText2.text.toString().toDouble()
            var sonuc = sayi1 - sayi2

            binding.textView.text = "Sonuc: ${sonuc}"
        }else{
            binding.textView.text = "Numaraları giriniz!"
        }
    }

    fun bol(view : View){
        if(binding.editText1.text.toString() != "" && binding.editText2.text.toString() != ""){
            var sayi1 = binding.editText1.text.toString().toDouble()
            var sayi2 = binding.editText2.text.toString().toDouble()
            if(sayi2 == 0.0){
                binding.textView.text = "Sıfıra bölünemez!"
            }else{
                var sonuc = sayi1 / sayi2
                binding.textView.text = "Sonuc: ${sonuc}"
            }
        }else{
            binding.textView.text = "Numaraları giriniz!"
        }
    }

    fun carp(view : View){
        if(binding.editText1.text.toString() != "" && binding.editText2.text.toString() != ""){
            var sayi1 = binding.editText1.text.toString().toDouble()
            var sayi2 = binding.editText2.text.toString().toDouble()
            var sonuc = sayi1 * sayi2

            binding.textView.text = "Sonuc: ${sonuc}"
        }else{
            binding.textView.text = "Numaraları giriniz!"
        }
    }

}