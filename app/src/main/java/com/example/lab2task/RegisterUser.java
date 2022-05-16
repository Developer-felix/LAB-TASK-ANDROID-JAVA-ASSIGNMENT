package com.example.lab2task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.lab2task.databinding.ActivityLoginBinding;
import com.example.lab2task.databinding.ActivityRegisterUserBinding;

public class RegisterUser extends AppCompatActivity {
    private ActivityRegisterUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final EditText usernameEditText = binding.editTextTextPersonName5;
        final EditText passwordEditText = binding.editTextTextPassword;
        final EditText phoneEditText = binding.editTextTextPersonName6;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
    }
}