package prangerz54.kusmartparking.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Collection;
import java.util.List;

import prangerz54.kusmartparking.Models.Parking;
import prangerz54.kusmartparking.Models.ParkingList;
import prangerz54.kusmartparking.Models.Storage;
import prangerz54.kusmartparking.R;

/**
 * Created by PrangerZ54 on 6/5/2016 AD.
 */
public class showCarpark extends AppCompatActivity {

    private Parking parking;
    private ParkingList parkingList;
    private int indexList,indexCard;
    private List<Parking> carparkList;
    private TextView showCarparkName,showCarparkPrice,showCarparkDist;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_carpark);
        indexList = this.getIntent().getIntExtra("i", 0);
        indexCard = this.getIntent().getIntExtra("j", 0);
        parking = Storage.getInstance().loadSavedParking().get(indexList).getNewParkingList().get(indexCard);
        initComponents();
    }

    private void initComponents() {

        showCarparkName = (TextView)findViewById(R.id.showCarparkNameTextView);
        showCarparkPrice = (TextView)findViewById(R.id.showCarparkPriceTextView);
        showCarparkDist = (TextView)findViewById(R.id.showCarparkDistanceTextView);

        showCarparkName.setText(parking.getName());
        showCarparkPrice.setText(parking.getPrice());
        showCarparkDist.setText((int)parking.getDistance());
    }

}
