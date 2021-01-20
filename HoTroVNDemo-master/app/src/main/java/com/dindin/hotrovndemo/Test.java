package com.dindin.hotrovndemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.dindin.hotrovndemo.fragment.GoogleMapFragment;
import com.dindin.hotrovndemo.fragment.ShowListReliefFragment;

import java.util.ArrayList;

public class Test extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment, new GoogleMapFragment(new ArrayList<Poco>()))
                        .commit();
            }
        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment, new ShowListReliefFragment(new ArrayList<>(), 1))
                        .commit();
            }
        });
    }
}