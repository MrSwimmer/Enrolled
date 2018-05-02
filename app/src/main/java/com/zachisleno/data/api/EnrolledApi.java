package com.zachisleno.data.api;

import com.zachisleno.data.api.model.res.Uni;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import rx.Observable;

public interface EnrolledApi {
    @GET("getlistuser")
    Observable<Uni> getUnis();
}