<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .error-container {
        text-align: center;
        padding: 20px;
        border: 1px solid #e74c3c;
        border-radius: 8px;
        background-color: #fff;
        box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
    }
    .error-message {
        color: #e74c3c;
        font-size: 24px;
    }
    .retry-button {
        margin-top: 20px;
        padding: 10px 20px;
        color: white;
        background-color: #3498db;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    .retry-button:hover {
        background-color: #2980b9;
    }
</style>
</head>
<body>
<div class="error-container">

    <div class="error-message">Invalid username, please try again.</div>
    <br>
    <a href="customerlogin.html" class="retry-button">Retry</a>
</div>
</body>
</html>
