package com.trev.fizzbuzz.inject.guice;

import com.google.inject.AbstractModule;

public class FizzBuzzModule extends AbstractModule
{

    @Override
    protected void configure()
    {
        bind(FizzBuzzNumberProvider.class).to(DefaultNumberProvider.class);
        bind(FizzBuzzPrinter.class).to(DefaultFizzBuzzPrinter.class);
        bind(FizzBuzzTextProvider.class).to(DefaultTextProvider.class);
    }

}
