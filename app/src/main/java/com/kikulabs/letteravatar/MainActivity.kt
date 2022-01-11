package com.kikulabs.letteravatar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avatarfirst.avatargenlib.AvatarGenerator
import com.kikulabs.letteravatar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.userAvatar.setImageDrawable(
            AvatarGenerator.AvatarBuilder(this)
                .setLabel("Rizki Kurniawan")
                .setAvatarSize(120)
                .setTextSize(30)
                .toCircle()
                .build()
        )
    }
}