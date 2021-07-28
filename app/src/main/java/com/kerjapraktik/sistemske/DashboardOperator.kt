package com.kerjapraktik.sistemske
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * Dibuat oleh RizkyPratama pada 3/30/2021.
 */
class DashboardOperator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity03_dashboard_operator)

        val buttonpemb = findViewById<View>(R.id.arahpembayarantiket)
        buttonpemb.setOnClickListener{
            val intent = Intent(this, DasarPembayaran::class.java)
            startActivity(intent)
        }

    }
}