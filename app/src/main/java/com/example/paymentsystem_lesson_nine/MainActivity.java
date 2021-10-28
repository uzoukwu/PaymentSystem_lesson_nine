package com.example.paymentsystem_lesson_nine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Account myAccount = new Account();

        for (int i = 0; i < 5; i++) {
                try {
            new Payment(myAccount, 100);
            Thread.sleep(1000);

        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    }
}