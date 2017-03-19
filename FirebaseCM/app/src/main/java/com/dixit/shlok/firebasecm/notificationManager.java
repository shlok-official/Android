package com.dixit.shlok.firebasecm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.NotificationCompat;

/**
 * Created by ShlokDixit on 3/19/17.
 */

public class notificationManager {
        private Context nctx;
        public static final int NOTIFICATION_ID = 123;

    public notificationManager(Context context){
        this.nctx = context;
    }
    public void showNotification(String from, String notification, Intent intent){
        PendingIntent pendingIntent = PendingIntent.getActivity(nctx, NOTIFICATION_ID,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(nctx);
        Notification notification1 = builder.setSmallIcon(R.mipmap.ic_launcher)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent)
                .setContentTitle(from)
                .setContentText(notification)
                .setLargeIcon(BitmapFactory.decodeResource(nctx.getResources(),R.mipmap.ic_launcher))
                .build();
        notification1.flags |=Notification.FLAG_AUTO_CANCEL;
        NotificationManager notificationManager = (NotificationManager) nctx.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICATION_ID,notification1);
    }
}
