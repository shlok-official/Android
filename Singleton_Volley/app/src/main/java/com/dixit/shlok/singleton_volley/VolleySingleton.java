package com.dixit.shlok.singleton_volley;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

import static android.R.attr.max;

/**
 * Created by ShlokDixit on 3/28/17.
 */

public class VolleySingleton {
    private static VolleySingleton sInstance = null;
    private RequestQueue mRequestQueue;
    private ImageLoader imageLoader;
    private static Context mCtx;

    private  VolleySingleton() {

        mRequestQueue= Volley.newRequestQueue(mCtx.getApplicationContext());
        imageLoader = new ImageLoader(mRequestQueue,new ImageLoader.ImageCache(){
            private LruCache<String, Bitmap> cache = new LruCache<>((int) (Runtime.getRuntime().maxMemory()/1024/8));

            @Override
            public Bitmap getBitmap(String url) {
                return cache.get(url);
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {
                cache.put(url,bitmap);
            }
        });
    }

    public static VolleySingleton getInstance(){

        if(sInstance == null){

            sInstance = new VolleySingleton();

        }
        return sInstance;
    }

    public RequestQueue getmRequestQueue(){
        return mRequestQueue;
    }

    public ImageLoader getImageLoader(){
        return imageLoader;
    }
}
