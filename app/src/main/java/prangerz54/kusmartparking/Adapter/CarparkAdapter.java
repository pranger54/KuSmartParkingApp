package prangerz54.kusmartparking.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import prangerz54.kusmartparking.Parking.Parking;
import prangerz54.kusmartparking.R;

/**
 * Created by PrangerZ54 on 6/3/2016 AD.
 */
public class CarparkAdapter extends ArrayAdapter<Parking> {


    public CarparkAdapter(Context context, int resource, List<Parking> objects) {
        super(context, resource,objects);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        View v = convertView;

        if(v == null){
            LayoutInflater vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.parking_cell, null);
        }

        TextView ParkingList = (TextView) v.findViewById(R.id.parkingCell);

        Parking parking  = getItem(position);
        parking.setName(parking.getName());

        return v;

    }


}
