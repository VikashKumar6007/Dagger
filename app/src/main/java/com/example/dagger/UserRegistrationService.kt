package com.example.dagger

class UserRegistrationService(private var userRepository: UserRepository , private var emailService: EmailService) {

    fun registerUser(email :String , password:String){
        userRepository
    }
}