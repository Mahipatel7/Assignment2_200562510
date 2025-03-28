package com.example.assignment_2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;
    private List<Movie> movieList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this is the correct layout file

        // Initialize movie list
        movieList = new ArrayList<>();

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.rv); // Ensure rv is defined in your XML
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize Adapter
        movieAdapter = new MovieAdapter(movieList);
        recyclerView.setAdapter(movieAdapter);

        // Setup UI elements
        Button searchButton = findViewById(R.id.searchButton); // Ensure this ID exists in your XML
        EditText searchField = findViewById(R.id.searchField); // Ensure this ID exists in your XML

        // Setup Search Button listener
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String query = searchField.getText().toString();
                // Make API call to fetch matching movies from OMDB API
                fetchMovies(query);
            }
        });
    }

    private void fetchMovies(String query) {
        // TODO: Implement OMDB API call using Retrofit/OkHttp to fetch movies matching the search query
        // Example: Update movieList with the new results and notify adapter
        // movieList.clear();
        // movieList.addAll(newMovieList);
        // movieAdapter.notifyDataSetChanged();
    }
}
