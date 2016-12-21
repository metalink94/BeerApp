package ru.beer.beerapp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import ru.beer.beerapp.baseUtils.BaseActivity;

/**
 * Created by Денис on 21.12.2016.
 */

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
