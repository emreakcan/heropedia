package com.pasotti.matteo.wikiheroes.di

import android.app.Application
import com.pasotti.matteo.wikiheroes.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [
    (AndroidInjectionModule::class),
    (ActivityModule::class),
    (FragmentModule::class),
    (AppModule::class)])
interface AppComponent :AndroidInjector<DaggerApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): AppComponent.Builder
        fun build(): AppComponent
    }

    //fun inject(instance: MyApplication)
}