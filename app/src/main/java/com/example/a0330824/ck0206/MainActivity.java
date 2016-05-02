package com.example.a0330824.ck0206;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callAnotherActivity(View view) {
        Intent intent = new Intent(this, AnotherActivity.class);
        startActivity(intent);

    }

    public void callImplicitActivity(View view) {
        Intent intent = new Intent();
        intent.setAction("com.example.a0330824.ck0206.AnotherActivity");
        intent.setComponent(null);
        intent.addCategory("com.example.a0330824.ck0206.CATEGORIA");
        intent.setType("text/plain");
        startActivity(intent);

    }
}
