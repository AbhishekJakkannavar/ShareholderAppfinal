package shareholder.infinity.com.shareholderapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {


    ImageButton companybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To send intent to CompanyProfile Activity
        companybutton = findViewById(R.id.companybutton);
        companybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CompanyProfile.class);
                startActivity(intent);
            }
        });
    }

}
