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
        background-color: #f8f9fa;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .error-container {
        text-align: center;
        padding: 30px;
        border: 2px solid #d9534f;
        border-radius: 10px;
        background-color: #ffffff;
        box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
    }
    .error-message {
        color: #d9534f;
        font-size: 22px;
        font-weight: bold;
        margin-bottom: 20px;
    }
    .retry-button {
        padding: 10px 25px;
        color: #fff;
        background-color: #0275d8;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
    }
    .retry-button:hover {
        background-color: #025aa5;
    }
</style>
</head>
<body>
<div class="error-container">
    <div class="error-message">Invalid password, please try again.</div>
    <a href="customerlogin.html" class="retry-button">Retry</a>
</div>
</body>
</html>
