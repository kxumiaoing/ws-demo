axis1
=====
1. jws deploying
2. wsdd deploying

axis2
=====
1. create a service from scratch
    
    axiom
2. deploy pojo

    pojo 
3. create service from wsdl

    3.1 adb
    
    3.2 xmlbeans
    
    3.3 jibx
    
    run axis2-jibx-vo first for compiling the bindings into class files, then run axis2-jibx-skeleton and axis2-jibx-stub.

jaxws ri
========
1. main publish;

2. servlet publish;
        
error
=====
maven error(Error loading class java.lang.CharSequence) solution: use jdk1.7 instead of jdk1.8.
