package stelly.example.fragmentpreference;

import android.os.Bundle;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout frameLayout;

    private SettingFragment settingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView(){
        frameLayout=(FrameLayout)findViewById(R.id.add_fragment);
        getFragmentManager().beginTransaction()
                .add(R.id.add_fragment,new SettingFragment())
                .commit();
    }
}
