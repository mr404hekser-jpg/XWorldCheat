package com.xworld.cheat;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class OverlayService extends Service {
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }
    public IBinder onBind(Intent intent) { return null; }
}
