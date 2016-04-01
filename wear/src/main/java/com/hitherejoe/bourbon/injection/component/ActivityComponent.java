package com.hitherejoe.bourbon.injection.component;

import com.hitherejoe.bourbon.common.injection.PerActivity;
import com.hitherejoe.bourbon.common.injection.component.ApplicationComponent;
import com.hitherejoe.bourbon.common.injection.module.ActivityModule;

import dagger.Component;

/**
 * This component injects dependencies to all Activities across the application
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

}