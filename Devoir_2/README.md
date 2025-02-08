
# Projet Servlet Java avec Apache Tomcat 🚀

## 🔧 Technologies Utilisées
- **Java** 🧑‍💻
- **Apache Tomcat 9.0** 🌐
- **HTML** 📄

---

## 📋 Instructions Détaillées

### 1. ➕ Télécharger et Installer Apache Tomcat
- Téléchargez la version 9.x depuis [Apache Tomcat](https://tomcat.apache.org/).
- Extrayez l’archive téléchargée.
- Démarrez Tomcat avec les commandes suivantes :

```bash
./bin/startup.sh  # Linux/MacOS
.in\startup.bat # Windows
```
- Accédez à [http://localhost:8080](http://localhost:8080) pour vérifier que Tomcat fonctionne.

---

### 2. 🔧 Implémenter la Servlet
Créez une classe `BonjourServlet.java` :

```java
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bonjour")
public class BonjourServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Bonjour, votre nom est John Doe!</h1>");
    }
}
```

---

### 3. 🔧 Compiler la Servlet
Utilisez `javac` pour compiler le fichier Servlet. Assurez-vous que `javax.servlet-api.jar` est dans le classpath.

**Commande pour compiler :**
```bash
javac -cp /path/to/tomcat/lib/servlet-api.jar BonjourServlet.java
```
Cela génère un fichier `BonjourServlet.class`.

---


### 5. 🔧 Créer une Page HTML

Lancez Tomcat et accédez à la page [http://localhost:8080/BonjourApp/index.html](http://localhost:8080/BonjourApp/index.html).

---


## ⚙️ Commandes Utilisées
```bash
wget https://tomcat.apache.org/...
javac -cp servlet-api.jar BonjourServlet.java

```
