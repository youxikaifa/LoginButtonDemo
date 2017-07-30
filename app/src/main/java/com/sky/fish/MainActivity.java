package com.sky.fish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    LoginButton btnLogin;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReset = findViewById(R.id.btnReset);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setAnimationButtonListener(new LoginButton.OnAnimationButtonClickListener() {
            @Override
            public void onAnimationStart() {
                btnLogin.start();
            }

            @Override
            public void onAnimationFinish() {

            }

            @Override
            public void onAnimationCancel() {

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnLogin.reset();
            }
        });


    }
}
