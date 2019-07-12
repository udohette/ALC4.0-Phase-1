package com.example.alc4phase1;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebViewClient;

public class WebViewC extends WebViewClient {
    @Override
    public void onReceivedSslError(android.webkit.WebView view, SslErrorHandler handler, SslError error) {

        //Proceeding request directly for non-production App
        handler.proceed();
    }
}

