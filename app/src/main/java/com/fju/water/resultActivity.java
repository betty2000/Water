package com.fju.water;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_result);
            Intent intent = getIntent();
            float fee = intent.getFloatExtra("FEE",-1);
            Log.d("ResultActivity",fee+"");
            TextView feeText = findViewById(R.id.fee) ;
            int n = (int) (fee+0.5f);
            feeText.setText(n+"");

        }


    }




