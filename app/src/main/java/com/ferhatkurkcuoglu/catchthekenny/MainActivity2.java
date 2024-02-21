package com.ferhatkurkcuoglu.catchthekenny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {


    String kolay ="kolay";
    String orta ="orta";
    String zor = "zor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    public void easy(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("easy",kolay);
        startActivity(intent);
    }
    public void medium(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("medium",orta);
        startActivity(intent);
    }
    public void hard(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("hard", zor);
        startActivity(intent);
    }
}