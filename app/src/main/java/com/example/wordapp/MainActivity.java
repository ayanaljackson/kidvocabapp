package com.example.wordapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendKeyboard(View view){

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
    public void sendMouse(View view){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void sendLaptop(View view){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void sendDesktop(View view){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void sendTouchpad(View view){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }

}