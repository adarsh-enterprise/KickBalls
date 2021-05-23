package com.adarsh.kickballs.mediumlevels;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.media.Image;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import com.adarsh.kickballs.R;

public class MediumLevelOne extends AppCompatActivity implements Animation.AnimationListener {
    protected static Button btnPool1, btnPool2, btnPool3;
    protected static TranslateAnimation animationBall1, animationBall2, animationBall3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_level_one);
        btnPool1 = findViewById(R.id.btn_pool_1);
        animationBall1 = new TranslateAnimation(0, 750, 0, 0);
        animationBall1.setDuration(4000);
        animationBall1.setFillAfter(false);
        animationBall1.setAnimationListener(this);
        animationBall1.setRepeatCount(Animation.INFINITE);
        btnPool1.startAnimation(animationBall1);

        btnPool2 = findViewById(R.id.btn_pool_2);
        animationBall2 = new TranslateAnimation(350, 0, 0, 0);
        animationBall2.setDuration(2000);
        animationBall2.setFillAfter(false);
        animationBall2.setAnimationListener(new MediumLevelAnimation());
        animationBall2.setRepeatCount(Animation.INFINITE);
        btnPool2.startAnimation(animationBall2);

        btnPool3 = findViewById(R.id.btn_pool_3);
        animationBall3 = new TranslateAnimation(350, 600, 0, 0);
        animationBall3.setDuration(2000);
        animationBall3.setFillAfter(false);
//        animationBall3.setAnimationListener(this);
        animationBall3.setRepeatCount(Animation.INFINITE);
        btnPool3.startAnimation(animationBall3);

    }

    @Override
    public void onAnimationEnd(Animation oldAnimation) {
        btnPool1.startAnimation(animationBall1);
//        btnPool2.startAnimation(animationBall2);
//        btnPool3.startAnimation(animationBall3);
//        btnPool1.clearAnimation();
//        ActionBar.LayoutParams lp = new ActionBar.LayoutParams(btnPool1.getWidth(), btnPool1.getHeight());
//        lp.setMargins(50, 100, 0, 0);
//        btnPool1.setLayoutParams(lp);
    }

    @Override
    public void onAnimationRepeat(Animation oldAnimation) {
        TranslateAnimation animationBall1Return = new TranslateAnimation(750, 0, 0, 0);
        animationBall1Return.setDuration(4000);
        animationBall1Return.setFillAfter(false);
        animationBall1Return.setAnimationListener(this);
        btnPool1.startAnimation(animationBall1Return);

//        TranslateAnimation animationBall2Return = new TranslateAnimation(0, 350, 0, 0);
//        animationBall2Return.setDuration(2000);
//        animationBall2Return.setFillAfter(false);
//        animationBall2Return.setAnimationListener(this);
//        btnPool2.startAnimation(animationBall2Return);
    }

    @Override
    public void onAnimationStart(Animation animation) {
    }
}