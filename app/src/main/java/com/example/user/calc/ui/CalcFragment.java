package com.example.user.calc.ui;

/**
 * Created by User on 07.10.2016.
 */

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.calc.Config;
import com.example.user.calc.R;

/**
 * Created by Oleg on 04.10.2016.
 */

public class CalcFragment extends Fragment implements View.OnClickListener {


    EditText input;
    //----------------------------------------
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    //    --------------------------------------------
    Button btnPoint;
    Button btnMul;
    Button btnDiv;
    Button btnPlus;
    Button btnMinus;
    Button btnClear;
    Button btnEquals;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.calc, container, false);

        input = (EditText) v.findViewById(R.id.input);

        btnZero = (Button) v.findViewById(R.id.btnZero);
        btnZero.setOnClickListener(this);


        btnOne = (Button) v.findViewById(R.id.btnOne);
        btnOne.setOnClickListener(this);

        btnTwo = (Button) v.findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(this);

        btnThree = (Button) v.findViewById(R.id.btnThree);
        btnThree.setOnClickListener(this);

        btnFour = (Button) v.findViewById(R.id.btnFour);
        btnFour.setOnClickListener(this);

        btnFive = (Button) v.findViewById(R.id.btnFive);
        btnFive.setOnClickListener(this);

        btnSix = (Button) v.findViewById(R.id.btnSix);
        btnSix.setOnClickListener(this);

        btnSeven = (Button) v.findViewById(R.id.btnSeven);
        btnSeven.setOnClickListener(this);

        btnEight = (Button) v.findViewById(R.id.btnEight);
        btnEight.setOnClickListener(this);

        btnNine = (Button) v.findViewById(R.id.btnNine);
        btnNine.setOnClickListener(this);

        btnPoint = (Button) v.findViewById(R.id.btnPoint);
        btnPoint.setOnClickListener(this);

        btnPlus = (Button) v.findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(this);

        btnMinus = (Button) v.findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(this);

        btnMul = (Button) v.findViewById(R.id.btnMulti);
        btnMul.setOnClickListener(this);

        btnDiv = (Button) v.findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(this);


        btnClear = (Button) v.findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);

        btnEquals = (Button) v.findViewById(R.id.btnEquals);
        btnEquals.setOnClickListener(this);

        Log.d(Config.TAG, "CalcFragment - onCreateView");
        return v;
    }

    int a = 0;
    int b = 0;
    char op;

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.btnOne:
                input.setText("1" + input.getText());
                Log.d(Config.TAG, "one clicked: " + input.getText());
                break;

            case R.id.btnTwo:
                Log.d(Config.TAG, "two clicked: " + btnTwo.getId());
                input.setText("2" + input.getText());
                break;

            case R.id.btnThree:
                Log.d(Config.TAG, "three clicked: " + btnThree.getId());
                input.setText("3" + input.getText());
                break;

            case R.id.btnFour:
                Log.d(Config.TAG, "four clicked: " + btnFour.getId());
                input.setText("4" + input.getText());
                break;

            case R.id.btnFive:
                Log.d(Config.TAG, "five clicked: " + btnFive.getId());
                input.setText("5" + input.getText());
                break;

            case R.id.btnSix:
                Log.d(Config.TAG, "six clicked: " + btnSix.getId());
                input.setText("6" + input.getText());
                break;

            case R.id.btnSeven:
                Log.d(Config.TAG, "seven clicked: " + btnSeven.getId());
                input.setText("7" + input.getText());
                break;

            case R.id.btnEight:
                Log.d(Config.TAG, "eight clicked: " + btnEight.getId());
                input.setText("8" + input.getText());
                break;

            case R.id.btnNine:
                Log.d(Config.TAG, "nine clicked: " + btnNine.getId());
                input.setText("8" + input.getText());
                break;

            case R.id.btnZero:
                Log.d(Config.TAG, "zero clicked: " + btnZero.getId());
                input.setText("0" + input.getText());
                break;


            case R.id.btnMulti:
                a = Integer.parseInt(input.getText().toString());
                op = '*';
                input.setText("");
                Log.d(Config.TAG, "* clicked: " + a);
                break;


            case R.id.btnDiv:
                a = Integer.parseInt(input.getText().toString());
                op = '/';
                Log.d(Config.TAG, "div clicked: " + a);
                input.setText("");
                break;

            case R.id.btnPlus:
                a = Integer.parseInt(input.getText().toString());
                op = '+';
                Log.d(Config.TAG, "plus clicked: " + a);
                input.setText("");
                break;


            case R.id.btnMinus:
                a = Integer.parseInt(input.getText().toString());
                op = '-';
                Log.d(Config.TAG, "Minus clicked: " + a);
                input.setText("");
                break;

            case R.id.btnClear:
                Log.d(Config.TAG, "clear clicked: " + btnClear.getId());
                input.setText("");
                break;

            case R.id.btnPoint:
                Log.d(Config.TAG, "point clicked: " + btnPoint.getId());
                input.setText("");
                break;

            case R.id.btnEquals:
                Adapter adapter = new Adapter();
                b = Integer.parseInt(input.getText().toString());
                int res = adapter.result(a, b, op);

                Result result = new Result();
                Bundle bundle = new Bundle();
                bundle.putString("tag", res + "");
                result.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.activity_main, result);
                fragmentTransaction.commit();

                break;
        }
    }
}