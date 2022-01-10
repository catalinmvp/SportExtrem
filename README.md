# Magnum-Opus-Hub---Virtual-Museum

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
