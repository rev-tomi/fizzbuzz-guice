package com.trev.fizzbuzz.inject.guice;

import com.google.inject.Inject;

public class FizzBuzzGuiceService
{

    private final FizzBuzzNumberProvider numberProvider;
    private final FizzBuzzTextProvider textProvider;
    private final FizzBuzzPrinter printer;

    /**
     * A constructor that needs module configuration.
     *
     * @param numberProvider creates a Stream of Integer
     * @param textProvider translates integers to text
     * @param printer prints the texts
     */
    @Inject
    public FizzBuzzGuiceService(final FizzBuzzNumberProvider numberProvider,
        final FizzBuzzTextProvider textProvider,
        final FizzBuzzPrinter printer)
    {
        this.numberProvider = numberProvider;
        this.textProvider = textProvider;
        this.printer = printer;
    }

    /**
     * This one doesn't need module configuration
     */

    //    @Inject
    //    public FizzBuzzGuiceService(final DefaultNumberProvider numberProvider,
    //        final DefaultTextProvider textProvider,
    //        final DefaultFizzBuzzPrinter printer)
    //    {
    //        this.numberProvider = numberProvider;
    //        this.textProvider = textProvider;
    //        this.printer = printer;
    //    }

    public void doFizzBuzz()
    {
        numberProvider.getFizzBuzzNumbers().forEach(num -> {
            final String msg = textProvider.getFizzBuzzText(num);
            printer.printFizzBuzz(msg);
        });
    }

}
