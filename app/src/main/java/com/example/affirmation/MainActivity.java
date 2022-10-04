package com.example.affirmation;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.affirmation.adapter.ItemAdapter;
import com.example.affirmation.data.Datasource;
import com.example.affirmation.model.Affirmation;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init data
        Affirmation[] myDataset = Datasource.loadAffirmation();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new ItemAdapter(this, myDataset));

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the recycler view
        recyclerView.setHasFixedSize(true);
    }
}
