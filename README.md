# spring-boot-security

Usage of @PreAuthorize for role secured endpoints.

## App start

- run the SpringBootSecurityApplication
- go to localhost:8080
- log int with user: blah / pass: blah
- try to reach following endpoints: 
  - localhost:8080/user *(should read)*
  - localhost:8080/admin *(should be unauthorized)*
- logout using localhost:8080/logout
- login with user: foo / pass: foo
- try to reach endpoints again:
    - localhost:8080/user *(should read)*
    - localhost:8080/admin *(should read)*
