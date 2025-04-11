<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Car Service Update</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background: linear-gradient(135deg, #00c6ff, #0072ff); /* Background gradient */
        }

        .message-box {
            background-color: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 6px 12px rgba(0, 0, 0, 0.1);
            animation: fadeIn 1s ease-in-out, pulse 2s infinite; /* Added pulse animation */
            text-align: center;
            color: #007bff;
        }

        h1 {
            font-size: 24px;
            margin-bottom: 10px;
        }

        p {
            font-size: 18px;
            color: #333;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        @keyframes pulse {
            0% {
                box-shadow: 0 0 20px rgba(0, 123, 255, 0.5);
            }
            50% {
                box-shadow: 0 0 40px rgba(0, 123, 255, 0.8);
            }
            100% {
                box-shadow: 0 0 20px rgba(0, 123, 255, 0.5);
            }
        }
    </style>
</head>
<body>
    <div class="message-box">
        <h1>Success!</h1>
        <p>Car status has been updated successfully.</p>
    </div>
</body>
</html>
