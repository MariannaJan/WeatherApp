package com.example.weatherapp;


import org.junit.Test;
import com.example.weatherapp.utilities.*;

import static org.junit.Assert.*;


public class BasicUnitTests {

    @Test
    public void testCelsiusToFahrenheitConversion () {
        double temperatureInCelsius = 20.0;
        double temperatureInFahrenheitExpected = 68.0;
        assertEquals(temperatureInFahrenheitExpected, SunshineWeatherUtils.celsiusToFahrenheit(temperatureInCelsius), 0);
    }
}