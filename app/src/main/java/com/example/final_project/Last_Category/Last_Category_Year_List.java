package com.example.final_project.Last_Category;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_project.R;

public class Last_Category_Year_List extends AppCompatActivity {
    ListAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_category_year_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new ListAdapter();

        adapter.addItem(new Year_Info("2020년 정보처리기사 1, 2회(필기)"));
        adapter.addItem(new Year_Info("2020년 정보처리기사 3회(필기)"));
        adapter.addItem(new Year_Info("2020년 정보처리기사 4회(필기)"));
        adapter.addItem(new Year_Info("2020년 정보처리기사 5회(필기)"));
        adapter.addItem(new Year_Info("2020년 정보처리기사 6회(필기)"));
        adapter.addItem(new Year_Info("2020년 정보처리기사 7회(필기)"));
        adapter.addItem(new Year_Info("2020년 정보처리기사 8회(필기)"));
        adapter.addItem(new Year_Info("2020년 정보처리기사 9회(필기)"));
        adapter.addItem(new Year_Info("2020년 정보처리기사 10회(필기)"));
        adapter.addItem(new Year_Info("2020년 정보처리기사 11회(필기)"));
        adapter.addItem(new Year_Info("2020년 정보처리기사 12회(필기)"));
        adapter.addItem(new Year_Info("2020년 정보처리기사 13회(필기)"));

        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new Last_Category_ClickListener() {
            @Override
            public void onItemClick(ListAdapter.ViewHolder holder, View view, int position) {
                Year_Info item = adapter.getItem(position);
                showToast("아이템 선택됨 : " + item.getYear());
                Intent intent = new Intent(getApplicationContext(), Last_Category_Quiz.class);
                startActivity(intent);
            }
        });
    }

    public void showToast(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}
