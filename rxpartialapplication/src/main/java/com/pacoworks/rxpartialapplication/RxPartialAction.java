/*
 * Copyright (c) pakoito 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pacoworks.rxpartialapplication;

import java.util.Arrays;
import java.util.Collections;

import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Action3;
import rx.functions.Action4;
import rx.functions.Action5;
import rx.functions.Action6;
import rx.functions.Action7;
import rx.functions.Action8;
import rx.functions.Action9;
import rx.functions.ActionN;

/**
 * Helper class to apply partial application to Actions in order to get a version with lower arity.
 *
 * @author pakoito
 */
public final class RxPartialAction {
    private RxPartialAction() {
    }

    /* Action0 */
    public static <A> Action0 apply(final Action1<A> action1, final A first) {
        return new Action0() {
            @Override
            public void call() {
                action1.call(first);
            }
        };
    }

    public static <A, B> Action0 apply(final Action2<A, B> action2, final A first, final B second) {
        return new Action0() {
            @Override
            public void call() {
                action2.call(first, second);
            }
        };
    }

    public static <A, B, C> Action0 apply(final Action3<A, B, C> action3, final A first,
            final B second, final C third) {
        return new Action0() {
            @Override
            public void call() {
                action3.call(first, second, third);
            }
        };
    }

    public static <A, B, C, D> Action0 apply(final Action4<A, B, C, D> action4, final A first,
            final B second, final C third, final D fourth) {
        return new Action0() {
            @Override
            public void call() {
                action4.call(first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E> Action0 apply(final Action5<A, B, C, D, E> action5,
            final A first, final B second, final C third, final D fourth, final E fifth) {
        return new Action0() {
            @Override
            public void call() {
                action5.call(first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F> Action0 apply(final Action6<A, B, C, D, E, F> action6,
            final A first, final B second, final C third, final D fourth, final E fifth,
            final F sixth) {
        return new Action0() {
            @Override
            public void call() {
                action6.call(first, second, third, fourth, fifth, sixth);
            }
        };
    }

    public static <A, B, C, D, E, F, G> Action0 apply(final Action7<A, B, C, D, E, F, G> action7,
            final A first, final B second, final C third, final D fourth, final E fifth,
            final F sixth, final G seventh) {
        return new Action0() {
            @Override
            public void call() {
                action7.call(first, second, third, fourth, fifth, sixth, seventh);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H> Action0 apply(
            final Action8<A, B, C, D, E, F, G, H> action8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth) {
        return new Action0() {
            @Override
            public void call() {
                action8.call(first, second, third, fourth, fifth, sixth, seventh, eighth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, I> Action0 apply(
            final Action9<A, B, C, D, E, F, G, H, I> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth, final I ninth) {
        return new Action0() {
            @Override
            public void call() {
                action9.call(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth);
            }
        };
    }

    static Action0 apply(final ActionN actionN, final Object... args) {
        return new Action0() {
            @Override
            public void call() {
                actionN.call(args);
            }
        };
    }

    static Action0 applyEnd(final ActionN actionN, final Object... args) {
        return new Action0() {
            @Override
            public void call() {
                Arrays.sort(args, Collections.reverseOrder());
                actionN.call(args);
            }
        };
    }

    /* Action1 */
    public static <A, T> Action1<T> apply(final Action2<A, T> action2, final A first) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action2.call(first, last);
            }
        };
    }

    public static <A, T> Action1<T> applyEnd(final Action2<T, A> action2, final A first) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action2.call(last, first);
            }
        };
    }

    public static <A, B, T> Action1<T> apply(final Action3<A, B, T> action3, final A first,
            final B second) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action3.call(first, second, last);
            }
        };
    }

    public static <A, B, T> Action1<T> applyEnd(final Action3<T, A, B> action3, final A first,
            final B second) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action3.call(last, first, second);
            }
        };
    }

    public static <A, B, C, T> Action1<T> apply(final Action4<A, B, C, T> action4, final A first,
            final B second, final C third) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action4.call(first, second, third, last);
            }
        };
    }

    public static <A, B, C, T> Action1<T> applyEnd(final Action4<T, A, B, C> action4,
            final A first, final B second, final C third) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action4.call(last, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T> Action1<T> apply(final Action5<A, B, C, D, T> action5,
            final A first, final B second, final C third, final D fourth) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action5.call(first, second, third, fourth, last);
            }
        };
    }

    public static <A, B, C, D, T> Action1<T> applyEnd(final Action5<T, A, B, C, D> action5,
            final A first, final B second, final C third, final D fourth) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action5.call(last, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T> Action1<T> apply(final Action6<A, B, C, D, E, T> action6,
            final A first, final B second, final C third, final D fourth, final E fifth) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action6.call(first, second, third, fourth, fifth, last);
            }
        };
    }

    public static <A, B, C, D, E, T> Action1<T> applyEnd(final Action6<T, A, B, C, D, E> action6,
            final A first, final B second, final C third, final D fourth, final E fifth) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action6.call(last, first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, T> Action1<T> apply(
            final Action7<A, B, C, D, E, F, T> action7, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action7.call(first, second, third, fourth, fifth, sixth, last);
            }
        };
    }

    public static <A, B, C, D, E, F, T> Action1<T> applyEnd(
            final Action7<T, A, B, C, D, E, F> action7, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action7.call(last, first, second, third, fourth, fifth, sixth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T> Action1<T> apply(
            final Action8<A, B, C, D, E, F, G, T> action8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action8.call(first, second, third, fourth, fifth, sixth, seventh, last);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T> Action1<T> applyEnd(
            final Action8<T, A, B, C, D, E, F, G> action8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action8.call(last, first, second, third, fourth, fifth, sixth, seventh);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, T> Action1<T> apply(
            final Action9<A, B, C, D, E, F, G, H, T> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action9.call(first, second, third, fourth, fifth, sixth, seventh, eighth, last);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, T> Action1<T> applyEnd(
            final Action9<T, A, B, C, D, E, F, G, H> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth) {
        return new Action1<T>() {
            @Override
            public void call(T last) {
                action9.call(last, first, second, third, fourth, fifth, sixth, seventh, eighth);
            }
        };
    }

    /* Action2 */
    public static <A, T, U> Action2<T, U> apply(final Action3<A, T, U> action3, final A first) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action3.call(first, one, two);
            }
        };
    }

    public static <A, T, U> Action2<T, U> applyEnd(final Action3<T, U, A> action3, final A first) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action3.call(one, two, first);
            }
        };
    }

    public static <A, B, T, U> Action2<T, U> apply(final Action4<A, B, T, U> action4,
            final A first, final B second) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action4.call(first, second, one, two);
            }
        };
    }

    public static <A, B, T, U> Action2<T, U> applyEnd(final Action4<T, U, A, B> action4,
            final A first, final B second) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action4.call(one, two, first, second);
            }
        };
    }

    public static <A, B, C, T, U> Action2<T, U> apply(final Action5<A, B, C, T, U> action5,
            final A first, final B second, final C third) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action5.call(first, second, third, one, two);
            }
        };
    }

    public static <A, B, C, T, U> Action2<T, U> applyEnd(final Action5<T, U, A, B, C> action5,
            final A first, final B second, final C third) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action5.call(one, two, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U> Action2<T, U> apply(final Action6<A, B, C, D, T, U> action6,
            final A first, final B second, final C third, final D fourth) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action6.call(first, second, third, fourth, one, two);
            }
        };
    }

    public static <A, B, C, D, T, U> Action2<T, U> applyEnd(
            final Action6<T, U, A, B, C, D> action6, final A first, final B second, final C third,
            final D fourth) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action6.call(one, two, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, U> Action2<T, U> apply(
            final Action7<A, B, C, D, E, T, U> action7, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action7.call(first, second, third, fourth, fifth, one, two);
            }
        };
    }

    public static <A, B, C, D, E, T, U> Action2<T, U> applyEnd(
            final Action7<T, U, A, B, C, D, E> action7, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action7.call(one, two, first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U> Action2<T, U> apply(
            final Action8<A, B, C, D, E, F, T, U> action8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action8.call(first, second, third, fourth, fifth, sixth, one, two);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U> Action2<T, U> applyEnd(
            final Action8<T, U, A, B, C, D, E, F> action8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action8.call(one, two, first, second, third, fourth, fifth, sixth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T, U> Action2<T, U> apply(
            final Action9<A, B, C, D, E, F, G, T, U> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action9.call(first, second, third, fourth, fifth, sixth, seventh, one, two);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T, U> Action2<T, U> applyEnd(
            final Action9<T, U, A, B, C, D, E, F, G> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Action2<T, U>() {
            @Override
            public void call(T one, U two) {
                action9.call(one, two, first, second, third, fourth, fifth, sixth, seventh);
            }
        };
    }

    /* Action3 */
    public static <A, T, U, V> Action3<T, U, V> apply(final Action4<A, T, U, V> action4,
            final A first) {
        return new Action3<T, U, V>() {
            @Override
            public void call(T one, U two, V three) {
                action4.call(first, one, two, three);
            }
        };
    }

    public static <A, T, U, V> Action3<T, U, V> applyEnd(final Action4<T, U, V, A> action4,
            final A first) {
        return new Action3<T, U, V>() {
            @Override
            public void call(T one, U two, V three) {
                action4.call(one, two, three, first);
            }
        };
    }

    public static <A, B, T, U, V> Action3<T, U, V> apply(final Action5<A, B, T, U, V> action5,
            final A first, final B second) {
        return new Action3<T, U, V>() {
            @Override
            public void call(T one, U two, V three) {
                action5.call(first, second, one, two, three);
            }
        };
    }

    public static <A, B, T, U, V> Action3<T, U, V> applyEnd(final Action5<T, U, V, A, B> action5,
            final A first, final B second) {
        return new Action3<T, U, V>() {
            @Override
            public void call(T one, U two, V three) {
                action5.call(one, two, three, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V> Action3<T, U, V> apply(
            final Action6<A, B, C, T, U, V> action6, final A first, final B second, final C third) {
        return new Action3<T, U, V>() {
            @Override
            public void call(T one, U two, V three) {
                action6.call(first, second, third, one, two, three);
            }
        };
    }

    public static <A, B, C, T, U, V> Action3<T, U, V> applyEnd(
            final Action6<T, U, V, A, B, C> action6, final A first, final B second, final C third) {
        return new Action3<T, U, V>() {
            @Override
            public void call(T one, U two, V three) {
                action6.call(one, two, three, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, V> Action3<T, U, V> apply(
            final Action7<A, B, C, D, T, U, V> action7, final A first, final B second,
            final C third, final D fourth) {
        return new Action3<T, U, V>() {
            @Override
            public void call(T one, U two, V three) {
                action7.call(first, second, third, fourth, one, two, three);
            }
        };
    }

    public static <A, B, C, D, T, U, V> Action3<T, U, V> applyEnd(
            final Action7<T, U, V, A, B, C, D> action7, final A first, final B second,
            final C third, final D fourth) {
        return new Action3<T, U, V>() {
            @Override
            public void call(T one, U two, V three) {
                action7.call(one, two, three, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V> Action3<T, U, V> apply(
            final Action8<A, B, C, D, E, T, U, V> action8, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Action3<T, U, V>() {
            @Override
            public void call(T one, U two, V three) {
                action8.call(first, second, third, fourth, fifth, one, two, three);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V> Action3<T, U, V> applyEnd(
            final Action8<T, U, V, A, B, C, D, E> action8, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Action3<T, U, V>() {
            @Override
            public void call(T one, U two, V three) {
                action8.call(one, two, three, first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U, V> Action3<T, U, V> apply(
            final Action9<A, B, C, D, E, F, T, U, V> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Action3<T, U, V>() {
            @Override
            public void call(T one, U two, V three) {
                action9.call(first, second, third, fourth, fifth, sixth, one, two, three);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U, V> Action3<T, U, V> applyEnd(
            final Action9<T, U, V, A, B, C, D, E, F> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Action3<T, U, V>() {
            @Override
            public void call(T one, U two, V three) {
                action9.call(one, two, three, first, second, third, fourth, fifth, sixth);
            }
        };
    }

    /* Action4 */
    public static <A, T, U, V, W> Action4<T, U, V, W> apply(final Action5<A, T, U, V, W> action5,
            final A first) {
        return new Action4<T, U, V, W>() {
            @Override
            public void call(T one, U two, V three, W four) {
                action5.call(first, one, two, three, four);
            }
        };
    }

    public static <A, T, U, V, W> Action4<T, U, V, W> applyEnd(
            final Action5<T, U, V, W, A> action5, final A first) {
        return new Action4<T, U, V, W>() {
            @Override
            public void call(T one, U two, V three, W four) {
                action5.call(one, two, three, four, first);
            }
        };
    }

    public static <A, B, T, U, V, W> Action4<T, U, V, W> apply(
            final Action6<A, B, T, U, V, W> action6, final A first, final B second) {
        return new Action4<T, U, V, W>() {
            @Override
            public void call(T one, U two, V three, W four) {
                action6.call(first, second, one, two, three, four);
            }
        };
    }

    public static <A, B, T, U, V, W> Action4<T, U, V, W> applyEnd(
            final Action6<T, U, V, W, A, B> action6, final A first, final B second) {
        return new Action4<T, U, V, W>() {
            @Override
            public void call(T one, U two, V three, W four) {
                action6.call(one, two, three, four, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, W> Action4<T, U, V, W> apply(
            final Action7<A, B, C, T, U, V, W> action7, final A first, final B second, final C third) {
        return new Action4<T, U, V, W>() {
            @Override
            public void call(T one, U two, V three, W four) {
                action7.call(first, second, third, one, two, three, four);
            }
        };
    }

    public static <A, B, C, T, U, V, W> Action4<T, U, V, W> applyEnd(
            final Action7<T, U, V, W, A, B, C> action7, final A first, final B second, final C third) {
        return new Action4<T, U, V, W>() {
            @Override
            public void call(T one, U two, V three, W four) {
                action7.call(one, two, three, four, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W> Action4<T, U, V, W> apply(
            final Action8<A, B, C, D, T, U, V, W> action8, final A first, final B second,
            final C third, final D fourth) {
        return new Action4<T, U, V, W>() {
            @Override
            public void call(T one, U two, V three, W four) {
                action8.call(first, second, third, fourth, one, two, three, four);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W> Action4<T, U, V, W> applyEnd(
            final Action8<T, U, V, W, A, B, C, D> action8, final A first, final B second,
            final C third, final D fourth) {
        return new Action4<T, U, V, W>() {
            @Override
            public void call(T one, U two, V three, W four) {
                action8.call(one, two, three, four, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V, W> Action4<T, U, V, W> apply(
            final Action9<A, B, C, D, E, T, U, V, W> action9, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Action4<T, U, V, W>() {
            @Override
            public void call(T one, U two, V three, W four) {
                action9.call(first, second, third, fourth, fifth, one, two, three, four);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V, W> Action4<T, U, V, W> applyEnd(
            final Action9<T, U, V, W, A, B, C, D, E> action9, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Action4<T, U, V, W>() {
            @Override
            public void call(T one, U two, V three, W four) {
                action9.call(one, two, three, four, first, second, third, fourth, fifth);
            }
        };
    }

    /* Action5 */
    public static <A, T, U, V, W, X> Action5<T, U, V, W, X> apply(
            final Action6<A, T, U, V, W, X> action6, final A first) {
        return new Action5<T, U, V, W, X>() {
            @Override
            public void call(T one, U two, V three, W four, X five) {
                action6.call(first, one, two, three, four, five);
            }
        };
    }

    public static <A, T, U, V, W, X> Action5<T, U, V, W, X> applyEnd(
            final Action6<T, U, V, W, X, A> action6, final A first) {
        return new Action5<T, U, V, W, X>() {
            @Override
            public void call(T one, U two, V three, W four, X five) {
                action6.call(one, two, three, four, five, first);
            }
        };
    }

    public static <A, B, T, U, V, W, X> Action5<T, U, V, W, X> apply(
            final Action7<A, B, T, U, V, W, X> action7, final A first, final B second) {
        return new Action5<T, U, V, W, X>() {
            @Override
            public void call(T one, U two, V three, W four, X five) {
                action7.call(first, second, one, two, three, four, five);
            }
        };
    }

    public static <A, B, T, U, V, W, X> Action5<T, U, V, W, X> applyEnd(
            final Action7<T, U, V, W, X, A, B> action7, final A first, final B second) {
        return new Action5<T, U, V, W, X>() {
            @Override
            public void call(T one, U two, V three, W four, X five) {
                action7.call(one, two, three, four, five, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X> Action5<T, U, V, W, X> apply(
            final Action8<A, B, C, T, U, V, W, X> action8, final A first, final B second,
            final C third) {
        return new Action5<T, U, V, W, X>() {
            @Override
            public void call(T one, U two, V three, W four, X five) {
                action8.call(first, second, third, one, two, three, four, five);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X> Action5<T, U, V, W, X> applyEnd(
            final Action8<T, U, V, W, X, A, B, C> action8, final A first, final B second,
            final C third) {
        return new Action5<T, U, V, W, X>() {
            @Override
            public void call(T one, U two, V three, W four, X five) {
                action8.call(one, two, three, four, five, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W, X> Action5<T, U, V, W, X> apply(
            final Action9<A, B, C, D, T, U, V, W, X> action9, final A first, final B second,
            final C third, final D fourth) {
        return new Action5<T, U, V, W, X>() {
            @Override
            public void call(T one, U two, V three, W four, X five) {
                action9.call(first, second, third, fourth, one, two, three, four, five);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W, X> Action5<T, U, V, W, X> applyEnd(
            final Action9<T, U, V, W, X, A, B, C, D> action9, final A first, final B second,
            final C third, final D fourth) {
        return new Action5<T, U, V, W, X>() {
            @Override
            public void call(T one, U two, V three, W four, X five) {
                action9.call(one, two, three, four, five, first, second, third, fourth);
            }
        };
    }

    /* Action6 */
    public static <A, T, U, V, W, X, Y> Action6<T, U, V, W, X, Y> apply(
            final Action7<A, T, U, V, W, X, Y> action7, final A first) {
        return new Action6<T, U, V, W, X, Y>() {
            @Override
            public void call(T one, U two, V three, W four, X five, Y six) {
                action7.call(first, one, two, three, four, five, six);
            }
        };
    }

    public static <A, T, U, V, W, X, Y> Action6<T, U, V, W, X, Y> applyEnd(
            final Action7<T, U, V, W, X, Y, A> action7, final A first) {
        return new Action6<T, U, V, W, X, Y>() {
            @Override
            public void call(T one, U two, V three, W four, X five, Y six) {
                action7.call(one, two, three, four, five, six, first);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y> Action6<T, U, V, W, X, Y> apply(
            final Action8<A, B, T, U, V, W, X, Y> action8, final A first, final B second) {
        return new Action6<T, U, V, W, X, Y>() {
            @Override
            public void call(T one, U two, V three, W four, X five, Y six) {
                action8.call(first, second, one, two, three, four, five, six);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y> Action6<T, U, V, W, X, Y> applyEnd(
            final Action8<T, U, V, W, X, Y, A, B> action8, final A first, final B second) {
        return new Action6<T, U, V, W, X, Y>() {
            @Override
            public void call(T one, U two, V three, W four, X five, Y six) {
                action8.call(one, two, three, four, five, six, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X, Y> Action6<T, U, V, W, X, Y> apply(
            final Action9<A, B, C, T, U, V, W, X, Y> action9, final A first, final B second,
            final C third) {
        return new Action6<T, U, V, W, X, Y>() {
            @Override
            public void call(T one, U two, V three, W four, X five, Y six) {
                action9.call(first, second, third, one, two, three, four, five, six);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X, Y> Action6<T, U, V, W, X, Y> applyEnd(
            final Action9<T, U, V, W, X, Y, A, B, C> action9, final A first, final B second,
            final C third) {
        return new Action6<T, U, V, W, X, Y>() {
            @Override
            public void call(T one, U two, V three, W four, X five, Y six) {
                action9.call(one, two, three, four, five, six, first, second, third);
            }
        };
    }

    /* Action7 */
    public static <A, T, U, V, W, X, Y, Z> Action7<T, U, V, W, X, Y, Z> apply(
            final Action8<A, T, U, V, W, X, Y, Z> action8, final A first) {
        return new Action7<T, U, V, W, X, Y, Z>() {
            @Override
            public void call(T one, U two, V three, W four, X five, Y six, Z seven) {
                action8.call(first, one, two, three, four, five, six, seven);
            }
        };
    }

    public static <A, T, U, V, W, X, Y, Z> Action7<T, U, V, W, X, Y, Z> applyEnd(
            final Action8<T, U, V, W, X, Y, Z, A> action8, final A first) {
        return new Action7<T, U, V, W, X, Y, Z>() {
            @Override
            public void call(T one, U two, V three, W four, X five, Y six, Z seven) {
                action8.call(one, two, three, four, five, six, seven, first);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y, Z> Action7<T, U, V, W, X, Y, Z> apply(
            final Action9<A, B, T, U, V, W, X, Y, Z> action9, final A first, final B second) {
        return new Action7<T, U, V, W, X, Y, Z>() {
            @Override
            public void call(T one, U two, V three, W four, X five, Y six, Z seven) {
                action9.call(first, second, one, two, three, four, five, six, seven);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y, Z> Action7<T, U, V, W, X, Y, Z> applyEnd(
            final Action9<T, U, V, W, X, Y, Z, A, B> action9, final A first, final B second) {
        return new Action7<T, U, V, W, X, Y, Z>() {
            @Override
            public void call(T one, U two, V three, W four, X five, Y six, Z seven) {
                action9.call(one, two, three, four, five, six, seven, first, second);
            }
        };
    }

    /* Action8 */
    public static <A, T, U, V, W, X, Y, Z, P> Action8<T, U, V, W, X, Y, Z, P> apply(
            final Action9<A, T, U, V, W, X, Y, Z, P> action9, final A first) {
        return new Action8<T, U, V, W, X, Y, Z, P>() {
            @Override
            public void call(T one, U two, V three, W four, X five, Y six, Z seven, P eight) {
                action9.call(first, one, two, three, four, five, six, seven, eight);
            }
        };
    }

    public static <A, T, U, V, W, X, Y, Z, P> Action8<T, U, V, W, X, Y, Z, P> applyEnd(
            final Action9<T, U, V, W, X, Y, Z, P, A> action9, final A first) {
        return new Action8<T, U, V, W, X, Y, Z, P>() {
            @Override
            public void call(T one, U two, V three, W four, X five, Y six, Z seven, P eight) {
                action9.call(one, two, three, four, five, six, seven, eight, first);
            }
        };
    }
}
