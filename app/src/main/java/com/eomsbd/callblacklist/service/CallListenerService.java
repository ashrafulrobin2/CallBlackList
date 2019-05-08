package com.eomsbd.callblacklist.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.telephony.TelephonyManager;

import com.eomsbd.callblacklist.utils.DataManger;

public class CallListenerService extends Service {
    TelephonyManager m_telephonyManager;
    public CallListenerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return  null;
    }
    @Override
    public void onStart(Intent intent, int startId) {
        // TODO Auto-generated method stub
        m_telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
        if(DataManger.getInstance(this).checkTrackerService()){
          //  SMSOps.getInstance(this).checkSimChange();
        }
        super.onStart(intent, startId);
    }
}
