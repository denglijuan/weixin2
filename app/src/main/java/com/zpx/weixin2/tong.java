package com.zpx.weixin2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class tong extends Fragment {
    private int id;
    private String name;

    public  tong ( int id ,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tong,container,false);
        TextView txt_content = (TextView) view.findViewById(R.id.s2);
        ImageView txt_content3 = (ImageView) view.findViewById(R.id.s1);
        txt_content.setText(name);
        txt_content3.setImageResource(id);
        return view;
    }

}
