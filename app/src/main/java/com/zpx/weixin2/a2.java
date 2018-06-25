package com.zpx.weixin2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class a2 extends BaseAdapter{
    private List<a1> data;
    private Context context;
    public a2(List<a1> data ,Context context){
        this.context=context;
        this.data=data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder =null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.tong,parent,false);
            viewHolder = new a2.ViewHolder();
            viewHolder.name = convertView.findViewById(R.id.s2);
            viewHolder.head = convertView.findViewById(R.id.s1);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (a2.ViewHolder) convertView.getTag();
        }
        viewHolder.head.setBackgroundResource(data.get(position).getId());
        viewHolder.name.setText(data.get(position).getName());
        return convertView;
    }

    private class ViewHolder {
        TextView name;
        ImageView head;
    }
}
