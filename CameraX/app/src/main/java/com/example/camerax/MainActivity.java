package com.example.camerax;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.AspectRatio;
import androidx.camera.core.CameraSelector;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button previewView, capture, toggleFlash;
    int cameraFacing = CameraSelector.LENS_FACING_BACK;
//    private final ActivityResultLauncher<String> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback<Boolean>() {
//        @Override
//        public void onActivityResult(Boolean result) {
//            if(result){
//                startCamera(cameraFacing);
//            }
//        }
//    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previewView = findViewById(R.id.button1);
        capture = findViewById(R.id.button2);
        toggleFlash = findViewById(R.id.btton3);


        //skipped flipCamera

//        if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
//            activityResultLauncher.launch(Manifest.permission.CAMERA);
//        }else{
//            startCamera(cameraFacing);
//        }


    }
//    public void startCamera(int cameraFacing){
//        int aspectRadio = aspectRadio(previewView.getWidth(),previewView.getHeight());
//    }

//    public void aspectRadio(int width,int height){
//        double previewRatio = (double) Math.max(width,height)/Math.min(width,height);
//        if(Math.abs(previewRatio - 4.0/3.0)<=Math.abs(previewRatio - 16.0/9.0)){
//            return AspectRatio.RATIO_4_3;
//        }
//    }
}