package com.example.siyuan.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Description extends AppCompatActivity {

    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        intent = getIntent();
        setTitle(intent.getStringExtra("COURSE"));
        description();
    }

    protected void description(){
        TextView text1 = (TextView)findViewById(R.id.textView3);
        TextView text2 = (TextView)findViewById(R.id.textView4);
        switch (intent.getStringExtra("COURSE")){
            case "BUSA 2720":
                text1.append("Business in a Networked Economy");
                text2.append("\tThis course introduces students to basic business concepts and processes. The course starts from a global perspective examining the Canadian business environment, ethics and entrepreneurship. After students have an understanding of the Canadian business environment, the course looks at the main areas of concern for most businesses: managing people, managing operations and information, managing marketing and managing financial issues.");
                break;
            case "COMM 1116":
                text1.append("Business Communications 1");
                text2.append("\tInformation technology professionals spend time each day communicating orally and in writing with their supervisors, colleagues and clients. As problem-solvers and entrepreneurs in industry, you need to communicate quickly, clearly, and effectively. This course will teach you how to be a professional and efficient communicator at work. You will write effective business correspondence and instructions and deliver a formal oral presentation to your set. The first term establishes the principles and basic patterns on which you will build more advanced applications in the second term.");
                break;
            case "COMP 1100":
                text1.append("CST Program Fundamentals");
                text2.append("\tThe course covers topics of importance to new and continuing students on how to balance school and related activities to enhance chances of success in their academic careers. In this course students will learn a variety of different techniques to improve study habits, note taking, and time management skills. The class will also present other topics of interest to CST students and will introduce students to various support systems at BCIT.");
                break;
            case "COMP 1111":
                text1.append("Essential Skills for Computing");
                text2.append("\tThis course addresses technology expertise expected of our students but not specifically addressed in their other courses. These survival skills will better equip our CST students to succeed in their main programs of study.");
                break;
            case "COMP 1113":
                text1.append("Applied Mathematics");
                text2.append("\tComp 1113 is partially discrete mathematics, partially an introduction to linear equations. The purpose of this course is to give a strong foundation for future technical and programming courses. The course is divided into three parts: (1) Boolean algebra and design of logic circuits; (2) number systems and data representation; and (3) functions, linear equations, vectors and matrices.");
                break;
            case "COMP 1510":
                text1.append("Programming Methods");
                text2.append("\tThis course is the foundation for all future programming courses and complements COMP 1536. This course introduces the fundamental concepts of programming from an object-oriented perspective. Through the study of object design, this course also introduces the basics of human-computer interfaces, graphics, and the social implications of computing, along with some coverage of software engineering.");
                break;
            case "COMP 1536":
                text1.append("Introduction to Web Development");
                text2.append("\tThis course is a web design and programming course with an emphasis on good planning, interface design, multimedia, client-side scripting with JavaScript, server-side scripting, and best practices. COMP 1536 will provide students with a solid understanding about how web applications are constructed and deployed. Students will be taught to use client-side RAD tools in order to enhance their productivity. Students will complete a number of assignments and exams as well as one larger project.");
                break;
            case "COMM 2216":
                text1.append("Business Communications 2");
                text2.append("\tInformation technology professionals spend time each day communicating orally and in writing with their supervisors, colleagues and clients. As problem-solvers and entrepreneurs in industry, you need to communicate quickly, clearly, and effectively. This course will build on the skills you learned in first term to be an efficient and professional communicator at work. You will learn how to conduct an effective job search and write the accompanying resume and cover letter to support it. You will also write effective reports, deliver a persuasive oral presentation to your set, and participate effectively in meetings and group work. You will prepare a formal report and present it orally and in writing. Prerequisites: COMM 1116");
                break;
            case "COMP 2121":
                text1.append("\tDiscrete Mathematics");
                text2.append("\tDiscrete Mathematics concerns processes that consist of a sequence of individual steps. The ideas of discrete mathematics underline the science and technology specific to computer applications. The Discrete Mathematics course provides the mathematical basis and concepts for applications in computer science: elementary logic, the logic of quantified statements, methods of proof, set theory, discrete functions, relations, counting and probabilities, sequences and mathematical induction, recursion, graphs, trees, and Boolean algebra. Prerequisites: COMP 1113");
                break;
            case "COMP 2510":
                text1.append("Procedural Programming in C");
                text2.append("\tThis hands-on course follows on from COMP 1510 in the full-time CST Diploma. Students are introduced to the procedural programming paradigm using the C programming language. Topics include: language syntax, common coding styles and idioms and the implementation of selected data structures and algorithms in C. Successful participants will learn how to design and build modular multi-file C programs and be prepared to move on to several higher level courses. COMP 2510 Procedural Programming in C is a required course in the full-time CST Diploma before option placement. It needs to be completed prior to a number of courses in second year including COMP 3512 Object Oriented Programming in C++, and COMP 4735 Operating Systems. Prerequisites: COMP 1510");
                break;
            case "COMP 2526":
                text1.append("Object-Oriented Programming with Java\n");
                text2.append("\tStudents continue to learn to develop applications with the Java language using the Object Oriented Paradigm. Focus is on problem solving, proper Object Oriented Programming techniques, and clear coding style. The three fundamentals of OOP are covered data abstraction and encapsulation, inheritance, and polymorphism with emphasis on the last two (inheritance and polymorphism). Data structures including Linked Lists, Queues, Stacks and Trees will be examined along with some common search and sort algorithms. Basic Java is explored including interfaces, exception handling, and user interfaces. Features of the latest Java Development Kit will also be examined. Several Java packages are examined including java.io, java.awt, swing, and others. Prerequisites: COMP 1510");
                break;
            case "COMP 2714":
                text1.append("Relational Database Systems");
                text2.append("\tThis course covers relational database technology, including basic concepts, relational algebra, enhanced entity-relationship data modeling, functional dependencies and normalization, design methodology, SQL query language (DDL and DML), views, access control and transaction management. Students design and implement a database application using RDBMS. Also covers some current database trends such as data warehousing and OLAP, and use of databases through web technology.");
                break;
            case "COMP 2721":
                text1.append("Computer Organization/Architecture");
                text2.append("\tComputer organization is a fundamental topic for computer science students and for any future programmers. The course gives a good understanding of the computer hardware and how software is built on a specific hardware. The computer is regarded as a hierarchy of levels, each one performing some well-defined functions from the device level (hardware) to the problem-oriented language level. Each level is discussed and analyzed in detail. Prerequisites: COMP 1113 and COMP 1510");
                break;
            case "COMP 2910":
                text1.append("Projects* **");
                text2.append("\tStudents work in teams of four or five to complete an internal software development or IT project. Teams will proceed through the majority of the software development lifecycle, from requirements gathering to specification to implementation and delivery. The course is focused on developing teamwork and project management skills as well as an understanding of the development lifecycle. The project will simultaneously allow students to apply their previously-developed technical knowledge. Prerequisites: COMP 1510");
                break;
            case "COMP 3512":
                text1.append("Object Oriented Programming in C++");
                text2.append("\tThis course covers a paradigm in programming which deals with classes and objects. A number of features of the C++ language will be covered including inheritance, polymorphism, templates, exceptions and the Standard Template Library. Prerequisites: COMP 2510");
                break;
            case "COMP 3711":
                text1.append("Object Oriented Analysis and Design");
                text2.append("\tThis course introduces the students to the concepts of object oriented analysis and design. They will get the knowledge and the hands on experience to implement all the steps of an agile, iterative and incremental analysis and design process, from the planning and project management to the release and QA of the code. Use case documents are written to capture and analyze the requirements. The students will gain proficiency using Rational Rose and UML (Unified Modeling Language) to visually document the process. Design patterns, best practices, code generation and reverse engineering are used as a base for design and implementation. The course also introduces quality assurance concepts and the students will use automated software testing to create and execute test plans and test scripts. NOTE: In Part-time Studies, this course was replaced by COMP 3831. Prerequisites: COMP 2526");
                break;
            case "COMP 3721":
                text1.append("Introduction to Data Communications");
                text2.append("\tThis course covers the basic concepts and terminologies related to data communications, networking and network topologies. Students will learn about the TCP/IP protocol suite and the principles of protocols at the physical, data link, network and transport layers, the characteristics of transmission media, analog/digital transmission, multiplexing/switching techniques, basic error detection and correction, elementary data link protocols, flow control and an introduction to routing and congestion control issues. Multiple access protocols, the UDP and TCP protocols, networking and internetworking devices, LANs and WANs will also be discussed. Prerequisites: COMP 2721");
                break;
            case "COMP 3760":
                text1.append("Algorithm Analysis and Design");
                text2.append("\tIn this course, students will develop their ability to analyze and design computer algorithms. In particular, students will analyze the time and space complexity of programs, solve difficult programming problems using algorithmic techniques, and prove that their solution is correct. The emphasis will be on developing the practical skills of analysis and design. Topics covered may vary each term. Prerequisites: COMP 2121 and COMP 2526");
                break;
            case "COMP 3900":
                text1.append("Computer Projects Practicum 1");
                text2.append("\tAllows students to work on projects within guidelines specified by faculty. The projects are drawn from a variety of sources, especially from industrial situations, and may require extensive contact with the business community. Students work in teams and seek advice from a faculty member acting as their project supervisor. Prerequisites: Completion of first year CST and Admission into a CST Option.");
                break;
            case "COMP 3717":
                text1.append("Mobile Application Development with Android");
                text2.append("\tThis hands-on course introduces Android Application Development on mobile and tablet platforms to experienced Java Application Developers. Continuing on from COMP 2526, the Java programming language is used to develop, debug and deploy Android applications. Labs and assignments explore and use the Android SDK tools - avd, adb, ddms, etc., to configure and troubleshoot Android applications on the emulator(s). Topics include: Designing user interfaces with Views, Fragments, Layouts and Activities. Students learn to manage Android Resources, work with Manifest files, Persist data using SQLite DB, Create Services and Content Providers. Other topics of discussion include Location Based Services, Telephony, Multimedia APIs and Cloud to Device Messaging. By the end of this course successful participants will complete a final project which includes building, packaging and publishing an Android application for a mobile device or tablet. Prerequisites: COMP 2526");
                break;
            case "COMP 3975":
                text1.append("Server-side Web Scripting with PHP");
                text2.append("\tThis hands-on course introduces server-side scripting using PHP (PHP: Hypertext Preprocessor) an open-source, platform-independent, server-side web scripting language. Topics include: PHP theory and syntax, textfile manipulation, cookies, regular expressions, sessions, graphics, and database interactions. By the end of this course, students have learned the major functions of PHP server-side scripting and how to freely obtain a wide variety of open-source software tools and code libraries. Students also learn how to write reusable classes and object-oriented scripts. Students will use popular PHP frameworks such as Laravel and/or Yii in addition to unit-testing frameworks such as SimpleTest or PHPUnit. Students also learn how to create secure sessions, apply hashing and encryption techniques, and use the PHP command line interface. Prerequisites: COMP 1536 and COMP 2714");
                break;
            case "BLAW 3600":
                text1.append("Computers and the Law");
                text2.append("\tThe course offers basic knowledge of Canadian law with emphasis on how the law affects those in the computer industry. The course includes the law of tort, contracts, sale of goods, secured transactions, employment, intellectual property, partnerships and companies.");
                break;
            case "COMP 4100":
                text1.append("Career Preparation* **");
                text2.append("\tStudents will explore employment options in information technology and develop a skill set to prepare for success in their career. Students will learn to make a positive first impression, will develop presentation and self-marketing skills and explore team building. Interview, job search and resume writing skills will also be developed. Traditional, contract, freelance work and self-employment will be discussed.");
                break;
            case "COMP 4735":
                text1.append("Operating Systems");
                text2.append("\tThis course is focused on basic concepts in operating systems: structure, operating systems services, how these services are used and implemented, processor management, processes and threads, kernel architecture, inter-process communication, synchronization and mutual exclusion, deadlock and starvation, memory organization and management, virtual memory, processor scheduling, input/output management, disk scheduling, and file management. To illustrate the concepts, each topic includes examples of real life design choices used in modern operating systems (e.g., UNIX, Linux, Windows, and Android). Prerequisites: COMP 2721 and COMP 3512");
                break;
            case "COMP 4900":
                text1.append("Computer Projects Practicum 2*");
                text2.append("\tAllows students to work on projects within guidelines specified by faculty. The projects are drawn from a variety of sources, especially from industrial situations, and may require extensive contact with the business community. Students work in teams and seek advice from a faculty member acting as their project supervisor. Prerequisites: Completion of first year CST and Admission into a CST Option.");
                break;
            case "COMP 4560":
                text1.append("Computer Graphics for Computer Systems Technology");
                text2.append("\tCovers basic operations in two-and three-dimensions, including the mathematical representation of basic geometric objects, definition of coordinate systems and mappings, transformations, simple animation, and viewing. Transformations and projections are presented in a matrix formulation. The course also introduces lighting models, colour models and methods for constructing curves. Prerequisites: (COMP 2510 or COMP 2526) and COMP 1113");
                break;
            case "COMP 4711":
                text1.append("Introduction to Internet Software Development");
                text2.append("\tThis course provides the students with an opportunity to develop a software application that works across the internet. An overview of various internet software development technologies is provided. Students will learn how to build a web application using a modern webapp MVC framework and Apache server technology; and how to use XML for data representation, structure and transport. Prerequisites: COMP 2510 or COMP 2526");
                break;
            case "COMP 4976":
                text1.append("Web Application with ASP.NET");
                text2.append("\tThis hands-on course is designed for those who are already familiar with an Object Oriented programming language such as Java or C++. Students are introduced to web application development using C# and the Microsoft ASP.NET Framework. The course provides an overview of the Microsoft .NET framework as well as an introduction to the C# programming language. Topics include: ASP.NET Server controls, Data Binding, LINQ, Entity Framework, Code First development, Web API, Odata, ASP.NET MVC, SignalR, ASP.NET State management, Data Validation, and Single Page Applications Prerequisites: COMP 1536 and COMP 2714");
                break;
            case "COMP 4977":
                text1.append("iOS Application Development for iPhone and iPad");
                text2.append("\tThis hands-on course is designed for students who are able to code medium sized applications in an Object Oriented language. Students design and develop apps to Apple standards for the latest iOS platforms. Participants will be required to specify, design and build a significant iOS application for iPhone or iPad. The course starts with an intensive overview of the Objective-c language, followed by an introduction to the iOS platform. Special attention is given to the user interface components of current popular iPhone and iPad applications and games. Topics include Objective-c, Xcode, Cocoa Touch API, memory management, user input and gesture recognition, data persistence including Core Data, SQLite, NSUserDefaults and Plists. Prerequisites: COMP 3512 and COMP 3717");
                break;
            default:
                text1.append("N/A");
                text2.append("N/A");
        }
    }
}
