package com.example.assignment_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private TextView movieTitle, movieYear, movieGenre, movieDescription;
    private ImageView moviePoster;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Initialize views
        movieTitle = findViewById(R.id.movieTitle);
        movieYear = findViewById(R.id.movieYear);
        movieGenre = findViewById(R.id.movieGenre);
        movieDescription = findViewById(R.id.movieDescription);
        moviePoster = findViewById(R.id.moviePoster);
        backButton = findViewById(R.id.backButton);

        // Retrieve movie details passed from the search screen (e.g., through Intent)
        Intent intent = getIntent();
        String title = intent.getStringExtra("movieTitle");
        String year = intent.getStringExtra("movieYear");
        String genre = intent.getStringExtra("movieGenre");
        String description = intent.getStringExtra("movieDescription");
        String posterUrl = intent.getStringExtra("moviePosterUrl");  // URL for the poster image

        // Set the movie details in the UI elements
        movieTitle.setText(title);
        movieYear.setText("Year: " + year);
        movieGenre.setText("Genre: " + genre);
        movieDescription.setText(description);

        // Load the image using an image loading library (e.g., Picasso, Glide)
        // Picasso.get().load(posterUrl).into(moviePoster);  // Example with Picasso

        // Set up the back button to navigate to the Movie Search screen
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to Movie Search screen
                finish();
            }
        });
    }
}
