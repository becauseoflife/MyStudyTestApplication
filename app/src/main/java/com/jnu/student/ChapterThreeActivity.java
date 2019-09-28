package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChapterThreeActivity extends AppCompatActivity {
/*   例3-1 Intent 页面转换*/
/*    private Button ChangeBtn;*/
/*    例3-2 Intent的数据传递*/
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_three);
/*   例3-1 Intent 页面转换*/
/*        ChangeBtn = findViewById(R.id.button_change_page);
        ChangeBtn.setOnClickListener(new mclock());
    }

    private class mclock implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(ChapterThreeActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }*/

/*    例3-2 Intent的数据传递*/
        btn = findViewById(R.id.button_change_page);
        btn.setOnClickListener(new btnclock());
    }

    private class btnclock implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(ChapterThreeActivity.this, MainActivity.class);

            EditText txt = findViewById(R.id.editText);
            Bundle bundle = new Bundle();
            bundle.putString("text", txt.getText().toString()); // 存放数据

            /*将Bundle对象传递给Intent*/
            intent.putExtras(bundle);
           /* 启动另一个Activity 页面*/
            startActivity(intent);
        }
    }
}
