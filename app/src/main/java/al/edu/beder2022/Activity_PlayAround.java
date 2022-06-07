package al.edu.beder2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_PlayAround extends AppCompatActivity {


    Button TestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_around);

        TestButton = findViewById(R.id.button);

        TestButton.setOnClickListener(view -> {
            
        });
    }
}