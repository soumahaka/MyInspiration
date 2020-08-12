package com.example.prophetkacouphilippe.adaptersPackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prophetkacouphilippe.GridviewModelClass;
import com.example.prophetkacouphilippe.R;

import java.util.ArrayList;

public class GridviewAdapter extends ArrayAdapter<GridviewModelClass> {
    private static final String TAG = GridviewAdapter.class.getSimpleName();


    private Context context;

    public GridviewAdapter(Context context, ArrayList<GridviewModelClass> gridviewModelClassArrayList) {
        super(context,0,gridviewModelClassArrayList);
        //this.context=context;
        //this.gridviewModelClassArrayList=gridviewModelClassArrayList;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){
            convertView=LayoutInflater.from(getContext()).inflate(R.layout.girdview_items, parent,false);
        }
        GridviewModelClass gridviewModelClass=getItem(position);

        ImageView flag=convertView.findViewById(R.id.flag);
        //TextView language=convertView.findViewById(R.id.language);
        flag.setImageResource(gridviewModelClass.getFlag());
        //language.setText(gridviewModelClass.getLanguage());
        return convertView;

    }


}
