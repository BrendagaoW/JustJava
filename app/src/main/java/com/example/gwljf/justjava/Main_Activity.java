package com.example.gwljf.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class Main_Activity extends AppCompatActivity {

    private int quantity = 0;

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = findViewById(R.id.orderButton);
//        button.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        displayQuantity(1);
//                    }
//                }
//        );
    }


    private void displayQuantity(int number) {
        TextView quantityView = findViewById(R.id.quality);
        quantityView.setText(String.valueOf(number));
    }


    public void submitOrder(View view) {
        displayQuantity(quantity);
        displayPrice(quantity * 5);
    }

    private void displayPrice(int price) {
        TextView priceView = findViewById(R.id.price);
        priceView.setText(NumberFormat.getCurrencyInstance().format(price));
    }

    public void increaseQuantity(View view) {
        quantity++;
        displayQuantity(quantity);
    }

    public void decreaseQuantity(View view) {
        quantity = quantity > 0 ? quantity - 1 : quantity;
        displayQuantity(quantity);
    }
}
