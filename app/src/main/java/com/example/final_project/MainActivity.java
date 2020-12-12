package com.example.final_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.final_project.Fifth_Category.Fifth_Category_Quiz;
import com.example.final_project.First_Category.First_Category_Quiz;
import com.example.final_project.Fourth_Category.Fourth_Category_Quiz;
import com.example.final_project.Last_Category.Last_Category_Year_List;
import com.example.final_project.R;
import com.example.final_project.Second_Category.Second_Category_Quiz;
import com.example.final_project.Third_Category.Third_Category_Quiz;

public class MainActivity extends AppCompatActivity {
    private Button category, category1, category2, category3, category4, category5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_page);

        category = findViewById(R.id.button);
        category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), First_Category_Quiz.class);
                startActivity(intent);
            }
        });

        category1 = findViewById(R.id.button1);
        category1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Second_Category_Quiz.class);
                startActivity(intent);
            }
        });

        category2 = findViewById(R.id.button2);
        category2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Third_Category_Quiz.class);
                startActivity(intent);
            }
        });

        category3 = findViewById(R.id.button3);
        category3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Fourth_Category_Quiz.class);
                startActivity(intent);
            }
        });

        category4 = findViewById(R.id.button4);
        category4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Fifth_Category_Quiz.class);
                startActivity(intent);
            }
        });

        category5 = findViewById(R.id.button5);
        category5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Last_Category_Year_List.class);
                startActivity(intent);
            }
        });

    }
}