package pt.up.fe.ssin.pexplorer.actions;

import pt.up.fe.ssin.pexplorer.R;
import pt.up.fe.ssin.pexplorer.app.PermissionAction;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.widget.Toast;

public class InternetAccessAction extends PermissionAction {

	static String URL = "http://images.wikia.com/meme/images/d/d2/14-me-gusta-22vmrft.png";    

	public InternetAccessAction() {
		super(R.string.internet_access_label, R.string.internet_access_desc,
				PermissionAction.WARN);
	}
	
	@Override
	protected void doAction(final Context context) {
		context.startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(URL)));
	}
	
	private static boolean isConnected(Context context) {
	    ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
	    if (connectivityManager != null) {
	         return connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnected();
	    }
	    return false;
	}
}

