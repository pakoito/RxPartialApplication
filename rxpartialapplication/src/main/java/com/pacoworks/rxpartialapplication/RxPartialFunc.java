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

import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.Func6;
import rx.functions.Func7;
import rx.functions.Func8;
import rx.functions.Func9;
import rx.functions.FuncN;

/**
 * Helper class to apply partial application to Functions in order to get a version with lower
 * arity.
 *
 * @author pakoito
 */
public final class RxPartialFunc {
    private RxPartialFunc() {
    }

    /* Func0 */
    public static <A, R> Func0<R> apply(final Func1<A, R> func1, final A first) {
        return new Func0<R>() {
            @Override
            public R call() {
                return func1.call(first);
            }
        };
    }

    public static <A, B, R> Func0<R> apply(final Func2<A, B, R> func2, final A first, final B second) {
        return new Func0<R>() {
            @Override
            public R call() {
                return func2.call(first, second);
            }
        };
    }

    public static <A, B, C, R> Func0<R> apply(final Func3<A, B, C, R> func3, final A first,
            final B second, final C third) {
        return new Func0<R>() {
            @Override
            public R call() {
                return func3.call(first, second, third);
            }
        };
    }

    public static <A, B, C, D, R> Func0<R> apply(final Func4<A, B, C, D, R> func4, final A first,
            final B second, final C third, final D fourth) {
        return new Func0<R>() {
            @Override
            public R call() {
                return func4.call(first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, R> Func0<R> apply(final Func5<A, B, C, D, E, R> func5,
            final A first, final B second, final C third, final D fourth, final E fifth) {
        return new Func0<R>() {
            @Override
            public R call() {
                return func5.call(first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, R> Func0<R> apply(final Func6<A, B, C, D, E, F, R> func6,
            final A first, final B second, final C third, final D fourth, final E fifth,
            final F sixth) {
        return new Func0<R>() {
            @Override
            public R call() {
                return func6.call(first, second, third, fourth, fifth, sixth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, R> Func0<R> apply(
            final Func7<A, B, C, D, E, F, G, R> func7, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Func0<R>() {
            @Override
            public R call() {
                return func7.call(first, second, third, fourth, fifth, sixth, seventh);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, R> Func0<R> apply(
            final Func8<A, B, C, D, E, F, G, H, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth) {
        return new Func0<R>() {
            @Override
            public R call() {
                return func8.call(first, second, third, fourth, fifth, sixth, seventh, eighth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, I, R> Func0<R> apply(
            final Func9<A, B, C, D, E, F, G, H, I, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth, final I ninth) {
        return new Func0<R>() {
            @Override
            public R call() {
                return func9.call(first, second, third, fourth, fifth, sixth, seventh, eighth,
                        ninth);
            }
        };
    }

    public static <R> Func0<R> apply(final FuncN<R> funcN, final Object... args) {
        return new Func0<R>() {
            @Override
            public R call() {
                return funcN.call(args);
            }
        };
    }

    public static <R> Func0<R> applyEnd(final FuncN<R> funcN, final Object... args) {
        return new Func0<R>() {
            @Override
            public R call() {
                Arrays.sort(args, Collections.reverseOrder());
                return funcN.call(args);
            }
        };
    }

    /* Func1 */
    public static <A, T, R> Func1<T, R> apply(final Func2<A, T, R> func2, final A first) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func2.call(first, last);
            }
        };
    }

    public static <A, T, R> Func1<T, R> applyEnd(final Func2<T, A, R> func2, final A first) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func2.call(last, first);
            }
        };
    }

    public static <A, B, T, R> Func1<T, R> apply(final Func3<A, B, T, R> func3, final A first,
            final B second) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func3.call(first, second, last);
            }
        };
    }

    public static <A, B, T, R> Func1<T, R> applyEnd(final Func3<T, A, B, R> func3, final A first,
            final B second) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func3.call(last, first, second);
            }
        };
    }

    public static <A, B, C, T, R> Func1<T, R> apply(final Func4<A, B, C, T, R> func4,
            final A first, final B second, final C third) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func4.call(first, second, third, last);
            }
        };
    }

    public static <A, B, C, T, R> Func1<T, R> applyEnd(final Func4<T, A, B, C, R> func4,
            final A first, final B second, final C third) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func4.call(last, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, R> Func1<T, R> apply(final Func5<A, B, C, D, T, R> func5,
            final A first, final B second, final C third, final D fourth) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func5.call(first, second, third, fourth, last);
            }
        };
    }

    public static <A, B, C, D, T, R> Func1<T, R> applyEnd(final Func5<T, A, B, C, D, R> func5,
            final A first, final B second, final C third, final D fourth) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func5.call(last, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, R> Func1<T, R> apply(final Func6<A, B, C, D, E, T, R> func6,
            final A first, final B second, final C third, final D fourth, final E fifth) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func6.call(first, second, third, fourth, fifth, last);
            }
        };
    }

    public static <A, B, C, D, E, T, R> Func1<T, R> applyEnd(
            final Func6<T, A, B, C, D, E, R> func6, final A first, final B second, final C third,
            final D fourth, final E fifth) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func6.call(last, first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, T, R> Func1<T, R> apply(
            final Func7<A, B, C, D, E, F, T, R> func7, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func7.call(first, second, third, fourth, fifth, sixth, last);
            }
        };
    }

    public static <A, B, C, D, E, F, T, R> Func1<T, R> applyEnd(
            final Func7<T, A, B, C, D, E, F, R> func7, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func7.call(last, first, second, third, fourth, fifth, sixth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T, R> Func1<T, R> apply(
            final Func8<A, B, C, D, E, F, G, T, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func8.call(first, second, third, fourth, fifth, sixth, seventh, last);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T, R> Func1<T, R> applyEnd(
            final Func8<T, A, B, C, D, E, F, G, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func8.call(last, first, second, third, fourth, fifth, sixth, seventh);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, T, R> Func1<T, R> apply(
            final Func9<A, B, C, D, E, F, G, H, T, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func9
                        .call(first, second, third, fourth, fifth, sixth, seventh, eighth, last);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, T, R> Func1<T, R> applyEnd(
            final Func9<T, A, B, C, D, E, F, G, H, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth) {
        return new Func1<T, R>() {
            @Override
            public R call(T last) {
                return func9
                        .call(last, first, second, third, fourth, fifth, sixth, seventh, eighth);
            }
        };
    }

    /* Func2 */
    public static <A, T, U, R> Func2<T, U, R> apply(final Func3<A, T, U, R> func3, final A first) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func3.call(first, one, two);
            }
        };
    }

    public static <A, T, U, R> Func2<T, U, R> applyEnd(final Func3<T, U, A, R> func3,
            final A first) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func3.call(one, two, first);
            }
        };
    }

    public static <A, B, T, U, R> Func2<T, U, R> apply(final Func4<A, B, T, U, R> func4,
            final A first, final B second) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func4.call(first, second, one, two);
            }
        };
    }

    public static <A, B, T, U, R> Func2<T, U, R> applyEnd(final Func4<T, U, A, B, R> func4,
            final A first, final B second) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func4.call(one, two, first, second);
            }
        };
    }

    public static <A, B, C, T, U, R> Func2<T, U, R> apply(final Func5<A, B, C, T, U, R> func5,
            final A first, final B second, final C third) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func5.call(first, second, third, one, two);
            }
        };
    }

    public static <A, B, C, T, U, R> Func2<T, U, R> applyEnd(final Func5<T, U, A, B, C, R> func5,
            final A first, final B second, final C third) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func5.call(one, two, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, R> Func2<T, U, R> apply(
            final Func6<A, B, C, D, T, U, R> func6, final A first, final B second, final C third,
            final D fourth) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func6.call(first, second, third, fourth, one, two);
            }
        };
    }

    public static <A, B, C, D, T, U, R> Func2<T, U, R> applyEnd(
            final Func6<T, U, A, B, C, D, R> func6, final A first, final B second, final C third,
            final D fourth) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func6.call(one, two, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, U, R> Func2<T, U, R> apply(
            final Func7<A, B, C, D, E, T, U, R> func7, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func7.call(first, second, third, fourth, fifth, one, two);
            }
        };
    }

    public static <A, B, C, D, E, T, U, R> Func2<T, U, R> applyEnd(
            final Func7<T, U, A, B, C, D, E, R> func7, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func7.call(one, two, first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U, R> Func2<T, U, R> apply(
            final Func8<A, B, C, D, E, F, T, U, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func8.call(first, second, third, fourth, fifth, sixth, one, two);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U, R> Func2<T, U, R> applyEnd(
            final Func8<T, U, A, B, C, D, E, F, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func8.call(one, two, first, second, third, fourth, fifth, sixth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T, U, R> Func2<T, U, R> apply(
            final Func9<A, B, C, D, E, F, G, T, U, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func9.call(first, second, third, fourth, fifth, sixth, seventh, one, two);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T, U, R> Func2<T, U, R> applyEnd(
            final Func9<T, U, A, B, C, D, E, F, G, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Func2<T, U, R>() {
            @Override
            public R call(T one, U two) {
                return func9.call(one, two, first, second, third, fourth, fifth, sixth, seventh);
            }
        };
    }

    /* Func3 */
    public static <A, T, U, V, R> Func3<T, U, V, R> apply(final Func4<A, T, U, V, R> func4,
            final A first) {
        return new Func3<T, U, V, R>() {
            @Override
            public R call(T one, U two, V three) {
                return func4.call(first, one, two, three);
            }
        };
    }

    public static <A, T, U, V, R> Func3<T, U, V, R> applyEnd(final Func4<T, U, V, A, R> func4,
            final A first) {
        return new Func3<T, U, V, R>() {
            @Override
            public R call(T one, U two, V three) {
                return func4.call(one, two, three, first);
            }
        };
    }

    public static <A, B, T, U, V, R> Func3<T, U, V, R> apply(final Func5<A, B, T, U, V, R> func5,
            final A first, final B second) {
        return new Func3<T, U, V, R>() {
            @Override
            public R call(T one, U two, V three) {
                return func5.call(first, second, one, two, three);
            }
        };
    }

    public static <A, B, T, U, V, R> Func3<T, U, V, R> applyEnd(
            final Func5<T, U, V, A, B, R> func5, final A first, final B second) {
        return new Func3<T, U, V, R>() {
            @Override
            public R call(T one, U two, V three) {
                return func5.call(one, two, three, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, R> Func3<T, U, V, R> apply(
            final Func6<A, B, C, T, U, V, R> func6, final A first, final B second, final C third) {
        return new Func3<T, U, V, R>() {
            @Override
            public R call(T one, U two, V three) {
                return func6.call(first, second, third, one, two, three);
            }
        };
    }

    public static <A, B, C, T, U, V, R> Func3<T, U, V, R> applyEnd(
            final Func6<T, U, V, A, B, C, R> func6, final A first, final B second, final C third) {
        return new Func3<T, U, V, R>() {
            @Override
            public R call(T one, U two, V three) {
                return func6.call(one, two, three, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, V, R> Func3<T, U, V, R> apply(
            final Func7<A, B, C, D, T, U, V, R> func7, final A first, final B second,
            final C third, final D fourth) {
        return new Func3<T, U, V, R>() {
            @Override
            public R call(T one, U two, V three) {
                return func7.call(first, second, third, fourth, one, two, three);
            }
        };
    }

    public static <A, B, C, D, T, U, V, R> Func3<T, U, V, R> applyEnd(
            final Func7<T, U, V, A, B, C, D, R> func7, final A first, final B second,
            final C third, final D fourth) {
        return new Func3<T, U, V, R>() {
            @Override
            public R call(T one, U two, V three) {
                return func7.call(one, two, three, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V, R> Func3<T, U, V, R> apply(
            final Func8<A, B, C, D, E, T, U, V, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Func3<T, U, V, R>() {
            @Override
            public R call(T one, U two, V three) {
                return func8.call(first, second, third, fourth, fifth, one, two, three);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V, R> Func3<T, U, V, R> applyEnd(
            final Func8<T, U, V, A, B, C, D, E, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Func3<T, U, V, R>() {
            @Override
            public R call(T one, U two, V three) {
                return func8.call(one, two, three, first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U, V, R> Func3<T, U, V, R> apply(
            final Func9<A, B, C, D, E, F, T, U, V, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Func3<T, U, V, R>() {
            @Override
            public R call(T one, U two, V three) {
                return func9.call(first, second, third, fourth, fifth, sixth, one, two, three);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U, V, R> Func3<T, U, V, R> applyEnd(
            final Func9<T, U, V, A, B, C, D, E, F, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Func3<T, U, V, R>() {
            @Override
            public R call(T one, U two, V three) {
                return func9.call(one, two, three, first, second, third, fourth, fifth, sixth);
            }
        };
    }

    /* Func4 */
    public static <A, T, U, V, W, R> Func4<T, U, V, W, R> apply(
            final Func5<A, T, U, V, W, R> func5, final A first) {
        return new Func4<T, U, V, W, R>() {
            @Override
            public R call(T one, U two, V three, W four) {
                return func5.call(first, one, two, three, four);
            }
        };
    }

    public static <A, T, U, V, W, R> Func4<T, U, V, W, R> applyEnd(
            final Func5<T, U, V, W, A, R> func5, final A first) {
        return new Func4<T, U, V, W, R>() {
            @Override
            public R call(T one, U two, V three, W four) {
                return func5.call(one, two, three, four, first);
            }
        };
    }

    public static <A, B, T, U, V, W, R> Func4<T, U, V, W, R> apply(
            final Func6<A, B, T, U, V, W, R> func6, final A first, final B second) {
        return new Func4<T, U, V, W, R>() {
            @Override
            public R call(T one, U two, V three, W four) {
                return func6.call(first, second, one, two, three, four);
            }
        };
    }

    public static <A, B, T, U, V, W, R> Func4<T, U, V, W, R> applyEnd(
            final Func6<T, U, V, W, A, B, R> func6, final A first, final B second) {
        return new Func4<T, U, V, W, R>() {
            @Override
            public R call(T one, U two, V three, W four) {
                return func6.call(one, two, three, four, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, W, R> Func4<T, U, V, W, R> apply(
            final Func7<A, B, C, T, U, V, W, R> func7, final A first, final B second, final C third) {
        return new Func4<T, U, V, W, R>() {
            @Override
            public R call(T one, U two, V three, W four) {
                return func7.call(first, second, third, one, two, three, four);
            }
        };
    }

    public static <A, B, C, T, U, V, W, R> Func4<T, U, V, W, R> applyEnd(
            final Func7<T, U, V, W, A, B, C, R> func7, final A first, final B second, final C third) {
        return new Func4<T, U, V, W, R>() {
            @Override
            public R call(T one, U two, V three, W four) {
                return func7.call(one, two, three, four, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W, R> Func4<T, U, V, W, R> apply(
            final Func8<A, B, C, D, T, U, V, W, R> func8, final A first, final B second,
            final C third, final D fourth) {
        return new Func4<T, U, V, W, R>() {
            @Override
            public R call(T one, U two, V three, W four) {
                return func8.call(first, second, third, fourth, one, two, three, four);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W, R> Func4<T, U, V, W, R> applyEnd(
            final Func8<T, U, V, W, A, B, C, D, R> func8, final A first, final B second,
            final C third, final D fourth) {
        return new Func4<T, U, V, W, R>() {
            @Override
            public R call(T one, U two, V three, W four) {
                return func8.call(one, two, three, four, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V, W, R> Func4<T, U, V, W, R> apply(
            final Func9<A, B, C, D, E, T, U, V, W, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Func4<T, U, V, W, R>() {
            @Override
            public R call(T one, U two, V three, W four) {
                return func9.call(first, second, third, fourth, fifth, one, two, three, four);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V, W, R> Func4<T, U, V, W, R> applyEnd(
            final Func9<T, U, V, W, A, B, C, D, E, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Func4<T, U, V, W, R>() {
            @Override
            public R call(T one, U two, V three, W four) {
                return func9.call(one, two, three, four, first, second, third, fourth, fifth);
            }
        };
    }

    /* Func5 */
    public static <A, T, U, V, W, X, R> Func5<T, U, V, W, X, R> apply(
            final Func6<A, T, U, V, W, X, R> func6, final A first) {
        return new Func5<T, U, V, W, X, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five) {
                return func6.call(first, one, two, three, four, five);
            }
        };
    }

    public static <A, T, U, V, W, X, R> Func5<T, U, V, W, X, R> applyEnd(
            final Func6<T, U, V, W, X, A, R> func6, final A first) {
        return new Func5<T, U, V, W, X, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five) {
                return func6.call(one, two, three, four, five, first);
            }
        };
    }

    public static <A, B, T, U, V, W, X, R> Func5<T, U, V, W, X, R> apply(
            final Func7<A, B, T, U, V, W, X, R> func7, final A first, final B second) {
        return new Func5<T, U, V, W, X, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five) {
                return func7.call(first, second, one, two, three, four, five);
            }
        };
    }

    public static <A, B, T, U, V, W, X, R> Func5<T, U, V, W, X, R> applyEnd(
            final Func7<T, U, V, W, X, A, B, R> func7, final A first, final B second) {
        return new Func5<T, U, V, W, X, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five) {
                return func7.call(one, two, three, four, five, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X, R> Func5<T, U, V, W, X, R> apply(
            final Func8<A, B, C, T, U, V, W, X, R> func8, final A first, final B second,
            final C third) {
        return new Func5<T, U, V, W, X, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five) {
                return func8.call(first, second, third, one, two, three, four, five);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X, R> Func5<T, U, V, W, X, R> applyEnd(
            final Func8<T, U, V, W, X, A, B, C, R> func8, final A first, final B second,
            final C third) {
        return new Func5<T, U, V, W, X, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five) {
                return func8.call(one, two, three, four, five, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W, X, R> Func5<T, U, V, W, X, R> apply(
            final Func9<A, B, C, D, T, U, V, W, X, R> func9, final A first, final B second,
            final C third, final D fourth) {
        return new Func5<T, U, V, W, X, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five) {
                return func9.call(first, second, third, fourth, one, two, three, four, five);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W, X, R> Func5<T, U, V, W, X, R> applyEnd(
            final Func9<T, U, V, W, X, A, B, C, D, R> func9, final A first, final B second,
            final C third, final D fourth) {
        return new Func5<T, U, V, W, X, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five) {
                return func9.call(one, two, three, four, five, first, second, third, fourth);
            }
        };
    }

    /* Func6 */
    public static <A, T, U, V, W, X, Y, R> Func6<T, U, V, W, X, Y, R> apply(
            final Func7<A, T, U, V, W, X, Y, R> func7, final A first) {
        return new Func6<T, U, V, W, X, Y, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five, Y six) {
                return func7.call(first, one, two, three, four, five, six);
            }
        };
    }

    public static <A, T, U, V, W, X, Y, R> Func6<T, U, V, W, X, Y, R> applyEnd(
            final Func7<T, U, V, W, X, Y, A, R> func7, final A first) {
        return new Func6<T, U, V, W, X, Y, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five, Y six) {
                return func7.call(one, two, three, four, five, six, first);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y, R> Func6<T, U, V, W, X, Y, R> apply(
            final Func8<A, B, T, U, V, W, X, Y, R> func8, final A first, final B second) {
        return new Func6<T, U, V, W, X, Y, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five, Y six) {
                return func8.call(first, second, one, two, three, four, five, six);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y, R> Func6<T, U, V, W, X, Y, R> applyEnd(
            final Func8<T, U, V, W, X, Y, A, B, R> func8, final A first, final B second) {
        return new Func6<T, U, V, W, X, Y, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five, Y six) {
                return func8.call(one, two, three, four, five, six, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X, Y, R> Func6<T, U, V, W, X, Y, R> apply(
            final Func9<A, B, C, T, U, V, W, X, Y, R> func9, final A first, final B second,
            final C third) {
        return new Func6<T, U, V, W, X, Y, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five, Y six) {
                return func9.call(first, second, third, one, two, three, four, five, six);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X, Y, R> Func6<T, U, V, W, X, Y, R> applyEnd(
            final Func9<T, U, V, W, X, Y, A, B, C, R> func9, final A first, final B second,
            final C third) {
        return new Func6<T, U, V, W, X, Y, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five, Y six) {
                return func9.call(one, two, three, four, five, six, first, second, third);
            }
        };
    }

    /* Func7 */
    public static <A, T, U, V, W, X, Y, Z, R> Func7<T, U, V, W, X, Y, Z, R> apply(
            final Func8<A, T, U, V, W, X, Y, Z, R> func8, final A first) {
        return new Func7<T, U, V, W, X, Y, Z, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five, Y six, Z seven) {
                return func8.call(first, one, two, three, four, five, six, seven);
            }
        };
    }

    public static <A, T, U, V, W, X, Y, Z, R> Func7<T, U, V, W, X, Y, Z, R> applyEnd(
            final Func8<T, U, V, W, X, Y, Z, A, R> func8, final A first) {
        return new Func7<T, U, V, W, X, Y, Z, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five, Y six, Z seven) {
                return func8.call(one, two, three, four, five, six, seven, first);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y, Z, R> Func7<T, U, V, W, X, Y, Z, R> apply(
            final Func9<A, B, T, U, V, W, X, Y, Z, R> func9, final A first, final B second) {
        return new Func7<T, U, V, W, X, Y, Z, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five, Y six, Z seven) {
                return func9.call(first, second, one, two, three, four, five, six, seven);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y, Z, R> Func7<T, U, V, W, X, Y, Z, R> applyEnd(
            final Func9<T, U, V, W, X, Y, Z, A, B, R> func9, final A first, final B second) {
        return new Func7<T, U, V, W, X, Y, Z, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five, Y six, Z seven) {
                return func9.call(one, two, three, four, five, six, seven, first, second);
            }
        };
    }

    /* Func8 */
    public static <A, T, U, V, W, X, Y, Z, P, R> Func8<T, U, V, W, X, Y, Z, P, R> apply(
            final Func9<A, T, U, V, W, X, Y, Z, P, R> func9, final A first) {
        return new Func8<T, U, V, W, X, Y, Z, P, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five, Y six, Z seven, P eight) {
                return func9.call(first, one, two, three, four, five, six, seven, eight);
            }
        };
    }

    public static <A, T, U, V, W, X, Y, Z, P, R> Func8<T, U, V, W, X, Y, Z, P, R> applyEnd(
            final Func9<T, U, V, W, X, Y, Z, P, A, R> func9, final A first) {
        return new Func8<T, U, V, W, X, Y, Z, P, R>() {
            @Override
            public R call(T one, U two, V three, W four, X five, Y six, Z seven, P eight) {
                return func9.call(one, two, three, four, five, six, seven, eight, first);
            }
        };
    }
}
