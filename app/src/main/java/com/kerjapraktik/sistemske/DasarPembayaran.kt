package com.kerjapraktik.sistemske

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager


class DasarPembayaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.kerjapraktik.sistemske.R.layout.activity05_dasar_pembayaran_operator)

        val viewPager = findViewById<ViewPager>(com.kerjapraktik.sistemske.R.id.viewPager)

        val activity = listOf(
            com.kerjapraktik.sistemske.R.layout.activity06_pembayaran_operator,
            com.kerjapraktik.sistemske.R.layout.activity11_logtransaksi
        )
    }
}