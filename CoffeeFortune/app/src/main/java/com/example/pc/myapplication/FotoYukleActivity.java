package com.example.pc.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;


public class FotoYukleActivity extends ActionBarActivity {

    ImageButton resimCek;
    ImageView resim_;
    Button devam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_yukle);

        resimCek= (ImageButton) findViewById(R.id.resimCekIB);
        resim_= (ImageView) findViewById(R.id.resim);
        devam= (Button) findViewById(R.id.devamet_yukle);





        resimCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        final Bitmap bm= (Bitmap) data.getExtras().get("data");
        resim_.setImageBitmap(bm);



        devam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(FotoYukleActivity.this, FalBaktir.class);
                Bitmap b; // your bitmap
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                bm.compress(Bitmap.CompressFormat.PNG, 50, bs);
                i.putExtra("byteArray", bs.toByteArray());
                startActivity(i);
                finish();


            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_foto_yukle, menu);
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
