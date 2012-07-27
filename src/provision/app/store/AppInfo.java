package provision.app.store;



import android.app.Activity;
import android.app.ProgressDialog;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.webkit.WebViewClient;
import android.os.Bundle;

public class AppInfo extends Activity {
    /** Called when the activity is first created. */
	
	static LinearLayout pr_bar;
	WebView mWebView;
	ProgressDialog progressDialog;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appinfo);
        

        
        // 자신에게 넘어온 값을 파싱한다.
        String value = getIntent().getStringExtra("app");
        
        setTitle(value);
        
        // 값이 무엇인지 체크
        if (value.equals("netfree"))
        {
        	pr_bar=(LinearLayout)findViewById(R.id.pr_bar);
        	mWebView = (WebView)findViewById(R.id.webView1);
        	mWebView.setWebViewClient(new WebViewClient(){
        	public void onPageFinished(WebView view, String url){
        	pr_bar.setVisibility(View.GONE);
        	}
        	});
        	mWebView.clearCache(true);
        	mWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        	mWebView.getSettings().setJavaScriptEnabled(true); 
        	mWebView.loadUrl("http://dkserver.wo.tc/~marutian/app/netfree"); 
     	}  
      
        else if (value.equals("netpro"))
        {
        	pr_bar=(LinearLayout)findViewById(R.id.pr_bar);
        	mWebView = (WebView)findViewById(R.id.webView1);
        	mWebView.setWebViewClient(new WebViewClient(){
        	public void onPageFinished(WebView view, String url){
        	pr_bar.setVisibility(View.GONE);
        	}
        	});
        	mWebView.clearCache(true);
        	mWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        	mWebView.getSettings().setJavaScriptEnabled(true); 
        	mWebView.loadUrl("http://dkserver.wo.tc/~marutian/app/netpro"); 
     	}  
        else if (value.equals("opfree"))
        {
        	pr_bar=(LinearLayout)findViewById(R.id.pr_bar);
        	mWebView = (WebView)findViewById(R.id.webView1);
        	mWebView.setWebViewClient(new WebViewClient(){
        	public void onPageFinished(WebView view, String url){
        	pr_bar.setVisibility(View.GONE);
        	}
        	});
        	mWebView.clearCache(true);
        	mWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        	mWebView.getSettings().setJavaScriptEnabled(true); 
        	mWebView.loadUrl("http://dkserver.wo.tc/~marutian/app/opfree"); 
     	}  
        else if (value.equals("oppro"))
        {
        	pr_bar=(LinearLayout)findViewById(R.id.pr_bar);
        	mWebView = (WebView)findViewById(R.id.webView1);
        	mWebView.setWebViewClient(new WebViewClient(){
        	public void onPageFinished(WebView view, String url){
        	pr_bar.setVisibility(View.GONE);
        	}
        	});
        	mWebView.clearCache(true);
        	mWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        	mWebView.getSettings().setJavaScriptEnabled(true); 
        	mWebView.loadUrl("http://dkserver.wo.tc/~marutian/app/oppro"); 
     	}  
        else if (value.equals("studio"))
        {
        	pr_bar=(LinearLayout)findViewById(R.id.pr_bar);
        	mWebView = (WebView)findViewById(R.id.webView1);
        	mWebView.setWebViewClient(new WebViewClient(){
        	public void onPageFinished(WebView view, String url){
        	pr_bar.setVisibility(View.GONE);
        	}
        	});
        	mWebView.clearCache(true);
        	mWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        	mWebView.getSettings().setJavaScriptEnabled(true); 
        	mWebView.loadUrl("http://dkserver.wo.tc/~marutian/app/studio"); 
     	}  
        
    }

    

 }