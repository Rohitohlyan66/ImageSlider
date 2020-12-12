package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    Adapter adapter;
    List<Data> data;

    String url="https://img.freepik.com/free-photo/beautiful-woman-portrait_144627-27912.jpg?size=626&ext=jpg&ga=GA1.2.706123966.1590856939";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2=findViewById(R.id.view_pager_2);
        data=new ArrayList<>();

        data.add(new Data(url));
        data.add(new Data(url));
        data.add(new Data(url));
        data.add(new Data(url));
        data.add(new Data(url));
        data.add(new Data(url));
        data.add(new Data(url));

        adapter=new Adapter(data);
        viewPager2.setAdapter(adapter);

    }
}