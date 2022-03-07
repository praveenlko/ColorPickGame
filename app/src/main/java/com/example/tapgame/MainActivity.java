package com.example.tapgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.graphics.Color;
import android.os.Bundle;

import android.os.CountDownTimer;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View view2,view3,view4,view5;
    private TextView score,time;
    private int counter = 0;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        view2 = findViewById(R.id.view2);
        view3 = findViewById(R.id.view3);
        view4 = findViewById(R.id.view4);
        view5 = findViewById(R.id.view5);
        score = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        time = findViewById(R.id.time);

        showGame();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                score.setText("");
                view2.setEnabled(true);
                view3.setEnabled(true);
                view4.setEnabled(true);
                view5.setEnabled(true);
                showGame();
            }
        });

    }

    private void showGame(){
        new CountDownTimer(100000,500){

            @Override
            public void onTick(long millisUntilFinished) {

                int random = new Random().nextInt(5 - 1) + 1;
                if (random == 1){
                    view2.setBackgroundColor(Color.GRAY);
                    view3.setBackgroundColor(Color.RED);
                    view4.setBackgroundColor(Color.GREEN);
                    view5.setBackgroundColor(Color.YELLOW);
                    view2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            counter++;
                            score.setText("Score : "+String.valueOf(counter));
                        }
                    });
                    view3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cancel();
                            view2.setEnabled(false);
                            score.setText("Score : "+String.valueOf(counter)+" \n Game Over");
                        }
                    });
                    view4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cancel();
                            view2.setEnabled(false);
                            score.setText("Score : "+String.valueOf(counter)+" \n Game Over");
                        }
                    });
                    view5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cancel();
                            view2.setEnabled(false);
                            score.setText("Score : "+String.valueOf(counter)+" \n Game Over");
                        }
                    });
                }else if(random == 2){
                    view2.setBackgroundColor(Color.YELLOW);
                    view3.setBackgroundColor(Color.GRAY);
                    view4.setBackgroundColor(Color.RED);
                    view5.setBackgroundColor(Color.GREEN);
                    view2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cancel();
                            view3.setEnabled(false);
                            score.setText("Score : "+String.valueOf(counter)+" \n Game Over");
                        }
                    });
                    view3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            counter++;
                            score.setText("Score : "+String.valueOf(counter));
                        }
                    });
                    view4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cancel();
                            view3.setEnabled(false);
                            score.setText("Score : "+String.valueOf(counter)+" \n Game Over");
                        }
                    });
                    view5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cancel();
                            view3.setEnabled(false);
                            score.setText("Score : "+String.valueOf(counter)+" \n Game Over");
                        }
                    });
                }else if(random == 3){
                    view2.setBackgroundColor(Color.GREEN);
                    view3.setBackgroundColor(Color.YELLOW);
                    view4.setBackgroundColor(Color.GRAY);
                    view5.setBackgroundColor(Color.RED);
                    view2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cancel();
                            view4.setEnabled(false);
                            score.setText("Score : "+String.valueOf(counter)+" \n Game Over");
                        }
                    });
                    view3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cancel();
                            view4.setEnabled(false);
                            score.setText("Score : "+String.valueOf(counter)+" \n Game Over");
                        }
                    });
                    view4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            counter++;
                            score.setText("Score : "+String.valueOf(counter));

                        }
                    });
                    view5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cancel();
                            view4.setEnabled(false);
                            score.setText("Score : "+String.valueOf(counter)+" \n Game Over");
                        }
                    });
                }else if(random == 4){
                    view2.setBackgroundColor(Color.RED);
                    view3.setBackgroundColor(Color.GREEN);
                    view4.setBackgroundColor(Color.YELLOW);
                    view5.setBackgroundColor(Color.GRAY);
                    view2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cancel();
                            view5.setEnabled(false);
                            score.setText("Score : "+String.valueOf(counter)+" \n Game Over");
                        }
                    });
                    view3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cancel();
                            view5.setEnabled(false);
                            score.setText("Score : "+String.valueOf(counter)+" \n Game Over");
                        }
                    });
                    view4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cancel();
                            view5.setEnabled(false);
                            score.setText("Score : "+String.valueOf(counter)+" \n Game Over");
                        }
                    });
                    view5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            counter++;
                            score.setText("Score : "+String.valueOf(counter));
                        }
                    });
                }
            }

            @Override
            public void onFinish() {
                score.setText("Score : "+String.valueOf(counter)+" \n Time Up \n Thanks for play this game");
                time.setText("Time Up 0"+" \n Thanks for play this game");
                view2.setEnabled(false);
                view3.setEnabled(false);
                view4.setEnabled(false);
                view5.setEnabled(false);

            }
        }.start();
    }

}