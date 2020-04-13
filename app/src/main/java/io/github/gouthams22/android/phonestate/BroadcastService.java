package io.github.gouthams22.android.phonestate;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class BroadcastService extends Service {
    private static BroadcastReceiver simChangedReceiver;
    public BroadcastService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        registerScreenOffReceiver();
    }
    @Override
    public void onDestroy()
    {
        unregisterReceiver(simChangedReceiver);
//        m_ScreenOffReceiver = null;
    }
    private void registerScreenOffReceiver()
    {
        simChangedReceiver = new BroadcastReceiver()
        {
            @Override
            public void onReceive(Context context, Intent intent)
            {
                Log.d("Service", "ACTION_SCREEN_OFF");
                Toast.makeText(context,"Yes",Toast.LENGTH_SHORT).show();
                // do something, e.g. send Intent to main app
            }
        };
        IntentFilter filter = new IntentFilter("android.intent.action.SIM_STATE_CHANGED");
        registerReceiver(simChangedReceiver, filter);
    }
}
