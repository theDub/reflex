Assignment 1: Android buzzer and reaction timer application
CMPUT 301

Aaron Arnason
1281110

I want to be clear. This assignment is not fully implemented. Java and android studio are both
still very new to me, I did learn lots along the way. I had major difficulties
getting an infinite loop in the timer application. Still don't know how to loop it properly.
That said, the UI is fully connected, and there are even onclick listeners for each button. 
This can be seen in the video (that didn't follow the format defined in eclass). I just wanted
to show the work that went into this assignment.

Timer class - designed to be utilized as a timer that can start on a random interval. It has
other methods which can be easily viewed via the UML documentation.

TimerList class - designed so that each time the timer runs, it can add its value to the
list. This also had methods to handle the output data: min, max, avg, and med. These two
models were test driven developed, with the exception of one method, med. 

Heapsort was written by me, and was going to be used for the median calculation in
Timerlist class.

Sources Used to help build this application:

Abram Hindle's Student Picker SAGA (most of them)
https://www.youtube.com/watch?v=5PPD0ncJU1g&list=PL240uJOh_Vb4PtMZ0f7N8ACYkCLv0673O

Onstart override
http://stackoverflow.com/questions/8063239/android-activity-onstart
Android Listview
http://www.javacodegeeks.com/2013/06/android-listview-tutorial-and-basic-example.html
dialog window
http://developer.android.com/guide/topics/ui/dialogs.html
Debugging Action Bar
http://stackoverflow.com/questions/18010072/menu-items-are-not-showing-on-action-bar
Researching system class
https://docs.oracle.com/javase/1.5.0/docs/api/java/lang/System.html
findMax val of long
https://garygregory.wordpress.com/2011/02/02/what-are-javas-min-and-max-values/
sleep method
http://stackoverflow.com/questions/9439110/make-a-java-program-sleep-without-threading
http://stackoverflow.com/questions/13578412/add-a-decimal-millisecond-delay-to-java-code
Object oriented Design
https://www.youtube.com/watch?v=1BVXQ64wI00
Find apk file
http://stackoverflow.com/questions/30366905/difference-between-app-debug-apk-and-app-debug-unaligned-apk
http://stackoverflow.com/questions/17702053/where-is-android-studio-building-my-apk-file
Reading up on Git
https://www.atlassian.com/git/tutorials/using-branches/git-branch
FillerCreep
https://github.com/theDub/FillerCreepForAndroid
Abstraction
http://crunchify.com/what-is-an-abstract-class-and-abstract-method-in-java-when-should-i-use-it/
Composition
https://en.wikipedia.org/wiki/Object_composition
handler
http://developer.android.com/reference/android/os/Handler.html
Delay
http://stackoverflow.com/questions/13578412/add-a-decimal-millisecond-delay-to-java-code
ArrayAdapter issues
http://stackoverflow.com/questions/3157157/listview-and-arrayadapterstring
Learning about activities in android
http://stackoverflow.com/questions/8063239/android-activity-onstart
Issues with adapter Null pointer
http://stackoverflow.com/questions/24203980/null-pointer-exception-in-listview-setadapter
http://stackoverflow.com/questions/6960678/nullpointerexception-with-listview-and-setadapter
Android Reference
 http://developer.android.com/reference/android/app/Activity.html
http://developer.android.com/reference/java/util/Timer.html
http://stackoverflow.com/questions/4597690/android-timer-how
infinite game loop needed, It's stateless and needed some perspective
http://stackoverflow.com/questions/11295152/android-running-infinite-loop
Conversion
http://stackoverflow.com/questions/321549/double-to-long-conversion
