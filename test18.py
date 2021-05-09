import numpy as np
import pandas as pd

#series 선언.
obj = pd.Series([4,7,11,13], index = ['a', 'b', 'c', 'd'])
print(obj.values)
print(obj.index)
print(obj.dtypes)

sdata = {'kim': 35000, 'lee':17000, 'park':22000}
obj2 = pd.Series(sdata)
obj2.name = "First Name"
obj2.indexname = "Names"
print(obj2)

#data frame 선언

#data = {'firstname' : ['kim',';lee','park'],
#        'age' : [22,35,41],
#        'stunum' : [38050,37060,22010]}

data = {'첫번째당첨번호' : [2,11,12,23,35,41],
        '두번째당첨번호' : [1,7,9,22,35,41],
        '세번째당첨번호' : [5,7,22,32,42,44],
        '네번째당첨번호' : [13,19,22,23,29,34],
        '다섯번째당첨번호' : [14,15,16,18,19,20],
        '여섯번째당첨번호' : [3,6,9,12,34,41]}
df = pd.DataFrame(data)
print(df)

print(df.index)
print(df.columns)
print(df.values)

df.index.name = 'num'
df.columns.name = 'info'
print(df)
df.to_csv('c:/doit/20210413test.csv')
