package com.example.vineet.calcipro;
import java.lang.Math;

import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b20,b21;
    EditText e1,e2,e3;
    TextView t1,t2,t3;
    TextToSpeech ts;

    @RequiresApi(api = Build.VERSION_CODES.DONUT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);
        b17=(Button)findViewById(R.id.button17);
        b18=(Button)findViewById(R.id.button18);
        b20=(Button)findViewById(R.id.button20);
        b21=(Button)findViewById(R.id.button21);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        ts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.9f);

            }
        });
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        e1.setText(e1.getText()+"1");
                        ts.speak("One", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"2");
                        ts.speak("Two", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"3");
                        ts.speak("Three", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"4");
                        ts.speak("Four", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"5");
                        ts.speak("FIve", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"6");
                        ts.speak("Six", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"7");
                        ts.speak("Seven", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"8");
                        ts.speak("Eight", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"9");
                        ts.speak("Nine", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+".");
                        ts.speak("Dot", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"0");
                        ts.speak("Zero", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText("");
                    }
                });
                b20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        String str = e1.getText().toString();
                        if (str.length() > 1) {
                            str = str.substring(0, str.length() - 1);
                            e1.setText(str);
                        } else if (str.length() <= 1) {
                            e1.setText("0");
                        }
                    }
                });
            }
        });
        //e2 starts
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        e2.setText(e2.getText()+"1");
                        ts.speak("One", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"2");
                        ts.speak("Two", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"3");
                        ts.speak("Three", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"4");
                        ts.speak("Four", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"5");
                        ts.speak("Five", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"6");
                        ts.speak("Six", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"7");
                        ts.speak("Seven", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"8");
                        ts.speak("Eight", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"9");
                        ts.speak("Nine", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+".");
                        ts.speak("Dot", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"0");
                        ts.speak("Zero", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText("");
                    }
                });
                b20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        String str = e2.getText().toString();
                        if (str.length() > 1) {
                            str = str.substring(0, str.length() - 1);
                            e2.setText(str);
                        } else if (str.length() <= 1) {
                            e2.setText("0");
                        }
                    }
                });
                //e2 endds
            }
        });


        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e3.setText("");
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1+f2;
                String s3=Float.toString(f3);
                e3.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(MainActivity.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1-f2;
                String s3=Float.toString(f3);
                e3.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(MainActivity.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1*f2;
                String s3=Float.toString(f3);
                e3.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(MainActivity.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1/f2;
                String s3=Float.toString(f3);
                e3.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(MainActivity.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Double f1=Double.parseDouble(s1);
                Double f2=Double.parseDouble(s2);
               Double f3=Math.sin(f1+f2);
                String s3=Double.toString(f3);
                e3.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(MainActivity.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Double f1=Double.parseDouble(s1);
                Double f2=Double.parseDouble(s2);
                Double f3=Math.tan(f1+f2);
                String s3=Double.toString(f3);
                e3.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(MainActivity.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });


        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Double f1=Double.parseDouble(s1);
                Double f2=Double.parseDouble(s2);
                Double f3=Math.cos(f1+f2);
                String s3=Double.toString(f3);
                e3.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(MainActivity.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
