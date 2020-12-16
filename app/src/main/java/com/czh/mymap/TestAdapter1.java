package com.czh.mymap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.moxun.tagcloudlib.view.TagsAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TestAdapter
 * @Description: java类作用描述
 * @Author: Mr Chen
 * @CreateDate: 2020/11/21 15:50
 */
public class TestAdapter1 extends TagsAdapter {

    private List<String> dataSet = new ArrayList<>();

    public TestAdapter1(List<String> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public View getView(final Context context, final int position, ViewGroup parent) {
//        TextView tv = new TextView(context);
//        tv.setText("No." + position);
//        tv.setGravity(Gravity.CENTER);
//        tv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.e("Click", "Tag " + position + " clicked.");
//                Toast.makeText(context, "Tag " + position + " clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
//        tv.setTextColor(Color.WHITE);
        View view = LayoutInflater.from(context).inflate(R.layout.itme_layout1, parent, false);
//        TextView textView  = view.findViewById(R.id.tv_text);
//        textView.setText(dataSet.get(position));
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, dataSet.get(position), Toast.LENGTH_SHORT).show();
//            }
//        });

        return view;
    }

    @Override
    public Object getItem(int position) {
        return dataSet.get(position);
    }

    @Override
    public int getPopularity(int position) {
        return position % 7;
    }

    @Override
    public void onThemeColorChanged(View view, int themeColor) {

        view.setBackgroundColor(themeColor);
    }


}
