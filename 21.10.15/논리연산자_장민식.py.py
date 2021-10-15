##장민식 2021.10.15##
while True:
    a=int(input("남성1,여성2:"))
    w=int(input("몸무게를 적으시오"))    

    if a==1:    
        if w>=85:
            print("과체중")
        elif 50<=w<85:
            print("표준체중")
        else:
            print("저체중")
            
    elif a==2:     
        if w>=68:
            print("과체중")
        elif 40<=w<68:
            print("표준체중")
        else:
            print("저체중")

    continue

