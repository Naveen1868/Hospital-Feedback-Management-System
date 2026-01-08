# Hospital Feedback Management System

A web-based application developed using **Java, HTML, CSS, and MySQL** that allows patients to submit feedback about hospital services.  
The system securely stores feedback data in a database and helps hospitals analyze patient experience.

## Technologies Used

- **Frontend:** HTML, CSS
- **Backend:** Java (Servlets, JDBC)
- **Database:** MySQL
- **Build Tool:** Maven
- **Server:** Apache Tomcat
- **IDE:** Eclipse

## Features

- Patient feedback submission form
- Multiple department selection
- Ratings for:
  - Staff Behaviour
  - Cleanliness
  - Overall Experience
- Secure database insertion using PreparedStatement
- Responsive and clean UI design
- MVC-based project structure

## Features

HospitalFeedbackForm/
├── pom.xml
├── src/
│ └── main/
│ ├── java/
│ │ ├── hospital_Controller/
│ │ │ └── FeedbackServlet.java
│ │ ├── hospital_DAO/
│ │ │ ├── FeedbackDAOImp1.java
│ │ │ └── FeedbackInstance.java
│ │ └── hospital_Entity/
│ │ └── FeedbackEntity.java
│ └── webapp/
│ ├── index.html
│ ├── thankYou.html
├── database/
│ └── hospital_feed.sql
├── README.md

## Database Details

- Database Name: `hospital_feed`
- Table Name: `feed`

## How to Run the Project

1. Clone or download the project from GitHub
2. Import the project into **Eclipse** as a **Maven Project**
3. Configure **Apache Tomcat** in Eclipse
4. Open MySQL and execute the SQL script
5. Update database credentials in `FeedbackInstance.java`
6. Run the project on Tomcat server
