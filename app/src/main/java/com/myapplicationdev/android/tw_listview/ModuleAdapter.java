package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private ArrayList<Module> modules;
    private Context context;
    private TextView tvModule;
    private ImageView ivImage;

    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects){
        super(context, resource, objects);
        modules = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvModule = (TextView) rowView.findViewById(R.id.tvModule);
        ivImage = (ImageView) rowView.findViewById(R.id.ivImage);

        Module currModule = modules.get(position);

        tvModule.setText(currModule.getModule());
        ivImage.setImageResource(currModule.getModuleImage());

        return rowView;
    }

}
