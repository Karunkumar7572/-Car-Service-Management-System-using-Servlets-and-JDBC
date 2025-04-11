<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Successful</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f7f9fc;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background-color: white;
            padding: 40px;
            border-radius: 12px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 400px;
            width: 100%;
        }

        h1 {
            color: #28a745;
            font-size: 2rem;
            margin-bottom: 20px;
        }

        p {
            font-size: 1.1rem;
            color: #555;
            margin-bottom: 30px;
        }

        .button-container {
            display: flex;
            justify-content: center;
        }

        .btn {
            padding: 12px 25px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-size: 1rem;
            text-decoration: none;
        }

        .btn:hover {
            opacity: 0.9;
        }
    </style>
</head>
<body>

    <div class="container">
        <h1>Login Successful</h1>
        <p>Welcome! You have successfully logged in.</p>
           <div class="button-container">
        <a href="addCardDetails.html" class="btn">Add car Details</a>
          </div>
          <br>
              <div class="button-container">
        <a href="requestService.html" class="btn">Request For a Service</a>
          </div>
          <br>
                <div class="button-container">
        <a href="RetriveDetails" class="btn">CheckService Status</a>
          </div>
          <br>
          
        <div class="button-container">
        
           
            <a href="customerlogout.html" class="btn">Logout</a>
        </div>
    </div>

</body>
</html>
