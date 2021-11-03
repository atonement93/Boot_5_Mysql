# Boot_5_Mysql
 
 <페이징처리>
 
 - 변수
 
 A. 한 페이지에 몇 개씩 조회 : perPage = 10
 
 B. 현재 페이지 번호 : pn
 
 C. 한 블럭에 출력할 페이지 번호의 갯수 : perBlock = 5
 
 
 1. 일정한 개수만큼 DB 조회
  1) limit 0,10
  2) limit 10,10
  3) limit 20,10
  4) ...
  => (pn-1)*perPage
  
 2. Page 번호 처리
  1) 총 글의 갯수 - DB에서 조회
  2) 총 페이지의 갯수 구하기
