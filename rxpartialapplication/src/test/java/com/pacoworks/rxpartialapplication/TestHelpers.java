
package com.pacoworks.rxpartialapplication;

import rx.functions.Func1;

/**
 * Created by Paco on 14/02/2016. See LICENSE.md
 */
final class TestHelpers {
    static Func1<? super Class<?>, Boolean> classCompare(final Class<?> expectedClass) {
        return new Func1<Class<?>, Boolean>() {
            @Override
            public Boolean call(Class<?> aClass) {
                return expectedClass.equals(aClass);
            }
        };
    }
}
