package com.example.weatherapp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.example.weatherapp.utilities.SunshineWeatherUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.GINGERBREAD;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class BasicInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.weatherapp", appContext.getPackageName());
    }

    @Test
    public void testAndroidVersionGreaterThanGingerbread() {
        int currentAndroidVersion = SDK_INT;
        int androidVersion = GINGERBREAD;
        assertTrue(currentAndroidVersion > androidVersion);
    }

    @Test
    public void testFormatTemperature() {
        Context context = InstrumentationRegistry.getTargetContext();
        double temperatureInCelsius = 20.5;
        assertEquals("69°", SunshineWeatherUtils.formatTemperature(context, temperatureInCelsius));
    }
}
