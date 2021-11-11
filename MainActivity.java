package com.example.makharijal_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPractice(View view)
    {
        Intent intent = new Intent(this, Practice.class);
        startActivity(intent);
    }

    public void openQuiz(View view)
    {
        Intent quiz = new Intent(this, MainQuiz.class);
        startActivity(quiz);
    }

    public void repository(View view)
    {
        Uri uri = Uri.parse("https://github.com/ferozamir88/Makharij");
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


}
