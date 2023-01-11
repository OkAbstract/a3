package com.example.a3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.example.a3.deprecated.OtherLoginAct;
import com.example.a3.suggest.LoadFragmentActivity;
import com.example.a3.suggest.LoginActivity;
import com.example.a3.suggest.LoginFragment;
import com.example.a3.utils.statusbar.StatusBarUtil;
import com.example.a3.test.user;

/**
 * Created by wenzhihao on 2017/8/18.
 */

public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.transparentStatusbarAndLayoutInsert(this, true);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        int id = view.getId() ;
        if (id == R.id.old_version){
            startActivity(new Intent(this, OtherLoginAct.class));
        }else if (id == R.id.latest_version){
            startActivity(new Intent(this, LoginActivity.class));
        }else if (id == R.id.latest_fragment_version) {
            LoadFragmentActivity.lunchFragment(this, LoginFragment.class, null);
        }else if (id == R.id.latest_fragment_version){
            startActivity(new Intent(this, user.class));
    }
}
