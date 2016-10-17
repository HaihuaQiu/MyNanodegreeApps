package com.example.android.mynanodegreeapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popularMovies(View v){
        Toast.makeText(this,"This button will launch my popular movies app",Toast.LENGTH_SHORT).show();
    }
    public void stockHawk(View v){
        Toast.makeText(this,"This button will launch my stock hawk app",Toast.LENGTH_SHORT).show();
    }
    public void buildItBigger(View v){
        Toast.makeText(this,"This button will launch my build it bigger app",Toast.LENGTH_SHORT).show();
    }
    public void makeYouAppMaterial(View v){
        Toast.makeText(this,"This button will launch my make your all material app",Toast.LENGTH_SHORT).show();
    }
    public void goUbiquitous(View v){
        Toast.makeText(this,"This button will launch my go ubiquitous app",Toast.LENGTH_SHORT).show();
    }
    public void capstone(View v){
        Toast.makeText(this,"This button will launch my capstone app",Toast.LENGTH_SHORT).show();
    }
}
