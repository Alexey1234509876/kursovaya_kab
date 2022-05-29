package com.example.kursovaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.kursovaya.image.FaceDetectionMLKit;
import com.example.kursovaya.image.FlowerIdentificationActivity;
import com.example.kursovaya.image.ImageClassificationActivity;
import com.example.kursovaya.image.Detector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //усли кто-то нажмет на кнопку <Google Image Activity>, то сработает этот метод
    //и мы перейдем в новую активити (страницу)
    public void onGotoImageActivity(View view) {
        //запуск ImageHelperActivity
        Intent intent = new Intent(this, ImageClassificationActivity.class);
        startActivity(intent);
    }

    public void onGotoFlowerIdentification(View view) {
        //запуск ImageHelperActivity
        Intent intent = new Intent(this, FlowerIdentificationActivity.class);
        startActivity(intent);
    }

    public void onGotoTestClass(View view) {
        //запуск ImageHelperActivity
        Intent intent = new Intent(this, Detector.class);
        startActivity(intent);
    }

    public void onGotoFaceDetectionMLKit(View view) {
        //запуск ImageHelperActivity
        Intent intent = new Intent(this, FaceDetectionMLKit.class);
        startActivity(intent);
    }
}

