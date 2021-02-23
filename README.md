# WhatsCrap Messenger

WhatsCrap Messenger is an instant messaging application with two main objectives

1. Improve my UI, JavaScript, React & Redux skills
1. Explore using Web Sockets for communication between browser client and service

The project consists of two parts

1. Backend service
1. Frontend UI

This repository is the service which is written in [Kotlin](https://kotlinlang.org/), uses the [Spring Boot](https://spring.io/projects/spring-boot) framework and is hosted on [Heroku](https://www.heroku.com/). The address of the hosted Heroku service is https://whats-crap.herokuapp.com/

Repository https://github.com/DangerousDarlow/messenger-react-ui is the frontend UI. It is written in [JavaScript](https://www.javascript.com/), uses [React](https://reactjs.org/) & [Redux](https://redux.js.org/) and is hosted on [Netlify](https://www.netlify.com/). The address of the hosted Netlify service is https://heuristic-ardinghelli-186726.netlify.app/

## How To Build & Run

Building and running the application locally requires a Java SDK to be installed. At the time of writing I'm using [AdoptOpenJDK](https://adoptopenjdk.net/) 15 Hotspot.

Clone the repository

> git clone https://github.com/DangerousDarlow/messenger.git

Build and run using [gradle](https://gradle.org/) (the script will download the correct version of gradle)

> gradlew bootRun