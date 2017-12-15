package com.example.tenma.walkapp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Tenma on 2017/12/15.
 */

public class AppMain extends AppCompatActivity {

    ImageButton battle, magic, check, escape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StatusStart(View view) {
        Intent intent = new Intent(this, AppStatus.class);
        //遷移先の画面を起動
        startActivity(intent);
    }

    public void LogStart(View view) {
        Intent intent = new Intent(this, AppLog.class);
        //遷移先の画面を起動
        startActivity(intent);
    }

    public void change_battle(View view) {

    //たたかうが選ばれたらたたかうに矢印
    battle =(ImageButton)findViewById(R.id.main_battle);
    battle.setImageResource(R.drawable.main_battle2);
    //それ以外は初期にもどす
    magic =(ImageButton)findViewById(R.id.main_magic);
    magic.setImageResource(R.drawable.main_magic1);
    check =(ImageButton)findViewById(R.id.main_check);
    check.setImageResource(R.drawable.main_check1);
    escape =(ImageButton)findViewById(R.id.main_escape);
    escape.setImageResource(R.drawable.main_escape1);
    }

    public void change_magic(View view){
        //まほうが選ばれたらまほうに矢印
        magic = (ImageButton) findViewById(R.id.main_magic);
        magic.setImageResource(R.drawable.main_magic2);
        //それ以外は初期にもどす
        battle = (ImageButton) findViewById(R.id.main_battle);
        battle.setImageResource(R.drawable.main_battle1);
        check = (ImageButton) findViewById(R.id.main_check);
        check.setImageResource(R.drawable.main_check1);
        escape = (ImageButton) findViewById(R.id.main_escape);
        escape.setImageResource(R.drawable.main_escape1);
    }

    public void change_check(View view){
        //かくにんが選ばれたらかくにんに矢印
        check = (ImageButton) findViewById(R.id.main_check);
        check.setImageResource(R.drawable.main_check2);
        //それ以外は初期にもどす
        battle = (ImageButton) findViewById(R.id.main_battle);
        battle.setImageResource(R.drawable.main_battle1);
        magic = (ImageButton) findViewById(R.id.main_magic);
        magic.setImageResource(R.drawable.main_magic1);
        escape = (ImageButton) findViewById(R.id.main_escape);
        escape.setImageResource(R.drawable.main_escape1);
    }

    public void change_escape(View view){
        //にげるが選ばれたらにげるに矢印
        escape = (ImageButton) findViewById(R.id.main_escape);
        escape.setImageResource(R.drawable.main_escape2);
        //それ以外は初期にもどす
        battle = (ImageButton) findViewById(R.id.main_battle);
        battle.setImageResource(R.drawable.main_battle1);
        magic = (ImageButton) findViewById(R.id.main_magic);
        magic.setImageResource(R.drawable.main_magic1);
        check = (ImageButton) findViewById(R.id.main_check);
        check.setImageResource(R.drawable.main_check1);
    }
}
