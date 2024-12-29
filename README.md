# User Authentication System 🔐

This project implements a basic user authentication system using JSP, Servlets, and MySQL. It allows users to register, log in, and view a successful login page. 🖥️

## Features 🌟

- **Home Page**: A welcoming page with links to the Login and Register pages. 🏠
- **Login Page**: Allows users to input their username and password to log in. 🔑
- **Register Page**: Allows users to create an account by entering a username and password. ✍️
- **Login Success Page**: Displays a success message after a successful login, along with a logout option. 🎉
- **Database Connection**: The system interacts with a MySQL database to authenticate users and store new registrations. 🗄️

## Technologies Used ⚙️

- **JSP (JavaServer Pages)**: Used for creating dynamic web pages. 📄
- **Servlets**: Used to handle the login and registration requests. 🖧
- **MySQL**: Used for storing user information like username and password. 💾
- **CSS**: For styling the web pages, including responsive design and hover effects. 🎨
- **Java**: Backend logic for connecting to the database and processing user input. ☕️

## Setup Instructions 🛠️

1. **Clone the repository**: Download the project files. 📥
2. **Set up MySQL Database**: 
    - Create a MySQL database (e.g., `userdb_new`). 🗃️
    - Create a `users` table with `username` and `password` columns. 🏗️
3. **Configure Database Credentials**: Edit the `DBConnection.java` file to match your database credentials (username, password, and database URL). 🔧
4. **Run the Project**: Deploy the project to a servlet container (e.g., Apache Tomcat). 🚀
5. **Access the Application**: Open your browser and navigate to the home page. 🌐

## Screenshots 📸

- **Home Page**: The main entry point of the application. 🏠
- **Login Page**: Where users can enter their credentials to log in. 🔑
- **Register Page**: Allows users to create a new account. ✍️
- **Login Success Page**: Displays after successful login. 🎉

## Future Improvements 🔮

- Add password encryption (e.g., using BCrypt) for secure password storage. 🔒
- Implement session management to keep users logged in. 🔑
- Validate user inputs and handle errors more gracefully. ⚠️

## License 📜

This project is open-source and available under the MIT License. 🖊️
