package hu.gearxpert.gearxpertapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //website
        ImageButton _imgButton_web;
        _imgButton_web =(ImageButton)findViewById(R.id.web);
        _imgButton_web.setOnClickListener(new View.OnClickListener()
                                          {
                                              @Override
                                              public void onClick(View v)
                                              {
                                                  String _url = "http://www.gearxpert.hu";
                                                  Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(_url));
                                                  startActivity(i);
                                              }
                                          }
        );

        //map
        ImageButton _imgButton_map;
        _imgButton_map =(ImageButton)findViewById(R.id.map);
        _imgButton_map.setOnClickListener(new View.OnClickListener()
                                          {
                                              @Override
                                              public void onClick(View v)
                                              {
                                                  String _location = "47.942135,21.031745";
                                                  Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+_location));
                                                  startActivity(i);
                                              }
                                          }
        );

        //phone
        ImageButton _imgButton_phone;
        _imgButton_phone =(ImageButton)findViewById(R.id.phone);
        _imgButton_phone.setOnClickListener(new View.OnClickListener()
                                            {
                                                @Override
                                                public void onClick(View v)
                                                {
                                                    String _phonenumber = "+36703669170";
                                                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+_phonenumber));
                                                    startActivity(i);
                                                }
                                            }
        );

        //email
        ImageButton _imgButton_email;
        _imgButton_email =(ImageButton)findViewById(R.id.email);
        _imgButton_email.setOnClickListener(new View.OnClickListener()
                                            {
                                                @Override
                                                public void onClick(View v)
                                                {
                                                    String _emailaddress = "contact@gearxpert.hu";
                                                    Intent i = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"+_emailaddress));
                                                    startActivity(i);
                                                }
                                            }
        );

    }
}
