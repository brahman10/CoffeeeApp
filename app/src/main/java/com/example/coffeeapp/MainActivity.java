package com.example.coffeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void submitOrder(View view) {


        displayPrice(n*5);
    }
    public void Decrement(View view) {
        if(n==0){
            display(0);
        }
        else{
            n=n-1;
            display(n);
        }
    }
    public void Increment(View view) {

        n=n+1;
        display(n);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.order);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.txtprice);
        TextView price = (TextView) findViewById(R.id.price);
        price.setVisibility(View.VISIBLE);
        priceTextView.setVisibility(View.VISIBLE);
        priceTextView.setText("PRICE");
        price.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
