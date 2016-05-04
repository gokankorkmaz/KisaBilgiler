package com.gokankorkmaz.bilgibankasi;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    TextView textView,textView2;
    Button button;
    RelativeLayout relativeLayout;


    private BilgiDeposu mBilgiDeposu=new BilgiDeposu();     //Nesneyi tanımladık
    private Renkler mrenkler=new Renkler();                 //Objemizi olusturduk


     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         textView = (TextView) findViewById(R.id.textView);
         textView2 = (TextView) findViewById(R.id.textView2);
         button = (Button) findViewById(R.id.button);
         relativeLayout=(RelativeLayout)findViewById(R.id.relativeLayout);


         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                String bilgi=mBilgiDeposu.getBilgi();
                textView2.setText(bilgi);

                int renk=mrenkler.getRenkler();

                 relativeLayout.setBackgroundColor(renk);
             //    mBilgiDeposu.mRenkler[0]="Gökhan KORKMAZ Tarafından Değiştirildi";

                 button.setTextColor(renk);
             }
         });



     }
};
