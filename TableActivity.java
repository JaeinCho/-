package com.example.chocho64.clanner;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TableActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
    }

    public void onClick(View v) {

        final EditText subject = new EditText(this);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("교과 시간을 입력해 주세요.");
        alert.setView(subject);

        switch(v.getId()) {
            case R.id.mon1:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.mon1);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.tue1:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.tue1);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.wed1:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.wed1);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.thu1:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.thu1);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.fri1:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.fri1);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.mon2:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.mon2);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.tue2:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.tue2);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.wed2:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.wed2);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.thu2:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.thu2);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.fri2:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.fri2);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.mon3:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.mon3);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.tue3:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.tue3);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.wed3:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.wed3);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.thu3:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.thu3);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.fri3:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.fri3);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.mon4:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.mon4);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.tue4:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.tue4);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.wed4:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.wed4);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.thu4:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.thu4);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.fri4:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.fri4);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.mon5:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.mon5);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.tue5:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.tue5);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.wed5:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.wed5);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.thu5:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.thu5);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.fri5:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.fri5);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.mon6:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.mon6);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.tue6:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.tue6);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.wed6:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.wed6);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.thu6:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.thu6);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.fri6:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.fri6);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.mon7:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.mon7);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.tue7:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.tue7);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.wed7:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.wed7);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.thu7:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.thu7);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.fri7:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.fri7);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.mon8:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.mon8);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.tue8:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.tue8);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.wed8:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.wed8);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.thu8:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.thu8);
                        textView.setText(inputValue);
                    }
                });
                break;
            case R.id.fri8:
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String inputValue = subject.getText().toString();
                        TextView textView = (TextView)findViewById(R.id.fri8);
                        textView.setText(inputValue);
                    }
                });
                break;
        }

        alert.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.cancel();
            }
        });

        alert.show();
    }
}
