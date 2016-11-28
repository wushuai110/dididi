package com.example.day10_imageloader;

import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.UsingFreqLimitedMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;

import android.app.Application;
import android.graphics.Bitmap.CompressFormat;

/**
 * application
 * ȫ�ֵ�һЩ����
 * ����
 * @author Administrator
 */
public class App extends Application{
	@Override
	public void onCreate() {
		super.onCreate();
		//����ImageLoader
		init();
	}

	private void init() {
		 ImageLoaderConfiguration config = new ImageLoaderConfiguration  
				    .Builder(getApplicationContext())  
				    .memoryCacheExtraOptions(480, 800) // max width, max height���������ÿ�������ļ�����󳤿�  
				    .threadPoolSize(3)//�̳߳��ڼ��ص�����
				    .threadPriority(Thread.NORM_PRIORITY - 2)  
				    .denyCacheImageMultipleSizesInMemory()  
				    .memoryCache(new UsingFreqLimitedMemoryCache(2 * 1024 * 1024)) // You can pass your own memory cache implementation/�����ͨ���Լ����ڴ滺��ʵ��  
				    .memoryCacheSize(2 * 1024 * 1024)    
				    .discCacheSize(50 * 1024 * 1024)    
				    .discCacheFileNameGenerator(new Md5FileNameGenerator())//�������ʱ���URI������MD5 ����  
				    .tasksProcessingOrder(QueueProcessingType.LIFO)  
				    .discCacheFileCount(100) //������ļ�����  
				    .defaultDisplayImageOptions(DisplayImageOptions.createSimple())  
				    .imageDownloader(new BaseImageDownloader(getApplicationContext(), 5 * 1000, 30 * 1000)) // connectTimeout (5 s), readTimeout (30 s)��ʱʱ��  
				    .writeDebugLogs() // Remove for release app  
				    .build();
		 ImageLoader.getInstance().init(config);//ȫ��
	}
}
