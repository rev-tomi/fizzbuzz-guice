package com.trev.fizzbuzz.inject.guice.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.trev.fizzbuzz.inject.guice.FizzBuzzGuiceService;
import com.trev.fizzbuzz.inject.guice.FizzBuzzModule;

public class Main
{

    public static void main(final String[] args)
    {
        // This is for the constructor with concrete classes
        //final Injector injector = Guice.createInjector();

        final Injector injector = Guice.createInjector(new FizzBuzzModule());

        final FizzBuzzGuiceService fizzBuzz = injector.getInstance(FizzBuzzGuiceService.class);

        fizzBuzz.doFizzBuzz();

    }

}
