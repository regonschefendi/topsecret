package com.example.mobilepdam

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mobilepdam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_account
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        // Temukan LinearLayout berdasarkan ID
        val llTagihan: LinearLayout = findViewById(R.id.ll_tagihan)

        // Set listener untuk menangani klik
        llTagihan.setOnClickListener {
            // Buat Intent untuk PaymentActivity
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
        }
    }
}