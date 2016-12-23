package com.escoglobal.miritlpatient;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by nathaniel.gonzales on 11/23/2016.
 */

@SuppressWarnings("ALL")
public class Browser extends WebViewClient {
    @Override
    public  boolean shouldOverrideUrlLoading(WebView view, String url ){
        view.loadUrl(url);
        return true;
    }
}
