package com.quesada.connorcalculator;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Alex on 3/10/2015.
 */
public class menu3_Fragment extends android.support.v4.app.Fragment {

    Button calculate;
    Button messageBox;
    EditText principal;
    EditText rate;
    EditText period;
    TextView simpleInterest;
    TextView siText;
    Context context;

    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.menu3_layout, container, false);
        return rootview;
    }
}
