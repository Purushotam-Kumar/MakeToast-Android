package android.showtoastmessage;

import android.content.Context;
import android.widget.Toast;

public class CreateToast {

    public static void popShortToast(Context context, String toastMessage){
        Toast.makeText(context,toastMessage,Toast.LENGTH_SHORT).show();
    }

    public static void popLongToast(Context context, String toastMessage){
        Toast.makeText(context,toastMessage,Toast.LENGTH_SHORT).show();
    }

}
