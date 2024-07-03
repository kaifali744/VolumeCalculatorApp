package com.example.volumecalculatorapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {
    private ArrayList<Shape> shapeArrayList;
    private Context context;

    public MyCustomAdapter(ArrayList<Shape> shapeArrayList, Context context) {
        super(context, R.layout.grid_layout_file, shapeArrayList);
        this.context = context;
        this.shapeArrayList = shapeArrayList;
    }
    private static class MyViewHolder{
        ImageView imageView;
        TextView shapeName;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shapes = getItem(position);

        MyViewHolder myViewHolder;

        if (convertView == null){
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater= LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.grid_layout_file, parent, false);

            myViewHolder.imageView =(ImageView) convertView.findViewById(R.id.imageView);
            myViewHolder.shapeName =(TextView) convertView.findViewById(R.id.shapeName);

            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        myViewHolder.shapeName.setText(shapes.getShapeName());
        myViewHolder.imageView.setImageResource(shapes.getShapeImg());

        return convertView;

    }
}
