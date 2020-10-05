package pens.lab.app.belajaractivity.modul.profile;

import android.os.Bundle;

import pens.lab.app.belajaractivity.base.BasePresenter;
import pens.lab.app.belajaractivity.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void setProfile(String email, String password);
    }

    interface Presenter extends BasePresenter {
        void getProfileInfo(Bundle bundle);
    }
}
