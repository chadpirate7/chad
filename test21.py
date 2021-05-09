import requests
import re
url = "https://askdjango.github.io/lv3/"
html = requests.get(url).text

matched = re.search(r'var courses = (.+?)', html, re.S)
print(matched)