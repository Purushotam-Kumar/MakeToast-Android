package android.showtoastmessage;

import android.content.Context;
import android.widget.Toast;

public class CreateToast {

    public void PopToast(Context context, String toastMessage){
        Toast.makeText(context,toastMessage,Toast.LENGTH_SHORT).show();
    }

}
