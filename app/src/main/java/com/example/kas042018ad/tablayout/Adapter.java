package com.example.kas042018ad.tablayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Student> {
    RecyclerView rv;
    int flage=0;
    Context context;
    ArrayList<model>modelArrayList;

    public Adapter(int flage, Context context, ArrayList<model> modelArrayList) {
        this.flage = flage;
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @Override
    public Student onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(flage==0) {

            Student st = new Student( LayoutInflater.from( parent.getContext() ).inflate( R.layout.design, parent, false ) );
            return st;
        }else if(flage==1) {
            Student st = new Student( LayoutInflater.from( parent.getContext() ).inflate( R.layout.designgrid, parent, false ) );
            return st;
        }else if (flage==2) {
            Student st = new Student( LayoutInflater.from( parent.getContext() ).inflate( R.layout.card, parent, false ) );
            return st;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Student holder, int position) {
        holder.name.setText( modelArrayList.get(position  ).getName() );
        holder.designation.setText( modelArrayList.get( position ).getDesignation() );
        holder.imageView.setImageResource( modelArrayList.get( position ).getImage() );

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    class Student extends RecyclerView.ViewHolder {
        TextView name,designation;
        ImageView imageView;
        public Student(View itemView) {
            super( itemView );
            name=(TextView)itemView.findViewById(R.id.name );
            designation=(TextView)itemView.findViewById( R.id.designation );
            imageView=(ImageView)itemView.findViewById( R.id.image );
        }
    }
}
