package com.example.sergiooctavio.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button quoteBtn;
    private TextView quoteTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Enlazando la variable creada de textview 'quoteTV' con el texview de la interfaz de usuario 'quoteText'
        quoteTV = findViewById(R.id.quoteText);
        //Enlazando la variable creada de button 'quoteBtn' con el boton de la interfaz de usuario 'showQuoteBtn'
        quoteBtn = findViewById(R.id.showQuoteBtn);

        quoteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QuoteServer quoteServer = new QuoteServer();
                quoteTV.setText(quoteServer.getRandomQuote());
            }
        });
    }
}
