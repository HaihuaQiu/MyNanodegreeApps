package com.example.android.mynanodegreeapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static Toast mToast = null;

    private void showToast(int resId) {
        if (mToast == null) {
            mToast = Toast.makeText(this, resId, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(resId);
        }
        mToast.show();
    }

    public void btnClick(View v) {
        switch (v.getId()) {
            case R.id.button_Streanmer:
                showToast(R.string.msg1);
                break;
            case R.id.button_Scores:
                showToast(R.string.msg2);
                break;
            case R.id.button_Library:
                showToast(R.string.msg3);
                break;
            case R.id.button_bigger:
                showToast(R.string.msg4);
                break;
            case R.id.button_reader:
                showToast(R.string.msg5);
                break;
            case R.id.button_capstone:
                showToast(R.string.msg6);
                break;
        }
    }
}
