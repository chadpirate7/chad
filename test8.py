import random

my_list = [1, 9, 26, 28, 30, 41, 4, 9, 23, 26, 29, 33, 10, 11, 20, 21, 25, 41, 4, 15, 24, 35, 36, 40]
new_list = []
for v in my_list:
    if v not in new_list:
        new_list.append(v)
        new_list.sort()

list = {}
ran_num = random.choice(new_list)

for i in range(6):
    while ran_num in list:
        ran_num = random.choice(new_list)
print(list)
