package com.zpx.weixin2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class s2 extends BaseAdapter{
    private List<s1> data;
    private Context context;
    public s2(List<s1> data ,Context context){
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
            convertView = LayoutInflater.from(context).inflate(R.layout.fg_content,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.name = convertView.findViewById(R.id.name);
            viewHolder.speak = convertView.findViewById(R.id.nei);
            viewHolder.time = convertView.findViewById(R.id.time);
            viewHolder.head = convertView.findViewById(R.id.tou);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.head.setBackgroundResource(data.get(position).getId());
        viewHolder.name.setText(data.get(position).getName());
        viewHolder.speak.setText(data.get(position).getSpeak());
        viewHolder.time.setText(data.get(position).getTime());
        return convertView;
    }

    private class ViewHolder {
        TextView name;
        TextView speak;
        TextView time;
        ImageView head;
    }
}
