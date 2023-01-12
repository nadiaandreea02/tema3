package com.example.laborator_tema3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
int x=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceFragment(new Fragment1());
    }
    public void onClickPrev(View view){
        if(x==2){
            x=1;
            replaceFragment(new Fragment1());
        }else if(x==3){
            x=2;
            replaceFragment(new Fragment2());
        }else{
            x=3;
            replaceFragment(new Fragment3());
        }

    }
    public void onClickNext(View view){
        if(x==1){
            x=2;
            replaceFragment(new Fragment2());
        }else if(x==2){
            x=3;
            replaceFragment(new Fragment3());
        }else{
            x=1;
            replaceFragment(new Fragment1());
        }

    }
    public void onClickDet(View view){
        Intent intent_1 = new Intent(this, Activity2.class);
        if(x==1){
        intent_1.putExtra("input_data","aceasta e poza - rosu");
        }else if (x==2){
            intent_1.putExtra("input_data","aceasta e poza - albastru");
        }else if(x==3)
        {
            intent_1.putExtra("input_data","aceasta e poza - mov");
        }

        startActivity(intent_1);
    }

    private void replaceFragment(Fragment fragmentParam){
        FragmentManager fragManager = getSupportFragmentManager();
        FragmentTransaction fragTransaction=fragManager.beginTransaction();
        fragTransaction.replace(R.id.frameLayout, fragmentParam);
        fragTransaction.commit();
    }
}