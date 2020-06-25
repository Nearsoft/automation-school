# Prepping For Use

# Running A Different Browser Locally

# Running Browsers In The Cloud

# Speeding Up Your Test Runs
**Preconditions:** Your automation framework should be prepared to be executed in parallel

## TestNG
**pom.xml**
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version><!-- update --></version>
    <configuration>
        <suiteXmlFiles>
            <suiteXmlFile>testng.xml</suiteXmlFile>
        </suiteXmlFiles>
    </configuration>
</plugin>
```

**testng.xml**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="TestSuiteNameHere" verbose="10" parallel="tests" thread-count="ThreadsHere">
    <test name="TestNameHere" preserve-order="true">
        <classes>
            <class name="ClassPathHere"/>
        </classes>
    </test>
</suite>
```
**Where:**
- `parallel` should indicate the way to execute
- `thread-count` number of thread can be used

## Surefire
**pom.xml**
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version><!-- update --></version>
    <configuration>
        <parallel>classes</parallel>
        <threadCount>3</threadCount>
    </configuration>
</plugin>
```
**Where:**
- `parallel` should indicate the way to execute
- `threadCount` number of thread can be used

# Flexible Test Execution

## TestNG
```java
@Test(groups = {"group1", "group2"})
public void testMethod() {
    // Code here
}
```

**pom.xml**
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>2.22.2</version>
    <configuration>
        <suiteXmlFiles>
            <suiteXmlFile>testng.xml</suiteXmlFile>
        </suiteXmlFiles>
    </configuration>
</plugin>
```

**testng.xml**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="TestSuiteNameHere" verbose="10" parallel="tests" thread-count="ThreadsHere">
    <test name="TestNameHere" preserve-order="true">
         <groups>
            <run>
                <include name="GroupNameHere"/>
            </run>
        </groups>
        <classes>
            <class name="ClassPathHere"/>
        </classes>
    </test>
</suite>
```

# Automating Your Test Runs
**How to install Jenkins?** [Jenkins](https://www.jenkins.io/download/lts/macos/)
**How to create Maven job?** [Maven Job](https://medium.com/@anusha.sharma3010/build-a-simple-maven-project-in-jenkins-da7a2a4ae202)

# Finding Information On Your Own
