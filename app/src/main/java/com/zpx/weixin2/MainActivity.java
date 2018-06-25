package com.zpx.weixin2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity implements  RadioGroup.OnCheckedChangeListener {

    private RadioGroup bar;
    private RadioButton rb;
    private ListView listView;


    private MyFragment fg1,fg3,fg4;
    private tong fg2;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getFragmentManager();
        bar = findViewById(R.id.end);
        bar.setOnCheckedChangeListener(this);
        rb = findViewById(R.id.rb1);
        rb.setChecked(true);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fun(fragmentTransaction);
        switch (checkedId){
            case R.id.rb1:
                    listView = findViewById(R.id.xx1);
                    LinkedList mData = new LinkedList<s1>();
                    mData.add(new s1("张佩璇 "
                            , "早点睡"
                            , "下午2:48",R.mipmap.zpx));
                    mData.add(new s1("部长"
                            , "准备"
                            , "上午10:37",R.mipmap.bz));
                    mData.add(new s1("赵婕"
                            , "斗地主"
                            , "上午10:03",R.mipmap.zj));
                    mData.add(new s1("张佩璇"
                            , "邓丽娟"
                            , "上午9:38",R.mipmap.zpx3));
                    mData.add(new s1("佩璇"
                            , "么么哒"
                            , "上午9:38",R.mipmap.zpx4));
                    mData.add(new s1("小璇璇"
                            , "小心心送给你"
                            , "上午9:38",R.mipmap.zpx5));
                    mData.add(new s1("zy"
                            , "99"
                            , "上午9:38",R.mipmap.zpx6));
                    mData.add(new s1("lzy"
                            , "88"
                            , "上午9:38",R.mipmap.zpx7));
                    mData.add(new s1("哈哈"
                            , "嘻嘻"
                            , "上午9:38",R.mipmap.zpx8));
                    s2 mAdapter = new s2((LinkedList<s1>) mData, this);

                    listView.setAdapter(mAdapter);
                break;
            case R.id.rb2:
                listView = findViewById(R.id.xx1);
                LinkedList mData1 = new LinkedList<a1>();
                mData1.add(new a1("新的朋友",R.mipmap.tong1));
                mData1.add(new a1("群聊", R.mipmap.qun));
                mData1.add(new a1("标签",R.mipmap.biaoqian));
                mData1.add(new a1("公众号",R.mipmap.per));
                mData1.add(new a1("张佩璇",R.mipmap.zpx4));
                mData1.add(new a1("赵婕",R.mipmap.zj));
                mData1.add(new a1("部长",R.mipmap.bz));
                a2 mAdapter1 = new a2((LinkedList<a1>) mData1, this);
                listView.setAdapter(mAdapter1);
                break;
            case R.id.rb3:
                    listView = findViewById(R.id.xx1);
                    LinkedList mData2 = new LinkedList<a1>();
                    mData2.add(new a1("朋友圈", R.mipmap.peng));
                    mData2.add(new a1("摇一摇", R.mipmap.yao));
                    mData2.add(new a1("游戏", R.mipmap.you));
                    a2 mAdapter2 = new a2((LinkedList<a1>) mData2, this);
                    listView.setAdapter(mAdapter2);
                    break;
            case R.id.rb4:
                listView = findViewById(R.id.xx1);
                LinkedList mData3 = new LinkedList<a1>();
                mData3.add(new a1("钱包", R.mipmap.bao));
                mData3.add(new a1("相册", R.mipmap.xiang));
                mData3.add(new a1("表情", R.mipmap.qing));
                mData3.add(new a1("设置", R.mipmap.qian));
                a2 mAdapter3 = new a2((LinkedList<a1>) mData3, this);
                listView.setAdapter(mAdapter3);
                break;
        }
    }


    private void fun(FragmentTransaction fragmentTransaction) {
        if(fg1 != null)fragmentTransaction.hide(fg1);
        if(fg2 != null)fragmentTransaction.hide(fg2);
        if(fg3 != null)fragmentTransaction.hide(fg3);
        if(fg4 != null)fragmentTransaction.hide(fg4);

    }
}
