package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

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

    ImageView img;
    Button btn_last, btn_next;
    private int[] imgs={
            R.drawable.image_test1,
            R.drawable.image_test2,
            R.drawable.image_test3,
            R.drawable.image_test4,
            R.drawable.image_test5,
            R.drawable.image_test6
    };
    int index = 1;
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

        img = findViewById(R.id.imageTest);
        btn_last = findViewById(R.id.Btn_last);
        btn_next = findViewById(R.id.Btn_next);
        btn_last.setOnClickListener(new mclick());
        btn_next.setOnClickListener(new mclick());
    }

    private class mclick implements View.OnClickListener {
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
    }
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
