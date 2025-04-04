# About News Website Project

## Overview
This project is a dynamic news website built with Java, Spring Boot, and MySQL. The application allows users to browse news articles by category, read full articles.

## Features
- **Category-based News Browsing**: Users can select from various news categories (Sports, Entertainment, Hot, Good, Superb, etc.)
- **Article View**: Complete news articles are displayed when a headline is clicked
- **Multiple Category Association**: News items can belong to multiple categories
- **News Detail View**: Readers can view complete news articles when clicking on headlines
- **RESTful API**: Backend implemented as a RESTful service

## Technologies Used
- **Backend**: Java, Spring Boot
- **Database**: MySQL
- **API Testing**: Postman/Insomnia

## Project Structure

### Database Schema
- **News**: Stores news articles with their content
- **Categories**: Contains the different news categories
- **News_Categories**: Junction table linking news items to categories


### API Endpoints
- `POST /api/news`: Create new news items
- `GET /api/news`: Retrieve all news items
- `GET /api/news/{id}`: Retrieve a specific news article
- `PUT /api/news/{id}`: Update a specific news article
- `DELETE /api/news/{id}`: Delete a specific news article
- `POST /api/api/cate/news/{id}`: Add category into news
- `GET /api/api/cate/news/{id}`: Get categories by news id


## Installation and Setup

### Prerequisites
- Java JDK 11 or higher
- MySQL Database
- Maven or Gradle (for dependency management)

### Database Setup
1. Create a MySQL database
2. Run the SQL scripts in the `database` folder to set up the schema and sample data

### Application Configuration
1. Clone the repository
2. Configure the database connection in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
3. Build the project using Maven or Gradle
4. Run the application

## Usage
1. Start the application
2. Access the homepage at `http://localhost:8080`
3. Select a news category to view related headlines
4. Click on a headline to read the full article


## Future Enhancements
- User authentication and profiles
- Admin dashboard for content management
- Image upload functionality for news articles
- Comment system for user interaction
- Search functionality
- Pagination for news listings
