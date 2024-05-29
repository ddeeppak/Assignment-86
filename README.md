# Assignment-86
# Selenium Web Testing Project

## Introduction
This project demonstrates how to set up and run a Selenium WebDriver test using Java.

## Requirements
- Java Development Kit (JDK)
- Apache NetBeans IDE or any other Java IDE
- Selenium Java Client Driver
- ChromeDriver (or WebDriver for another browser)

## Setup Instructions

### 1. Download Selenium JAR Files
Download the Selenium Java Client Driver from the [Selenium Downloads](https://www.selenium.dev/downloads/) page.

### 2. Setup Project in Apache NetBeans

1. Open Apache NetBeans IDE.
2. Create a new Java project:
   - `File -> New Project -> Java -> Java Application -> Next`
   - Name your project (e.g., `WebTesting`) -> `Finish`

### 3. Add Selenium Libraries

1. Right-click on your project in the Projects pane.
2. Select `Properties -> Libraries -> Add JAR/Folder`.
3. Add the Selenium JAR files you downloaded.

### 4. Create and Run the Test Script

1. Create a new Java class:
   - Right-click `Source Packages` -> `New -> Java Class`
   - Name it `WebTesting` -> `Finish`

2. Paste your Selenium test code into `WebTesting.java`.

3. Ensure the ChromeDriver path is set correctly in your code.

4. Run the program:
   - Right-click `WebTesting.java` -> `Run File`

## Running the Test
To run the test, ensure all dependencies are set up and execute the `WebTesting.java` file. The WebDriver will open the specified URL in the browser.

## License
This project is licensed under the MIT License.
