# 가상은행 대출 서비스

가상으로 은행에서 대출 심사를 하여 집행하고 상환하는 과정 그리고 이를 docker kubernetes를 이용해서 배포하는 과정까지를 담고 있는 프로젝트입니다.

이 프로젝트는 전체 대출 프로세스를 이해하고 공부했음을 알리고자 하는 프로젝트이며 

대출 프로세스의 각 과정 

대출 상담 -> 대출 신청 -> 대출 심사 -> 대출 집행 -> 대출 상환 

각 과정마다 구현되야하는 도메인, 컨트롤러, 서비스, 테스트를 구현하였고 이를 컨테이너 환경에서 배포를 할 것입니다. 

보수적인 은행 업계 특성상 시스템도 안정화된 이전버전을 주로 쓰기에 java11버전으로 개발하였습니다.

## 개발 환경

* Intellij IDEA community 2023.1.1 
* Java 11
* Gradle 8.1.1
* Spring Boot 2.7.14

## 기술 세부 스택

Spring Boot

* Spring Web
* Spring Data JPA
* H2 Database
* MySQL Driver
* Lombok
* Spring Boot DevTools


## 프로젝트 진행사항

* https://github.com/users/immediatelylee/projects/5

추가적인 리팩토링이 있는지 이슈별로 어떤 변경이 있었느지 확인 가능합니다.
