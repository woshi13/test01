package com.example.application01;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class page2 extends Activity {
    @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
                 super.onCreate(savedInstanceState);
                 setContentView(R.layout.page2);

                 Button btn1 = (Button)findViewById(R.id.button1);
                 Button btn2 = (Button)findViewById(R.id.button2);

                 btn1.setOnClickListener(new View.OnClickListener() {
    @Override
   public void onClick(View view) {
                 Intent i = new Intent(page2.this , page1.class);
                 startActivity(i);
             }
       });
               btn2.setOnClickListener(new View.OnClickListener() {
   @Override
   public void onClick(View view) {
                 Intent b = new Intent(page2.this , page2.class);

       startActivity(b);
              }
      });

           }
 }