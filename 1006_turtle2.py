#거북이 그래픽 활용하기 위한 turtle 모듈 가져오기#

from turtle import *
color('red', 'yellow')
begin_fill()
while True:# while= 반복
    forward(200)
    left(170)
    if abs(pos()) < 1:
        break
end_fill()
done()
