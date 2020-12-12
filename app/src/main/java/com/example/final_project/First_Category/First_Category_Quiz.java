package com.example.final_project.First_Category;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.final_project.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;


public class First_Category_Quiz extends AppCompatActivity {
    String title;       // firestore에 저장된 field의 키값인 title의 value 값을 저장할 변수
    String select1, select2, select3, select4;      // 선택한 객관식 번호를 저장하는 변수
    int choose;     // 현재 어떤 객관식 번호를 선택했는지 저장하는 변수
    int count=1;    // 현재 문제의 번호
    int fullcount=15;    // 문제의 총 개수
    int correctNum=0;   // 정답 번호
    int correctCount=0; // 맞춘 문제의 개수
    int score=0;        // 총 점수

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_category_design);

        final TextView textView = findViewById(R.id.First_Category_Title);
        final TextView textView1 = findViewById(R.id.select1);
        final TextView textView2 = findViewById(R.id.select2);
        final TextView textView3 = findViewById(R.id.select3);
        final TextView textView4 = findViewById(R.id.select4);
        final TextView textView5 = findViewById(R.id.progress);

        final FirebaseFirestore database = FirebaseFirestore.getInstance();
        DocumentReference doc = database.collection("First_Category_Quiz").document("First_Category_Pr" + count);

        doc.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    title = task.getResult().getString("title");
                    textView.setText(title);

                    select1 = task.getResult().getString("select1");
                    textView1.setText(select1);

                    select2 = task.getResult().getString("select2");
                    textView2.setText(select2);

                    select3 = task.getResult().getString("select3");
                    textView3.setText(select3);

                    select4 = task.getResult().getString("select4");
                    textView4.setText(select4);

                    textView5.setText(count + "/" + fullcount);

                    correctNum = Integer.parseInt(task.getResult().getString("answer"));

                    if (document.exists()) {
                        System.out.println(document.getData());
                    }
                }
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == fullcount) {
                    choose = 1;
                    if (choose == correctNum) correctCount++;
                    score = (100 / fullcount) * correctCount;
                    Intent intent = new Intent(getApplicationContext(), Result.class);
                    intent.putExtra("correctCount", correctCount);
                    intent.putExtra("fullCount", fullcount);
                    intent.putExtra("score", score);
                    startActivity(intent);
                }
                else {
                    count++;
                    choose = 1;
                    if (choose == correctNum) correctCount++;

                    DocumentReference doc = database.collection("First_Category_Quiz").document("First_Category_Pr" + count);
                    doc.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if (task.isSuccessful()) {
                                DocumentSnapshot document = task.getResult();
                                title = task.getResult().getString("title");
                                textView.setText(title);

                                select1 = task.getResult().getString("select1");
                                textView1.setText(select1);

                                select2 = task.getResult().getString("select2");
                                textView2.setText(select2);

                                select3 = task.getResult().getString("select3");
                                textView3.setText(select3);

                                select4 = task.getResult().getString("select4");
                                textView4.setText(select4);

                                textView5.setText(count + "/" + fullcount);

                                correctNum = Integer.parseInt(task.getResult().getString("answer"));

                                System.out.println(correctNum);
                                System.out.println(correctCount);
                                System.out.println(count);
                                System.out.println(score);
                                System.out.println((100 / fullcount) * correctCount);

                                if (document.exists()) {
                                    System.out.println(document.getData());
                                }
                            }
                        }
                    });
                }
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == fullcount) {
                    choose = 2;
                    if (choose == correctNum) correctCount++;
                    score = (100 / fullcount) * correctCount;
                    Intent intent = new Intent(getApplicationContext(), Result.class);
                    intent.putExtra("correctCount", correctCount);
                    intent.putExtra("fullCount", fullcount);
                    intent.putExtra("score", score);
                    startActivity(intent);
                }
                else {
                    count++;
                    choose = 2;
                    if (choose == correctNum) correctCount++;

                    DocumentReference doc = database.collection("First_Category_Quiz").document("First_Category_Pr" + count);
                    doc.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if (task.isSuccessful()) {
                                DocumentSnapshot document = task.getResult();
                                title = task.getResult().getString("title");
                                textView.setText(title);

                                select1 = task.getResult().getString("select1");
                                textView1.setText(select1);

                                select2 = task.getResult().getString("select2");
                                textView2.setText(select2);

                                select3 = task.getResult().getString("select3");
                                textView3.setText(select3);

                                select4 = task.getResult().getString("select4");
                                textView4.setText(select4);

                                textView5.setText(count + "/" + fullcount);

                                correctNum = Integer.parseInt(task.getResult().getString("answer"));

                                System.out.println(correctNum);
                                System.out.println(correctCount);
                                System.out.println(count);
                                System.out.println(score);
                                System.out.println((100 / fullcount) * correctCount);

                                if (document.exists()) {
                                    System.out.println(document.getData());
                                }
                            }
                        }
                    });
                }
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == fullcount) {
                    choose = 3;
                    if (choose == correctNum) correctCount++;
                    score = (100 / fullcount) * correctCount;
                    Intent intent = new Intent(getApplicationContext(), Result.class);
                    intent.putExtra("correctCount", correctCount);
                    intent.putExtra("fullCount", fullcount);
                    intent.putExtra("score", score);
                    startActivity(intent);
                } else {
                    count++;
                    choose = 3;
                    if (choose == correctNum) correctCount++;

                    DocumentReference doc = database.collection("First_Category_Quiz").document("First_Category_Pr" + count);
                    doc.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if (task.isSuccessful()) {
                                DocumentSnapshot document = task.getResult();
                                title = task.getResult().getString("title");
                                textView.setText(title);

                                select1 = task.getResult().getString("select1");
                                textView1.setText(select1);

                                select2 = task.getResult().getString("select2");
                                textView2.setText(select2);

                                select3 = task.getResult().getString("select3");
                                textView3.setText(select3);

                                select4 = task.getResult().getString("select4");
                                textView4.setText(select4);

                                textView5.setText(count + "/" + fullcount);

                                correctNum = Integer.parseInt(task.getResult().getString("answer"));

                                System.out.println(correctNum);
                                System.out.println(correctCount);
                                System.out.println(count);
                                System.out.println(score);
                                System.out.println((100 / fullcount) * correctCount);

                                if (document.exists()) {
                                    System.out.println(document.getData());
                                }
                            }
                        }
                    });
                }
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == fullcount) {
                    choose = 4;
                    if (choose == correctNum) correctCount++;
                    score = (100 / fullcount) * correctCount;
                    Intent intent = new Intent(getApplicationContext(), Result.class);
                    intent.putExtra("correctCount", correctCount);
                    intent.putExtra("fullCount", fullcount);
                    intent.putExtra("score", score);
                    startActivity(intent);
                } else {
                    count++;
                    choose = 4;
                    if (choose == correctNum) correctCount++;

                    DocumentReference doc = database.collection("First_Category_Quiz").document("First_Category_Pr" + count);
                    doc.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if (task.isSuccessful()) {
                                DocumentSnapshot document = task.getResult();
                                title = task.getResult().getString("title");
                                textView.setText(title);

                                select1 = task.getResult().getString("select1");
                                textView1.setText(select1);

                                select2 = task.getResult().getString("select2");
                                textView2.setText(select2);

                                select3 = task.getResult().getString("select3");
                                textView3.setText(select3);

                                select4 = task.getResult().getString("select4");
                                textView4.setText(select4);

                                textView5.setText(count + "/" + fullcount);

                                correctNum = Integer.parseInt(task.getResult().getString("answer"));

                                System.out.println(correctNum);
                                System.out.println(correctCount);
                                System.out.println(count);
                                System.out.println(score);
                                System.out.println((100 / fullcount) * correctCount);

                                if (document.exists()) {
                                    System.out.println(document.getData());
                                }
                            }
                        }
                    });
                }
            }
        });
    }
}
