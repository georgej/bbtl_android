/**   
* @Title: ClassInfoActivity.java 
* @Package com.ffapp.bbtimeline.tenant.bbtlclass.activity 
* @Description: TODO(用一句话描述该文件做什么) 
* @author www.5fapp.com
* @date 2014-7-13 下午9:17:49 
* @version V1.0   
*/
package com.ffapp.bbtimeline.tenant.bbtlclass.activity;

import java.util.ArrayList;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView.ScaleType;

import com.ffapp.bbtimeline.common.base.BaseActivity;
import com.ffapp.bbtimeline.tenant.R;

/**
 * @ClassName: classInfoActivity 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author jiangzhiqi
 *
 */
public class ClassInfoActivity extends BaseActivity {
	private String TAG = "ClassInfoActivity";
	private ViewPager viewPager;  
	 private ArrayList<View> pageViews;  
	 private ImageView imageView;  
	 private ImageView[] imageViews; 
	 private ViewGroup group;
	 
	 private TextView titleName;//标题名
		private ImageView title_btn_back;
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public ClassInfoActivity() {
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * <p>Title: onCreate</p> 
	 * <p>Description: </p> 
	 * @param savedInstanceState 
	 * @see android.app.Activity#onCreate(android.os.Bundle) 
	*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.class_info);
		
		initViewPager();
		
		
		titleName = (TextView)findViewById(R.id.title_txt1);
		titleName.setText(R.string.showClassString);//
		findViewById(R.id.title_btn_right1).setVisibility(View.INVISIBLE);
	
		title_btn_back = (ImageView)findViewById(R.id.title_btn_left);
		title_btn_back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ClassInfoActivity.this.finish();
			}
		});
		
		
		
		
		
	}
	public void callPhoneHandler(View v){
		Log.i(TAG, "咨询记录和拨打电话");
		  //传入服务， parse（）解析号码
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:18610871086"));
        //通知activtity处理传入的call服务
        ClassInfoActivity.this.startActivity(intent);
	}
	public void enrollHandler(View v){
		Log.i(TAG, "报名");
		  //传入服务， parse（）解析号码
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:18610871086"));
        //通知activtity处理传入的call服务
        ClassInfoActivity.this.startActivity(intent);
	}
	/**
	 * 根据请求来的图片，显示侧滑效果
	* @Title: initPageView 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param     设定文件 
	* @return void    返回类型 
	* @throws
	 */
	private void initViewPager(){
		 int[] img=new int[]{R.drawable.t1,R.drawable.t2,R.drawable.t3,R.drawable.t4,R.drawable.t5,R.drawable.t6,R.drawable.t7,R.drawable.t8,R.drawable.t9,R.drawable.t5};
	        LayoutInflater inflater = getLayoutInflater();  
	        pageViews = new ArrayList<View>();   
	        for(int i=0;i<img.length;i++){
	    	    LinearLayout layout=new LinearLayout(this);
	    	    LayoutParams ltp=new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
	    	    final ImageView imageView=new ImageView(this);
	    	    imageView.setScaleType(ScaleType.FIT_XY);
	    	    imageView.setImageResource(img[i]);
	    	    layout.addView(imageView, ltp); 
	    	    pageViews.add(layout);
	        }
	        imageViews = new ImageView[pageViews.size()];  
	        
	        group = (ViewGroup)findViewById(R.id.viewGroup);  
	        viewPager = (ViewPager)findViewById(R.id.showImagePages);  
	        
	        for (int i = 0; i < pageViews.size(); i++) {  
	            imageView = new ImageView(ClassInfoActivity.this);  
	            imageView.setLayoutParams(new LayoutParams(20,20));  
	            imageView.setPadding(20, 0, 20, 0);  
	            imageViews[i] = imageView;            
	            if (i == 0) {  
	                imageViews[i].setBackgroundResource(R.drawable.page_indicator_focused);  
	            } else {  
	                imageViews[i].setBackgroundResource(R.drawable.page_indicator);  
	            }             
	            group.addView(imageViews[i]);  
	        }       
	        viewPager.setAdapter(new GuidePageAdapter());  
	        viewPager.setOnPageChangeListener(new GuidePageChangeListener());  
	}
	/* (non-Javadoc)
	 * <p>Title: setContentLayout</p> 
	 * <p>Description: </p>  
	 * @see com.ffapp.bbtimeline.common.base.BaseActivity#setContentLayout() 
	 */
	@Override
	public void setContentLayout() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * <p>Title: dealLogicBeforeInitView</p> 
	 * <p>Description: </p>  
	 * @see com.ffapp.bbtimeline.common.base.BaseActivity#dealLogicBeforeInitView() 
	 */
	@Override
	public void dealLogicBeforeInitView() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * <p>Title: initView</p> 
	 * <p>Description: </p>  
	 * @see com.ffapp.bbtimeline.common.base.BaseActivity#initView() 
	 */
	@Override
	public void initView() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * <p>Title: dealLogicAfterInitView</p> 
	 * <p>Description: </p>  
	 * @see com.ffapp.bbtimeline.common.base.BaseActivity#dealLogicAfterInitView() 
	 */
	@Override
	public void dealLogicAfterInitView() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * <p>Title: onClickEvent</p> 
	 * <p>Description: </p> 
	 * @param view 
	 * @see com.ffapp.bbtimeline.common.base.BaseActivity#onClickEvent(android.view.View) 
	 */
	@Override
	public void onClickEvent(View view) {
		// TODO Auto-generated method stub

	}
	class GuidePageAdapter extends PagerAdapter {  
	  	  
        @Override  
        public int getCount() {  
            return pageViews.size();  
        }  
  
        @Override  
        public boolean isViewFromObject(View arg0, Object arg1) {  
            return arg0 == arg1;  
        }  
  
        @Override  
        public int getItemPosition(Object object) {  
            // TODO Auto-generated method stub  
            return super.getItemPosition(object);  
        }  
  
        @Override  
        public void destroyItem(View arg0, int arg1, Object arg2) {  
            // TODO Auto-generated method stub  
            ((ViewPager) arg0).removeView(pageViews.get(arg1));  
        }  
  
        @Override  
        public Object instantiateItem(View arg0, int arg1) {  
            // TODO Auto-generated method stub  
            ((ViewPager) arg0).addView(pageViews.get(arg1));  
            return pageViews.get(arg1);  
        }  
  
        @Override  
        public void restoreState(Parcelable arg0, ClassLoader arg1) {  
            // TODO Auto-generated method stub  
  
        }  
  
        @Override  
        public Parcelable saveState() {  
            // TODO Auto-generated method stub  
            return null;  
        }  
  
        @Override  
        public void startUpdate(View arg0) {  
            // TODO Auto-generated method stub  
  
        }  
  
        @Override  
        public void finishUpdate(View arg0) {  
            // TODO Auto-generated method stub  
  
        }  
    } 
    
    class GuidePageChangeListener implements OnPageChangeListener {  
    	  
        @Override  
        public void onPageScrollStateChanged(int arg0) {  
            // TODO Auto-generated method stub  
  
        }  
  
        @Override  
        public void onPageScrolled(int arg0, float arg1, int arg2) {  
            // TODO Auto-generated method stub  
  
        }  
  
        @Override  
        public void onPageSelected(int arg0) {  
        	
            for (int i = 0; i < imageViews.length; i++) {  
                imageViews[arg0].setBackgroundResource(R.drawable.page_indicator_focused);
//                Toast.makeText(this, "onBtnclassMClick clicked!", Toast.LENGTH_SHORT).show();
                showToastMsg();
                if (arg0 != i) {  
                    imageViews[i].setBackgroundResource(R.drawable.page_indicator);  
                }  
            }
        }  
    } 
    private void showToastMsg(){
    	Toast.makeText(this, "班级宣传照片", Toast.LENGTH_SHORT).show();
    }
}
