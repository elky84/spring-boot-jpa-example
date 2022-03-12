[![Website](https://img.shields.io/website-up-down-green-red/http/shields.io.svg?label=elky-essay)](https://elky84.github.io)
![Made with](https://img.shields.io/badge/made%20with-Java11-brightgreen.svg)
![Made with](https://img.shields.io/badge/made%20with-SpringBoot2-blue.svg)
![Made with](https://img.shields.io/badge/made%20with-MySQL-red.svg)

![GitHub forks](https://img.shields.io/github/forks/elky84/spring-boot-jpa-example.svg?style=social&label=Fork)
![GitHub stars](https://img.shields.io/github/stars/elky84/spring-boot-jpa-example.svg?style=social&label=Stars)
![GitHub watchers](https://img.shields.io/github/watchers/elky84/spring-boot-jpa-example.svg?style=social&label=Watch)
![GitHub followers](https://img.shields.io/github/followers/elky84.svg?style=social&label=Follow)

![GitHub](https://img.shields.io/github/license/mashape/apistatus.svg)
![GitHub repo size in bytes](https://img.shields.io/github/repo-size/elky84/spring-boot-jpa-example.svg)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/elky84/spring-boot-jpa-example.svg)

# spring-boot-jpa-example

## 소개
* Java 11과 Spring Boot 2.3.4를 기반으로 작성되었습니다.
* JPA + MySQL을 이용한 웹 서버 예제입니다.
* 간단한 기능 예제이므로, 세부적인 프로젝트 디테일은 포킹이나 Clone해서 변경하시면 됩니다.

## API 스펙
* Swagger3를 사용하므로 주소가 기존 버전과 다릅니다.
  * {주소}/swagger-ui.index.html

## 예외 처리
* com.elky.jpa.exception.GlobalExceptionHandler 에서, 예외 타입에 맞게 핸들링 코드를 작성해주시면 됩니다.
  * 미작성된 예외의 경우, 500 Internal Error로 응답이 가게 됩니다.

## 설정
* application.yml 혹은 가동하실 환경에 맞는 application-{환경}.yml 파일을 구성하시고, DB 설정을 하시면 됩니다.
* 실행인자로 datasource 부분을 넘기셔도 무방합니다
    * "-Dspring.datasource.url=jdbc:mysql://{ip}:{port}/{db} -Dspring.datasource.username={username} Dspring.datasource.password={password}"