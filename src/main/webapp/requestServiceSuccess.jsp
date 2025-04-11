<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Type Service Added</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(45deg, #ff9a9e, #fad0c4, #fad0c4, #fbc2eb);
            background-size: 400% 400%;
            animation: gradient 10s ease infinite;
        }

        .floating-message {
            background-color: #4CAF50;
            color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
            font-size: 24px;
            text-align: center;
            animation: float 4s infinite ease-in-out, colorchange 6s infinite ease-in-out;
        }

        @keyframes float {
            0% {
                transform: translateY(0);
            }
            50% {
                transform: translateY(-20px);
            }
            100% {
                transform: translateY(0);
            }
        }

        @keyframes gradient {
            0% {
                background-position: 0% 50%;
            }
            50% {
                background-position: 100% 50%;
            }
            100% {
                background-position: 0% 50%;
            }
        }

        @keyframes colorchange {
            0% {
                background-color: #4CAF50;
                color: white;
            }
            25% {
                background-color: #ff9800;
                color: black;
            }
            50% {
                background-color: #2196f3;
                color: white;
            }
            75% {
                background-color: #f44336;
                color: black;
            }
            100% {
                background-color: #4CAF50;
                color: white;
            }
        }

        .floating-message:hover {
            animation: bounce 1s infinite;
        }

        @keyframes bounce {
            0%, 100% {
                transform: translateY(0);
            }
            50% {
                transform: translateY(-10px);
            }
        }
    </style>
</head>
<body>

<div class="floating-message">
    Successfully type service added
</div>

</body>
</html>
