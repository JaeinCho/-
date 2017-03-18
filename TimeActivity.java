package com.example.chocho64.clanner;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeActivity extends Activity {

    long now = System.currentTimeMillis();
    Date date = new Date(now);
    SimpleDateFormat sdfNow = new SimpleDateFormat("HH:mm");
    String formatDate = sdfNow.format(date);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
    }

    public void onClick(final View v) {
        TimePickerDialog dialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                switch(v.getId()) {
                    case R.id.start1:
                        TextView start1 = (TextView)findViewById(R.id.start1);
                        String s1 = String.format("%02d:%02d", hourOfDay, minute);
                        start1.setText(s1);
                        break;
                    case R.id.end1:
                        TextView end1 = (TextView)findViewById(R.id.end1);
                        String e1 = String.format("%02d:%02d", hourOfDay, minute);
                        end1.setText(e1);
                        break;
                    case R.id.start2:
                        TextView start2 = (TextView)findViewById(R.id.start2);
                        String s2 = String.format("%02d:%02d", hourOfDay, minute);
                        start2.setText(s2);
                        break;
                    case R.id.end2:
                        TextView end2 = (TextView)findViewById(R.id.end2);
                        String e2 = String.format("%02d:%02d", hourOfDay, minute);
                        end2.setText(e2);
                        break;
                    case R.id.start3:
                        TextView start3 = (TextView)findViewById(R.id.start3);
                        String s3 = String.format("%02d:%02d", hourOfDay, minute);
                        start3.setText(s3);
                        break;
                    case R.id.end3:
                        TextView end3 = (TextView)findViewById(R.id.end3);
                        String e3 = String.format("%02d:%02d", hourOfDay, minute);
                        end3.setText(e3);
                        break;
                    case R.id.start4:
                        TextView start4 = (TextView)findViewById(R.id.start4);
                        String s4 = String.format("%02d:%02d", hourOfDay, minute);
                        start4.setText(s4);
                        break;
                    case R.id.end4:
                        TextView end4 = (TextView)findViewById(R.id.end4);
                        String e4 = String.format("%02d:%02d", hourOfDay, minute);
                        end4.setText(e4);
                        break;
                    case R.id.start5:
                        TextView start5 = (TextView)findViewById(R.id.start5);
                        String s5 = String.format("%02d:%02d", hourOfDay, minute);
                        start5.setText(s5);
                        break;
                    case R.id.end5:
                        TextView end5 = (TextView)findViewById(R.id.end5);
                        String e5 = String.format("%02d:%02d", hourOfDay, minute);
                        end5.setText(e5);
                        break;
                    case R.id.start6:
                        TextView start6 = (TextView)findViewById(R.id.start6);
                        String s6 = String.format("%02d:%02d", hourOfDay, minute);
                        start6.setText(s6);
                        break;
                    case R.id.end6:
                        TextView end6 = (TextView)findViewById(R.id.end6);
                        String e6 = String.format("%02d:%02d", hourOfDay, minute);
                        end6.setText(e6);
                        break;
                    case R.id.start7:
                        TextView start7 = (TextView)findViewById(R.id.start7);
                        String s7 = String.format("%02d:%02d", hourOfDay, minute);
                        start7.setText(s7);
                        break;
                    case R.id.end7:
                        TextView end7 = (TextView)findViewById(R.id.end7);
                        String e7 = String.format("%02d:%02d", hourOfDay, minute);
                        end7.setText(e7);
                        break;
                    case R.id.start8:
                        TextView start8 = (TextView)findViewById(R.id.start8);
                        String s8 = String.format("%02d:%02d", hourOfDay, minute);
                        start8.setText(s8);
                        break;
                    case R.id.end8:
                        TextView end8 = (TextView)findViewById(R.id.end8);
                        String e8 = String.format("%02d:%02d", hourOfDay, minute);
                        end8.setText(e8);
                        break;
                }
            }
        }, 00, 00, false);
        switch(v.getId()) {
            case R.id.start1: dialog.setTitle("1교시 시작 시간"); break;
            case R.id.start2: dialog.setTitle("2교시 시작 시간"); break;
            case R.id.start3: dialog.setTitle("3교시 시작 시간"); break;
            case R.id.start4: dialog.setTitle("4교시 시작 시간"); break;
            case R.id.start5: dialog.setTitle("5교시 시작 시간"); break;
            case R.id.start6: dialog.setTitle("6교시 시작 시간"); break;
            case R.id.start7: dialog.setTitle("7교시 시작 시간"); break;
            case R.id.start8: dialog.setTitle("8교시 시작 시간"); break;
            case R.id.end1: dialog.setTitle("1교시 종료 시간"); break;
            case R.id.end2: dialog.setTitle("2교시 종료 시간"); break;
            case R.id.end3: dialog.setTitle("3교시 종료 시간"); break;
            case R.id.end4: dialog.setTitle("4교시 종료 시간"); break;
            case R.id.end5: dialog.setTitle("5교시 종료 시간"); break;
            case R.id.end6: dialog.setTitle("6교시 종료 시간"); break;
            case R.id.end7: dialog.setTitle("7교시 종료 시간"); break;
            case R.id.end8: dialog.setTitle("8교시 종료 시간"); break;
        }
        dialog.show();
    }
}