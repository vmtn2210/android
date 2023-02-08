package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvtraicay;
    ArrayList<TraiCay> arrayTraicay; //Dòng dữ liệu gồm hình, tên, mô tả
    TraiCayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        adapter = new TraiCayAdapter( this,R.layout.dong_trai_cay,arrayTraicay);
        lvtraicay.setAdapter(adapter);
    }

    public void Anhxa(){
        lvtraicay =(ListView) findViewById(R.id.lisviewTraiCay);
        arrayTraicay = new ArrayList<>();
        arrayTraicay.add(new TraiCay("Chuối tiêu","Chuối tiêu Long An", R.drawable.chuoitieu));
        arrayTraicay.add(new TraiCay("Nho Xanh","Nho xanh không hạt", R.drawable.nhoxanh));
        arrayTraicay.add(new TraiCay("Thanh Long","Thanh Long ruột đỏ", R.drawable.thanhlongruotdo));

    }
}