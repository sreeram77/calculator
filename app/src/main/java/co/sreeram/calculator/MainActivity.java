package co.sreeram.calculator;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    float x = 0, y = 0;
    int flag = 0,c,d=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, dot, del,eq;
        final TextView t = (TextView) findViewById(R.id.textView2);


        b0 = (Button) findViewById(R.id.button11);
        b0.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          if(d==0) {
                                              x *= 10;
                                              x += 0;
                                          }
                                          else
                                          {
                                              x+=0.0;
                                          }
                                          t.setText(String.valueOf(x));
                                      } else {
                                          y *= 10;
                                          y += 10;
                                          t.setText(String.valueOf(x));
                                      }
                                  }
                              }
        );

        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          if(d==0) {
                                              x *= 10;
                                              x += 1;
                                          }
                                          else
                                          {
                                              x+=0.1;

                                          }
                                          t.setText(String.valueOf(x));
                                      } else {
                                          y *= 10;
                                          y += 1;
                                          t.setText(String.valueOf(y));
                                      }
                                  }
                              }
        );


        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          x *= 10;
                                          x += 2;
                                          t.setText(String.valueOf(x));
                                      } else {
                                          y *= 10;
                                          y += 2;
                                          t.setText(String.valueOf(y));
                                      }
                                  }
                              }
        );

        b3 = (Button) findViewById(R.id.button9);
        b3.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          x *= 10;
                                          x += 3;
                                          t.setText(String.valueOf(x));
                                      } else {
                                          y *= 10;
                                          y += 3;
                                          t.setText(String.valueOf(y));
                                      }
                                  }
                              }
        );

        b4 = (Button) findViewById(R.id.button6);
        b4.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          x *= 10;
                                          x += 4;
                                          t.setText(String.valueOf(x));
                                      } else {
                                          y *= 10;
                                          y += 4;
                                          t.setText(String.valueOf(y));
                                      }
                                  }
                              }
        );

        b5 = (Button) findViewById(R.id.button7);
        b5.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          x *= 10;
                                          x += 5;
                                          t.setText(String.valueOf(x));
                                      } else {
                                          y *= 10;
                                          y += 5;
                                          t.setText(String.valueOf(y));
                                      }
                                  }
                              }
        );

        b6 = (Button) findViewById(R.id.button8);
        b6.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          x *= 10;
                                          x += 6;
                                          t.setText(String.valueOf(x));
                                      } else {
                                          y *= 10;
                                          y += 6;
                                          t.setText(String.valueOf(y));
                                      }
                                  }
                              }
        );

        b7 = (Button) findViewById(R.id.button4);
        b7.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          x *= 10;
                                          x += 7;
                                          t.setText(String.valueOf(x));
                                      } else {
                                          y *= 10;
                                          y += 7;
                                          t.setText(String.valueOf(y));
                                      }
                                  }
                              }
        );

        b8 = (Button) findViewById(R.id.button5);
        b8.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          x *= 10;
                                          x += 8;
                                          t.setText(String.valueOf(x));
                                      } else {
                                          y *= 10;
                                          y += 8;
                                          t.setText(String.valueOf(y));
                                      }
                                  }
                              }
        );

        b9 = (Button) findViewById(R.id.button3);
        b9.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          x *= 10;
                                          x += 9;
                                          t.setText(String.valueOf(x));
                                      } else {
                                          y *= 10;
                                          y += 9;
                                          t.setText(String.valueOf(y));
                                      }
                                  }
                              }
        );

        dot = (Button) findViewById(R.id.button10);
        dot.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          t.setText(String.valueOf(x));

                                      } else {
                                          t.setText(String.valueOf(y));

                                      }
                                  }
                              }
        );

        del = (Button) findViewById(R.id.button14);
        del.setOnClickListener(new View.OnClickListener() {
                                   public void onClick(View v) {
                                       if (flag == 0) {
                                           x-=x%10;
                                           x/=10;
                                           t.setText(String.valueOf(x));
                                       } else if(flag == 1){
                                           y-=y%10;
                                           y/=10;
                                           t.setText(String.valueOf(y));
                                       }
                                   }
                               }
        );

        ba = (Button) findViewById(R.id.button18);
        ba.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          c = 1;
                                          flag=1;
                                      }
                                  }
                              }
        );

        bs = (Button) findViewById(R.id.button17);
        bs.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          c=2;
                                          flag=1;
                                      }
                                  }
                              }
        );

        bm = (Button) findViewById(R.id.button16);
        bm.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          c = 3;
                                          flag=1;
                                      }
                                  }
                              }
        );

        bd = (Button) findViewById(R.id.button15);
        bd.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          c = 4;
                                          flag=1;
                                      }
                                  }
                              }
        );

        eq = (Button) findViewById(R.id.button12);
        eq.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      if (flag == 0) {
                                          t.setText(String.valueOf(x));
                                      }
                                      else {
                                          switch (c) {
                                              case 1:
                                                  x += y;
                                                  break;
                                              case 2:
                                                  x -= y;
                                                  break;
                                              case 3:
                                                  x *= y;
                                                  break;
                                              case 4:
                                                  x /= y;
                                                  break;
                                          }
                                          t.setText(String.valueOf(x));
                                          flag=0;
                                          y=0;

                                      }
                                  }
                              }
            );

    }
}
