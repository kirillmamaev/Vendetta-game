package club.vendetta.game.misc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DebugReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, Debug.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
