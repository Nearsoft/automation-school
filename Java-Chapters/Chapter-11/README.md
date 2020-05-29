# Chapter 11 - Design Patterns

## Singleton

**Definition:**
Define a class that has only one instance and provides a global point of access to it

**Early Implementation:**
```java
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
```

**Lazy Implementation:**
```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
```

**Exercise:** [singleton-exercise](https://github.com/AgueroNS/singleton-exercise)

## Factory

**Definition:**
Define a class that has only one instance and provides a global point of access to it

**Implementation:**
```java
```

**Example:** []()