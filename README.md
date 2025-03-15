# Antivirus - COVID-19 Risk Assessment App

## Overview

Antivirus is a Java-based application designed to help people assess the safety of their destination during the COVID-19 pandemic. By analyzing reported cases within a 1km radius, it provides users with insights to minimize their risk of exposure. The application leverages OpenStreetMap for mapping, geocoding APIs for address lookup, and a CSV data source for case records.

## Features

* Process and store geographic data from a CSV file.

* Display locations on a map using OpenStreetMap.

* Geocoding capabilities to convert addresses to latitude/longitude.

* Reverse geocoding to find municipality names from coordinates.

* Search functionality to locate COVID-19 cases within a 1km radius of a user-inputted address.

* Calculate distances between points to determine proximity.

* User-friendly graphical interface with multiple pages for analytics and contact information.

## Project Structure

The project consists of the following key components:

### 1. Data Handling

  * UsableData.java - Represents an individual record with address, coordinates, and date.

  * DataProcessor.java - Reads and processes CSV data into UsableData objects.

### 2. Geographic Processing

  * Geocoding.java - Provides geolocation services using the OpenCage API.

  * Distance.java - Computes distances between two geographic points.

  * Square.java - Defines a square boundary around a given location for proximity searches.

### 3. Mapping & Visualization

  * MapDisplay.java - Uses JXMapViewer to display OpenStreetMap tiles and locations.

### 4. Search Functionality

  * Search.java - Manages user queries, fetches relevant cases, and computes statistics.

### 5. Graphical User Interface (GUI)

  * HomePage.java - The main landing page with search functionality.

  * WelcomePage.java - The initial page with an introduction to the app.

  * AboutUsPage.java - Displays information about the development team.

  * ContactPage.java - Provides contact details for the team members.

  * AnalyticsPage.java - Shows statistical analysis of search results.

  * MasterCtrl.java - Manages page navigation and user interactions.

### 6. GUI Panels

  * AboutPanel.java - The panel for the About Us section.

  * ContactPanel.java - The panel for the Contact page.

  * AnalyticsPanel.java - Displays statistical graphs and case distribution.

  * AntiPanel.java - A foundational panel used in multiple pages.
