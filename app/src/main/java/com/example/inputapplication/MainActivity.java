package com.example.inputapplication;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CalendarView cal;
    private Button choose;
    private EditText Bd;
    private EditText MS;
    private EditText name;
    private EditText CC;
    private EditText phone;
    private EditText email;
    private EditText homeTown;
    private EditText address;
    private RadioGroup major;

    private CheckBox agree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal = findViewById(R.id.Calendar);
        MS = findViewById(R.id.MSSV_text);
        name = findViewById(R.id.FullNameText);
        CC = findViewById(R.id.CCCD_text);
        phone = findViewById(R.id.PhoneNumber_text);
        email = findViewById(R.id.email_text);
        Bd = findViewById(R.id.Birthday_text);
        homeTown = findViewById(R.id.home_town);
        address = findViewById(R.id.Address);
        major = findViewById(R.id.major);
        agree = findViewById(R.id.CheckOK);
        cal.setVisibility(View.INVISIBLE);
        choose = findViewById(R.id.button2);
        MS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                MS.setBackgroundColor(getResources().getColor(R.color.white));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                name.setBackgroundColor(getResources().getColor(R.color.white));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        CC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                CC.setBackgroundColor(getResources().getColor(R.color.white));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        phone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                phone.setBackgroundColor(getResources().getColor(R.color.white));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                email.setBackgroundColor(getResources().getColor(R.color.white));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        Bd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Bd.setBackgroundColor(getResources().getColor(R.color.white));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        homeTown.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                homeTown.setBackgroundColor(getResources().getColor(R.color.white));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        address.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                address.setBackgroundColor(getResources().getColor(R.color.white));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = i2 + "/" + (i1+1) + "/" + i;
                Bd.setText(date);
                cal.setVisibility(View.INVISIBLE);
                choose.setVisibility(View.VISIBLE);
            }
        });
    }
    public void displayToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void CheckAll(View view) {
        boolean iCheck = true;
        if(!agree.isChecked()){
            displayToast("Hãy chấp nhận điều khoản");
            iCheck = false;
            agree.setBackground(ContextCompat.getDrawable(this, R.drawable.gradient_background));
        }
        if(MS.getText().toString().equals("")){
            MS.setBackground(ContextCompat.getDrawable(this, R.drawable.gradient_background));
            iCheck = false;
        }
        if(name.getText().toString().equals("")){
            name.setBackground(ContextCompat.getDrawable(this, R.drawable.gradient_background));
            iCheck = false;
        }
        if(CC.getText().toString().equals("")){
            CC.setBackground(ContextCompat.getDrawable(this, R.drawable.gradient_background));
            iCheck = false;
        }
        if(phone.getText().toString().equals("")){
            phone.setBackground(ContextCompat.getDrawable(this, R.drawable.gradient_background));
            iCheck = false;
        }
        if(email.getText().toString().equals("")){
            email.setBackground(ContextCompat.getDrawable(this, R.drawable.gradient_background));
            iCheck = false;
        }
        if(Bd.getText().toString().equals("")){
            Bd.setBackground(ContextCompat.getDrawable(this, R.drawable.gradient_background));
            iCheck = false;
        }
        if(homeTown.getText().toString().equals("")){
            homeTown.setBackground(ContextCompat.getDrawable(this, R.drawable.gradient_background));
            iCheck = false;
        }
        if(address.getText().toString().equals("")){
            address.setBackground(ContextCompat.getDrawable(this, R.drawable.gradient_background));
            iCheck = false;
        }
        if(major.getCheckedRadioButtonId() == -1){
            iCheck = false;
            major.setBackground(ContextCompat.getDrawable(this, R.drawable.gradient_background));
        }
        if(iCheck){
            displayToast("Nhập thành công!");
        }else if(agree.isChecked()){
            displayToast("Hãy nhập đủ thông tin");
        }
    }

    public void openCalendar(View view) {
        Log.d("TAG", "chooseCalendar: ");
        cal.setVisibility(View.VISIBLE);
        choose.setVisibility(View.INVISIBLE);
    }


    public void inputRadio1(View view) {
        major.setBackgroundColor(getResources().getColor(R.color.white));
    }
    public void inputRadio2(View view) {
        major.setBackgroundColor(getResources().getColor(R.color.white));
    }

    public void Checked(View view) {
        agree.setBackgroundColor(getResources().getColor(R.color.white));
    }
}