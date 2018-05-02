package com.zachisleno.di;

import com.zachisleno.di.module.APIModule;
import com.zachisleno.di.module.SharedPreferencesModule;
import com.zachisleno.presentation.intro.auth.AuthPresenter;
import com.zachisleno.presentation.main.detail_dir.DetailDirPresenter;
import com.zachisleno.presentation.main.direction.recycler.DirAdapter;
import com.zachisleno.presentation.main.settings.SettingsPresenter;
import com.zachisleno.presentation.main.university.UniversityPresenter;
import com.zachisleno.presentation.main.university.recycler.UniAdapter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {APIModule.class, SharedPreferencesModule.class})
public interface AppComponent {

    void inject(AuthPresenter authPresenter);

    void inject(UniversityPresenter universityPresenter);

    void inject(UniAdapter uniAdapter);

    void inject(DirAdapter dirAdapter);

    void inject(DetailDirPresenter detailDirPresenter);

    void inject(SettingsPresenter settingsPresenter);
}
