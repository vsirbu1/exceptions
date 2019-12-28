package com.intership.task.exceptionstask;

import org.hamcrest.MatcherAssert;

public class Assertion {
    public static void compare(String s1, String s2)
    {
        MatcherAssert.assertThat("s1 equals s2", s1.equals(s2));
        System.out.println("Everything ok");
        System.out.println(s1 +" and "+s2);

    }
}
