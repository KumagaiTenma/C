package com.example.tenma.walkapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AppTitle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
    }
    public void AppStart(View view){
        Intent intent = new Intent(this, AppMain.class);
        //遷移先の画面を起動
        startActivity(intent);


    }
}
