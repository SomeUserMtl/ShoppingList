package com.midterm.shoppinglist;

import android.widget.CheckBox;
import android.widget.EditText;

public class UserInput {
    EditText editText;
    CheckBox checkBox;

    UserInput(CheckBox cb, EditText et){
        editText = et;
        checkBox = cb;
    }

    public EditText getEditText(){
        return editText;
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }
}
