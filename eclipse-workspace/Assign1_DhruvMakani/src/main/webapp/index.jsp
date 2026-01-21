<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<style>
.error { color: red; font-size: 14px; }
</style>
</head>

<body>
<h2>Registration Form</h2>

<form action="register" method="post">

User ID:
<input type="text" name="userid" required />
<span class="error">Required and must be of length 5 to 12.</span><br><br>

Password:
<input type="password" name="password" required />
<span class="error">Required and must be of length 7 to 12.</span><br><br>

Name:
<input type="text" name="name" required />
<span class="error">Required and alphabets only.</span><br><br>

Address:
<input type="text" name="address" />
<span class="error">Optional.</span><br><br>

Country:
<select name="country">
    <option value="select">Please select a country</option>
    <option>India</option>
    <option>Canada</option>
    <option>USA</option>
</select>
<span class="error">Required.</span><br><br>

ZIP Code:
<input type="text" name="zip" required />
<span class="error">Required. Must be numeric only.</span><br><br>

Email:
<input type="text" name="email" required />
<span class="error">Required. Must be a valid email.</span><br><br>

Sex:
<input type="radio" name="sex" value="Male">Male
<input type="radio" name="sex" value="Female">Female
<span class="error">Required.</span><br><br>

Language:
<input type="checkbox" name="language" value="English">English
<input type="checkbox" name="language" value="Non-English">Non English
<span class="error">Required.</span><br><br>

About:
<textarea name="about" rows="5" cols="30"></textarea>
<span class="error">Optional.</span><br><br>

<input type="submit" value="Submit">
</form>

<% if (request.getAttribute("error") != null) { %>
    <p class="error">Validation Failed. Please check inputs.</p>
<% } %>

</body>
</html>