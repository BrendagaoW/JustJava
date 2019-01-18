package com.example.gwljf.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main_Activity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = findViewById(R.id.orderButton);
//        button.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        display(1);
//                    }
//                }
//        );
    }


    private void display(int number) {
        TextView quantityView = findViewById(R.id.quality);

        quantityView.setText(String.valueOf(number));
    }

    public void submitOrder(View view) {
        display(1);
    }
}
