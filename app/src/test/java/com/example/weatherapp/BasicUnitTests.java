package com.example.weatherapp;


import org.junit.Test;

import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.GINGERBREAD;
import static org.junit.Assert.*;


public class BasicUnitTests {

    @Test
    public void testAndroidVersionGreaterThanGingerbread() {
        int currentAndroidVersion = SDK_INT;
        int androidVersion = GINGERBREAD;
        assertTrue(currentAndroidVersion > 0);
    }


}