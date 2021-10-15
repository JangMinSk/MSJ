##장민식 2021.10.15##
while True:
    a=int(input("점수를 입력 하세요:"))
    while a<0 or a>100:
        a=int(input("다시입력"))

    if a>=95:
        print("A+",end="")
    elif a >=90:
        print("A",end="")
    elif a>=85:
        print("B+",end="")
    elif a>=80:
        print("B",end="")
    elif a>=75:
        print("C+",end="")
    elif a>=70:
        print("C",end="")
    elif a>=65:
        print("D+",end="")
    elif a>=60:
        print("D",end="")
    else:
        print("F",end="")
        
    print("학점입니다")
