# 📱 MAD Practical 5 — Android Application

<p align="center">
  <b>Modern Application Development (MAD)</b><br>
  Android Application Development using Kotlin and Jetpack Compose
</p>

---

## 📌 Table of Contents

- [About the Project](#-about-the-project)
- [Project Objectives](#-project-objectives)
- [Project Overview](#-project-overview)
- [Features](#-features)
- [Technology Stack](#-technology-stack)
- [Application Architecture](#-application-architecture)
- [Project Structure](#-project-structure)
- [How the Application Works](#-how-the-application-works)
- [Installation and Setup](#-installation-and-setup)
- [How to Run the Project](#-how-to-run-the-project)
- [Testing](#-testing)
- [Learning Outcomes](#-learning-outcomes)
- [Future Enhancements](#-future-enhancements)
- [Author](#-author)

---

## 📖 About the Project

**MAD Practical 5** is an Android application developed as part of the Modern Application Development practical course.

The project is developed using **Kotlin** and **Jetpack Compose**, Google's modern toolkit for building native Android user interfaces.

The application uses a component-based UI structure, allowing interface elements such as text, buttons, checkboxes, layouts, and interactive controls to be created using Kotlin code instead of traditional XML layout files.

The main activity initializes the application, applies the custom application theme, and displays the user interface inside a Material Design scaffold.

The source code also includes reusable composable functions, state management, a button counter example, and Toast messages for displaying short feedback to the user.

**Project Repository:** [24012011230_MAD_Practical-5](https://github.com/khaneshahimadri/24012011230_MAD_Practical-5)

## 🎯 Project Objectives

The main objectives of this practical are:

1. To understand the fundamentals of Android application development.
2. To learn Kotlin programming for Android.
3. To create user interfaces using Jetpack Compose.
4. To understand composable functions and reusable UI components.
5. To implement interactive buttons and checkboxes.
6. To manage UI state using Compose state management.
7. To display short messages using Android Toast notifications.
8. To understand the role of activities and the Android application lifecycle.
9. To apply Material Design principles to Android applications.
10. To build and run an Android application using Android Studio and Gradle.

## 📝 Project Overview

This project demonstrates important concepts used in modern Android application development.

### 1. Main Activity

The `MainActivity` class acts as the application's entry point.

Its responsibilities include:

- Initializing the activity through `onCreate()`.
- Enabling edge-to-edge display.
- Setting up the Compose content.
- Applying the custom application theme.
- Creating the main screen using `Scaffold`.
- Displaying the `LoginActivityUI` composable.
- Providing Toast messages through a callback.

### 2. Jetpack Compose UI

Jetpack Compose is used to build the application interface directly in Kotlin.

The source code imports and uses Compose components such as:

- `Column` for vertical arrangements.
- `Row` for horizontal arrangements.
- `Box` for positioning and containing elements.
- `Text` for displaying text.
- `Button` for user interaction.
- `Checkbox` for selectable options.
- `Spacer` for adding space.
- `Modifier` for controlling layout, appearance, and behavior.

These components help create flexible and reusable Android interfaces.

### 3. State Management

The application includes a button demonstration that uses `remember` and `mutableStateOf` to maintain a counter value.

When the button is clicked, the counter increases by one. Compose updates the displayed value when the state changes.

This demonstrates how interactive Android interfaces can respond to user actions.

### 4. Toast Messages

The application uses Android's `Toast` functionality to display short messages.

A callback passes the message from the composable interface to the activity, where the Toast is displayed.

This demonstrates communication between UI components and Android activity code.

### 5. Material Design

The application uses Material 3 components and a custom theme to maintain a consistent visual appearance.

The `Scaffold` composable provides a basic structure for the screen.

## ✨ Features

The source code demonstrates the following features:

| Feature | Description |
|---|---|
| Main Activity | Entry point of the Android application. |
| Compose UI | Builds the interface using Kotlin functions. |
| Material 3 Theme | Applies a consistent application theme. |
| Login UI Component | Displays the interface through `LoginActivityUI`. |
| Interactive Buttons | Supports button-click actions. |
| Checkbox Component | Provides selectable UI options. |
| State Management | Maintains and updates UI state. |
| Counter Demonstration | Increases a displayed number when clicked. |
| Toast Messages | Displays short messages to the user. |
| Preview Support | Helps preview composable functions in Android Studio. |
| Edge-to-Edge Display | Enables content to extend into system-bar areas. |

**Note:** The login interface is a UI demonstration. Database-backed authentication, password verification, and user registration should not be considered implemented unless they are added separately.

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Kotlin | Primary programming language. |
| Android Studio | IDE used to develop and run the application. |
| Jetpack Compose | Declarative UI development toolkit. |
| Material 3 | UI components and visual design. |
| Android SDK | Android development and application runtime. |
| Gradle Kotlin DSL | Project build configuration. |
| AndroidX Activity Compose | Integration of Compose with Android activities. |
| AndroidX Core KTX | Kotlin extensions for Android APIs. |
| Lifecycle Runtime KTX | Lifecycle-aware Android functionality. |
| Compose Navigation | Navigation support for Compose applications. |
| JUnit | Unit testing framework. |
| Espresso | Android UI testing support. |

### Development Configuration

- **Minimum SDK:** API 24
- **Compile SDK:** API 37
- **Target SDK:** API 36
- **Application Version:** 1.0
- **Language:** Kotlin
- **UI Framework:** Jetpack Compose
- **Design Library:** Material 3

These values are based on the repository's application-level Gradle configuration.

## 🏗️ Application Architecture

The application follows a simple activity-based structure with a declarative UI.

```text
Android Application
        |
        v
   MainActivity
        |
        v
  Compose setContent
        |
        v
 Custom Application Theme
        |
        v
      Scaffold
        |
        v
   LoginActivityUI
        |
        +----------------+
        |                |
        v                v
  UI Interactions    Toast Callback
        |
        v
  Compose State
        |
        v
  Updated UI
```

### Architecture Explanation

1. `MainActivity` starts when the application launches.
2. `setContent` initializes the Compose interface.
3. The custom theme provides consistent styling.
4. `Scaffold` establishes the screen structure.
5. `LoginActivityUI` displays the main interface.
6. User interactions trigger the appropriate callbacks or state updates.
7. Toast messages provide short feedback when requested.

## 📂 Project Structure

The repository is organized as an Android Studio Gradle project.

```text
24012011230_MAD_Practical-5/
│
├── .idea/
│   └── Android Studio project settings
│
├── app/
│   ├── build.gradle.kts
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml
│           ├── java/
│           │   └── com/example/
│           │       └── a24012011230_mad_practical_5/
│           │           ├── MainActivity.kt
│           │           └── ui/theme/
│           │
│           └── res/
│               └── values/
│                   └── strings.xml
│
├── gradle/
│   └── Gradle wrapper configuration
│
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle.kts
```

*Note: This is a simplified structural overview. Some generated files and individual theme files are omitted for readability.*

### Important Files

**`MainActivity.kt`**

Contains the main activity, Compose initialization, theme application, and composable UI examples.

**`AndroidManifest.xml`**

Defines the application configuration and declares `MainActivity` as the launcher activity.

**`app/build.gradle.kts`**

Contains the application SDK configuration, plugins, and dependencies.

**`strings.xml`**

Stores the application name.

**`ui/theme/`**

Contains the application's Compose theme resources, including theme-related styling.

**`settings.gradle.kts`**

Defines the Gradle project configuration and included modules.

**`gradlew` and `gradlew.bat`**

Provide Gradle wrapper scripts for supported operating systems.

## ⚙️ How the Application Works

### Step 1: Application Launch

The Android system launches `MainActivity`, which initializes the application interface.

### Step 2: Compose Initialization

The `setContent` function sets up the Compose UI instead of using a traditional XML layout for the main activity.

### Step 3: Theme Application

The custom theme is applied to provide consistent styling for the interface.

### Step 4: Screen Display

The `Scaffold` composable provides the main screen container, and `LoginActivityUI` is called to display the interface.

### Step 5: User Interaction

The user interacts with the available UI controls, such as buttons and checkboxes.

### Step 6: State Updates

In the counter demonstration, clicking the button increases the counter value, and the interface reflects the updated state.

### Step 7: User Feedback

When a message callback is invoked, the application displays a short Toast message.

## 💻 Installation and Setup

### Prerequisites

Before running the project, make sure you have:

- Android Studio installed.
- A compatible JDK configured for the Android Gradle Plugin.
- Android SDK Platform 37 installed.
- An Android emulator or a physical Android device.
- Git installed if you want to clone the repository.

### Clone the Repository

Open a terminal and run:

```bash
git clone https://github.com/khaneshahimadri/24012011230_MAD_Practical-5.git
```

Navigate to the project directory:

```bash
cd 24012011230_MAD_Practical-5
```

### Open the Project

1. Launch Android Studio.
2. Select **Open**.
3. Choose the cloned project folder.
4. Wait for Gradle synchronization to finish.
5. Install any required Android SDK components if prompted.

## ▶️ How to Run the Project

1. Open the project in Android Studio.
2. Wait until Gradle synchronization completes successfully.
3. Start an Android emulator or connect a physical device with USB debugging enabled.
4. Select the `app` run configuration.
5. Click the **Run ▶** button.
6. Wait for the application to build and install.
7. Interact with the application's interface.

### Run Using the Gradle Wrapper

On Windows:

```powershell
.\gradlew.bat assembleDebug
```

On macOS or Linux:

```bash
./gradlew assembleDebug
```

If the build completes successfully, the debug APK is generally generated at:

```text
app/build/outputs/apk/debug/app-debug.apk
```

## 🧪 Testing

The project includes dependencies for unit testing and Android instrumentation testing.

Suggested checks include:

- Verify that the application launches successfully.
- Confirm that the main interface appears.
- Check the alignment and visibility of UI elements.
- Test button-click behavior.
- Verify that the counter updates correctly in the counter demonstration.
- Check checkbox interaction.
- Verify Toast messages when their callbacks are triggered.
- Test the interface on different emulator screen sizes.
- Confirm that the application builds without compilation errors.

Automated test cases should be added where necessary to validate these behaviors.

## 📚 Learning Outcomes

By completing this practical, students can gain experience in:

1. Creating Android applications with Kotlin.
2. Understanding Android activities and lifecycle initialization.
3. Using Jetpack Compose for UI development.
4. Creating reusable composable functions.
5. Arranging components using `Column`, `Row`, and `Box`.
6. Handling button and checkbox interactions.
7. Managing state with `remember` and `mutableStateOf`.
8. Displaying Toast messages.
9. Applying Material 3 themes.
10. Configuring Android SDK versions and Gradle dependencies.
11. Running and testing applications using Android Studio.
12. Understanding the basics of declarative UI development.

## 🚀 Future Enhancements

The project could be extended with the following improvements, if required:

- Implement proper form validation.
- Add email and password validation.
- Implement secure user authentication.
- Add a registration screen.
- Integrate a database or authentication service.
- Add navigation between multiple screens.
- Improve accessibility and responsive layouts.
- Add automated UI and unit tests.
- Improve error handling and user feedback.
- Add persistent storage for application data.

These are possible future enhancements and are not claims about the current implementation.

## 👩‍💻 Author

**Himadri Khanesha**

- **Student ID:** 24012011230
- **Course:** B.Tech Computer Engineering
- **Institution:** Ganpat University — U. V. Patel College of Engineering
- **Subject:** Modern Application Development (MAD)
- **Practical:** 5

### GitHub Repository

[View Source Code on GitHub](https://github.com/khaneshahimadri/24012011230_MAD_Practical-5)

---

## ⭐ Conclusion

This MAD Practical 5 project demonstrates the fundamentals of modern Android application development using Kotlin and Jetpack Compose.

It provides practical experience with activity initialization, composable UI components, Material 3 styling, interactive controls, state management, and Toast messages.

The project serves as a foundation for learning more advanced Android development concepts and building feature-rich mobile applications.

**Thank you for visiting my repository!** 🚀
