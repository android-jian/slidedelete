package com.jian.android.slidedelete;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by dell on 2017/4/6.
 */

public class MyRecyclerView extends RecyclerView {

    public MyRecyclerView(Context context) {
        super(context);
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /*private int downX,downY;        //记录按下的x y
    @Override
    public boolean onInterceptTouchEvent(MotionEvent e) {

        boolean intercepted=false;

        switch (e.getAction()){

            case MotionEvent.ACTION_DOWN:

                downX= (int) e.getX();
                downY= (int) e.getY();
                intercepted=false;
                break;

            case MotionEvent.ACTION_MOVE:
                int mMoveX = (int) e.getX();
                int mMoveY = (int) e.getY();
                if (Math.abs(mMoveX-downX)<Math.abs(mMoveY-downY)){        //父容器需要当前点击事件
                    intercepted=true;
                }else {
                    intercepted=false;
                }
                downX=mMoveX;
                downY=mMoveY;
                break;

            case MotionEvent.ACTION_UP:
                intercepted=false;
                break;

            default:
                break;
        }

        return intercepted;
    }*/
}
