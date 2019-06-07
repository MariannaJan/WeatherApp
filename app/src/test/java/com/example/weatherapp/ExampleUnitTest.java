package com.example.weatherapp;

import android.os.Build;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testAndroidVersionGreaterThanGingerbread() {
        int currentAndroidVersion = Build.VERSION.SDK_INT;
        int gingerbread = Build.VERSION_CODES.GINGERBREAD;
        assertTrue(currentAndroidVersion > gingerbread);
    }


}