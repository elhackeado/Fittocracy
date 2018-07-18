package com.example.amanthakur.fittocracy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {

    private DatabaseReference mDatabase;
    EditText editText,editText2,editText3,editText4;
    Button button;
    String name,email,phone,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    name = editText.getText().toString().trim();
                    email = editText2.getText().toString().trim();
                    phone = editText3.getText().toString().trim();
                    pass = editText4.getText().toString().trim();
                    if(name.equals("")||email.equals("")||phone.equals("")||pass.equals(""))
                    {
                        Toast.makeText(Register.this, "FILL ALL FIELDS",Toast.LENGTH_LONG).show();
                    }
                    else{
                    User user = new User(name, email, phone, pass);
                    mDatabase.child("users").child(phone).setValue(user);
                    Toast.makeText(Register.this, "REGISTERED SUCCESSFULLY",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Register.this,Login.class);
                    startActivity(intent);
                    finish();
                    }
                }
                catch (Exception e){
                    Toast.makeText(Register.this, e.toString(),Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}

  class User {

    public String name;
    public String email;
    public String phone;
    public String pass;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String name, String email,String phone, String pass) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pass = pass;
    }

}
