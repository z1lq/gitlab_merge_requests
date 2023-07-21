## Running the application

### Running the API application
Create a configuration file with the name `secrets.properties` in the application classpath.
Populate the file with the following configuration fields:

```
spring.security.oauth2.client.registration.gitlab.client-id=client-id
spring.security.oauth2.client.registration.gitlab.client-secret=client-secret
```
Create an OAuth2 service provider application in [GitLab](https://docs.gitlab.com/ee/integration/oauth_provider.html#create-a-user-owned-application).
If running the application locally, the redirect URI defined in the GitLab application should generally be `http://localhost:8080/login/oauth2/code/gitlab`;
The scopes selected in the GitLab application should coincide with the scopes defined in the `application.properties` file.
Replace the `client-id` and `client-secret` values with the application ID and the secret from GitLab.

Launch the application with `./gradlew bootRun`;
