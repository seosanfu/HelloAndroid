package com.example.sergiooctavio.helloandroid;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Sergio Octavio on 27-01-2018.
 */

public class QuoteServer {
    String [] getQuotes() {
        String [] quotes = new String[] {
                "What???. - SCSA",
                "If you smell, what The Rock is cooking? - The Rock",
                "And that´s the bottom line that Stone Cold said so! -SCSA",
        };
        return quotes;
    }
    String getRandomQuote() {
        String quote;
        int quotesArrayLen = getQuotes().length;
        int randomNum = ThreadLocalRandom.current().nextInt(quotesArrayLen);
        quote = getQuotes()[randomNum];
        return quote;
    }
}
