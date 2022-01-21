package com.example.digitclassifier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        Button startBtn = findViewById(R.id.start_btn);
        TextView resultTv = findViewById(R.id.result_tv);

        startBtn.setOnClickListener(view -> new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    final int num = i + 1;
                    Thread.sleep(1000);
                    runOnUiThread(() -> resultTv.setText("" + num));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start());
    }
}

