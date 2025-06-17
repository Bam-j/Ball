# Ball

- Ball은 웹 클리커 게임입니다.
- [Cookie Clicker](https://cookieclicker.com/)로부터 영감을 받아서 제작되었습니다.
- 프로젝트에 대한 상세 사양은 [노션 페이지](https://motley-broker-ff4.notion.site/Ball-2000e30515948041b77aee4a01dc5c96?pvs=74)에서 확인하실 수 있습니다.

---
## ERD
![erd](https://github.com/user-attachments/assets/9ae3c571-a260-4af1-bec8-136a9e9e3878)

## 핵심 Flow
- 페이지 기본 흐름: `회원가입 -> 로그인 -> 공 클릭`
- 인게임 흐름: `공 클릭 -> 건물 구입`

## 주요 기능 요약
- 클릭 횟수가 재화가 되어 건물 구매 및 업그레이드에 사용
- 건물은 클릭 횟수 증가 및 자동 클릭 등의 부수 효과 부여
- 클릭 수는 `알파벳 기반 계수`로 표현
