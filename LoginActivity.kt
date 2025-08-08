package com.example.moipz_app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginButton: Button
    private lateinit var signUpLink: TextView
    private lateinit var forgotPasswordLink: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameInput = findViewById(R.id.editTextUsername)
        passwordInput = findViewById(R.id.editTextPassword)
        loginButton = findViewById(R.id.buttonLogin)
        signUpLink = findViewById(R.id.textSignUp)
        forgotPasswordLink = findViewById(R.id.textForgotPassword)

        loginButton.setOnClickListener {
            val username = usernameInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "아이디와 비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show()
            } else {
                // 로그인 API 호출 및 처리 로직 추가
                Toast.makeText(this, "로그인 시도 중...", Toast.LENGTH_SHORT).show()
            }
        }

        signUpLink.setOnClickListener {
            // 회원가입 화면 이동 등 처리
            Toast.makeText(this, "회원가입 화면으로 이동", Toast.LENGTH_SHORT).show()
        }

        forgotPasswordLink.setOnClickListener {
            // 비밀번호 찾기 화면 이동 등 처리
            Toast.makeText(this, "비밀번호 찾기 화면으로 이동", Toast.LENGTH_SHORT).show()
        }
    }
}
