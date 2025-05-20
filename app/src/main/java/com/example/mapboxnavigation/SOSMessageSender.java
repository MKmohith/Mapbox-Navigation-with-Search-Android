package com.example.mapboxnavigation;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mapboxnavigation.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SOSMessageSender extends AppCompatActivity {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private EditText messageEditText;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos_message_sender);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("sos_messages");

        messageEditText = findViewById(R.id.message_edit_text);
        sendButton = findViewById(R.id.send_button);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = messageEditText.getText().toString();
                if (!message.isEmpty()) {
                    sendSOSMessage(message);
                    messageEditText.setText("");
                } else {
                    Toast.makeText(SOSMessageSender.this, "Please enter a message", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void sendSOSMessage(String message) {
        SOSMessage sosMessage = new SOSMessage(message, System.currentTimeMillis());
        databaseReference.push().setValue(sosMessage);
        Toast.makeText(this, "SOS message sent", Toast.LENGTH_SHORT).show();
    }

    public class SOSMessage {
        private String message;
        private long timestamp;

        public SOSMessage(String message, long timestamp) {
            this.message = message;
            this.timestamp = timestamp;
        }

        public String getMessage() {
            return message;
        }

        public long getTimestamp() {
            return timestamp;
        }
    }
}