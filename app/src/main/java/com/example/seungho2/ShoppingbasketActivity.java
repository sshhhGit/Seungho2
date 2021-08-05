package com.example.seungho2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShoppingbasketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingbasket);

        TextView[] tv = new TextView[]{findViewById(R.id.tv1), findViewById(R.id.tv1), findViewById(R.id.tv1), findViewById(R.id.tv1)
                                       ,findViewById(R.id.tv1), findViewById(R.id.tv1), findViewById(R.id.tv1), findViewById(R.id.tv1)};

        Button btnPrv = (Button)findViewById(R.id.btnPrv);
        Intent intent = getIntent();
        String coffee = intent.getExtras().getString("coffee");
        for (int i = 0; i < tv.length; i++) {
            if (tv[i].setText();)
        }
        tv.setText(coffee);
        tv.setBackgroundColor();

    }
}
