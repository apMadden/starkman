package iron.man;

import android.arch.lifecycle.ViewModel;

/**
 * Created by madde on 11/1/2017.
 */


interface IronManViewActionListener {
    void onViewClicked();
}

public class IronManViewModel extends ViewModel implements IronManViewActionListener {

    public IronManViewModel() {
        // trigger user load.
    }

    @Override
    public void onViewClicked() {
        // depending on the action, do necessary business logic calls and update the
        // userLiveData.
    }
}
