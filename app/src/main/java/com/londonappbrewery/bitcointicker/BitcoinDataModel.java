package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import static android.util.Log.d;

public class BitcoinDataModel {
    private double bitcoinPrice;

    public static BitcoinDataModel fromJSON(JSONObject response){

        BitcoinDataModel bitcoinData = new BitcoinDataModel();

        try {
            bitcoinData.bitcoinPrice = response.getDouble("last");
            return bitcoinData;
        }
        catch (JSONException e){
            Log.d("Bitcoin", "Json Exception");
            e.printStackTrace();
            return null;
        }
    }

    public double getBitcoinPrice() {
        return bitcoinPrice;
    }
}
