package prangerz54.kusmartparking.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import prangerz54.kusmartparking.R;

/**
 * Created by PrangerZ54 on 6/3/2016 AD.
 *
 */
public class StartActivity extends AppCompatActivity {

    private Button goButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        goButton = (Button)findViewById(R.id.goBtn);
        initComponent();
    }

    public void initComponent(){
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
