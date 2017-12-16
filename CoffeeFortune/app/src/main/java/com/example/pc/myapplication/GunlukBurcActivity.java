package com.example.pc.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class GunlukBurcActivity extends ActionBarActivity {

    TextView burcAdi_button, simge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunluk_burc);

        burcAdi_button = (TextView) findViewById(R.id.burcAdiButton);
        simge = (TextView) findViewById(R.id.simgeText);
        Intent intent = getIntent();

        final int gelenBurc = intent.getIntExtra("burcAdi", -1);


        switch (gelenBurc) {

            case 1:

                burcAdi_button.setText(" \n KOÇ   ");
                burcAdi_button.setTextColor(Color.parseColor("#ffff658b"));
                simge.setBackgroundResource(R.drawable.koc_);
                break;

            case 2:

                burcAdi_button.setText(" \n BOGA   ");
                burcAdi_button.setTextColor(Color.parseColor("#ffff658b"));
                simge.setBackgroundResource(R.drawable.boga_);
                break;

            case 3:

                burcAdi_button.setText(" \n IKIZLER   ");
                burcAdi_button.setTextColor(Color.parseColor("#ffff658b"));
                simge.setBackgroundResource(R.drawable.ikizler_);
                break;
            case 4:

                burcAdi_button.setText(" \n YENGEC   ");
                burcAdi_button.setTextColor(Color.parseColor("#ffff658b"));
                simge.setBackgroundResource(R.drawable.yengec_);
                break;
            case 5:

                burcAdi_button.setText(" \n ASLAN   ");
                burcAdi_button.setTextColor(Color.parseColor("#ffff658b"));
                simge.setBackgroundResource(R.drawable.leo_);
                break;
            case 6:

                burcAdi_button.setText(" \n BASAK   ");
                burcAdi_button.setTextColor(Color.parseColor("#ffff658b"));
                simge.setBackgroundResource(R.drawable.basak_);
                break;
            case 7:

                burcAdi_button.setText(" \n TERAZI   ");
                burcAdi_button.setTextColor(Color.parseColor("#ffff658b"));
                simge.setBackgroundResource(R.drawable.terazi_);
                break;
            case 8:

                burcAdi_button.setText(" \n AKREP   ");
                burcAdi_button.setTextColor(Color.parseColor("#ffff658b"));
                simge.setBackgroundResource(R.drawable.akrep_);
                break;
            case 9:

                burcAdi_button.setText(" \n YAY   ");
                burcAdi_button.setTextColor(Color.parseColor("#ffff658b"));
                simge.setBackgroundResource(R.drawable.yay_);
                break;
            case 10:

                burcAdi_button.setText(" \n OÐLAK   ");
                burcAdi_button.setTextColor(Color.parseColor("#ffff658b"));
                simge.setBackgroundResource(R.drawable.oglak_);
                break;
            case 11:

                burcAdi_button.setText(" \n KOVA   ");
                burcAdi_button.setTextColor(Color.parseColor("#ffff658b"));
                simge.setBackgroundResource(R.drawable.kova_);
                break;
            case 12:

                burcAdi_button.setText(" \n BALIK   ");
                burcAdi_button.setTextColor(Color.parseColor("#ffff658b"));
                simge.setBackgroundResource(R.drawable.balik_);
                break;
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gunluk_burc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
