<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Success Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: linear-gradient(135deg, #74ebd5, #ACB6E5);
        }

        .message {
            font-size: 2em;
            font-weight: bold;
            color: #fff;
            background-color: rgba(0, 0, 0, 0.6);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 8px 15px rgba(0, 0, 0, 0.2);
            animation: fadeInMoveUp 2s ease-in-out, glow 1.5s infinite alternate;
        }

        @keyframes fadeInMoveUp {
            0% {
                opacity: 0;
                transform: translateY(50px);
            }
            100% {
                opacity: 1;
                transform: translateY(0);
            }
        }

        @keyframes glow {
            0% {
                box-shadow: 0 0 5px rgba(255, 255, 255, 0.2);
            }
            100% {
                box-shadow: 0 0 20px rgba(255, 255, 255, 0.8);
            }
        }
    </style>
</head>
<body>
    <div class="message">Successfully  Added Data</div>
</body>
</html>
