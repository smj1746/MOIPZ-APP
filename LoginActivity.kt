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
        setContentView(R.layout.activity_1_login)

        usernameInput = findViewById(R.id.editTextUsername)
        passwordInput = findViewById(R.id.editTextPassword)
        loginButton = findViewById(R.id.buttonLogin)
        signUpLink = findViewById(R.id.textSignUp)
        forgotPasswordLink = findViewById(R.id.textForgotPassword)


        btnLogin.setOnClickListener {
            // TODO: 실제 로그인 검증 로직
            val i = Intent(this, MainActivity::class.java).apply {
                // 뒤로가기 시 로그인 화면 안 보이게 (선택)
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            startActivity(i)
            // finish() // 위 플래그 쓰면 없어도 됨
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
