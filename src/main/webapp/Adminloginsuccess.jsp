<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Success</title>
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
        .success-container {
            background-color: #fff;
            padding: 40px;
            text-align: center;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
        }
        .success-container h2 {
            color: #28a745;
            margin-bottom: 20px;
            font-size: 24px;
        }
        .success-container p {
            color: #555;
            margin-bottom: 30px;
            font-size: 18px;
        }
        .success-container a {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }
        .success-container a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="success-container">
    <h2>Login Successful!</h2>
    <p>Welcome back! You have successfully logged in.</p>
    <a href="CustomerList">View Customer List</a>
    <br>
    <br>
       <a href="updateservicestatus.html">Update Service Status</a>
       <br>
       <br>
       <a href="">check new service  </a>
       <br>
       <br>
          <a href="index.html">Logout</a>
</div>

</body>
</html>
