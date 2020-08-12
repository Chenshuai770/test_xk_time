package com.zentcm.test_xk_time;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.xkzhangsan.time.calculator.DateTimeCalculatorUtil;
import com.xkzhangsan.time.converter.DateTimeConverterUtil;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;
    private Button mBtn4;
    private Button mBtn5;
    private Button mBtn6;
    private Button mBtn7;
    private Button mBtn8;
    private Button mBtn9;
    private Button mBtn10;
    private Button mBtn11;
    private Button mBtn12;
    private Button mBtn13;
    private Button mBtn14;
    private Button mBtn15;
    private Button mBtn16;
    private Button mBtn17;
    private Button mBtn18;
    private Button mBtn19;
    private Button mBtn20;
    private Button mBtn21;
    private Button mBtn22;
    private Button mBtn23;
    private Button mBtn24;
    private Button mBtn25;
    private Button mBtn26;
    private Button mBtn27;
    private Button mBtn28;
    private Button mBtn29;
    private Button mBtn30;
    private Button mBtn31;
    private Button mBtn32;
    private Button mBtn33;
    private Button mBtn34;
    private Button mBtn35;
    private Button mBtn36;
    private Button mBtn37;
    private Button mBtn38;
    private Button mBtn39;
    private Button mBtn40;
    private Button mBtn41;
    private Button mBtn42;
    private Button mBtn43;
    private Button mBtn44;
    private Button mBtn45;
    private Button mBtn46;
    private Button mBtn47;
    private Button mBtn48;
    private Button mBtn49;
    private Button mBtn50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtn1 = (Button) findViewById(R.id.btn_1);
        mBtn2 = (Button) findViewById(R.id.btn_2);
        mBtn3 = (Button) findViewById(R.id.btn_3);
        mBtn4 = (Button) findViewById(R.id.btn_4);
        mBtn5 = (Button) findViewById(R.id.btn_5);
        mBtn6 = (Button) findViewById(R.id.btn_6);
        mBtn7 = (Button) findViewById(R.id.btn_7);
        mBtn8 = (Button) findViewById(R.id.btn_8);
        mBtn9 = (Button) findViewById(R.id.btn_9);
        mBtn10 = (Button) findViewById(R.id.btn_10);
        mBtn11 = (Button) findViewById(R.id.btn_11);
        mBtn12 = (Button) findViewById(R.id.btn_12);
        mBtn13 = (Button) findViewById(R.id.btn_13);
        mBtn14 = (Button) findViewById(R.id.btn_14);
        mBtn15 = (Button) findViewById(R.id.btn_15);
        mBtn16 = (Button) findViewById(R.id.btn_16);
        mBtn17 = (Button) findViewById(R.id.btn_17);
        mBtn18 = (Button) findViewById(R.id.btn_18);
        mBtn19 = (Button) findViewById(R.id.btn_19);
        mBtn20 = (Button) findViewById(R.id.btn_20);
        mBtn21 = (Button) findViewById(R.id.btn_21);
        mBtn22 = (Button) findViewById(R.id.btn_22);
        mBtn23 = (Button) findViewById(R.id.btn_23);
        mBtn24 = (Button) findViewById(R.id.btn_24);
        mBtn25 = (Button) findViewById(R.id.btn_25);
        mBtn26 = (Button) findViewById(R.id.btn_26);
        mBtn27 = (Button) findViewById(R.id.btn_27);
        mBtn28 = (Button) findViewById(R.id.btn_28);
        mBtn29 = (Button) findViewById(R.id.btn_29);
        mBtn30 = (Button) findViewById(R.id.btn_30);
        mBtn31 = (Button) findViewById(R.id.btn_31);
        mBtn32 = (Button) findViewById(R.id.btn_32);
        mBtn33 = (Button) findViewById(R.id.btn_33);
        mBtn34 = (Button) findViewById(R.id.btn_34);
        mBtn35 = (Button) findViewById(R.id.btn_35);
        mBtn36 = (Button) findViewById(R.id.btn_36);
        mBtn37 = (Button) findViewById(R.id.btn_37);
        mBtn38 = (Button) findViewById(R.id.btn_38);
        mBtn39 = (Button) findViewById(R.id.btn_39);
        mBtn40 = (Button) findViewById(R.id.btn_40);
        mBtn41 = (Button) findViewById(R.id.btn_41);
        mBtn42 = (Button) findViewById(R.id.btn_42);
        mBtn43 = (Button) findViewById(R.id.btn_43);
        mBtn44 = (Button) findViewById(R.id.btn_44);
        mBtn45 = (Button) findViewById(R.id.btn_45);
        mBtn46 = (Button) findViewById(R.id.btn_46);
        mBtn47 = (Button) findViewById(R.id.btn_47);
        mBtn48 = (Button) findViewById(R.id.btn_48);
        mBtn49 = (Button) findViewById(R.id.btn_49);
        mBtn50 = (Button) findViewById(R.id.btn_50);

        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);
        mBtn4.setOnClickListener(this);
        mBtn5.setOnClickListener(this);
        mBtn6.setOnClickListener(this);
        mBtn7.setOnClickListener(this);
        mBtn8.setOnClickListener(this);
        mBtn9.setOnClickListener(this);
        mBtn10.setOnClickListener(this);
        mBtn11.setOnClickListener(this);
        mBtn12.setOnClickListener(this);
        mBtn13.setOnClickListener(this);
        mBtn14.setOnClickListener(this);
        mBtn15.setOnClickListener(this);
        mBtn16.setOnClickListener(this);
        mBtn17.setOnClickListener(this);
        mBtn18.setOnClickListener(this);
        mBtn19.setOnClickListener(this);
        mBtn20.setOnClickListener(this);
        mBtn21.setOnClickListener(this);
        mBtn22.setOnClickListener(this);
        mBtn23.setOnClickListener(this);
        mBtn24.setOnClickListener(this);
        mBtn25.setOnClickListener(this);
        mBtn26.setOnClickListener(this);
        mBtn27.setOnClickListener(this);
        mBtn28.setOnClickListener(this);
        mBtn29.setOnClickListener(this);
        mBtn30.setOnClickListener(this);
        mBtn31.setOnClickListener(this);
        mBtn32.setOnClickListener(this);
        mBtn33.setOnClickListener(this);
        mBtn34.setOnClickListener(this);
        mBtn35.setOnClickListener(this);
        mBtn36.setOnClickListener(this);
        mBtn37.setOnClickListener(this);
        mBtn38.setOnClickListener(this);
        mBtn39.setOnClickListener(this);
        mBtn40.setOnClickListener(this);
        mBtn41.setOnClickListener(this);
        mBtn42.setOnClickListener(this);
        mBtn43.setOnClickListener(this);
        mBtn44.setOnClickListener(this);
        mBtn45.setOnClickListener(this);
        mBtn46.setOnClickListener(this);
        mBtn47.setOnClickListener(this);
        mBtn48.setOnClickListener(this);
        mBtn49.setOnClickListener(this);
        mBtn50.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                String twelveTwo = DateTimeCalculatorUtil.getTwelveTwo();
                Log.d("MainActivity", twelveTwo);

                break;
            case R.id.btn_2:
                String dayOfWeekCn = DateTimeCalculatorUtil.getDayOfWeekCn(new Date());
                Log.d("MainActivity", dayOfWeekCn);
                break;
            case R.id.btn_3:

                break;
            case R.id.btn_4:

                break;
            case R.id.btn_5:

                break;
            case R.id.btn_6:

                break;
            case R.id.btn_7:

                break;
            case R.id.btn_8:

                break;
            case R.id.btn_9:

                break;
            case R.id.btn_10:

                break;
            case R.id.btn_11:

                break;
            case R.id.btn_12:

                break;
            case R.id.btn_13:

                break;
            case R.id.btn_14:

                break;
            case R.id.btn_15:

                break;
            case R.id.btn_16:

                break;
            case R.id.btn_17:

                break;
            case R.id.btn_18:

                break;
            case R.id.btn_19:

                break;
            case R.id.btn_20:

                break;
            case R.id.btn_21:

                break;
            case R.id.btn_22:

                break;
            case R.id.btn_23:

                break;
            case R.id.btn_24:

                break;
            case R.id.btn_25:

                break;
            case R.id.btn_26:

                break;
            case R.id.btn_27:

                break;
            case R.id.btn_28:

                break;
            case R.id.btn_29:

                break;
            case R.id.btn_30:

                break;
            case R.id.btn_31:

                break;
            case R.id.btn_32:

                break;
            case R.id.btn_33:

                break;
            case R.id.btn_34:

                break;
            case R.id.btn_35:

                break;
            case R.id.btn_36:

                break;
            case R.id.btn_37:

                break;
            case R.id.btn_38:

                break;
            case R.id.btn_39:

                break;
            case R.id.btn_40:

                break;
            case R.id.btn_41:

                break;
            case R.id.btn_42:

                break;
            case R.id.btn_43:

                break;
            case R.id.btn_44:

                break;
            case R.id.btn_45:

                break;
            case R.id.btn_46:

                break;
            case R.id.btn_47:

                break;
            case R.id.btn_48:

                break;
            case R.id.btn_49:

                break;
            case R.id.btn_50:

                break;
        }
    }
}
