package com.desafiolatam.casadagger;

import com.desafiolatam.casadagger.model.Casa;

import dagger.Component;

@Component
public interface AppComponent {

    Casa getCasa();
}
