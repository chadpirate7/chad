import random

def myfunc(a,b):
    print("test6의 print %d" %(a+b))
    if a == 1:
        print("a 는 %d 입니다" %a)

def lotto1():
    lotto_num = random.sample(range(1, 46), 6)
    lotto_num.sort()
    print(lotto_num)

def lotto2():
    x = list(range(1, 46))
    random.shuffle(x)
    lotto_num = x[:6]
    lotto_num.sort()
    print(lotto_num)

def lotto3():
    x = list(range(1,46))
    lotto_num = []
    for i in range(6):
        r = random.choice(x)
        x.remove(r) #remove = 삭제하다.
        lotto_num.append(r)
    print(lotto_num)
    lotto_num.sort()
    print(lotto_num)
    print(x)

def winner():#10, 11 , 20 , 21, 25, 41 + 40
    x = [10, 11, 20, 21, 25, 41] #전주차 당첨번호
    return x

def winnerprint(x):
    y = list(range(1,46))
    real = []
    for i in x:
        y.remove(i)
    while len(real) != 6:
        k = random.choice(y)
        if k not in real:
            real.append(k)
    real.sort()
    print("진짜 번호 : ", real)
    return real

def teacherfilter(x,y):
    real = []
    for i in x:
        if x in y:
            y.remove(i)
    while len(real) != 6:
        k= random.choice(y)
        if k not in real:
            real.append(k)
    real.sort()
    print("필터거친번호:", real)








