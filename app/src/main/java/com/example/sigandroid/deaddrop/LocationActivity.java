package com.example.sigandroid.deaddrop;

//MAP
//https://developers.google.com/maps/documentation/android-api/

//Android imports
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Project imports
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;
import android.app.Activity;


public class LocationActivity extends Activity implements OnMapReadyCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);


        //Create map fragment
        MapFragment mapFragment = (MapFragment)getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady(GoogleMap map){
        //Newark Coordinates:  40.7357° N, 74.1724° W
        LatLng newark = new LatLang(40.7357, 74.1724);

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(newark, 13)); //13?

        map.addMarker(new MarkerOptions()
                .title("Newark")
                .snippet("Welcome to Hell")
                .position(newark));
    }


}
