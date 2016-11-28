package com.example.day10_imageloader;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

public class MainActivity extends Activity {
	//Õº∆¨µÿ÷∑
	private String img_url="http://f.hiphotos.baidu.com/zhidao/pic/item/50da81cb39dbb6fd8fcb2a460d24ab18972b373a.jpg";
	private ImageView img;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		img = (ImageView) findViewById(R.id.img);
	}
	public void loadImage(View v){
		// π”√ImageLoaderº”‘ÿÕº∆¨
		//1.≈‰÷√---°∑applicatioin
		//2. µ¿˝ªØImageLoader
	   ImageLoader imageLoader = ImageLoader.getInstance();
	   //3.º”‘ÿÕº∆¨
//	   imageLoader.displayImage(img_url, img);
	   imageLoader.displayImage(img_url, img, ImageLoaderOptions.options());
	}
}
