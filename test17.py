import csv
import pandas as pd

#f = open("c:/doit/textxsl.csv", 'r', encoding = 'utf -8')
#r = csv.reader(f)
#for line in r:
#    print(line)
#f.close()

#with open('c:/doit/textxsl.csv') as csvfile:
#    r = csv.DictReader(csvfile)
#    for i in r:
#        print(i)

data = pd.read_csv("c:/doit/textxsl.csv")
print(data)