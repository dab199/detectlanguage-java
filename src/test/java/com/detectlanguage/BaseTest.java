package com.detectlanguage;

import org.junit.Before;

public class BaseTest {
    public static String TEST_API_KEY = "93dfb956a294140a4370a09584af2ef6";

    @Before
    public void setUp() {
        DetectLanguage.apiHost = System.getProperty("detectlanguage_api_host",
                DetectLanguage.apiHost);
        DetectLanguage.apiKey = System.getProperty("detectlanguage_api_key",
                TEST_API_KEY);
    }
}
