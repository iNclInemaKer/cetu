package com.example.teamo.cetu;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


public class Menus extends Fragment {

    GridView item;
    String [] ESTADIOS;
    int [] imagen = {
      R.drawable.neney,
      R.drawable.marce,
      R.drawable.ronal
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menus, container, false);


    }


}
