num=[]
for i in range(10):
    a=int(input("정수 입력:%d회"%(i+1)))
    num.append(a)
    num=list(set(num))
    print(num)
    print("----------------------")
    print(max(num),min(num))      
            
