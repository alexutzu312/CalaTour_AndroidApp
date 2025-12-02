package com.example.calatour.presentation.auth_screen

object UserValidator {

    private fun validateUsername(username: String): ValidationResult {

        if(username.isBlank()) {
            return ValidationResult(
                usernameError = "Username cannot be empty!"
            )
        }

        if(username.length < 3) {
            return ValidationResult(
                usernameError = "Username is too short!"
            )
        }

        return ValidationResult()
    }

    private fun validatePassword(password: String): ValidationResult {

        if(password.isBlank()) {
            return ValidationResult(
                passwordError = "Password cannot be empty!"
            )
        }

        if(password.length < 3) {
            return ValidationResult(
                passwordError = "Password is too short!"
            )
        }

        return ValidationResult()
    }

    fun signIn(username: String, password: String): ValidationResult {
        return ValidationResult(
            usernameError = validateUsername(username).usernameError,
            passwordError = validatePassword(password).passwordError,
            areCredentialsCorrect = username == "admin" && password == "password"
        )
    }
}

data class ValidationResult(
    val usernameError: String = "",
    val passwordError: String = "",
    val areCredentialsCorrect: Boolean = false
)