package com.quesada.connorcalculator;

//import android.app.Fragment;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Alex on 3/10/2015.
 */
public class menu1_Fragment extends android.support.v4.app.Fragment {

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
        rootview = inflater.inflate(R.layout.menu1_layout, container, false);

        siText = (TextView) rootview.findViewById(R.id.textSimpleInterest);
        simpleInterest = (TextView) rootview.findViewById(R.id.textSI);

        messageBox = (Button) rootview.findViewById(R.id.box);
        messageBox.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                principal = (EditText) rootview.findViewById(R.id.pAmount);
                rate = (EditText) rootview.findViewById(R.id.rate);
                period = (EditText) rootview.findViewById(R.id.period);

                try {
                    if (principal.getText().toString().equals("")) {
                        Toast.makeText(context, "Principal Missing", Toast.LENGTH_SHORT).show();
                    } else if (rate.getText().toString().equals("")) {
                        Toast.makeText(context, "Rate Of Interest Missing", Toast.LENGTH_SHORT).show();
                    } else if (period.getText().toString().equals("")) {
                        Toast.makeText(context, "Period Missing", Toast.LENGTH_SHORT).show();
                    } else {

                        Double p = Double.parseDouble(principal.getText().toString());
                        Double r = Double.parseDouble(rate.getText().toString());
                        Double t = Double.parseDouble(period.getText().toString());


                        Double si;
                        System.out.println("P = " + p + "\nR = " + r + "\nT = " + t);

                        si = (p * r * t) / 100;

                        // prepare the alert box
                        AlertDialog.Builder alertbox = new AlertDialog.Builder(v.getContext());
                        System.out.println("Alert builder");
                        // set the message to display
                        alertbox.setMessage("Simple Interest = "+ si.toString());

                        alertbox.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                            // click listener on the alert box
                            public void onClick(DialogInterface arg0, int arg1) {
                                // the button was clicked
                                Toast.makeText(getActivity(), "Your screwed!!!!", Toast.LENGTH_LONG).show();
                            }
                        });

                        alertbox.show();

                        System.out.println("Alert Show");
                    }

                } catch (Exception e) {
                    System.out.println("In catch block");
                    e.printStackTrace();
                }
            }
        });

        /*siText = (TextView)getView().findViewById(R.id.textSimpleInterest);
        simpleInterest = (TextView)getView().findViewById(R.id.textSI);

        messageBox = (Button)getView().findViewById(R.id.box);
        messageBox.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                principal = (EditText)getView().findViewById(R.id.pAmount);
                rate = (EditText)getView().findViewById(R.id.rate);
                period = (EditText)getView().findViewById(R.id.period);

                try{
                    if(principal.getText().toString().equals("")){
                        Toast.makeText(context, "Principal Missing", Toast.LENGTH_SHORT).show();
                    }
                    else if(rate.getText().toString().equals("")){
                        Toast.makeText(context, "Rate Of Interest Missing", Toast.LENGTH_SHORT).show();
                    }
                    else if(period.getText().toString().equals("")){
                        Toast.makeText(context, "Period Missing", Toast.LENGTH_SHORT).show();
                    }
                    else{

                        Double p = Double.parseDouble(principal.getText().toString());
                        Double r = Double.parseDouble(rate.getText().toString());
                        Double t = Double.parseDouble(period.getText().toString());


                        Double si;
                        System.out.println("P = "+p+"\nR = "+r+"\nT = "+t);

                        si = (p*r*t)/100;



                        // prepare the alert box
                        AlertDialog.Builder alertbox = new AlertDialog.Builder(v.getContext());
                        System.out.println("Alert builder");
                        // set the message to display
                        alertbox.setMessage("Simple Interest = "+si.toString());

                        // add a neutral button to the alert box and assign a click listener

                        alertbox.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                            // click listener on the alert box
                            public void onClick(DialogInterface arg0, int arg1) {
                                // the button was clicked
                                Toast.makeText(getActivity(), "Your screwed!!!!", Toast.LENGTH_LONG).show();
                            }
                        });

                        // show it
                        alertbox.show();

                        System.out.println("Alert show");

                        //	simpleInterest.setText(si.toString());

                        //simpleInterest.setVisibility(TextView.VISIBLE);
                        //siText.setVisibility(TextView.VISIBLE);
                    }
                }catch(Exception e){
                    System.out.println("In catch block");
                    e.printStackTrace();
                }
            }
        });*/

        return rootview;

    }
}