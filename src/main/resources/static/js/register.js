function register() {
    var displayName = document.getElementById("displayName").value;
    var username = document.getElementById("username").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;

    // Validate that the name is not empty and does not contain only spaces
    if (displayName.trim() === "") {
        alert("Please enter a valid name.");
        return;
    }

    // Validate that the username does not contain spaces or special characters
    var usernameRegex = /^[a-zA-Z0-9_]+$/;
    if (!usernameRegex.test(username)) {
        alert("Username can only contain letters, numbers, and underscores (_).");
        return;
    }

    // Validate that the username is not empty and does not contain only spaces
    if (username.trim() === "") {
        alert("Please enter a valid username.");
        return;
    }

    // Validate the email format
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        alert("Please enter a valid email address.");
        return;
    }

    // Validate that the password has at least 6 characters
    if (password.length < 8) {
        alert("Password must be at least 6 characters long.");
        return;
    }

    // If all validations pass, submit the form (you can add the code to send the data to the server here if needed)
    alert("Registration successful! Data will be sent to the server.");
}
