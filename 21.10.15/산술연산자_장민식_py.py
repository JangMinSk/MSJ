##장민식 2021.10.15 ##

a=0
b=0
c=0
d=0
e=0
sum=0
while True:
    a,b,c,d,e=input("5개의 정수를 입력 하세요.")
    sum=int(a)+int(b)+int(c)+int(d)+int(e)       
    print("%d+%d+%d+%d+%d=%d"%(int(a),int(b),int(c),int(d),int(e),int(sum)) + "입니다") 
    input("아무키나 누르면 처음부터")
