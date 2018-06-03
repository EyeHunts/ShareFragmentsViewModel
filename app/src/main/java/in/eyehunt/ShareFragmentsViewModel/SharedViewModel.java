package in.eyehunt.ShareFragmentsViewModel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by Eyehunt Team on 02/06/18.
 */

public class SharedViewModel extends ViewModel {
    private final MutableLiveData message = new MutableLiveData();

    public void setMessage(String msg){
        message.setValue(msg);
    }

    public MutableLiveData getMessage() {
        return message;
    }
}
