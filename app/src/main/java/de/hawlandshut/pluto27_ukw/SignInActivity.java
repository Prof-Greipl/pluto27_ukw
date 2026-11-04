package de.hawlandshut.pluto27_ukw;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignInActivity extends AppCompatActivity {

    // Declare UT Variables
    private EditText signInEmailAddress;
    private EditText signInPassword;
    private Button signInSigInButton;
    private Button signInResetPasswordButton;
    private Button signInCreateAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        signInEmailAddress = findViewById(R.id.signInEmailAddress);
        signInPassword = findViewById(R.id.signInPassword);
        signInSigInButton = findViewById(R.id.signInSigInButton);
        signInResetPasswordButton = findViewById(R.id.signInResetPasswordButton);
        signInCreateAccountButton = findViewById(R.id.signInCreateAccountButton);
    }
}