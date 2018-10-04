package android.example.android.inventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Items> items = new ArrayList<Items>();

        items.add(new Items("Pie",100,10,"Google","9598889262","xyz@gmail.com",R.drawable.ic_launcher_background));
        ListView listView = findViewById(R.id.list);

        ItemsAdapter itemsAdapter = new ItemsAdapter(this,items);

        listView.setAdapter(itemsAdapter);
    }
}
