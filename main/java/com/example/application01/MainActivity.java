package com.example.application01;
import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;

import android.util.Log;
import android.view.View;
 import android.view.ViewStructure;
 import android.widget.Button;

import androidx.annotation.Nullable;

public class MainActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                 this.setContentView(R.layout.activity_main);

             }

             public void click(View view){
                 int i = view.getId();

                 switch (i){

                         case R.id.button1:
                             Log.d("MainActivity","button1 is clicked");
                                this.setContentView(R.layout.page1);

                                 break;

                         case R.id.button2:
                             Log.d("MainActivity","button2 is clicked");
                                 this.setContentView(R.layout.page2);

                                 break;

                     }
            }

         }