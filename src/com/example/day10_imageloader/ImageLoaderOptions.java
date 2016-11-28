package com.example.day10_imageloader;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

public class ImageLoaderOptions {
	public static DisplayImageOptions  options(){
		 DisplayImageOptions options;  
		 options = new DisplayImageOptions.Builder()  
		  .showImageOnLoading(R.drawable.ic_launcher) //����ͼƬ�������ڼ���ʾ��ͼƬ  
		  .showImageForEmptyUri(R.drawable.ic_launcher)//����ͼƬUriΪ�ջ��Ǵ����ʱ����ʾ��ͼƬ  
		 .showImageOnFail(R.drawable.ic_launcher)  //����ͼƬ����/��������д���ʱ����ʾ��ͼƬ
		 .cacheInMemory(true)//�������ص�ͼƬ�Ƿ񻺴����ڴ���  
		 .cacheOnDisc(true)//�������ص�ͼƬ�Ƿ񻺴���SD����  
		 .considerExifParams(true)  //�Ƿ���JPEGͼ��EXIF��������ת����ת��
		 .imageScaleType(ImageScaleType.EXACTLY_STRETCHED)//����ͼƬ����εı��뷽ʽ��ʾ  
		 .resetViewBeforeLoading(true)//����ͼƬ������ǰ�Ƿ����ã���λ  
		 .displayer(new RoundedBitmapDisplayer(50))//�Ƿ�����ΪԲ�ǣ�����Ϊ����  
		 .build();//
		 return options;
	}
}
