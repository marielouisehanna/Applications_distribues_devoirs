# 🚀 Servlet Project with Apache Tomcat 

## 📝 Project Description  
This project demonstrates a simple Servlet deployed on Apache Tomcat, which displays the message **"Bonjour John Doe"**. The steps below explain how to set up, deploy, and test the Servlet.

## 🛠️ Requirements
- Java Development Kit (JDK) 11+
- Apache Tomcat 10.0.x
- Web Browser (Chrome, Firefox, etc.)
- Git

## 📚 Steps to Reproduce
1. **Download and Install Tomcat**

2. **Write and Compile the Servlet**
    ```bash
    javac -d WEB-INF HelloServlet.java
    ```

3. **Deploy the Servlet**
    ```bash
    cp -r MyServletProject /usr/local/tomcat/webapps/
    catalina.sh stop
    catalina.sh start
    ```

4. **Test the Servlet**
    Visit: `http://localhost:8080/MyServletProject/hello`

5. **Create and Test an HTML Page**
    Navigate to `http://localhost:8080/MyServletProject/index.html`.

6. **Push to GitHub**
    ```bash
    git init
    git add .
    git commit -m "Initial servlet project with Tomcat"
    git remote add origin https://github.com/YOUR_USERNAME/MyServletProject.git
    git push -u origin master
    ```

## 📎 Additional Notes
- Ensure Tomcat is properly configured.
- Check the firewall settings if the browser cannot connect to `localhost`.

---
