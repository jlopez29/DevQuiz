package jlapps.games.devquiz.quiz.data

import jlapps.games.devquiz.quiz.model.QuizAnswer
import jlapps.games.devquiz.quiz.model.QuizQuestion

object QuizDB {
    val questions = mutableListOf(
        QuizQuestion(
            "What does ADB stand for?",
            listOf(
                QuizAnswer("Android Dalvik Bug"),
                QuizAnswer("Android Debug Bridge", true),
                QuizAnswer("Android Direct Beam"),
                QuizAnswer("Android Demo Badge")
            ), "Android"
        ),
        QuizQuestion(
            "Where would you find information about an application error?", listOf(
                QuizAnswer("Terminal"),
                QuizAnswer("Profiler"),
                QuizAnswer("Logcat", true),
                QuizAnswer("App Inspection")
            ), "Android"
        ),
        QuizQuestion(
            "Where would you determine the performance of your application?",
            listOf(
                QuizAnswer("Profiler", true),
                QuizAnswer("Debugger"),
                QuizAnswer("VCS"),
                QuizAnswer("Event Log")
            ), "Android"
        ),
        QuizQuestion(
            "In Kotlin, what is the correct way to declare a String variable?",
            listOf(
                QuizAnswer("String: var = \"Hi\""),
                QuizAnswer("var:String = \"Hi\""),
                QuizAnswer("var: string = \"Hi\""),
                QuizAnswer("var string = \"Hi\"", true)
            ), "Kotlin"
        ),
        QuizQuestion(
            "What is the android manifest NOT used for?",
            listOf(
                QuizAnswer("Declaring permissions"),
                QuizAnswer("Declaring activities"),
                QuizAnswer("Declaring services"),
                QuizAnswer("Declaring app dependencies", true)
            ), "Android"
        ),
        QuizQuestion(
            "Android is ",
            listOf(
                QuizAnswer("an operating system", true),
                QuizAnswer("a web browser", false),
                QuizAnswer("a web server", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Under which of the following Android is licensed?",
            listOf(
                QuizAnswer("OSS", false),
                QuizAnswer("Sourceforge", false),
                QuizAnswer("Apache/MIT", true),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "For which of the following Android is mainly developed?",
            listOf(
                QuizAnswer("Servers", false),
                QuizAnswer("Desktops", false),
                QuizAnswer("Laptops", false),
                QuizAnswer("Mobile devices", true)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is the first mobile phone released that ran the Android OS?",
            listOf(
                QuizAnswer("HTC Hero", false),
                QuizAnswer("Google gPhone", false),
                QuizAnswer("T - Mobile G1", true),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following virtual machine is used by the Android operating system?",
            listOf(
                QuizAnswer("JVM", false),
                QuizAnswer("Dalvik virtual machine", true),
                QuizAnswer("Simple virtual machine", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Android is based on which of the following language?",
            listOf(
                QuizAnswer("Java", true),
                QuizAnswer("C++", false),
                QuizAnswer("C", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "APK stands for ",
            listOf(
                QuizAnswer("Android Phone Kit", false),
                QuizAnswer("Android Page Kit", false),
                QuizAnswer("Android Package Kit", true),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "What does API stand for?",
            listOf(
                QuizAnswer("Application Programming Interface", true),
                QuizAnswer("Android Programming Interface", false),
                QuizAnswer("Android Page Interface", false),
                QuizAnswer("Application Page Interface", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following converts Java byte code into Dalvik byte code?",
            listOf(
                QuizAnswer("Dalvik converter", false),
                QuizAnswer("Dex compiler", true),
                QuizAnswer("Mobile interpretive compiler (MIC)", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "How can we stop the services in android?",
            listOf(
                QuizAnswer("By using the stopSelf() and stopService() method", true),
                QuizAnswer("By using the finish() method", false),
                QuizAnswer("By using system.exit() method", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "What is an activity in android?",
            listOf(
                QuizAnswer("android class", false),
                QuizAnswer("android package", false),
                QuizAnswer("A single screen in an application with supporting java code", true),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "How can we kill an activity in android?",
            listOf(
                QuizAnswer("Using finish() method", false),
                QuizAnswer("Using finishActivity(int requestCode)", false),
                QuizAnswer("Both answers", true),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "On which of the following, developers can test the application, during developing the android applications?",
            listOf(
                QuizAnswer("Third-party emulators", false),
                QuizAnswer("Emulator included in Android SDK", false),
                QuizAnswer("Physical android phone", false),
                QuizAnswer("All correct answers", true)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following kernel is used in Android?",
            listOf(
                QuizAnswer("MAC", false),
                QuizAnswer("Windows", false),
                QuizAnswer("Linux", true),
                QuizAnswer("Redhat", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is the first callback method that is invoked by the system during an activity life-cycle?",
            listOf(
                QuizAnswer("onClick() method", false),
                QuizAnswer("onCreate() method", true),
                QuizAnswer("onStart() method", false),
                QuizAnswer("onRestart() method", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is not an activity lifecycle callback method?",
            listOf(
                QuizAnswer("onClick() method", false),
                QuizAnswer("onCreate() method", false),
                QuizAnswer("onStart() method", false),
                QuizAnswer("onBackPressed() method", true)
            ), "Android"
        ),
        QuizQuestion(
            "We require an AVD to create an emulator. What does AVD stand for?",
            listOf(
                QuizAnswer("Android Virtual device", true),
                QuizAnswer("Android Virtual display", false),
                QuizAnswer("Active Virtual display", false),
                QuizAnswer("Active Virtual device", false)
            ), "Android"
        ),
        QuizQuestion(
            "Does android support other languages than java?",
            listOf(
                QuizAnswer("Yes", true),
                QuizAnswer("No", false),
                QuizAnswer("May be", false),
                QuizAnswer("Can't say", false)
            ), "Android"
        ),
        QuizQuestion(
            "What is the use of content provider in Android?",
            listOf(
                QuizAnswer("For storing the data in the database", false),
                QuizAnswer("For sharing the data between applications", false),
                QuizAnswer("For sending the data from an application to another application", true),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "AAPT stands for ",
            listOf(
                QuizAnswer("Android Activity Packaging Tool", false),
                QuizAnswer("Android Asset Packaging Tool", true),
                QuizAnswer("Android Action Packaging Tool", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "NDK stands for ",
            listOf(
                QuizAnswer("Native Development Kit", true),
                QuizAnswer("New Development kit", false),
                QuizAnswer("Native Design Kit", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is contained in the src folder?",
            listOf(
                QuizAnswer("XML", false),
                QuizAnswer("Java source code", true),
                QuizAnswer("Manifest", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following method is used to handle what happens after clicking a button?",
            listOf(
                QuizAnswer("onClick", true),
                QuizAnswer("onCreate", false),
                QuizAnswer("onSelect", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following android component displays the part of an activity on screen?",
            listOf(
                QuizAnswer("View", false),
                QuizAnswer("Manifest", false),
                QuizAnswer("Intent", false),
                QuizAnswer("Fragment", true)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is the parent class of Activity?",
            listOf(
                QuizAnswer("context", false),
                QuizAnswer("object", false),
                QuizAnswer("contextThemeWrapper", true),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is the parent class of service?",
            listOf(
                QuizAnswer("context", false),
                QuizAnswer("object", false),
                QuizAnswer("contextThemeWrapper", false),
                QuizAnswer("contextWrapper", true)
            ), "Android"
        ),
        QuizQuestion(
            "OHA in android stands for ",
            listOf(
                QuizAnswer("Open Health Academy", false),
                QuizAnswer("Open Handset Alliance", true),
                QuizAnswer("Open Handset Application", false),
                QuizAnswer("Open Handset Association", false)
            ), "Android"
        ),
        QuizQuestion(
            "In which year OHA (Open Handset Alliance) is announced?",
            listOf(
                QuizAnswer("2005", false),
                QuizAnswer("2007", true),
                QuizAnswer("2006", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is the name of the Android version 1.5?",
            listOf(
                QuizAnswer("Eclair", false),
                QuizAnswer("Froyo", false),
                QuizAnswer("Cupcake", true),
                QuizAnswer("Donut", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is the name of the Android version 1.6?",
            listOf(
                QuizAnswer("Eclair", false),
                QuizAnswer("Froyo", false),
                QuizAnswer("Cupcake", false),
                QuizAnswer("Donut", true)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is the topmost layer of android architecture?",
            listOf(
                QuizAnswer("System Libraries and Android Runtime", false),
                QuizAnswer("Linux Kernel", false),
                QuizAnswer("Applications", true),
                QuizAnswer("Applications Framework", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the layer is below the topmost layer of android architecture?",
            listOf(
                QuizAnswer("System Libraries and Android Runtime", false),
                QuizAnswer("Linux Kernel", false),
                QuizAnswer("Applications", false),
                QuizAnswer("Applications Framework", true)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the layer is the lowest layer of android architecture?",
            listOf(
                QuizAnswer("System Libraries and Android Runtime", false),
                QuizAnswer("Linux Kernel", true),
                QuizAnswer("Applications", false),
                QuizAnswer("Applications Framework", false)
            ), "Android"
        ),
        QuizQuestion(
            "What is contained in manifest.xml?",
            listOf(
                QuizAnswer("Source code", false),
                QuizAnswer("List of strings used in the app", false),
                QuizAnswer("Permission that the application requires", true),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is not a state in the service lifecycle?",
            listOf(
                QuizAnswer("Destroyed", false),
                QuizAnswer("Start", false),
                QuizAnswer("Paused", true),
                QuizAnswer("Running", false)
            ), "Android"
        ),
        QuizQuestion(
            "As an android programmer, which version of Android should we use as a minimum development target?",
            listOf(
                QuizAnswer("Version 1.2 or version 1.3", false),
                QuizAnswer("Version 1.0 or version 1.1", false),
                QuizAnswer("Version 1.6 or version 2.0", true),
                QuizAnswer("Version 2.3 or version 3.0", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is not a nickname of any android version?",
            listOf(
                QuizAnswer("Donut", false),
                QuizAnswer("Muffin", true),
                QuizAnswer("Honeycomb", false),
                QuizAnswer("Cupcake", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is a dialog class in android?",
            listOf(
                QuizAnswer("AlertDialog", false),
                QuizAnswer("DatePicker Dialog", false),
                QuizAnswer("ProgressDialog", false),
                QuizAnswer("All answers are correct", true)
            ), "Android"
        ),
        QuizQuestion(
            "In which state the activity is, if it is not in focus, but still visible on the screen?",
            listOf(
                QuizAnswer("Stopped state", false),
                QuizAnswer("Destroyed state", false),
                QuizAnswer("Paused state", true),
                QuizAnswer("Running state", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is the built-in database of Android?",
            listOf(
                QuizAnswer("SQLite", true),
                QuizAnswer("MySQL", false),
                QuizAnswer("Oracle", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following android version is named Jelly Bean?",
            listOf(
                QuizAnswer("3.1", false),
                QuizAnswer("2.1", false),
                QuizAnswer("1.1", false),
                QuizAnswer("4.1", true)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following features are updated in Android 4.1(Jelly Bean)?",
            listOf(
                QuizAnswer("User Interface", false),
                QuizAnswer("Lock screen improvement", false),
                QuizAnswer("New clock application", false),
                QuizAnswer("All answers are correct", true)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following is the API level of Android version 5.0?",
            listOf(
                QuizAnswer("21", true),
                QuizAnswer("20", false),
                QuizAnswer("11", false),
                QuizAnswer("41", false)
            ), "Android"
        ),
        QuizQuestion(
            "Is it true that \"There can be only one running activity at a given time\"?",
            listOf(
                QuizAnswer("True", true),
                QuizAnswer("False", false),
                QuizAnswer("May be", false),
                QuizAnswer("Can't say", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following android library provides access to the database?",
            listOf(
                QuizAnswer("android.content", false),
                QuizAnswer("android.database", true),
                QuizAnswer("android.api", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "In Android studio, which of the following callback is called when an activity starts interacting with the user?",
            listOf(
                QuizAnswer("onDestroy", false),
                QuizAnswer("onCreate", false),
                QuizAnswer("onResume", true),
                QuizAnswer("onStop", false)
            ), "Android"
        ),
        QuizQuestion(
            "The sendStickybroadcast(intent) method in android is used to show that the intent is ",
            listOf(
                QuizAnswer("Optional", false),
                QuizAnswer("Prioritize", false),
                QuizAnswer("Sticky", true),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following class in android displays information for a short period of time and disappears after some time?",
            listOf(
                QuizAnswer("toast class", true),
                QuizAnswer("log class", false),
                QuizAnswer("maketest class", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following method in android is used to log debug messages?",
            listOf(
                QuizAnswer("Log.r()", false),
                QuizAnswer("Log.R()", false),
                QuizAnswer("Log.d()", true),
                QuizAnswer("Log.D()", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following method is used by services to clean up any services?",
            listOf(
                QuizAnswer("onStop() method", false),
                QuizAnswer("stopService() method", false),
                QuizAnswer("onDestroy() method", true),
                QuizAnswer("stopSelf() method", false)
            ), "Android"
        ),
        QuizQuestion(
            "ANR in android stands for ",
            listOf(
                QuizAnswer("Application Not Reacting", false),
                QuizAnswer("Application Not Responding", true),
                QuizAnswer("Application Not Rendering", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "All layout classes are the subclasses of",
            listOf(
                QuizAnswer("android.view.View", false),
                QuizAnswer("android.view.ViewGroup", true),
                QuizAnswer("android.widget", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following class in android executes the task asynchronously with your service?",
            listOf(
                QuizAnswer("SyncTask", false),
                QuizAnswer("AsyncTask", true),
                QuizAnswer("Both correct", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following layout in android arranges its children into rows and columns?",
            listOf(
                QuizAnswer("RelativeLayout", false),
                QuizAnswer("TableLayout", true),
                QuizAnswer("FrameLayout", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following layout in android aligns all children either vertically or horizontally?",
            listOf(
                QuizAnswer("RelativeLayout", false),
                QuizAnswer("TableLayout", false),
                QuizAnswer("FrameLayout", false),
                QuizAnswer("LinearLayout", true)
            ), "Android"
        ),
        QuizQuestion(
            "What is the default value of the orientation attribute in LinearLayout?",
            listOf(
                QuizAnswer("Horizontal", true),
                QuizAnswer("Vertical", false),
                QuizAnswer(
                    "There is no default value of orientation attribute in LinearLayout",
                    false
                ),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "What is the nine-patch images tool in android?",
            listOf(
                QuizAnswer("It is an image extension tool.", false),
                QuizAnswer("It is used to change the bitmap images into nine sections", true),
                QuizAnswer("Both answers", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "GCM in android stands for ",
            listOf(
                QuizAnswer("Google Cloud Messaging", true),
                QuizAnswer("Google Count Messaging", false),
                QuizAnswer("Google Center Messaging", false),
                QuizAnswer("No correct answers", false)
            ), "Android"
        ),
        QuizQuestion(
            "Which of the following option leads to the portability and security of Java?",
            listOf(QuizAnswer("Bytecode is executed by JVM",true),QuizAnswer("The applet makes the Java code secure and portable",false),QuizAnswer("Use of exception handling",false),QuizAnswer("Dynamic binding between objects",false)),"Java"),
        QuizQuestion(
            "Which of the following is not a Java feature?",
            listOf(QuizAnswer("Dynamic",false),QuizAnswer("Architecture Neutral",false),QuizAnswer("Use of pointers",true),QuizAnswer("Object-oriented",false)),"Java"),
        QuizQuestion(
            "What should be the execution order, if a class has a method, static block, instance block, and constructor, as shown below?",
            listOf(QuizAnswer("Instance block, method, static block, and constructor",false),QuizAnswer("Method, constructor, instance block, and static block",false),QuizAnswer("Static block, method, instance block, and constructor",false),QuizAnswer("Static block, instance block, constructor, and method",true)),"Java"),
        QuizQuestion(
            "The \u0021 article referred to as a",
            listOf(QuizAnswer("Unicode escape sequence",true),QuizAnswer("Octal escape",false),QuizAnswer("Hexadecimal",false),QuizAnswer("Line feed",false)),"Java"),
        QuizQuestion(
            "_____ is used to find and fix bugs in the Java programs.",
            listOf(QuizAnswer("JVM",false),QuizAnswer("JRE",false),QuizAnswer("JDK",false),QuizAnswer("JDB",true)),"Java"),
        QuizQuestion(
            "Which of the following is a valid declaration of a char?",
            listOf(QuizAnswer("char ch = '\\utea';",true),QuizAnswer("char ca = 'tea';",false),QuizAnswer("char cr = \u0223;",false),QuizAnswer("char cc = '\\itea';",false)),"Java"),
        QuizQuestion(
            "What is the return type of the hashCode() method in the Object class?",
            listOf(QuizAnswer("Object",false),QuizAnswer("int",true),QuizAnswer("long",false),QuizAnswer("void",false)),"Java"),
        QuizQuestion(
            "Which of the following is a valid long literal?",
            listOf(QuizAnswer("ABH8097",false),QuizAnswer("L990023",false),QuizAnswer("904423",false),QuizAnswer("0xnf029L",true)),"Java"),
        QuizQuestion(
            "What does the expression float a = 35 / 0 return?",
            listOf(QuizAnswer("0",false),QuizAnswer("Not a Number",false),QuizAnswer("Infinity",true),QuizAnswer("Run time exception",false)),"Java"),
        QuizQuestion(
            "Evaluate the following Java expression, if x=3, y=5, and z=10:\n++z + y - y + z + x++",
            listOf(QuizAnswer("24",false),QuizAnswer("23",false),QuizAnswer("20",false),QuizAnswer("25",true)),"Java"),
        QuizQuestion(
            "Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?",
            listOf(QuizAnswer("javap tool",false),QuizAnswer("javaw command",false),QuizAnswer("Javadoc tool",true),QuizAnswer("javah command",false)),"Java"),
        QuizQuestion(
            "Which of the following creates a List of 3 visible items and multiple selections enabled?",
            listOf(QuizAnswer("new List(false, 3)",false),QuizAnswer("new List(3, true)",true),QuizAnswer("new List(true, 3)",false),QuizAnswer("new List(3, false)",false)),"Java"),
        QuizQuestion(
            "Which of the following for loop declaration is not valid?",
            listOf(QuizAnswer("for ( int i = 99; i >= 0; i / 9 )",true),QuizAnswer("for ( int i = 7; i <= 77; i += 7 )",false),QuizAnswer("for ( int i = 20; i >= 2; - -i )",false),QuizAnswer("for ( int i = 2; i <= 20; i = 2* i )",false)),"Java"),
        QuizQuestion(
            "Which method of the Class.class is used to determine the name of a class represented by the class object as a String?",listOf(QuizAnswer("getClass()",false),QuizAnswer("intern()",false),QuizAnswer("getName()",true),QuizAnswer("toString()",false)),"Java"),
        QuizQuestion(
            "In which process, a local variable has the same name as one of the instance variables?",
            listOf(QuizAnswer("Serialization",false),QuizAnswer("Variable Shadowing",true),QuizAnswer("Abstraction",false),QuizAnswer("Multi-threading",false)),"Java"),
        QuizQuestion(
            "Which of the following is true about the anonymous inner class?",
            listOf(QuizAnswer("It has only methods",false),QuizAnswer("Objects can't be created",false),QuizAnswer("It has a fixed class name",false),QuizAnswer("It has no class name",true)),"Java"),
        QuizQuestion(
            "Which package contains the Random class?",
            listOf(QuizAnswer("java.util package",true),QuizAnswer("java.lang package",false),QuizAnswer("java.awt package",false),QuizAnswer("java.io package",false)),"Java"),
        QuizQuestion(
            "What do you mean by nameless objects?",
            listOf(QuizAnswer("An object created by using the new keyword.",false),QuizAnswer("An object of a superclass created in the subclass.",false),QuizAnswer("An object without having any name but having a reference.",false),QuizAnswer("An object that has no reference.",true)),"Java"),
        QuizQuestion(
            "An interface with no fields or methods is known as a ______.",
             listOf(QuizAnswer("Runnable Interface",false),QuizAnswer("Marker Interface",true),QuizAnswer("Abstract Interface",false),QuizAnswer("CharSequence Interface",false)),"Java"),
        QuizQuestion(
            "Which of the following is an immediate subclass of the Panel class?",
            listOf(QuizAnswer("Applet class",true),QuizAnswer("Window class",false),QuizAnswer("Frame class",false),QuizAnswer("Dialog class",false)),"Java"),
        QuizQuestion(
            "Which option is false about the final keyword?",
            listOf(QuizAnswer("A final method cannot be overridden in its subclasses.",false),QuizAnswer("A final class cannot be extended.",false),QuizAnswer("A final class cannot extend other classes.",true),QuizAnswer("A final method can be inherited.",false)),"Java"),
        QuizQuestion(
            "Which of these classes are the direct subclasses of the Throwable class?",
            listOf(QuizAnswer("RuntimeException and Error class",false),QuizAnswer("Exception and VirtualMachineError class",false),QuizAnswer("Error and Exception class",true),QuizAnswer("IOException and VirtualMachineError class",false)),"Java"),
        QuizQuestion(
            "What do you mean by chained exceptions in Java?",
            listOf(QuizAnswer("Exceptions occurred by the VirtualMachineError",false),QuizAnswer("An exception caused by other exceptions",true),QuizAnswer("Exceptions occur in chains with discarding the debugging information",false),QuizAnswer("No correct answers",false)),"Java"),
        QuizQuestion(
            "In which memory a String is stored, when we create a string using new operator?",
            listOf(QuizAnswer("Stack",false),QuizAnswer("String memory",false),QuizAnswer("Heap memory",true),QuizAnswer("Random storage space",false)),"Java"),
        QuizQuestion(
            "What is the use of the intern() method?",
            listOf(QuizAnswer("It returns the existing string from memory",true),QuizAnswer("It creates a new string in the database",false),QuizAnswer("It modifies the existing string in the database",false),QuizAnswer("None correct answers",false)),"Java"),
        QuizQuestion(
            "Which of the following is a marker interface?",
            listOf(QuizAnswer("Runnable interface",false),QuizAnswer("Remote interface",true),QuizAnswer("Readable interface",false),QuizAnswer("Result interface",false)),"Java"),
        QuizQuestion(
            "Which of the following is a reserved keyword in Java?",
            listOf(QuizAnswer("object",false),QuizAnswer("strictfp",true),QuizAnswer("main",false),QuizAnswer("system",false)),"Java"),
        QuizQuestion(
            "Which keyword is used for accessing the features of a package?",
            listOf(QuizAnswer("package",false),QuizAnswer("import",true),QuizAnswer("extends",false),QuizAnswer("export",false)),"Java"),
        QuizQuestion(
            "In java, jar stands for_____.",
            listOf(QuizAnswer("Java Archive Runner",false),QuizAnswer("Java Application Resource",false),QuizAnswer("Java Application Runner",false),QuizAnswer("No correct answers",true)),"Java"),
        QuizQuestion(
            "Which of the following is false?",
            listOf(QuizAnswer("The rt.jar stands for the runtime jar",false),QuizAnswer("It is an optional jar file",true),QuizAnswer("It contains all the compiled class files",false),QuizAnswer("All the classes available in rt.jar is known to the JVM",false)),"Java"),
        QuizQuestion(
            "What is the use of \\w in regex?",
            listOf(QuizAnswer("Used for a whitespace character",false),QuizAnswer("Used for a non-whitespace character",false),QuizAnswer("Used for a word character",true),QuizAnswer("Used for a non-word character",false)),"Java"),
        QuizQuestion(
            "Which of the given methods are of Object class?",
            listOf(QuizAnswer("notify(), wait( long msecs ), and synchronized()",false),QuizAnswer("wait( long msecs ), interrupt(), and notifyAll()",false),QuizAnswer("notify(), notifyAll(), and wait()",true),QuizAnswer("sleep( long msecs ), wait(), and notify()",false)),"Java"),
        QuizQuestion(
            "Which of the following is a valid syntax to synchronize the HashMap?",
            listOf(QuizAnswer("Map m = hashMap.synchronizeMap();",false),QuizAnswer("HashMap map =hashMap.synchronizeMap();",false),QuizAnswer("Map m1 = Collections.synchronizedMap(hashMap);",true),QuizAnswer("Map m2 = Collection.synchronizeMap(hashMap);",false)),"Java"),
        QuizQuestion(
            "Given, ArrayList list = new ArrayList(); What is the initial quantity of the ArrayList list?",
            listOf(QuizAnswer("5",false),QuizAnswer("10",true),QuizAnswer("0",false),QuizAnswer("100",false)),"Java"),
        QuizQuestion(
            "Which of the following is a mutable class in java?",
            listOf(QuizAnswer("java.lang.String",false),QuizAnswer("java.lang.Byte",false),QuizAnswer("java.lang.Short",false),QuizAnswer("java.lang.StringBuilder",true)),"Java"),
        QuizQuestion(
            "What is meant by the classes and objects that dependents on each other?",
            listOf(QuizAnswer("Tight Coupling",true),QuizAnswer("Cohesion",false),QuizAnswer("Loose Coupling",false),QuizAnswer("No correct answers",false)),"Java"),
        QuizQuestion(
            "Which of the following code segment would execute the stored procedure getPassword() located in a database server?",
            listOf(QuizAnswer("CallableStatement cs = connection.prepareCall({call.getPassword()});",false),QuizAnswer("cs.executeQuery();",false),QuizAnswer("CallabledStatement callable = conn.prepareCall({call getPassword()});",false),QuizAnswer("callable.executeUpdate();",false)),"Java"),
        QuizQuestion(
            "How many threads can be executed at a time?",
            listOf(QuizAnswer("Only one thread",false),QuizAnswer("Multiple threads",true),QuizAnswer("Only main (main() method) thread",false),QuizAnswer("Two threads",false)),"Java"),
        QuizQuestion(
            "If three threads trying to share a single object at the same time, which condition will arise in this scenario?",
            listOf(QuizAnswer("Time-Lapse",false),QuizAnswer("Critical situation",false),QuizAnswer("Race condition",true),QuizAnswer("Recursion",false)),"Java"),
        QuizQuestion(
            "If a thread goes to sleep",
            listOf(QuizAnswer("It releases all the locks it has.",false),QuizAnswer("It does not release any locks.",true),QuizAnswer("It releases half of its locks.",false),QuizAnswer("It releases all of its lock except one.",false)),"Java"),
        QuizQuestion(
            "Which of the following modifiers can be used for a variable so that it can be accessed by any thread or a part of a program?",
            listOf(QuizAnswer("global",false),QuizAnswer("transient",false),QuizAnswer("volatile",true),QuizAnswer("default",false)),"Java"),
        QuizQuestion(
            "In character stream I/O, a single read/write operation performs _____.",
            listOf(QuizAnswer("Two bytes read/write at a time.",true),QuizAnswer("Eight bytes read/write at a time.",false),QuizAnswer("One byte read/write at a time.",false),QuizAnswer("Five bytes read/ write at a time.",false)),"Java"),
        QuizQuestion(
            "What is the default encoding for an OutputStreamWriter?",
            listOf(QuizAnswer("UTF-8",false),QuizAnswer("Default encoding of the host platform",true),QuizAnswer("UTF-12",false),QuizAnswer("None correct answers",false)),"Java"),
        QuizQuestion(
            "Kotlin was developed by?",
            listOf(QuizAnswer("IBM"),QuizAnswer("Netbeans"),QuizAnswer("JetBrains",true),QuizAnswer("Oracle")),
            "Kotlin"
        ),
        QuizQuestion(
            "Does Kotlin have a ternary conditional operator?",
            listOf(QuizAnswer("True",true),QuizAnswer("False")),
            "Kotlin"
        ),
        QuizQuestion(
            "Which of the following is used to compare two strings in Kotlin?",
            listOf(QuizAnswer("Using == operator"),QuizAnswer("Using compareTo() extension function"),QuizAnswer("Both answers",true),QuizAnswer("No answers")),
            "Kotlin"
        ),
        QuizQuestion(
            "Does Kotlin support primitive Datatypes?",
            listOf(QuizAnswer("True"),QuizAnswer("False",true)),
            "Kotlin"
        ),
        QuizQuestion(
            "All classes in Kotlin classes are by default?",
            listOf(QuizAnswer("public"),QuizAnswer("public"),QuizAnswer("abstract"),QuizAnswer("final",true)),
            "Kotlin"
        ),
        QuizQuestion(
            "Elvis Operator is used for handling null expectations in Kotlin",
            listOf(QuizAnswer("True",true),QuizAnswer("False")),
            "Kotlin"
        ),
        QuizQuestion(
            "What is used when you know what functionalities a class should have",
            listOf(QuizAnswer("exception class"),QuizAnswer("inheritance class"),QuizAnswer("abstraction class",true),QuizAnswer("no correct answers")),
            "Kotlin"
        ),
        QuizQuestion(
            "What operator is used to determine an expression is not null",
            listOf(QuizAnswer("!!",true),QuizAnswer("?"),QuizAnswer("?."),QuizAnswer("!?")),
            "Kotlin"
        ),
        QuizQuestion(
            "What operator is used to determine an expression is not null",
            listOf(QuizAnswer("!!",true),QuizAnswer("?"),QuizAnswer("?."),QuizAnswer("!?")),
            "Kotlin"
        ),
        QuizQuestion(
            "What is a correct way to iterate a range?",
            listOf(QuizAnswer("i to 1 to 5"),QuizAnswer("i in 1 downFrom 0"),QuizAnswer("i in 1..5",true),QuizAnswer("i to 1..5")),
            "Kotlin"
        ),
        QuizQuestion(
            "Is this a correct way to represent a string?\n" +
                    "var x = 3\n" +
                    "println(\"val x is \$x\")",
            listOf(QuizAnswer("True",true), QuizAnswer("False")),
            "Kotlin"
        ),QuizQuestion(
            "JVM is the target platform of Kotlin.",
            listOf(QuizAnswer("True",true),QuizAnswer("False")),
            "Kotlin"
        ),QuizQuestion(
            "What is an instance of suspendable computation, and thought of as light-weight threads.",
            listOf(QuizAnswer("Coroutines",true),QuizAnswer("Annotations"),QuizAnswer("Callbacks"),QuizAnswer("Lambdas")),
            "Kotlin"
        )
        ,QuizQuestion(
            "What keyword is used for singletons.",
            listOf(QuizAnswer("object",true),QuizAnswer("final"),QuizAnswer("abstract"),QuizAnswer("singleton")),
            "Kotlin"
        ),QuizQuestion(
            "What does the following code output.\n" +
                    "var x = intArrayOf(1,2,3,4,3,2)\n" +
                    "println(\n" +
                    "\tx.groupBy{it}.\n" +
                    "\tmap{it.value.size})",
            listOf(QuizAnswer("[1, 2, 2, 1]",true),QuizAnswer("[1,2]"),QuizAnswer("[[1], [2, 2], [3, 3], [4]]"),QuizAnswer("{1=[1], 2=[2, 2], 3=[3, 3], 4=[4]}")),
            "Kotlin"
        ),QuizQuestion(
            "Common superclass of all Kotlin classes is:",
            listOf(QuizAnswer("Any",true),QuizAnswer("All"),QuizAnswer("Class"),QuizAnswer("Generic")),
            "Kotlin"
        ),QuizQuestion(
            "Which of the following is the correct way to typecast?",
            listOf(QuizAnswer("x as String",true),QuizAnswer("x to String"),QuizAnswer("(String)x"),QuizAnswer("x.string")),
            "Kotlin"
        ),QuizQuestion(
            "Which of the following is the correct way to typecast?",
            listOf(QuizAnswer("x as String",true),QuizAnswer("x to String"),QuizAnswer("(String)x"),QuizAnswer("x.string")),
            "Kotlin"
        ),QuizQuestion(
            "What is something that Kotlin doesn't have?",
            listOf(QuizAnswer("Ternary Operator",true),QuizAnswer("named parameters"),QuizAnswer("extension functions"),QuizAnswer("null safety operators")),
            "Kotlin"
        ),QuizQuestion(
            "What is lateinit?",
            listOf(QuizAnswer("Initialize a variable after declaration",true),QuizAnswer("Declarations will be visible everywhere"),QuizAnswer("Compile time constants"),QuizAnswer("Initialize functions after declaration")),
            "Kotlin"
        ),QuizQuestion(
            "What's the difference between const and val?",
            listOf(QuizAnswer("Compile time vs Runtime",true),QuizAnswer("They are the same"),QuizAnswer("const can be assigned to a function"),QuizAnswer("const can be assigned to any class")),
            "Kotlin"
        ),QuizQuestion(
            "Companion objects are the equivalent of Java static methods in Kotlin",
            listOf(QuizAnswer("True",true),QuizAnswer("False")),
            "Kotlin"
        ),QuizQuestion(
            "x ?: y where x is null returns what?",
            listOf(QuizAnswer("y",true),QuizAnswer("x"),QuizAnswer("Runtime error"),QuizAnswer("Compile time error")),
            "Kotlin"
        ),QuizQuestion(
            "What is NOT a correct modifier",
            listOf(QuizAnswer("secure",true),QuizAnswer("private"),QuizAnswer("internal"),QuizAnswer("public")),
            "Kotlin"
        ),QuizQuestion(
            "What variables enable programmers to control threads, and CPU time more effectively",
            listOf(QuizAnswer("Volatile",true),QuizAnswer("Thread"),QuizAnswer("Lock"),QuizAnswer("Deadlock")),
            "Kotlin"
        ),QuizQuestion(
            "Is this a proper class declaration:\ndata class User(val name: String, val age: Int)",
            listOf(QuizAnswer("True",true),QuizAnswer("False")),
            "Kotlin"
        ),QuizQuestion(
            "What variables enable programmers to control threads, and CPU time more effectively",
            listOf(QuizAnswer("Volatile",true),QuizAnswer("Thread"),QuizAnswer("Lock"),QuizAnswer("Deadlock")),
            "Kotlin"
        ),QuizQuestion(
            "Instructions in the what block are executed right after Primary Constructor’s execution",
            listOf(QuizAnswer("init",true),QuizAnswer("exec"),QuizAnswer("constructor"),QuizAnswer("start")),
            "Kotlin"
        ),QuizQuestion(
            "How many constructors does Kotlin have?",
            listOf(QuizAnswer("Two",true),QuizAnswer("One"),QuizAnswer("Three"),QuizAnswer("None")),
            "Kotlin"
        ),QuizQuestion(
            "What isn't a Scope function",
            listOf(QuizAnswer("as",true),QuizAnswer("let"),QuizAnswer("with"),QuizAnswer("also")),
            "Kotlin"
        ),QuizQuestion(
            "What describes a sealed class",
            listOf(QuizAnswer("It represents restricted class hierarchies",true),QuizAnswer("It refers to the default class in Kotlin"),QuizAnswer("It is analogous to an abstract class"),QuizAnswer("No correct answers")),
            "Kotlin"
        ),QuizQuestion(
            "Kotlin and Java interoperable.",
            listOf(QuizAnswer("True",true),QuizAnswer("False")),
            "Kotlin"
        )


    )
}