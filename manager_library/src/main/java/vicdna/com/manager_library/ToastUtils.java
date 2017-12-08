package vicdna.com.manager_library;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by lewis on 2017/12/8.
 */

public class ToastUtils {

    /**
     * 顯示多士
     *
     * @param context
     * @param str
     */
    public static void showLongToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

    public static void showShortToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
    
    public static void showLongToastV2(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

    public static void showShortToastV2(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
