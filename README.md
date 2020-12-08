# springboot-postgres-application assignment

# Introduction: 
This project consists of RESTful services to perform over a list of 1000 of records. The records are stored over the ElephantSQL database server

## Get all Cities
*  GET /cities - fetches list of all cities

## Add City
*  POST /city - add new city in DB

## Update City
*  Put /city - update exising city in DB

## Delete City
*  delete /city - delete city from DB

## Apply Filter
*  getCityByDateRange /city - application of filter in DB on column enddate by taking input in date range

This program and instructions have been tested on following versions on Windows laptop.
*  Apache Maven 3.6.1 
*  Java version: 1.8.0_271
*  git version 2.19.0.windows.1

# How to run the application locally?

Pre-requisites to run application are Java, Maven and Git. 
*  Installation instructions for Maven are available at https://maven.apache.org/install.html
*  Java can be installed from http://www.oracle.com/technetwork/java/javase/downloads/index.html
*  Latest Git version can be installed from https://git-scm.com/downloads

Steps to build and run locally:
* Open commandline
* Go to repository where you want to clone.
* Clone repository using following command=>   https://github.com/Vibs21/springboot-postgres-ng.git
* Run given command in the same repository=> mvn clean tomcat7:run  OR alternatively by using IDE like intelliJ
* Access and invoke APIs using url => http://localhost:8080/api/v1

This application uses Postgresql database. 
