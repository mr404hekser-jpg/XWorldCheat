package com.xworld.cheat;

import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;

public class MainActivity extends AppCompatActivity {
    
    private SwitchCompat toggle_switch;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        toggle_switch = findViewById(R.id.toggle_cheat);
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.canDrawOverlays(this)) {
                Toast.makeText(this, "Enable overlay permission", Toast.LENGTH_SHORT).show();
            }
        }
        
        toggle_switch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                startService(new Intent(this, OverlayService.class));
            } else {
                stopService(new Intent(this, OverlayService.class));
            }
        });
    }
}
