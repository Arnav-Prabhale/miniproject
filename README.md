# Proctored Exam Desktop Application![image](https://github.com/Arnav-Prabhale/miniproject/assets/92647170/9488e83a-72d3-496a-8d1d-7a283376e66a)


classic online exam system

Designed, developed, implemented and tested a complete "Online Exam Application" utilizing Java, MongoDB and MySQL databases to store personal details, questions and also responses of the user. 
Created a automatic photo-capturing system to supervise the candidate appearing for test and store its images in MySQL database. 
Includes features like automatic timer, advanced page navigation systems, user-friendly design and user accessibility. 

# Student Section
1) Login Page 
  Where it asks for Roll Number and Passwords and checks in database for a match.
  If matches checkbox pops up for confirmation else displays invalid details. If the Roll Number had already appeared for exam it asks to attempt again.
![Login Page 1](https://user-images.githubusercontent.com/92647170/145339918-4c4bacca-4a6d-4fac-bf41-67acd98a743e.jpg)
![Login Page 2](https://user-images.githubusercontent.com/92647170/145339927-ba40fdff-56c7-4eeb-9db5-80677823547d.jpg)

2) Image Verification
   After successfully login, the image verification page pops where the student has to capture his/her image and sumbit it.
   Captured image is stored in the MySQL database.
   Student can recapture the image if he feels the captured image is not proper, and then submit it and move forward for the exam.
![Image Verification 1](https://user-images.githubusercontent.com/92647170/145340339-cc3a2ed4-8c33-423e-9d71-dbe108f0f146.jpg)
![Image Verification 2](https://user-images.githubusercontent.com/92647170/145340348-232b6667-7e4d-4287-a0de-c7dfefd72fb5.jpg)

3) Exam Start's - Question Page
  The Exam start's; question and it's options are fetched from the MongoDB database.
  The StopWatch starts at the topmost corner of the window which is bold and easily viewable. 
  To its right webcam starts and auto capturing of the image of the student starts. The images are captured and they are stored in MySQL Database. 
  The Roll Number and Name of the candidate is fetched from database and displayed on the screen.
  ![question page 1](https://user-images.githubusercontent.com/92647170/145342293-04f54ebd-ea5e-4549-bee5-82a43598651f.jpg)
  
  Navigation System:- 
    There is advanced navigation to change the question and display questions according to our wish. 
    There is a section which has all the buttons named as question number when clicked takes you to that question. 
    With this there are buttons for going to next question, previous question and clear the option ticked. 
    Message is displayed for successful attempting and marking of option. 
    Also for easy accessibility the colour of attempted question turns green and the blue border appears on the button of present question.
    ![question page 2](https://user-images.githubusercontent.com/92647170/145342311-4245a9ad-0748-459f-8950-8155383624b5.jpg)
    
  After completion of exam; click on submit button at right top and a confirmation box will pop up,
  once you confirm your test will end and your responses will be stored on database. 
  If the time of the exam ends then the test is auto-submitted and you are directed towards the successful attempt page.
  ![question page 3](https://user-images.githubusercontent.com/92647170/145342771-0b9d0dbd-1149-47d0-8da6-07f06b7572f5.jpg)
  
4) Summary page of Exam
  Now after attempting exam you arrive at summary section here you see summary of your exam.
  Total questions, attempted questions, time and date of your test submission and also your Roll Number and name.
  Also for easy look over attempted questions are displayed in green colour on the question Sidebar.
  ![summary page](https://user-images.githubusercontent.com/92647170/145343715-e45df6bb-4471-404c-b7c4-de2aeadd5518.jpg)
  Buttons are provided to either exit the system or navigate to the login page.

# Teachers Section
1) Marks Obtained By Student
  Teacher on this tab can see the marks of students who have appeared for the test by clicking on the check Marks button.
  ![check marks](https://user-images.githubusercontent.com/92647170/145344203-0524cc1e-5eb6-4d13-aca5-176bb0d8eb4a.jpg)

2) Attendance
  Teacher can see the attendance of the students as present or absent for the test.
  ![attendance](https://user-images.githubusercontent.com/92647170/145344310-fe9e20d5-d984-41af-988a-a447412afe7e.jpg)

3) Add Student
  Teacher can add a student in the list of students attempting the text and set his basic credentials.
  ![add student](https://user-images.githubusercontent.com/92647170/145344405-074e3eb0-0e7b-432d-ad65-485097f68599.jpg)

# Hope You Like This An Advanced and Feature Loaded Online Exam Application!!!
