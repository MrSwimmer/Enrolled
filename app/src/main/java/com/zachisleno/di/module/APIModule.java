package com.zachisleno.di.module;

import com.zachisleno.data.api.EnrolledApi;
import com.zachisleno.domain.interactor.APIService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class APIModule {
    @Provides
    @Singleton
    Retrofit provideCall() {
        return new Retrofit.Builder()
                .baseUrl("наш адресс")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    @SuppressWarnings("unused")
    public EnrolledApi providesNetworkService(
            Retrofit retrofit) {
        return retrofit.create(EnrolledApi.class);
    }

    @Provides
    @Singleton
    @SuppressWarnings("unused")
    public APIService providesService(
            EnrolledApi networkService) {
        return new APIService(networkService);
    }

}
