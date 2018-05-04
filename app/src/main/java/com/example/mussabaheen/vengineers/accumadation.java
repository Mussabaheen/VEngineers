package com.example.mussabaheen.vengineers;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.R.attr.fragment;

/**
 * Created by Mussabaheen on 4/15/18.
 */

public class accumadation extends Fragment
{
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
            myView=inflater.inflate(R.layout.accumadtion,container,false);
            return myView;

        }

}


