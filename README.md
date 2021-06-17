# ProfileTest

Sample project for the Bug: https://github.com/spring-cloud/spring-cloud-vault/issues/601 

## Run Instructions
1. Clone the repo
2. Start the app with the command
    ```
      java -Dspring.profiles.active=dev -Dspring.output.ansi.enabled=always -Drole_id=<ROLE_ID> -Dsecret_id=<SECRET_ID> -DVAULT_URL=<VAULT_URL> ProfileTestApplication
    ```
3. Go to http://localhost:8081 to see profile specific properties    
