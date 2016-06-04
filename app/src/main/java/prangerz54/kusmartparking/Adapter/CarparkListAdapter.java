package prangerz54.kusmartparking.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import prangerz54.kusmartparking.Models.ParkingList;
import prangerz54.kusmartparking.R;

/**
 * Created by PrangerZ54 on 6/5/2016 AD.
 */
public class CarparkListAdapter {

    public class CardListAdapter extends ArrayAdapter<ParkingList> {

        public CardListAdapter(Context context, int resource, List<ParkingList> objects){
            super(context,resource,objects);
        }

        public View getView(int position, View convertView, ViewGroup parent){

            View v = convertView;

            if(v == null){
                LayoutInflater vi = LayoutInflater.from(getContext());
                v = vi.inflate(R.layout.parkinglist_cell, null);
            }

            TextView NewParking = (TextView) v.findViewById(R.id.parkingListCell);

            ParkingList parkingList= getItem(position);
            NewParking.setText(parkingList.getParkingListTitle());

            return v;

        }


    }
}
