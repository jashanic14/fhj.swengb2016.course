# SWENGB - Lab 01

Goal is to port an example android application to Scala. First, we will examine together a very similar example
(Basic Multitouch) and afterwards you'll do the port yourself with another example of the google samples repository.

## Part 1

We assume that your workspace is in <code>c:/workspace/</code>.
 
To get the example material, follow following steps:

1.) Install scala gradle plugin to your local repository 

- open a terminal
- <code>cd c:/workspace</code> 
- git clone https://github.com/rladstaetter/gradle-android-scala-plugin/
- Check that gradle 2.14.1 is installed, via <code>gradle -v</code>
  - if gradle is not installed, go to gradle.org and install it
  - it is recommended to use sdkman, like described on their website (you'll need cygwin for that, though)
- <code>cd gradle-android-scala-plugin</code>
- <code>gradle install</code>

Now your gradle installation should support android projects with basic scala support.

2.) Clone example project

- <code>cd c:/workspace</code>
- <code>git clone https://github.com/rladstaetter/android-BasicMultitouch.git</code>
- <code>cd android-BasicMultitouch</code>

3.) Compile and install project on device (or emulator)

- <code>gradle installDebug</code>

4.) Open project in Android Studio

- Open Android Studio
- Import project (Eclipse ADT, Gradle ...)

5.) Follow code walkthrough

Follow the code walkthrough and examine the project for yourself. Compare the original project with the scala
port; identify the similarities and the differences.

## Part 2

Now it is your turn! The first assignment is to port another example, namely <code>BasicGestureDetect</code>
to Scala.

1.) Fork google BasicGestureDetect example

- go to https://github.com/googlesamples/android-BasicGestureDetect/
- Fork the project by clicking on the gray "Fork" Button
  - you should now have a repository available at https://github.com/<your github account>/android-BasicGestureDetect
  
2.) Clone it to your local machine

- You can do this directly in Android Studio, navigate to the main page of your forked project
- click on the green "Clone or download" button
- copy the URL starting with "https://github.com/..." in your clipboard
- Close all projects in Android studio
- Click on "Checkout project from version control", choose "GitHub"
- Paste the address to the first text field
- Clone it, accept everything

3.) If you are asked about a missing SDK 

- create a local.properties file in the root of the project with contents <code>sdk.dir=<path to your android sdk></code>

4.) Happy hacking!


## Helpful commands

- gradle tasks
- gradle uninstallAll

