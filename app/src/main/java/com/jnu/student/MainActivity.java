package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SlidingDrawer;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

/*    private TextView txt2_1;
    private TextView txt2_2;
    private Button btn2_2;*/
/*    private EditText edit2_4;
    private TextView txt2_41, txt2_42;
    private Button mButton2_4;*/
/*    private Button mButton2_51, mButton2_52, mButton2_53, mButton2_54;*/
/*    ImageView imageView2_6;
    ProgressBar progessBar2_10;
    Button Btu2_10, Btu2_101;*/

/*    CheckBox ch2_11_1, ch2_11_2, ch2_11_3;
    Button okBtn2_11;
    TextView txt2_11;*/

/*    ImageView img;
    Button btn_last, btn_next;*/
/*例2-14*/
/*    private ImageSwitcher imgSwi;
    private Gallery gallery;
    private int[] imgs={
            R.drawable.image_test1,
            R.drawable.image_test2,
            R.drawable.image_test3,
            R.drawable.image_test4,
            R.drawable.image_test5,
            R.drawable.image_test6
    };*/
/*    int index = 1;*/

/*    例2-15*/
/*    ListView list;
    Button btn1, btn2, btn3;*/

/*    例2-18 SlidingDraw*/
/*    SlidingDrawer mDrawer;
    ImageButton imgBtn;
    ListView listView;
    LinearLayout layout;
    String[] data = new String[]{"王者荣耀", "刺激战场", "开心消消乐"};*/

    /*    例3-2 Intent的数据传递*/
    private Button btn2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        txt2_1 = (TextView)findViewById(R.id.textView1);
        txt2_1.setTextColor(Color.RED);*/
/*        txt2_2 = (TextView)findViewById(R.id.textView2_2);
        btn2_2 = (Button)findViewById(R.id.button2_2);
        btn2_2.setOnClickListener(new mClick());*/
/*        txt2_41 = (TextView)findViewById(R.id.myTextView2_4);
        txt2_42 = (TextView)findViewById(R.id.myTextView2_40);
        edit2_4 = (EditText)findViewById(R.id.myEditText2_4);
        mButton2_4 = (Button)findViewById(R.id.myButton2_4);
        mButton2_4.setOnClickListener(new mClick());*/

/*        mButton2_51 = (Button)findViewById(R.id.mButton2_51);
        mButton2_52 = (Button)findViewById(R.id.mButton2_52);
        mButton2_53 = (Button)findViewById(R.id.mButton2_53);
        mButton2_54 = (Button)findViewById(R.id.mButton2_54);*/

/*        imageView2_6 = (ImageView)this .findViewById(R.id.mImageView2_6);
        imageView2_6.setImageResource(R.mipmap.img);*/

/*        progessBar2_10 = (ProgressBar)findViewById(R.id.ProgreeBar2_10);
        Btu2_10 = (Button)findViewById(R.id.Btu2_10);
        Btu2_101 = (Button)findViewById(R.id.Btu2_101);
        Btu2_10.setOnClickListener(new click1());
        Btu2_101.setOnClickListener(new click2());*/

/*        ch2_11_1 = (CheckBox)findViewById(R.id.check2_11_1);
        ch2_11_2 = (CheckBox)findViewById(R.id.check2_11_2);
        ch2_11_3 = (CheckBox)findViewById(R.id.check2_11_3);
        okBtn2_11 = (Button)findViewById(R.id.Btu2_11);
        txt2_11 = (TextView)findViewById(R.id.txt2_11);
        okBtn2_11.setOnClickListener(new click());*/

/*        img = findViewById(R.id.imageTest);
        btn_last = findViewById(R.id.Btn_last);
        btn_next = findViewById(R.id.Btn_next);
        btn_last.setOnClickListener(new mclick());
        btn_next.setOnClickListener(new mclick());*/

        /*例2-14 Gallery and ImageSwitcher*/
/*
        imgSwi = findViewById(R.id.ImageSwitcher01);
        imgSwi.setFactory(new viewFactory());
        // 设置淡入淡出方式
        imgSwi.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        imgSwi.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        // 设置初始显示图片
        imgSwi.setImageResource(R.drawable.image_test2);

        gallery = findViewById(R.id.Gallery01);
        // 设置监听，获取选择的图片
        gallery.setOnItemSelectedListener(new onItemSelectedListener());
        gallery.setSpacing(20); // 这是画廊图片之间的间隔
        // 设置图片文件和显示方式的适配器
        gallery.setAdapter(new adapter(this));
    }
    // 通过建立一个viewFactory接口建立一个imageView图像视图
    private class viewFactory implements ViewSwitcher.ViewFactory {
        @Override
        public View makeView() {
            ImageView imageView = new ImageView(MainActivity.this);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                    Gallery.LayoutParams.FILL_PARENT, Gallery.LayoutParams.FILL_PARENT));
            return imageView;
        }
    }
    // 实现选项监听接口，获取选择的图片
    private class onItemSelectedListener implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                imgSwi.setImageResource(imgs[i]);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
    // 设置一个适配器，安排放在画廊的gallery的图片文件和显示方式
    private class adapter extends BaseAdapter {
        private Context mContext;

        public adapter(Context mContext) {
            this.mContext = mContext;
        }

        // 取得gallery中的图片数量
        public int getCount(){
            return imgs.length;
        }
        public Object getItem(int position){
            return position;
        }
        // 取得gallery内选择的某张图片文件
        public long getItemId(int position){
            return position;
        }
        // 将选择到的图片放置在imageView中，且设定显示方式为居中
        public View getView(int position, View convertView, ViewGroup parent){
            ImageView imageView = new ImageView(mContext);
            imageView.setImageResource(imgs[position]);
            // 设置边界对齐
            imageView.setAdjustViewBounds(true);
            // 设置布局参数
            imageView.setLayoutParams(new Gallery.LayoutParams(
                    Gallery.LayoutParams.WRAP_CONTENT, Gallery.LayoutParams.WRAP_CONTENT));

            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

            return imageView;
        }*/

        /*  例2-15 Toast*/
/*       btn1 = findViewById(R.id.btn1);
       btn2 = findViewById(R.id.btn2);
       btn3 = findViewById(R.id.btn3);
       btn1.setOnClickListener(new mClick());
       btn2.setOnClickListener(new mClick());
       btn3.setOnClickListener(new mClick());
    }

    private class mClick implements View.OnClickListener {
        Toast toast;
        LinearLayout toastView;
        ImageView imageCodeProject;
        @Override
        public void onClick(View view) {
            if(view == btn1){
                Toast.makeText(getApplicationContext(),"默认Toast方式", Toast.LENGTH_SHORT).show();
            }
            else if (view == btn2){
                toast = Toast.makeText(getApplicationContext(), "自义定方式", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
            else if (view == btn3){
                toast = Toast.makeText(getApplicationContext(), "带图标的Toast", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 40);
                toastView = (LinearLayout) toast.getView();     // 定义视图
                imageCodeProject = new ImageView(MainActivity.this);
                imageCodeProject.setImageResource(R.drawable.img);  // 获取图标资源
                toastView.addView(imageCodeProject, 0); // 在视图中添加图标
                toast.show();
            }
        }
    */

/* 例2-18 SlidingDraw*/
/*    //在抽屉窗口中创建一个视图，显示数组内容
    layout = findViewById(R.id.content);
    listView = new ListView(MainActivity.this);
    listView.setAdapter(new ArrayAdapter<String>(
            MainActivity.this,
            android.R.layout.simple_list_item_1,
            data
    ));
    layout.addView(listView);
    // 注册监听器
    imgBtn = findViewById(R.id.handle);
    mDrawer = findViewById(R.id.slidingdrawer);
    mDrawer.setOnDrawerOpenListener(new mOpenListener());
    mDrawer.setOnDrawerCloseListener(new mCloseListener());
    mDrawer.setOnDrawerScrollListener(new mScrollListener());

    }

    private class mOpenListener implements SlidingDrawer.OnDrawerOpenListener {
        @Override
        public void onDrawerOpened() {
            imgBtn.setImageResource(R.drawable.arrow_down);
        }
    }

    private class mCloseListener implements SlidingDrawer.OnDrawerCloseListener {
        @Override
        public void onDrawerClosed() {
            imgBtn.setImageResource(R.drawable.arrow_up);
        }
    }

    private class mScrollListener implements SlidingDrawer.OnDrawerScrollListener {
        @Override
        public void onScrollStarted() {
            Toast.makeText(MainActivity.this, "拖动结束", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onScrollEnded() {
            Toast.makeText(MainActivity.this, "拖动开始", Toast.LENGTH_SHORT).show();
        }
    }*/

/*    例3-2 Intent的数据传递*/
        TextView txt2 = findViewById(R.id.textView2);
        /*获取Intent中的Bundle 对象*/
        Bundle bundle = this.getIntent().getExtras();

        String str = bundle.getString("text");
        txt2.setText(str);

        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new mClock());
    }

    private class mClock implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent2 = new Intent();
            intent2.setClass(MainActivity.this, ChapterThreeActivity.class);
            startActivityForResult(intent2, 0);
        }
    }

/*    private class mclick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (view == btn_last) {
                index++;
            }else {
                index--;
            }
            index = (index + imgs.length) % imgs.length;
            img.setImageResource(imgs[index]);
        }
    }*/

/*    class mClick implements View.OnClickListener
    {
        public void onClick(View v)
        {
            MainActivity.this.setTitle("改变标题");
            txt2_2.setText(R.string.exp2_2_NewStr);
            int BLACK = 0xffcccccc;
            txt2_2.setText("改变了文字及其背景颜色！");
            txt2_2.setTextColor(Color.YELLOW);
            txt2_2.setBackgroundColor(BLACK);
            String passwd;
            passwd = edit2_4.getText().toString();
            if (passwd.equals("nb"))
                txt2_42.setText("欢迎入坑！");
            else
                txt2_42.setText("入坑失败，请放弃！");
        }
    }*/
/*    class click1 implements View.OnClickListener
    {
        public void onClick(View v)
        {
            progessBar2_10.incrementProgressBy(5);
        }
    }
    class click2 implements View.OnClickListener
    {
        public void onClick(View v)
        {
            progessBar2_10.incrementProgressBy(-5);
        }
    }*/

/*    private class click implements View.OnClickListener {
        public void onClick(View v){
            String str = "";
            if(ch2_11_1.isChecked()) str += "\n" + ch2_11_1.getText();
            if(ch2_11_2.isChecked()) str += "\n" + ch2_11_2.getText();
            if (ch2_11_3.isChecked()) str += "\n" + ch2_11_3.getText();
            txt2_11.setText("你选择了：" + str);
        }
    }*/
}
