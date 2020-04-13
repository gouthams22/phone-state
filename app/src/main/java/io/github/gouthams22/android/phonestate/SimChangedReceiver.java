package io.github.gouthams22.android.phonestate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SubscriptionManager;
import android.util.Log;
import android.widget.Toast;

public class SimChangedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String state = intent.getExtras().getString("ss");
        if (state == null) {
            Log.d("SIM", "SIM null");
            Toast.makeText(context, "Sim null", Toast.LENGTH_SHORT).show();
        }
        switch (state){
//            case "ABSENT":
//                Log.d("SIM", "SIM absent");
//                Toast.makeText(context, "Sim absent", Toast.LENGTH_SHORT).show();
//                break;
//            case "NETWORK_LOCKED": Log.d("SIM", "SIM network locked");
//                Toast.makeText(context, "Sim network locked", Toast.LENGTH_SHORT).show();
//                break;
            case "NOT_READY":
                Log.d("SIM", "SIM null");
                Toast.makeText(context, "Sim changed", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
