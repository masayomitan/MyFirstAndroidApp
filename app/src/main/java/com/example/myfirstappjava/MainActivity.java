package com.example.myfirstappjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      long product = 1l;
              for(int i = 1; i <=20; i++) {
                  product = product * i;
              }
              this.setTitle(String.valueOf(product));

    }
}
