
package com.pacoworks.rxpartialapplication;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import rx.Observable;
import rx.functions.*;

public class RxPartialFuncTest {
    private static final Func6 ACTION_6 = new Func6() {
        @Override
        public Object call(Object o, Object o2, Object o3, Object o4, Object o5, Object o6) {
            return "";
        }
    };

    private static final Func9 ACTION_9 = new Func9() {
        @Override
        public Object call(Object o, Object o2, Object o3, Object o4, Object o5, Object o6,
                Object o7, Object o8, Object o9) {
            return "";
        }
    };

    private static final FuncN ACTION_N = new FuncN() {
        @Override
        public Object call(Object... args) {
            return "";
        }
    };

    @Test
    public void apply() throws Exception {
        List<Class<?>> classes = Observable
                .from(RxPartialFunc.apply(ACTION_6, 1, 2, 3).getClass().getInterfaces())
                .filter(TestHelpers.classCompare(Func3.class)).toList().toBlocking().first();
        Assert.assertEquals(1, classes.size());
        classes = Observable
                .from(RxPartialFunc.apply(ACTION_9, 1, 2, 3, 4, 5, 6, 7, 8, 9).getClass()
                        .getInterfaces())
                .filter(TestHelpers.classCompare(Func0.class)).toList().toBlocking().first();
        Assert.assertEquals(1, classes.size());
        classes = Observable
                .from(RxPartialFunc.apply(ACTION_N, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1,
                        2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3).getClass()
                .getInterfaces()).filter(TestHelpers.classCompare(Func0.class)).toList()
                .toBlocking().first();
        Assert.assertEquals(1, classes.size());
    }
}
