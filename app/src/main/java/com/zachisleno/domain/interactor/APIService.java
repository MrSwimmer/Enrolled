package com.zachisleno.domain.interactor;

import com.zachisleno.data.api.EnrolledApi;
import com.zachisleno.data.api.model.res.Uni;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class APIService {
    private final EnrolledApi enrolledApi;

    public APIService(EnrolledApi enrolledApi) {
        this.enrolledApi = enrolledApi;
    }

    public void getUnis(UniCallback callback) {
        enrolledApi.getUnis()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(callback::onSuccess, callback::onError);
    }

    public interface UniCallback {
        void onSuccess(Uni uni);
        void onError(Throwable e);
    }
}