package com.jian.android.slidedelete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mDatas;
    private RecyclerView mRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        mRecycler = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager manager=new LinearLayoutManager(this);
        mRecycler.setLayoutManager(manager);
        mRecycler.setAdapter(new MyAdapter(mDatas));
        mRecycler.setItemAnimator(new DefaultItemAnimator());
    }

    /***
     * 初始化数据
     */
    private void initData(){

        mDatas = new ArrayList<String>();

        for (int i=0;i<60;i++){
            mDatas.add("这是第"+i+"条测试数据");
        }
    }

}
