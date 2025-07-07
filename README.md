# Marketplace System

## Overview
The Marketplace System is a comprehensive application designed to manage marketplace operations, seller services, network communications, and system monitoring. It implements the SAGA pattern for transaction management and provides a robust framework for handling orders, inventory, and system health.

## Project Structure
The project is organized into several packages, each serving a specific purpose:

- **marketplace**: Contains the central logic for the marketplace system, including transaction management and order processing.
- **seller**: Manages seller-related operations and product inventory.
- **network**: Handles network communications, failure simulations, and system health checks.
- **monitoring**: Provides tools for monitoring system performance and conducting tests.
- **common**: Contains shared models and constants used throughout the application.
- **test**: Includes various test cases for different components of the system.

## Setup Instructions
1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/marketplace-system.git
   cd marketplace-system
   ```

2. **Build the Project**
   Ensure you have Java Development Kit (JDK) installed. Use a build tool like Maven or Gradle to build the project.

3. **Run the Application**
   Execute the main class from the `marketplace` package to start the application.

## Usage Guidelines
- **Marketplace Operations**: Use the `Marketplace` class to manage overall operations and interactions within the marketplace.
- **Seller Services**: Utilize the `Seller` class for managing seller-related tasks and inventory.
- **Network Management**: The `NetworkManager` class facilitates communication between services.
- **Monitoring**: Use the `WebMonitoringServer` to access the HTTP dashboard for real-time system metrics.

## Testing
The project includes a comprehensive suite of tests located in the `test/java` directory. Run the tests to ensure the integrity and performance of the system.

## Contributing
Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.