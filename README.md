# Magnum-Opus-Hub---Virtual-Museum

Magnum Opus Hub represents a way artists can showcase their masterpieces via digital exhibitions via our Virtual Museum. Taking into consideration the fact that digital artists are forced to go from digital to analogue to expose their artworks via an exhibition, we got a solution: a software in which they can express their work in a raw digital way.

Users can register / login with chosen credentials OR social networks

Testing the registration service using this Git Bash : 
`curl --location --request POST 'localhost:8080/api/v1/registration' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "TEST",
    "lastName": "TEST",
    "email": "aelenei.bogdan98@gmail.com",
    "password": "password"
}'`

firstName & lastName - nume client, email -> adresa de e-mail a clientului.


TODO Views, pages, htmls
