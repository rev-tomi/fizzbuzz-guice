package com.trev.fizzbuzz.inject.guice;

import java.util.stream.Stream;

public interface FizzBuzzNumberProvider
{

    Stream<Integer> getFizzBuzzNumbers();
}
