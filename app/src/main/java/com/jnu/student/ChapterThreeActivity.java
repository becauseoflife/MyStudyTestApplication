package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ChapterThreeActivity extends AppCompatActivity {
/*   例3-1 Intent 页面转换*/
/*    private Button ChangeBtn;*/
/*    例3-2 Intent的数据传递*/
/*    private Button btn;
    TextView MenuTxt;*/
/*    上下文菜单 例3-4*/
/*
    TextView MenuTxt1, MenuTxt2, MenuTxt3;
    private static final int item1 = Menu.FIRST;
    private static final int item2 = Menu.FIRST+1;
    private static final int item3 = Menu.FIRST+2;
    private String[] str = {"张凯朝", "李昊翔", "李彦锋"};
*/
/*消息对话框 例3-5*/
    ProcessBuilder myDialog;
    Button btn_common_box, btn_input_box;
    LinearLayout login;
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
/*        btn = findViewById(R.id.button_change_page);
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

            *//*将Bundle对象传递给Intent*//*
            intent.putExtras(bundle);
           *//* 启动另一个Activity 页面*//*
            startActivity(intent);
        }*/

/*选项菜单 例3-3*/
/*        MenuTxt = findViewById(R.id.textView2);*/
/*    上下文菜单 例3-4*/
/*        MenuTxt1 = findViewById(R.id.Menu_text_view1);
        MenuTxt2 = findViewById(R.id.Menu_text_view2);
        MenuTxt3 = findViewById(R.id.Menu_text_view3);
        MenuTxt1.setText(str[0]);
        MenuTxt2.setText(str[1]);
        MenuTxt3.setText(str[2]);
        registerForContextMenu(MenuTxt1);
        registerForContextMenu(MenuTxt2);
        registerForContextMenu(MenuTxt3);*/
/*    消息对话框 例3-5*/
     btn_common_box = findViewById(R.id.botton_common_box);
     btn_input_box = findViewById(R.id.button_input_box);
     btn_common_box.setOnClickListener(new mClick());
     btn_input_box.setOnClickListener(new mClick());
    }

    private class mClick implements View.OnClickListener {
        AlertDialog.Builder dialog = new AlertDialog.Builder(ChapterThreeActivity.this);
        @Override
        public void onClick(View view) {
            if (view == btn_common_box){
                // 设置对话框标题
                dialog.setTitle("警告");
                // 设置对话框图标
                dialog.setIcon(R.drawable.img);
                // 设置对话框显示内容
                dialog.setMessage("本项操作可能导致信息泄露!");
                // 设置对话框的“确定”按钮
                dialog.setPositiveButton("确定", new okClick());
                // 创建对话框对象
                dialog.create();
                // 显示对话框
                dialog.show();
            }
            else if (view == btn_input_box){
                // 从另外组件中关联组件
                login = (LinearLayout)getLayoutInflater().inflate(R.layout.login, null);
                dialog.setTitle("用户登录").setMessage("请输入用户名和密码").setView(login);
                dialog.setPositiveButton("确定", new loginClick());
                dialog.setNegativeButton("退出", new exitClick());
                dialog.setIcon(R.drawable.img);
                dialog.create();
                dialog.show();
            }
        }
        // 普通对话框确定按钮事件
        private class okClick implements DialogInterface.OnClickListener {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }
        // 输入对话框 “确定” 按钮事件
        private class loginClick implements DialogInterface.OnClickListener {
            EditText pwdTxt;
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                pwdTxt = login.findViewById(R.id.editText_login_password);
                // 取出输入框的值与密码“admin”比较
                if (pwdTxt.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "密码错误", Toast.LENGTH_SHORT).show();
                }
                dialogInterface.dismiss();
            }
        }
        // 输入对话框“取消”按钮事件
        private class exitClick implements DialogInterface.OnClickListener {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ChapterThreeActivity.this.finish();
            }
        }
    }

    /*选项菜单 例3-3*/
/*    public boolean onCreateOptionMenu(Menu menu){
        // 调用父类方法加入菜单系统
        super.onCreateOptionsMenu(menu);
        menu.add(
                1,  // 组号
                1,  // 唯一的id号
                1,  // 排序
                "菜单项1"  // 标题
                );
        menu.add(1,2,2,"菜单项2");
        menu.add(1,3,3,"菜单项3");
        menu.add(1,4,4,"菜单项4");

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        String title = "选择了" + item.getTitle().toString();
        switch (item.getItemId())
        {
            case 1:
            case 2:
            case 3:
            case 4:
                MenuTxt.setText(title);
                break;
            default:
                 return super.onOptionsItemSelected(item);
        }
        return true;
    }*/
/*    上下文菜单 例3-4*/
/*    上下文菜单，通过长按条目触发*/
/*    public void onCreateContextMenu(ContextMenu menu, View view,  ContextMenu.ContextMenuInfo menuInfo){
       menu.setHeaderTitle("人物简介");
       menu.add(0, item1, 0,"年龄");
       menu.add(0, item2, 0, "财富");
       menu.add(0, item3, 0,"恋爱史");
    }
    *//*菜单单击响应*//*
    public boolean onContextItemSelected(MenuItem item){
        // 获取当前被选择的菜单项信息
        switch (item.getItemId()){
            case item1:
                Toast.makeText(getApplicationContext(), "芳龄18", Toast.LENGTH_SHORT).show();
                break;
            case item2:
                Toast.makeText(getApplicationContext(), "500万", Toast.LENGTH_SHORT).show();
                break;
            case item3:
                Toast.makeText(getApplicationContext(), "女友成群", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }*/

}
