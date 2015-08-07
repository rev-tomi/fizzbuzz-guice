package com.trev.fizzbuzz.inject.guice.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.trev.fizzbuzz.inject.guice.FizzBuzzGuiceService;

public class Main
{

    public static void main(final String[] args)
    {
        final Injector injector = Guice.createInjector();

        final FizzBuzzGuiceService fizzBuzz = injector.getInstance(FizzBuzzGuiceService.class);

        fizzBuzz.doFizzBuzz();

    }

}
