package al.edu.beder2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button BtnTrue,BtnFalse;
    TextView LabelQuestion,LabelResult;
    Boolean StatusQuestion=false;
    String pyetjepalidhje[] = {"apple", "orange", "lemon", "pear", "grape"};
    ArrayList<String> listaepyetjeve = new ArrayList<String>();
    ArrayList<Boolean> listapergjigje = new ArrayList<Boolean>();

    int position_question=0;
    int position_actual_question=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnTrue = (Button) findViewById(R.id.bnt_true);
        BtnFalse = (Button) findViewById(R.id.bnt_false);
        LabelResult = (TextView)findViewById(R.id.label_result);
        LabelQuestion = (TextView)findViewById(R.id.textView3);
        list_quest();
        list_answer();

//        if(position_question==0){
//            LabelQuestion.setText(listaepyetjeve.get(0));
//        }else{
//            LabelQuestion.setText(listaepyetjeve.get(position_actual_question));
//            position_question=position_actual_question;
//        }


        BtnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Mesazhi",Toast.LENGTH_SHORT).show();
                //System.out.println(listaepyetjeve.get(1));
          // LabelResult.setText(listaepyetjeve.get(1));
                position_actual_question++;
                get_next_qestion(position_actual_question);
            }
        });
        BtnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                position_actual_question++;
                get_next_qestion(position_actual_question);
            }
        });
    }

    public void list_quest(){
        listaepyetjeve = new ArrayList<String>();
        listaepyetjeve.add("Eshte macja qen?");
        listaepyetjeve.add("A do futemi ne Be ne 2023");
        listaepyetjeve.add("A do behemi ndonjeher njerez ne shqiptaret");
        listaepyetjeve.add("A eshte njesoj sikur te themi IlirM ose LikeFloriri");
    }

    public void list_answer(){
        listapergjigje = new ArrayList<Boolean>();
        listapergjigje.add(false);
        listapergjigje.add(true);
        listapergjigje.add(true);
        listapergjigje.add(true);
    }

    public void get_next_qestion(int position_question){
        LabelQuestion.setText(listaepyetjeve.get(position_question));
    }


}