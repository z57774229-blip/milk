package com.example.mobiluygulamalar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Kitaptaki Button örneği: android:onClick="java_metot"
    public void java_metot(View v) {
        Toast.makeText(this, "java_metot çalıştı", Toast.LENGTH_SHORT).show();
    }

    // Kitaptaki Sıra Sizde: android:onClick="onayla"
    public void onayla(View v) {
        Toast.makeText(this, "onayla çalıştı", Toast.LENGTH_SHORT).show();
    }
}
