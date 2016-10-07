package com.example.user.calc.ui;

/**
 * Created by User on 07.10.2016.
 */

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.calc.Config;
import com.example.user.calc.R;

/**
 * Created by Oleg on 04.10.2016.
 */

public class Result extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2, container, false);

        TextView res = (TextView) v.findViewById(R.id.result);

        Bundle bundle = this.getArguments();
        res.setText(bundle.getString("tag"));
        return v;
    }
}
