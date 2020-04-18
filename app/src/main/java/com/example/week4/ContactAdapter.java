package com.example.week4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ContactAdapter extends BaseAdapter {
    private Context context;
    Person[] data;

    public ContactAdapter(Context mainActivityContext,Person[] data){
        this.context = mainActivityContext;
        this.data = data;
    }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View row = inflater.inflate(R.layout.custom_row,null);
        TextView name = row.findViewById(R.id.name);
        TextView phoneNumber = row.findViewById(R.id.phoneNumber);
        ImageView avatar = row.findViewById(R.id.avatar);

        name.setText(data[position].name);
        phoneNumber.setText(data[position].phoneNumber);
        avatar.setImageResource(data[position].avatar);

        return row;
    }
}
