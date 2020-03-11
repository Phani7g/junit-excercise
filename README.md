# junit-excercise
For this lab, you can either install JUnit yourself or use the already installed JUnit on the CS server (recommended).

In Java there are Math libraries containing various trigonometric functions. You will be tasked to write your own trigonometric library for Java. In doing so you will need to implement all the standard functions, SIN, COS, TAN. To calculate these functions consider the Taylor series expansions. You might find the following resource helpful:
https://www.efunda.com/math/taylor_series/taylor_series.cfm
It should be noted that these series are based in radian measure. It would be nice that your library could also generate the function values from degrees. Thus your library will require the appropriate conversion as well to allow the user to chain together functions to produce the desired result. You are not allowed to use any java math library functions when developing your own. If you need a function, then you must create it. As part of your testing make sure that the functions are sound in all 4 quadrants. Will throw a custom exception for invalid usage. The class you will develop will be a static class. 







JUnit testing is a testing framework for Test-First Development. This is an educational assignment, in that you will research and learn the Junit test suit and apply it to the class definition above. The below link is a tutorial for Junit. Its installation, and configuration to run an automated test on a code project. All of which you will be responsible for.

https://www.guru99.com/junit-tutorial.html also check out the official site https://junit.org/
As part of this assignment, you will be required to code the trigonometric functions sin, cos, tan in both radian and degree, integrating the Junit testing as you go. That is, you will also develop a test class under Junit to test the framework of your class as you implement the constructors and methods. When you are finished you should be able to run the test and verify that all cases have been covered and that your class is sound.


What this assignment is not: Turning in a working-class without any test suit will earn you a big fat zero. It is not about writing a java class, it is about learning Junit testing. It also means your class has to be correct. Thus, marks are assigned for completeness and thoroughness of the testing and the construction of the test environment. Output should include the tests which are defined on non-implemented methods and constructors. Thus initial tests should fail. You are to define this framework first, version this code as version 1, run it and save the version and output (here all the tests would fail naturally). Implement the constructors and methods, show the tests at 1/3 complete, 2/3 complete and fully complete, along with the versions which match the tests. How about version 2.0, 3.0, and 4.0 as the final version. Marking will be based on the quality of the submission which consists of the versions and test output as described above.That is, teams that submit a high-quality assignment will be distinguished from the “night before it is due” submission. Because of the size of this assignment you are given 2 weeks to complete it. Please start early. 

Use gitlab available on our CS server (see help.cs.uwindsor.ca) to set it up and allow the multiple versions.
Be sure to fully document all your code and add any necessary README files.
Grading Scheme:
-Setup of gitlab showing multiple versions [5 pts]
-version 1 with all test cases and a screenshot of the eclipse/Junit test view showing the results of the test cases and the failed cases. [sin, cos, tan, and radtodegree conversion (or similar) showing multiple test cases and setup 10 pts]
-version (final) with all the test cases and code implemented. submit a Screenshot showing the test cases successfully passing. [5 pts]; submit the source code (on gitlab) [10 pts]
--> No documentation or poor documentation = zero marks!
WHAT TO SUBMIT ON BLACKBOARD: SUBMIT the link to the gitlab page ensuring access to the GAs/instructor, and all your source code as attachments (do NOT zip your files).
