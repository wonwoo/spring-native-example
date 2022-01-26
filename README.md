# run

```
gradle bootBuildImage
docker run --rm -p 8080:8080 docker.io/library/spring-native-example:0.0.1-SNAPSHOT
```

> Spring Boot plugin requires Gradle 6.8.x, 6.9.x, or 7.x.


```
2022-01-26 06:38:27.427  INFO 1 --- [           main] o.s.nativex.NativeListener               : AOT mode enabled

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.6.3)

2022-01-26 06:38:27.429  INFO 1 --- [           main] o.s.boot.SpringApplication               : Starting application using Java 11.0.13 on fc61f5479290 with PID 1 (started by cnb in /workspace)
2022-01-26 06:38:27.430  INFO 1 --- [           main] o.s.boot.SpringApplication               : No active profile set, falling back to default profiles: default
2022-01-26 06:38:27.448  INFO 1 --- [           main] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port 8080
2022-01-26 06:38:27.448  INFO 1 --- [           main] o.s.boot.SpringApplication               : Started application in 0.029 seconds (JVM running for 0.031)
```
