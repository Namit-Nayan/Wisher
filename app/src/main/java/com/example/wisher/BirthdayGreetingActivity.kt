package com.example.wisher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wisher.databinding.ActivityBirthdayGreetingBinding

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA = "name"
    }
    private lateinit var binding: ActivityBirthdayGreetingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        val name = intent.getStringExtra(NAME_EXTRA)
        val wish = getString(R.string.happy_birthday)
        binding.birthdayGreeting.text = "$wish \n$name"
        setContentView(binding.root)
    }
}