package com.ajaraam.said.play_vedio;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView mTextView;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.list);
        String[] item=getResources().getStringArray(R.array.index);
        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(this,R.layout.row_item,R.id.textView2,item);
        listView.setAdapter(arrayAdapter);
        mTextView=(TextView)findViewById(R.id.Welcome);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.up_to_down);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,HomeActivite.class));
                finish();
            }
        },5000);
    }
}
