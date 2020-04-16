package com.example.myfirstappjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstText = (TextView)findViewById(R.id.firstText);

        long factorial = calculateFactorial(20);
        firstText.setText(String.valueOf(factorial));
    }

    private long calculateFactorial(int n) {
        long product = 1L;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        return product;
    }
}
