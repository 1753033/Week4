package com.example.week4;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    Person[] data = {new Person("Iron Man","191-317-6338",R.drawable.ironman80),
                     new Person("Captain America","313-963-4174",R.drawable.captainamerica80),
                     new Person("Spider Man","409-606-6222",R.drawable.spiderman80),
                     new Person("Thor","635-786-1230",R.drawable.thor80)};

    TextView txtMsg;
    ListView myListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMsg = findViewById(R.id.txtMsg);
        myListView = findViewById(R.id.myListView);

        ContactAdapter adapter = new ContactAdapter(this,data);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txtMsg.setText("You choose: "+data[position].name);
            }
        });
        myListView.setAdapter(adapter);

    }
}
