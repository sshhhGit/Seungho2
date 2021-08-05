package com.example.seungho2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

import java.util.ArrayList;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
    public static final int REQUEST_CODE = 101;
    String[] str = new String[]{"아아", "뜨아", "카페라떼", "카페모카", "카푸치노", "콜드브루", "마키아또" }
//    Button[] btnId = new Button[]{findViewById(R.id.btnA_1), findViewById(R.id.btnB_1), findViewById(R.id.btnC_1)
//                               ,findViewById(R.id.btnD_1), findViewById(R.id.btnE_1), findViewById(R.id.btnF_1)
//                               ,findViewById(R.id.btnG_1)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabspecCoffee = tabHost.newTabSpec("COFFEE").setIndicator("커피");
        tabspecCoffee.setContent(R.id.tabCoffee);
        tabHost.addTab(tabspecCoffee);

        TabHost.TabSpec tabspecTea = tabHost.newTabSpec("TEA").setIndicator("차");
        tabspecTea.setContent(R.id.tabTea);
        tabHost.addTab(tabspecTea);

        TabHost.TabSpec tabspecAde = tabHost.newTabSpec("ADE").setIndicator("에이드&주스");
        tabspecAde.setContent(R.id.tabAde);
        tabHost.addTab(tabspecAde);

        tabHost.setCurrentTab(0);

    }

    public void mOnClick(View view) {

        Intent intent = new Intent(getApplicationContext(), ShoppingbasketActivity.class);
        startActivityForResult(intent, REQUEST_CODE);


    }
    public void mOnClick1(View view){
        if (view.getId() == R.id.btnA_1) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("아아");
        }


    }


}