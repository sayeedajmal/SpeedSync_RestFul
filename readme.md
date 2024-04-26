# SpeedSync RESTful API 🚗💨

The SpeedSync RESTful API serves as the backend server for handling vehicle data, storing it in the database, and managing various functionalities related to speed tracking and monitoring. This API is designed to facilitate communication between the vehicle dashboard software and the server, ensuring seamless data transmission and processing.

[![Java CI with Maven](https://github.com/sayeedajmal/SpeedSync_RestFul-API/actions/workflows/maven.yml/badge.svg)](https://github.com/sayeedajmal/SpeedSync_RestFul-API/actions/workflows/maven.yml)

## Features 🛠️

- Receives real-time data from vehicle dashboards, including speed and location information.
- Stores vehicle data securely in the database.
- Implements functionality for detecting speed limit violations and generating alerts.
- Provides endpoints for integrating with frontend applications.
- Ensures secure communication using SSL/TLS encryption.
- Handles custom exceptions and error responses effectively for robust error handling.

## Installation and Setup 🚀

1. Clone the repository:

   ```bash
   git clone https://github.com/sayeedajmal/SpeedSync_RestFul-API.git
   ```

2. Configure environment variables:

   - Edit the configuration files in the project to set up database connections, SSL certificate paths, and other necessary parameters.

3. Import the project into your preferred Java IDE (e.g., IntelliJ IDEA, VsCode).

4. Set up SSL certificate:

   - Ensure that the SSL certificate is correctly configured and placed in the designated directory for secure communication.

5. Make Sure to Use the Environment Variables

   - (Check application.properties) and create the Environment variables like URI and DBName

6. Run the application:

   - Build and run the project using your IDE or deploy it to a web server.

## Endpoints 📡

- **POST** `/api/v1/vehicles/challan`: Endpoint for receiving vehicle data.

  - **Fields**:
    - `carNumber`: String - Vehicle registration number.
    - `vehicleDetails`: Map<String, Object> - Additional details about the vehicle.
    - `location`: Location - Current location of the vehicle.
    - `currentSpeed`: Integer - Current speed of the vehicle.
    - `highway`: String - Name or identifier of the highway.
    - `timestamp`: Long - Timestamp indicating when the data was recorded.

## Custom Exception Handling 🚨

SpeedSync API implements custom exception handling to ensure robust error management and graceful handling of unexpected situations. Custom exceptions are defined to provide meaningful error messages and appropriate HTTP status codes for different scenarios, enhancing the overall reliability of the system.

## Contributing 🤝

Contributions to the SpeedSync RESTful API project are welcome! If you have any ideas for improvements, bug fixes, or new features, feel free to submit a pull request or open an issue on GitHub.

## License 📝

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact 📧

For any inquiries or feedback regarding the SpeedSync RESTful API, please contact [sayeedajmala06@gmail.com](mailto:sayeedajmala06@gmail.com).

---

**Note:** This API is only for Simulation (We are workig for Realtime Restful API).
