package com.testapp.passgenerator;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.saturatelib.applib.SatLib;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private String fontPath = "fonts/myFont.ttf";
    private TextView textViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createFont();
    }

    public void createFont() {
        textViewMain = findViewById(R.id.textview_main);
        Typeface typeface = Typeface.createFromAsset(getAssets(), fontPath);
        textViewMain.setTypeface(typeface);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SatLib.class);
        startActivity(intent);
    }
}
