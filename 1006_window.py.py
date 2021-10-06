#2021.10.06 윈도우 프로그래밍, 그림판 만들기 #

from tkinter import * #윈도우 프로그래밍을 하기 위해 tkinter(모듈) 가져오기 #

## 변수 ##
window=None #창의 정보를 저장할 수 있는 변수 생성 (None=초기값을 주지않음)
canvas=None # 캔버스의 정보를 저장할 수 있는 변수 생성 
x1,y1,x2,y2=None,None,None,None #선의 시작점과 끝점 정보(x,y좌표값)를 저장하는 변수 생성 #

## 함수 ##
#마우스 클릭시 실행할 사용자 정의 함수 선언#
def mouseClick(event): # event=사용자가 발생시키는 사건 #
    global x1,y1,x2,y2 #global(전역변수) 변수를 공유하기 위함
    x1=event.x
    y1=event.y
    
#마우스 떼었을 때 실행할 사용자 정의 함수 선언#
def mouseDrop(event):
    global x1,y1,x2,y2
    x2=event.x
    y2=event.y
    canvas.create_line(x1,y1,x2,y2,width=5,fill="red") #width=너비,fill=선의 색#

## 메인 코드 ##

window=Tk() #Tk(클래스) = 윈도우(창)를 만들기 위한 정보
window2=Tk()#창 생성
window2.title("그림판 비슷한 프로그램2")
window.title("그림판 비슷한 프로그램") #title= 창(window) 에대한 제목을 붙힐때
canvas=Canvas(window, height=600,width=600)#생성된 창(window)에 그림을 그릴 수 있는 캔버스 생성#
canvas.bind("<Button-1>",mouseClick) #bind()= 함수로 사건과 실행할 함수를 연결
canvas.bind("<ButtonRelease-1>",mouseDrop)
canvas.pack() # canvas.pack=화면에 캔버스를 보여주는 명령어
window.mainloop() # 윈도우 창에 키보드 누르기,마우스 클릭 등 다양한 이벤트를 처리
