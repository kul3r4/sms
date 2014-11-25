package com.example.sms.confirmation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import com.example.sms.R;
import com.example.sms.booking.BookingActivity;


public class DisplayConfirmationActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_confirmation);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(BookingActivity.EXTRA_MESSAGE);

        // Create the text view
//        TextView textView = new TextView(this);
//        TextView textView = (TextView) findViewById(R.id.confirmation_message);
//        textView.setTextSize(40);
//        textView.setText(message);

        // Set the text view as the activity layout
//        setContentView(textView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openSettings() {
        Toast.makeText(this, "Open settings button pressed", Toast.LENGTH_SHORT).show();
    }

    private void openSearch() {
        Toast.makeText(this, "Search button pressed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
