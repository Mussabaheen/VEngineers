package com.example.mussabaheen.vengineers;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mussabaheen on 4/15/18.
 */

public class shopping extends Fragment{
    View myView;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.shopping,container,false);
        return myView;
    }
}
