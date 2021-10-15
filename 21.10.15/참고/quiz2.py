# Quiz 2  논리 연산자
# 성별과 몸무게를 입력 받고, 입력 받은 값에 따른 비만도를 출력하시오.
# 남녀별 비만 측정표는 아래를 참고하세요 


while True:
    gender=int(input("성별을 입력하세요 : <남성1, 여성2> : "))
    weight=int(input("체중을 입력하세요 : "))

    if gender==1 and weight>=85:
        print("남자, 과체중 입니다. 운동하세요.");
    elif gender==1 and weight>=50:
        print("남자, 표준체중입니다. 현 페이스 유지하세요.");
    elif gender==1 and weight < 50:
        print("남자, 표준체중이하입니다. 고기를 드세요");
    elif gender==2 and weight>=68:
        print("여자, 과체중 입니다. 운동하세요.");
    elif gender==2 and weight>=40:
        print("여자, 표준체중입니다. 현 페이스 유지하세요.");
    elif gender==2 and weight < 40:
        print("여자, 표준체중이하입니다. 고기를 드세요");
				
