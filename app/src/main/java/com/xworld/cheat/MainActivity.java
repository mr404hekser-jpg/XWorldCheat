package com.xworld.cheat;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwitchCompat toggle = findViewById(R.id.toggle_cheat);
        toggle.setOnCheckedChangeListener((v, checked) -> {
            Intent i = new Intent(this, OverlayService.class);
            if (checked) startService(i);
            else stopService(i);
        });
    }
}
