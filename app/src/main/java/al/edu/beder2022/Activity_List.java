package al.edu.beder2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import al.edu.beder2022.adaper.MyListAdapter;
import al.edu.beder2022.model.ListaModel;

public class Activity_List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        ListaModel[] myListData = new ListaModel[] {
                new ListaModel("Email", R.drawable.racecar),
                new ListaModel("Info", android.R.drawable.ic_dialog_info),
                new ListaModel("Delete", android.R.drawable.ic_delete),
                new ListaModel("Dialer", android.R.drawable.ic_dialog_dialer),
                new ListaModel("Alert", R.drawable.racecar),
                new ListaModel("Map", android.R.drawable.ic_dialog_map),
                new ListaModel("Email", android.R.drawable.ic_dialog_email),
                new ListaModel("Info", android.R.drawable.ic_dialog_info),
                new ListaModel("Delete", R.drawable.racecar),
                new ListaModel("Dialer", android.R.drawable.ic_dialog_dialer),
                new ListaModel("Alert", android.R.drawable.ic_dialog_alert),
                new ListaModel("Map", android.R.drawable.ic_dialog_map),
        };


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.listaa);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}