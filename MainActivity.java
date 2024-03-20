package edu.cinec.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import dalvik.system.BaseDexClassLoader;

public class MainActivity extends AppCompatActivity {
    Button square,parallelogram,rectangle,rhombus,trapezoid,triangle,circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //--------------------------mapping----------------------------
        square=findViewById(R.id.square);
        parallelogram=findViewById(R.id.parallelogram);
        rectangle=findViewById(R.id.rectangle);
        rhombus=findViewById(R.id.rhombus);
        trapezoid=findViewById(R.id.trapezoid);
        triangle=findViewById(R.id.triangle);
        circle=findViewById(R.id.circle);


        //--------------------Square-----------------------------------
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),squarePerimeter.class);
                startActivity(intent);
            }
        });

        //---------------Parallelogram----------------------------------
        parallelogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),parallelogram.class);
                startActivity(intent);
            }
        });

        //---------------Rectangle--------------------------------------
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),rectangle.class);
                startActivity(intent);
            }
        });

        //---------------Rhombus---------------------------------------
        rhombus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),rhombus.class);
                startActivity(intent);
            }
        });

        //---------------Trapezoid---------------------------------------
        trapezoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),trapezoid.class);
                startActivity(intent);
            }
        });

        //---------------Triangle---------------------------------------
        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),triangle.class);
                startActivity(intent);
            }
        });

        //---------------Circle---------------------------------------
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),circle.class);
                startActivity(intent);
            }
        });
    }
}