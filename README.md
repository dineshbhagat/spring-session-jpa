### spring-session-jpa

1. create tables from [file](src/main/resources/tables.sql), [Ref](https://github.com/spring-projects/spring-session/blob/master/spring-session-jdbc/src/main/resources/org/springframework/session/jdbc/schema-mysql.sql)
2. update mysql properties in [application.yml](src/main/resources/application.yml) file
3. run application `./gradlew clean build && && ./gradlew run`
4. username:root and password:root to login
5. Open tables and check sessions are already stored in DB once you successfully login to above page.
6. In order to test multiple sessions, either open localhost:8080 in incognito or clear cokkies
