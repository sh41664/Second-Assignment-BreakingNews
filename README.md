# Second Assignment: Breaking News 📰
**Welcome to Your Second Assignment in the Advanced Programming Course!**

In this assignment, you will develop a Java application that functions as a simple news aggregator. Your task is to fetch real-time news data from **"News API"** and present the latest headlines in an organized manner. This project will help you gain hands-on experience with API integration and parsing json.
## Objectives ✏️
By completing this assignment, you will:

- Reinforce your understanding of basic **Object-Oriented Programming (OOP)** principles such as designing classes, using constructor, encapsulation and apply them effectively.
- Gain familiarity with the process of issuing **HTTP** requests to APIs and parsing **JSON** data in Java.
- Learn to manage and track changes in your project using **Git**.
## Prerequisites ✅
Before getting started, ensure you have the following installed:

- Git
- Java 23
- Gradle as a package manager

## Tasks 📝
1. Fork this repository and clone it to your local machine.
2. Create a new branch named development and switch to it. All development should be done in this branch.
3. We are getting our information from https://NewsAPI.org. You should create an account in the site to get a APIKEY and pass it to the constructor of **Infrastructure** class.   
4. Complete the **Infrastructure** class methods as told in the code comments.
5. Design the **News** class with attributes "title", "description", "sourceName", "author", "url" and "publishedAt" and the method "displayNews" to display all information of that news.
6. Implement a menu in your Main class. This menu should contain the titles of news. The user should be able to choose the desired article to read more about it.
7. Add error handling to handle cases where the API returns an error or the information is not found.
8. Write a comprehensive report detailing the tasks you have completed and any challenges you encountered. **Your report should be written in Markdown format.** Write your report in the provided Report.md file located in the repository, which serves as a simple template for structuring your report.
9. Commit your changes and push them to your GitHub repository.
10. Submit a pull request from your develop branch to your main branch. Your mentor will review the pull request, score your assignment and merge it upon approval.
## Evaluation 📃
Your submission will be evaluated based on the following criteria:

- Your code should pass all the tests provided in the test directory.
- Error-free compilation and execution of your code. 
- Accurate retrieval and presentation of **News** data through the methods written.
- Clear code structure, readability, thorough commenting, and adherence to clean code principles.


## Bonus Tasks ✒️
For additional challenges and learning opportunities, consider the following bonus objectives:

- **Save Favorite Articles:** Allow users to save their favorite news articles to a file for future reference. Your app should be able to read those from file and display it. 
- **Change the publish date format:** Convert the news publication dates from the Gregorian calendar to the Solar Hijri calendar.
- **Create a GUI:** Provide a simple GUI (Graphical User Interface) for your project. The recommended library to do so is JavaFX. JavaFX empowers developers to create dynamic and engaging user interfaces for their Java applications, offering a modern and versatile platform for building cross-platform desktop, web, and mobile applications

## Submission ⌛
The deadline for submitting your code is Esfand 22nd.

## Resources 📚
For assistance with this assignment, you may refer to the following resources:

🔗 [About Gson](https://www.javadoc.io/doc/com.google.code.gson/gson/2.8.0/com/google/gson/Gson.html)

🔗 [Getting Json Data From A RESTFUL API Using Java](https://medium.com/swlh/getting-json-data-from-a-restful-api-using-java-b327aafb3751)

🔗 [How to Write a Good README File for Your GitHub Project](https://www.freecodecamp.org/news/how-to-write-a-good-readme-file/)

🔗 [A Simple Readme Template](https://gist.github.com/DomPizzie/7a5ff55ffa9081f2de27c315f5018afc)

🔗 [Markdown Cheet Sheet](https://www.freecodecamp.org/news/markdown-cheat-sheet/)

🔗 [Getting Started With Javafx](https://openjfx.io/openjfx-docs/)

🔗 [JavaFX Tutorials by BroCode](https://www.youtube.com/playlist?list=PLZPZq0r_RZOM-8vJA3NQFZB7JroDcMwev)
