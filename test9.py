import random
import test8

x = []
def lotto1():
    lotto_num = random.choice(range(int(x)), 6)
    lotto_num.sort()
    print(lotto_num)
