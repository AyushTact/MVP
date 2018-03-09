package com.tact.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity implements SigninHelper {

    SigninPresenter presenter;
    EditText etUserName, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        presenter = new SigninPresenter(this, this);
    }

    private void findViews() {
        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        findViewById(R.id.btSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onClick();
            }
        });
    }

    @Override
    public String getUserName() {
        if(etUserName!=null){
            return etUserName.getText().toString();
        }
        return "";
    }

    @Override
    public String getPassword() {
        if(etPassword!=null){
            return etPassword.getText().toString();
        }
        return "";
    }

    @Override
    public void showToast(int id) {
        Toast.makeText(this, id, Toast.LENGTH_SHORT).show();
    }
}
