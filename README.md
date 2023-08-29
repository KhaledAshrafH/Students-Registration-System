# Student Registration System

It's a subsystem that facilitates the process of registering student data. It includes two components: the main menu component for individual student registration and the batch data component for bulk student registration.

## Main Menu Component

The main menu component allows users to register individual student data to the system. It provides a simple menu interface with the following options:

1. Add student data
2. Add batch students data

### Adding Individual Student Data

To add an individual student's data, follow these steps:

1. Run the component.
2. The main menu will be displayed. Enter `1`.
3. Enter the student's data in the following order: Name, ID, Courses. For example:

    ```
    Ahmed
    1
    AI, Math
    ```

## Batch Data Component

The batch data component enables users to insert multiple student records into the system at once. It allows the selection of eligible files containing bulk student data.

### Adding Batch Students Data

To add batch students data to the system, follow these steps:

1. Run the component.
2. The main menu will be displayed. Enter `2`.
3. The eligible files will be shown, which are the files containing the phrase "verified" in their names.
4. Select the desired file by entering its name. For example:

    ```
    1_verified.csv
    ```

#### Assumptions

- The path `/app/data/batch/` is correctly mounted to a specific folder.
- The eligible files contain student data in a specific format, where each line represents one student's data separated by semicolons, and courses are separated by commas.

## CI/CD Pipeline

To ensure the successful building and deployment of the relevant components, a CI/CD pipeline is implemented for the software. The pipeline consists of continuous integration (CI) and continuous deployment (CD) processes for each repository.

### CI Process

The CI process ensures that each repository's component is built successfully. It involves the following steps:

1. Set up a CI configuration in the repository to trigger a build process on each commit.
2. Configure the build process to compile the source code and run any necessary tests.
3. If the build process succeeds, proceed to the CD process.

### CD Process

The CD process pushes the image for the relevant component to Docker Hub. It includes the following steps:

1. Set up a CD configuration in the repository to trigger the deployment process upon a successful build.
2. Build a Docker image for the component, using the provided Dockerfile.
3. Tag the image with the appropriate version, such as `latest`.
4. Push the image to Docker Hub, using the specified repository and version.

## Docker Compose Configuration

The provided Docker Compose file allows for the deployment of the subsystem components. It defines two services: `student-statistics-process` and `registration-process`.

### `student-statistics-process`

- Builds the image from the source code.
- Maps the local folder `/app/data/batch` to the corresponding folder in the Docker container.
- Exposes port `80` for accessing the component.

### `registration-process`

- Builds the image from the source code.
- Maps the local folder `/app/data/batch` to the corresponding folder in the Docker container.
- Exposes port `81` for accessing the component.

## Running the Docker Compose File

To run the Docker Compose file and deploy the subsystem, follow these steps:

1. Download the Docker Compose file from the repository.
2. Update the file with the appropriate local paths as indicated.
3. Open a terminal or PowerShell in the directory where the Docker Compose file is located.
4. Run the following command to start the containers:

    ```
    docker-compose up -d
    ```

5. Open another terminal to execute the other component if needed.
6. To execute commands inside a container, run the following command in the terminal:

    ```
    docker exec -it component-name bash
    ```

7. Run the component's main class or entry point inside the container. For example, for the main class `Main`:

    ```
    java Main
    ```

By following these steps, you can deploy and utilize the Student Registration Subsystem, incorporating CI/CD practices and Docker containerization concepts.


## Contributing

Contributions to the system are welcome. If you would like to contribute, please follow these steps:

1. Fork the repository on GitHub.

2. Create a new branch for your feature or bug fix.

3. Make the necessary changes in your branch.

4. Test your changes thoroughly.

5. Submit a pull request to the main repository.

6. Provide a clear description of your changes and the problem they solve.

7. Be responsive to any feedback or questions regarding your pull request.

## Team

This System was created by a team of four computer science students at Faculty of Computers and Artificial Intelligence Cairo University. The team members are:

- [Khaled Ashraf Hanafy Mahmoud - 20190186](https://github.com/KhaledAshrafH).
- [Samah Moustafa Hussien Mahmoud - 20190248](https://github.com/Samah-20190248).
- [Ayatullah Esam El-din Mohamed - 20190123](https://github.com/oshaesam1).
- [Kareem Galal Zaki Sayed - 20190383](#).


## Acknowledgment

This System is based on Cloud Computing course at Faculty of Computers and Artificial Intelligence Cairo University. We would like to thank prof. Fatma Omara for his guidance and support throughout this course.

## License

The System is released under the [MIT License](LICENSE.md). You are free to use, modify, and distribute the toolbox in accordance with the terms of this license.
