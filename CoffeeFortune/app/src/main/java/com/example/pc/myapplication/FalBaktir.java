package com.example.pc.myapplication;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.Calendar;


public class FalBaktir extends ActionBarActivity {

    ImageButton resimYukle3,resimYukle1,resimYukle2;
    Button dogm_tarih;
    Spinner spinner_iliski;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fal_gonder);

        resimYukle1= (ImageButton) findViewById(R.id.resimyukle1);
        resimYukle2 = (ImageButton) findViewById(R.id.resimyukle2);
        resimYukle3 = (ImageButton) findViewById(R.id.resimyukle3);

        if(getIntent().hasExtra("byteArray")) {
         //   ImageView previewThumbnail = new ImageView(this);
            Bitmap b = BitmapFactory.decodeByteArray(
                    getIntent().getByteArrayExtra("byteArray"), 0, getIntent().getByteArrayExtra("byteArray").length);
            resimYukle1.setImageBitmap(b);
        }



        spinner_iliski = (Spinner) findViewById(R.id.iliski_durumSpinnerGonder);


        spinner_iliski.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });

        dogm_tarih= (Button) findViewById(R.id.dogumTarihi);
        dogm_tarih.setOnClickListener(new View.OnClickListener() {//tarihButona Click Listener ekliyoruz

            @Override
            public void onClick(View v) {

                Calendar mcurrentTime = Calendar.getInstance();
                int year = mcurrentTime.get(Calendar.YEAR);
                int month = mcurrentTime.get(Calendar.MONTH);
                int day = mcurrentTime.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePicker;
                datePicker = new DatePickerDialog(FalBaktir.this, new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear,
                                          int dayOfMonth) {

                        dogm_tarih.setText(dayOfMonth + "/" + monthOfYear + "/" + year);

                    }
                }, year, month, day);
                datePicker.setTitle("Tarih Seciniz");
                datePicker.setButton(DatePickerDialog.BUTTON_POSITIVE, "Ayarla", datePicker);
                datePicker.setButton(DatePickerDialog.BUTTON_NEGATIVE, "Iptal", datePicker);

                datePicker.show();

            }
        });


        resimYukle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(FalBaktir.this, FotoYukleActivity.class);
                startActivity(intent);
                finish();
            }
        });

        resimYukle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(FalBaktir.this, FotoYukleActivity.class);
                startActivity(intent);
                finish();
            }
        });


        resimYukle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(FalBaktir.this, FotoYukleActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fal_gonder, menu);
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
