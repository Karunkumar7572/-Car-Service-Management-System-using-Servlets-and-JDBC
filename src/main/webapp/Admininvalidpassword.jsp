<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Password Error</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f0f2f5;
            font-family: Arial, sans-serif;
        }
        .error-container {
            background-color: #fff;
            padding: 40px;
            text-align: center;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
        }
        .error-container h2 {
            color: #d9534f;
            margin-bottom: 20px;
            font-size: 24px;
        }
        .error-container p {
            color: #555;
            margin-bottom: 30px;
            font-size: 18px;
        }
        .error-container a {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }
        .error-container a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="error-container">
    <h2>Invalid Password</h2>
    <p>Please try again</p>
    <a href="Adminlogin.html">Back to Login</a>
</div>

</body>
</html>
