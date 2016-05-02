package com.example.a0330824.ck0206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
    }

    public void voltar(View view) {
        finish();
    }
}
