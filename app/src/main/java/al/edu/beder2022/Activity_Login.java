package al.edu.beder2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Login extends AppCompatActivity {

    EditText Edt_Email,Edt_Password;
    Button Btn_Login,Btn_Register;
    String Str_email,Str_Pass;
    TextView CheckData;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elements);

        Edt_Email = (EditText) findViewById(R.id.edt_email);
        Edt_Password = (EditText) findViewById(R.id.edt_password);
        Btn_Login = (Button) findViewById(R.id.btn_login);
        Btn_Register = (Button) findViewById(R.id.bt_register);
        CheckData = (TextView) findViewById(R.id.check_data);

        Btn_Login.setOnClickListener(view -> {
           Str_email = Edt_Email.getText().toString();
           Str_Pass = Edt_Password.getText().toString();
            Toast.makeText(getApplicationContext(),"Emaili eshte: "+Str_email,Toast.LENGTH_SHORT).show();
        });

        Btn_Register.setOnClickListener(view -> {
            Intent intent;
            intent = new Intent().setClass(getApplicationContext(), Activity_Register.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
        Str_email = Edt_Email.getText().toString();
        Edt_Email.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                Str_email = Edt_Email.getText().toString();
                if (Str_email.matches(emailPattern) && s.length() > 0)
                {
                    Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();
                    // or
                    CheckData.setText("valid email");
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid email address",Toast.LENGTH_SHORT).show();
                    //or
                    CheckData.setText("invalid email");
                }
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // other stuffs
            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // other stuffs
            }
        });

    }
}