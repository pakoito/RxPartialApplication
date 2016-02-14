
package com.pacoworks.rxpartialapplication;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import rx.Observable;
import rx.functions.*;

public class RxPartialActionTest {
    private static final Action6 ACTION_6 = new Action6() {
        @Override
        public void call(Object o, Object o2, Object o3, Object o4, Object o5, Object o6) {
        }
    };

    private static final Action9 ACTION_9 = new Action9() {
        @Override
        public void call(Object o, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7,
                Object o8, Object o9) {
        }
    };

    private static final ActionN ACTION_N = new ActionN() {
        @Override
        public void call(Object... args) {
        }
    };

    @Test
    public void apply() throws Exception {
        List<Class<?>> classes = Observable
                .from(RxPartialAction.apply(ACTION_6, 1, 2, 3).getClass().getInterfaces())
                .filter(TestHelpers.classCompare(Action3.class)).toList().toBlocking().first();
        Assert.assertEquals(1, classes.size());
        classes = Observable
                .from(RxPartialAction.apply(ACTION_9, 1, 2, 3, 4, 5, 6, 7, 8, 9).getClass()
                        .getInterfaces())
                .filter(TestHelpers.classCompare(Action0.class)).toList().toBlocking().first();
        Assert.assertEquals(1, classes.size());
        classes = Observable
                .from(RxPartialAction.apply(ACTION_N, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3,
                        1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3).getClass()
                .getInterfaces()).filter(TestHelpers.classCompare(Action0.class)).toList()
                .toBlocking().first();
        Assert.assertEquals(1, classes.size());
    }
}
