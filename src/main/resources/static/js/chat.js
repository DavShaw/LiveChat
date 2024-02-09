document.addEventListener('DOMContentLoaded', function() {
    var firstTime = true;
    var button = document.querySelector('button[type="submit"]');
    var message = document.querySelector('input[type="text"][name="message"]');
    var user = document.querySelector('input[type="text"][name="username"]');

    var socket = new WebSocket("ws://localhost:8080/livechat");

    socket.onmessage = function (event) {
        var chat = document.getElementById('backendTextarea');
        chat.value += event.data + '\n';
    }

    button.addEventListener('click', sendMessage);

    function sendMessage() {
        var currentDate = new Date();
        var messageToSend = "[" + currentDate.toLocaleString() + "] " + user.value + " > " + message.value;
        socket.send(messageToSend);
        message.value = '';

        if (firstTime) {
            firstTime = false;
            user.disabled = true;
        }
    }
    
});
