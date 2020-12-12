package com.example.final_project.Fifth_Category;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.final_project.MainActivity;
import com.example.final_project.R;

public class Result extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        TextView all = findViewById(R.id.all);
        TextView correct = findViewById(R.id.correct);
        TextView score = findViewById(R.id.score);

        Button btn_goto_main = findViewById(R.id.home_btn);
        btn_goto_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                // 현재 액티비티에서 메인 액티비티로 이동 시, 메인과 현재 액티비티 사이에 존재하는
                // 액티비티를 지운다 => UI 흐름 문제 방지, 메모리 낭비 방지
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                // 띄우려는 액티비티가 스택 맨위에 이미 실행 중이라면 재사용하겠다.
                // 이 플래그를 설정하지 않으면, 메인 액티비티는 새로 생성되게 됨.
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        int correctCount = intent.getIntExtra("correctCount", 0);
        int fullCount = intent.getIntExtra("fullCount", 0);
        int result = intent.getIntExtra("score", 0);

        System.out.println(correctCount);
        System.out.println(fullCount);
        System.out.println(result);

        all.setText("전체 문제 수 : "+fullCount + "개");
        correct.setText("맞힌 문제 수 : "+correctCount + "개");
        score.setText(result + "점");
    }
}