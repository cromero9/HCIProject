package com.hue_v.christian.testapp;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.EditText;

public class addComments extends FragmentActivity {
    public static final String EXTRA_MESSAGE = "com.hue_v.christian.testapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_comments);

        getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getActionBar().setCustomView(R.layout.abs_addcomment);

        final ActionBar actionBar = getActionBar();

        actionBar.setDisplayHomeAsUpEnabled(false);
    }

    public void sendComment(View view){

        Intent intent = new Intent(this, MenuItemOne.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
