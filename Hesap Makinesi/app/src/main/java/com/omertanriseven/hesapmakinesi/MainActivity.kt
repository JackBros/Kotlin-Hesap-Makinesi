package com.omertanriseven.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cikar(view : View){
        var ilk = ilkSayi.text.toString()
        var ikinci = ikinciSayi.text.toString()
        sonuc.text = (ilk.toInt()-ikinci.toInt()).toString()
    }

    fun topla(view : View){
        var ilk = ilkSayi.text.toString()
        var ikinci = ikinciSayi.text.toString()
        sonuc.text = (ilk.toInt()+ikinci.toInt()).toString()
    }

    fun carp(view : View){
        var ilk = ilkSayi.text.toString()
        var ikinci = ikinciSayi.text.toString()
        sonuc.text = (ilk.toInt()*ikinci.toInt()).toString()
    }

    fun bol(view : View){
        var ilk = ilkSayi.text.toString()
        var ikinci = ikinciSayi.text.toString()
        sonuc.text = (ilk.toInt()/ikinci.toInt()).toString()
    }

}