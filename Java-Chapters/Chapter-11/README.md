# Chapter 11 - Design Patterns

## Singleton

**Definition:**
Define a class that has only one instance and provides a global point of access to it

**Implementation:**
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

**Example:** [Singleton](https://github.com/AgueroMishel/singleton)

## Factory

**Definition:**
Define a class that has only one instance and provides a global point of access to it

**Implementation:**
```java
```

**Example:** []()