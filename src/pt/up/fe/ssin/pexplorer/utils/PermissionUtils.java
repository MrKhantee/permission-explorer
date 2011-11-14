package pt.up.fe.ssin.pexplorer.utils;

import android.content.pm.PermissionInfo;

public class PermissionUtils {

	public static String getShortName(PermissionInfo perm) {
		int lastDot = perm.name.lastIndexOf('.');
		return perm.name.substring(lastDot + 1);
	}

	public static Pair<String, String> decomposeName(PermissionInfo perm) {
		int lastDot = perm.name.lastIndexOf('.');
		return new Pair<String, String>(lastDot < 0 ? "" : perm.name.substring(
				0, lastDot), perm.name.substring(lastDot + 1));
	}
}
