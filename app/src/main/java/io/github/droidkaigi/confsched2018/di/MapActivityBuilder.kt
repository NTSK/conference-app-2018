package io.github.droidkaigi.confsched2018.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.droidkaigi.confsched2018.presentation.map.MapActivity

@Module interface MapActivityBuilder {
    @ContributesAndroidInjector(
            modules = [
                FragmentBuildersModule::class,
                MapActivityModule::class
            ]
    )
    fun contributeMapActivity(): MapActivity
}
