package al.edu.beder2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_Quix extends AppCompatActivity {

    Button butontest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quix);

        butontest = findViewById(R.id.buton_test);

        butontest.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(),"test",Toast.LENGTH_SHORT).show();
            System.out.println("est");
        });
    }
}