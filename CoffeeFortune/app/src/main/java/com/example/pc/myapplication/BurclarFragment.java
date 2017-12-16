package com.example.pc.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BurclarFragment extends Fragment implements View.OnClickListener{

Button burc1,burc2,burc3,burc4,burc5, burc6,burc7,burc8,burc9,burc10,burc11,burc12;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_burclar,
                container, false);
        burc1= (Button) view.findViewById(R.id.koc_burc);
        burc1.setOnClickListener(this);

        burc2= (Button) view.findViewById(R.id.boga_burcButton);
        burc2.setOnClickListener(this);

        burc3= (Button) view.findViewById(R.id.ikizler_burcButton);
        burc3.setOnClickListener(this);

        burc4= (Button) view.findViewById(R.id.yengec_burcButton);
        burc4.setOnClickListener(this);

        burc5= (Button) view.findViewById(R.id.aslan_burcButton);
        burc5.setOnClickListener(this);

        burc6= (Button) view.findViewById(R.id.basak_burcButton);
        burc6.setOnClickListener(this);

        burc7= (Button) view.findViewById(R.id.terazi_burcButton);
        burc7.setOnClickListener(this);

        burc8= (Button) view.findViewById(R.id.akrep_burcButton);
        burc8.setOnClickListener(this);

        burc9= (Button) view.findViewById(R.id.yay_burcButton);
        burc9.setOnClickListener(this);

        burc10= (Button) view.findViewById(R.id.oglak_burcButton);
        burc10.setOnClickListener(this);

        burc11= (Button) view.findViewById(R.id.kova_burcButton);
        burc11.setOnClickListener(this);

        burc12= (Button) view.findViewById(R.id.balik_burcButton);
        burc12.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        int no;
        Intent intent = new Intent(getActivity(), GunlukBurcActivity.class);
        switch (v.getId()) {
            case R.id.koc_burc:

                no=1;

                intent.putExtra("burcAdi",no);
                startActivity(intent);
                break;
            case R.id.boga_burcButton:

                no=2;
                intent.putExtra("burcAdi",no);
                startActivity(intent);
                break;

            case R.id.ikizler_burcButton:

                no=3;
                intent.putExtra("burcAdi",no);
                startActivity(intent);
                break;
            case R.id.yengec_burcButton:

                no=4;
                intent.putExtra("burcAdi",no);
                startActivity(intent);
                break;
            case R.id.aslan_burcButton:

                no=5;
                intent.putExtra("burcAdi",no);
                startActivity(intent);
                break;
            case R.id.basak_burcButton:

                no=6;
                intent.putExtra("burcAdi",no);
                startActivity(intent);
                break;
            case R.id.terazi_burcButton:

                no=7;
                intent.putExtra("burcAdi",no);
                startActivity(intent);
                break;
            case R.id.akrep_burcButton:

                no=8;
                intent.putExtra("burcAdi",no);
                startActivity(intent);
                break;
            case R.id.yay_burcButton:

                no=9;
                intent.putExtra("burcAdi",no);
                startActivity(intent);
                break;
            case R.id.oglak_burcButton:

                no=10;
                intent.putExtra("burcAdi",no);
                startActivity(intent);
                break;
            case R.id.kova_burcButton:

                no=11;
                intent.putExtra("burcAdi",no);
                startActivity(intent);
                break;
            case R.id.balik_burcButton:

                no=12;
                intent.putExtra("burcAdi",no);
                startActivity(intent);
                break;

        }
    }
}
