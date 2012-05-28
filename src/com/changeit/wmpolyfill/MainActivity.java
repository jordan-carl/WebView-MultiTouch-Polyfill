package com.changeit.wmpolyfill;

import android.app.Activity;
import android.webkit.WebView;
import android.os.Bundle;
import com.changeit.wmpolyfill.WebClient;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

		WebView webview = new WebView(this);
		webview.setWebViewClient(new WebClient());
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://phil.timoessner.de/Zcroller/");

		setContentView(webview);
    }
}
