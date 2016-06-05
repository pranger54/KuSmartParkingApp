package prangerz54.kusmartparking.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import prangerz54.kusmartparking.R;

public class MainActivity extends AppCompatActivity {

    private Button availablecCarparkButton,informaitonButton,lowcostButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        availablecCarparkButton = (Button) findViewById(R.id.availableBtn);
        informaitonButton = (Button) findViewById(R.id.informtionBtn);
        lowcostButton = (Button) findViewById(R.id.lowpriceBtn);
        initComponent();
    }

    public void initComponent(){
        availablecCarparkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FindAvailableCarpark.class);
                startActivity(intent);
            }
        });

        informaitonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,InformationActivity.class);
                startActivity(intent);
            }
        });

        lowcostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Lowprice.class);
                startActivity(intent);
            }
        });
    }





}
