package com.igormelo.retrolambda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        //TODO Simplificado com retrolambda
        button.setOnClickListener(e -> Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show());



        ////TODO Como ficaria
        /*button.setOnClickListener(new View.OnclickListener(){
        @Override
            public void onClick(View v){
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show());
            }
        }
         */

    }
}
