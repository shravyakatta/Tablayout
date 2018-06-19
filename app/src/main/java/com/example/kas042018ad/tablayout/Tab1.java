package com.example.kas042018ad.tablayout;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Tab1 extends Fragment {
RecyclerView rv;
Context context;
Adapter adapter;
ArrayList<model>modelArrayList;
    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        View v = inflater.inflate( R.layout.tab1, container, false );
        modelArrayList=new ArrayList<>(  );
        rv=(RecyclerView)v.findViewById( R.id.rv );
        adapter=new Adapter(0,getActivity(),modelArrayList);
        rv.setLayoutManager( new LinearLayoutManager(  getActivity(),LinearLayoutManager.VERTICAL,false) );
        rv.setAdapter( adapter );
        rv.setHasFixedSize( true );

mydata();
        return v;
    }

    private void mydata() {
        model m1=new model( "sravya","employee" ,R.drawable.icon);
        modelArrayList.add( m1 );
        model m2=new model( "scsfsa","sdadsa",R.drawable.icon );
        modelArrayList.add( m2 );
        model m3=new model( "sadsaads","sdad" ,R.drawable.icon);
        modelArrayList.add( m3 );
        model m4=new model( "dsadsad","dsads",R.drawable.icon );
        modelArrayList.add( m4);
    }
}

