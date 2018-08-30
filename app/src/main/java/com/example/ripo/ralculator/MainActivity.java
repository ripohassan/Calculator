package com.example.ripo.ralculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    TextView result;
    Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, equal, sub, add, multi, divi, cancel;
    ArrayList<String> my_list = new ArrayList<String>();
    String showing_typed = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // setting id to java variable
        n0 =  findViewById(R.id.num0);
        n1 =  findViewById(R.id.num1);
        n2 =  findViewById(R.id.num2);
        n3 =  findViewById(R.id.num3);
        n4 =  findViewById(R.id.num4);
        n5 =  findViewById(R.id.num5);
        n6 =  findViewById(R.id.num6);
        n7 =  findViewById(R.id.num7);
        n8 =  findViewById(R.id.num8);
        n9 =  findViewById(R.id.num9);

        add =  findViewById(R.id.mrplus);
        sub =  findViewById(R.id.mrminus);
        multi =  findViewById(R.id.mrmultiplication);
        divi =  findViewById(R.id.mrdivide);

        equal = findViewById(R.id.mrequal);
        cancel = findViewById(R.id.mrcancel);
        result =  findViewById(R.id.omg_output);

        // getting values from XML
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("1");
                showing_typed = showing_typed+"1";
                result.setText(showing_typed);

            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("2");
                showing_typed = showing_typed+"2";
                result.setText(showing_typed);
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("3");
                showing_typed = showing_typed+"3";
                result.setText(showing_typed);
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("4");
                showing_typed = showing_typed+"4";
                result.setText(showing_typed);
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("5");
                showing_typed = showing_typed+"5";
                result.setText(showing_typed);
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("6");
                showing_typed = showing_typed+"6";
                result.setText(showing_typed);
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("7");
                showing_typed = showing_typed+"7";
                result.setText(showing_typed);
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("8");
                showing_typed = showing_typed+"8";
                result.setText(showing_typed);
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("9");
                showing_typed = showing_typed+"9";
                result.setText(showing_typed);

            }
        });


        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("0");
                showing_typed = showing_typed+"0";
                result.setText(showing_typed);

            }
        });


        // adding
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("+");
                showing_typed = showing_typed+"+";
                result.setText(showing_typed);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("-");
                showing_typed = showing_typed+"-";
                result.setText(showing_typed);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("*");
                showing_typed = showing_typed+"*";

                result.setText(showing_typed);

            }
        });

        divi.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View v) {
                my_list.add("/");
                showing_typed = showing_typed+"/";
                result.setText(showing_typed);

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.clear();
                result.setText("");
                showing_typed ="";
            }
        });

        // when equalto pressed
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // inserting my array into a string so that i can parse letter
                String s = "";
                if(!my_list.isEmpty()){

                    for (int j =0; j < my_list.size(); j++){
                        s = s+my_list.get(j);
                    }
                    Log.d("---------f",s);


                    for(int i=0; i < my_list.size(); i++){
                        switch (my_list.get(i).charAt(0)){
                            case '*' :
                                String p1[] = s.split("[*]");
                                float q1 = Float.parseFloat(p1[0]);
                                float q2 = Float.parseFloat(p1[1]);

                                result.setText((q1*q2)+"");
                                showing_typed = "";
                                break;
                            case '+':
                                String p2[] = s.split("[+]");
                                float q3 = Float.parseFloat(p2[0]);
                                float q4 = Float.parseFloat(p2[1]);
                                result.setText((q3+q4)+"");
                                showing_typed = "";
                                break;
                            case '-':
                                String p4[] = s.split("[-]");
                                float q5 = Float.parseFloat(p4[0]);
                                float q6 = Float.parseFloat(p4[1]);
                                result.setText((q5-q6)+"");
                                showing_typed = "";
                                break;
                            case '/':
                                String p5[] = s.split("[/]");
                                float q7 = Float.parseFloat(p5[0]);
                                float q8 = Float.parseFloat(p5[1]);
                                result.setText((q7/q8)+"");
                                showing_typed = "";
                                break;
                        }
                    }
                }
                my_list.clear();
            }
        });


    }


}
