## ALL MADE BY HUMAN, MYSELF

This repository follows a simple rule:

No AI-generated code.

Every feature is researched, designed,
implemented, debugged, and refactored manually.

The goal is to become a better engineer,
not a better prompt writer.

# DEVELOPMENT ENVIRONMENT
- macOS
- IntelliJ
- SpringBoot 4.1.0
- JAVA 21
- MySQL 9.7.1

# DAY 1
ERD Version1 작성하였고, 목표가 AWS EC2 환경에 컨테이너화 해서 배포 후 , CI/CD 구축하고 게시글당 첨부파일을 S3 버킷으로 관리할 예정이다. 
추후 기능 구현하다 DB변경이 필요하면 ERD 버전 업데이트하고, Flyway 마이그레이션 툴로 업데이트 할 예정

<img width="3994" height="1694" alt="image" src="https://github.com/user-attachments/assets/6089a48a-66d0-445d-a7fb-43970055c332" />

다음으로 MySQL연결 설정을 진행하였다. 

build.gradle 에 의존성 추가해주었고, application.yml에 mysql 접근 관련 코드를 작성하였다. 이미지는 예시

<img width="420" height="381" alt="image" src="https://github.com/user-attachments/assets/8af9f93d-3d08-416a-9afd-7f9cfe14359b" />

사용할 DB를 만들어주고 

<img width="620" height="341" alt="스크린샷 2026-07-22 오후 11 04 55" src="https://github.com/user-attachments/assets/718d58e3-8a8b-4f63-a519-cb62c1494059" />

빌드 성공

<img width="981" height="945" alt="image" src="https://github.com/user-attachments/assets/8da51f7f-85b4-4a71-affc-fd08f536ce50" />


# DAY 2
