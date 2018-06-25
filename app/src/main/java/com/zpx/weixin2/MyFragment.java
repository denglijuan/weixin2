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
public class MyFragment extends Fragment {

    private String userName;
    private String userNSpeak;
    private String speakTime;
    private int id;

    public MyFragment(String userName, String userNSpeak, String speakTime,int id) {
        this.userName = userName;
        this.userNSpeak = userNSpeak;
        this.speakTime = speakTime;
        this.id=id;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_content,container,false);
        TextView txt_content = (TextView) view.findViewById(R.id.name);
        TextView txt_content1 = (TextView) view.findViewById(R.id.nei);
        TextView txt_content2 = (TextView) view.findViewById(R.id.time);
        ImageView txt_content3 = (ImageView) view.findViewById(R.id.tou);
        txt_content.setText( userName);
        txt_content1.setText(userNSpeak);
        txt_content2.setText(speakTime);
        txt_content3.setImageResource(id);
        return view;

    }
}
