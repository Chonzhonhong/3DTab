package com.czh.mymap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.moxun.tagcloudlib.view.TagCloudView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TagCloudView tag_test,tag_cloudq;
    EditText et_content;
    TextView tv_ok;
    LinearLayout ll_top;
    ImageView img;
    List<String> list= new ArrayList<>();
    List<String> list1= new ArrayList<>();
    private TestAdapter textTagsAdapter;
    private TestAdapter1 textTagsAdapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData(20);


    }

    private void initData(int num) {
        list.clear();
        for (int i = 0;i<num;i++){
            list.add("用户"+i);
        }
        list1.add("2112");
        textTagsAdapter = new TestAdapter(list);
//        textTagsAdapter1 = new TestAdapter1(list1);
        tag_test.setAdapter(textTagsAdapter);
//        tag_cloudq.setAdapter(textTagsAdapter);
        textTagsAdapter.notifyDataSetChanged();
    }

    private void initView() {
        tag_test = (TagCloudView) findViewById(R.id.tag_cloud);
        tag_cloudq = (TagCloudView) findViewById(R.id.tag_cloudq);
        et_content = findViewById(R.id.et_content);
        tv_ok = findViewById(R.id.tv_ok);

        tv_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_content.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"请输入数字",Toast.LENGTH_LONG).show();
                }else {
                    initData(Integer.parseInt(et_content.getText().toString()));
                }
            }
        });

//        textTagsAdapter1.notifyDataSetChanged();
//        ll_top = findViewById(R.id.ll_top);
//        tag_test = new TagCloudView(this);
//        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.
//                LayoutParams.FILL_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
//        ll_top.addView(tag_test,param);
//        TestAdapter adapter = new TestAdapter(this,list);
//        tag_test.setAdapter(adapter);
//        tag_test.setAutoScrollMode(tag_test.MODE_UNIFORM);
    }
}