<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Failed</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #ffe6e6;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 400px;
            width: 100%;
        }

        h1 {
            font-size: 2rem;
            color: #e74c3c;
            margin-bottom: 20px;
        }

        p {
            font-size: 1.2rem;
            color: #333;
            margin-bottom: 30px;
        }

        .button {
            background-color: #e74c3c;
            color: white;
            padding: 12px 25px;
            border: none;
            border-radius: 8px;
            font-size: 1rem;
            cursor: pointer;
            text-decoration: none;
        }

        .button:hover {
            background-color: #c0392b;
        }

        .icon {
            font-size: 3rem;
            color: #e74c3c;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>

    <div class="container">
        <div class="icon">✘</div>
        <h1>Registration Failed</h1>
        <p>Sorry, there was an error processing your registration. Please try again.</p>
        <a href="customerregistration.html" class="button">Try Again</a>
    </div>

</body>
</html>
