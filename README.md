# efk-log-collection
efk로 백엔드 서버의 로그를 수집해보자

## 요구사항
- 백엔드 서버에 api를 통해 발생시킨 "hello" 라는 로그를 수집한다.
  - 간단하게 구성했지만 실제 사용시 여러 서버에서의 복잡한 로그를 수집할 수 있다.

## 아키텍처
- k8s
  - efk
  - springboot server
    - 로깅을 수행하는 하나의 api를 갖는 서버를 실습을 위해 한대만 실행한다.

## 결과
![](https://github.com/ohksj77/efk-log-collection/assets/89020004/fbc3f11d-0887-4a4e-ae9d-8150c7a5aa77)
