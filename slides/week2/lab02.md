# SWENGB - Lab 02

In the first part of this Lab we are investigating a simple object model for students, courses and
assigments. We will work towards a system for checking assignments by implementing a simple http 
client. We will learn about the Maven build system, ScalaTest and approaches towards code generation.

In the second part of this class we will start with our second assignment, the Sirpinski Triangle
app.

## 1 - Install Maven

- goto http://maven.apache.org/
- download the binary distribution of maven
- follow installation instructions

- the command <code>mvn -v</code> should yield the version of maven and the JDK you are using.

Now, you are ready and set to use maven as your build system.

## 2 - Get course repository

- goto https://github.com/rladstaetter/fhj.swengb2016.course
- fork it to your own repository at github

## 3 - Clone it to your local computer (in your workspace)

- cd <code>c:/workspace</code>
- git clone https://github.com/<yourgitubusername>/fhj.swengb2016.course

## 4 - Build project locally

- cd <code>c:/workspace/fhj.swengb2016.course</code> 
- <code>mvn clean install -DskipTests</code>

You should see something like this:

<pre>
...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO] 
[INFO] fhj.swengb.course .................................. SUCCESS [  0.763 s]
[INFO] fhj.swengb.course.base ............................. SUCCESS [  2.917 s]
[INFO] fhj.swengb.course.assignments ...................... SUCCESS [  7.958 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
....
</pre>

## 5 - Run <code>mvn install</code> project a second time

- <code>mvn clean install -DskipTests</code>
- did you recognise any difference?
  
## 6 - Examine dependencies
 
- execute <code>mvn dependency:tree</code>
- can you explain what happened?
  
## 7 - Open project in IntelliJ

- start IntelliJ and open project, use maven as external model

## 8 - Execute tests
 
- navigate to in course/assignments/src/test/scala/fhj/swengb/assignments/basic
- search for your name in the "Spec" files
- delete all other sections from the file (such that the section with your name is the only one left in the file)
- your name defines a section in the spec file, in this area right click and execute the test

## 9 - Lets expand the test coverage

- Analyze how the specs are implemented. Have a look at the way it is checked that the <code>.gitignore</code>
 exists and <code>local.properties</code> is not checked in.
- Extend the test such that it is checked that
  - BasicGestureDetectFragment.scala exists (at Application/src/main/scala/com/example/android/basicgesturedetect)
  - GestureListener.scala exists (at Application/src/main/scala/com/example/android/basicgesturedetect)
  - MainActivity.scala exists (at Application/src/main/scala/com/example/android/basicgesturedetect)

## 10 - Take advantage of code generation

- have a look at the codegenerator. it generates the code for all groups, as well as the allspec file.
- how do you have to extend it in order to generate your test cases (see point 9) for all your colleagues as well?
- generate the code
- what is your takeaway of this exercise? think about what role automation plays in the life of a developer.

# Part II (and homework: Sierpinski triangle)

The challenge for your second homework is to implement a sierpinski triangle (depth = 7). Of course, the triangle
should be constructed, that is to say your app should construct the sierpinski triangle programmatically.

Your code should be pushed to your 
 