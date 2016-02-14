#RxPartialApplication

RxPartialApplication is a library to allow partial application on RxJava function primitives.

##Usage

RxPartialApplication contains two classes, `RxPartialAction` and `RxPartialFunc`. Each contains a set of `apply()` methods to do partial application from any ActionN and FuncN to any type of a lower arity. For example, you can partially apply a Func6 object with 3 prefilled parameters to obtain a Func3 object to be reused.

Function to multiply numbers by 100:
```
Func1<Integer, Integer> multiplyBy100 = RxPartialFunc.apply((int first, int second) -> { return first * second; }, 100);
int result = multiplyBy100.call(5); // result == 500
```

Single parameter applicator:
```
Action1<String> salutator = RxPartialAction.apply(applicator(), (String parameter) -> { System.out.println("Hello, " + parameter); } );
salutator.call("pakoito"); // prints "Hello, pakoito"
Action1<Integer> duplicator = RxPartialFunc.apply(applicator(), (int parameter) -> { System.out.println("Double of parameter is " + 2 * parameter); } );
duplicator.call(2); // prints "Double of parameter is 4"

...

public static <T> Action2<Action1<T>, T> applicator() {
    return (Action1<T> action, T parameter) -> { action.call(parameter); };
}
```

Filter by class:
```
Func1<Object, Boolean> isMe = RxPartialFunc(equalsFilter(), myUser);
updatesFromDatabaseObservable().filter(isUser).map(toUser()).subscribe(/* ... */);

public static <T> Func2<T, U, Boolean> equalsFilter() {
    return (T first, U second) -> { return first.equals(second); };
}
```

##Distribution

Add as a dependency to your `build.gradle`

    repositories {
        ...
        maven { url "https://jitpack.io" }
        ...
    }
    
    dependencies {
        ...
        compile 'com.github.pakoito:RxPartialApplication:1.0.+'
        ...
    }

or to your `pom.xml`

    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
    
    <dependency>
        <groupId>com.github.pakoito</groupId>
        <artifactId>RxPartialApplication</artifactId>
        <version>1.0.0</version>
    </dependency>

##License

Copyright (c) pakoito 2016

The Apache Software License, Version 2.0

See LICENSE.md