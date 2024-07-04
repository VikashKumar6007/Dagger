package com.example.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
manual
  val userRepository = UserRepository()
        val emailService = EmailService()

        val userRegistrationService =UserRegistrationService(userRepository,emailService)
 */


//        with Dagger


      //  val userRegistrationService =

       // userRegistrationService.registerUser("vraj67207@gmail.com","12334688")


    }
}