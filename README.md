# Riset sederhana tentang tingkat PARALLEL pada suatu test

## Untuk hasil test SEQUENTIAL 

Berikut untuk code testng.xml SEQUENTIAL 
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="SequentialSuite" parallel="false">
    <test name="Parallel Test A">
        <classes>
            <class name="com.juaracoding.ujianminggu2.KelasTestA"></class>
        </classes>
    </test>

    <test name="Parallel Test B">
        <classes>
            <class name="com.juaracoding.ujianminggu2.KelasTestB"></class>
        </classes>
    </test>

</suite>
```
### Result yang didapet di INDEX.html
<img width="1907" height="844" alt="hasil sequential" src="https://github.com/user-attachments/assets/d4764535-dc2c-42d2-8878-3616b3408951" />

### dan berikut untuk Screen Shoot di Intelij
<img width="1278" height="458" alt="hasil sequential2" src="https://github.com/user-attachments/assets/2adb0d7d-568b-40b6-898f-30002d264a35" />

## Untuk hasil test PARALLEL

Berikut untuk code testng.xml PARALLEL 
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="ParallelSuite" parallel="methods" thread-count="6" verbose="1">
    <test name="ParallelTests">
        <classes>
            <class name="com.juaracoding.ujianminggu2.KelasTestA"/>
            <class name="com.juaracoding.ujianminggu2.KelasTestB"/>
        </classes>
    </test>
</suite>
```
### Result yang didapet di INDEX.html
<img width="1912" height="885" alt="hasil parallel" src="https://github.com/user-attachments/assets/c6206e65-a41f-4269-b764-c04d4ba318f2" />

### dan berikut untuk Screen Shoot di Intelij
<img width="1275" height="455" alt="hasil parallel2" src="https://github.com/user-attachments/assets/9fbd8b9c-16e7-48ac-927a-c8bd43d42e70" />
