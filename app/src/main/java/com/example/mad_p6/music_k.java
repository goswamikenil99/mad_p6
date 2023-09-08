package com.example.mad_p6;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class music_k extends Service {
    MediaPlayer mediaPlayer;
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer = MediaPlayer.create(this, R.raw.kenil);
        mediaPlayer.setLooping(true); // Set looping
        mediaPlayer.setVolume(100, 100);
    }
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer.start();
        Toast.makeText(getApplicationContext(), "Playing Gaman santhal Song", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }
    public void onStart(Intent intent, int startId) {
    }
    @Override
    public void onDestroy() {
        Toast.makeText(getApplicationContext(), "Stop Playing Gaman santhal Song", Toast.LENGTH_SHORT).show();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
    @Override
    public void onLowMemory() {
    }
}