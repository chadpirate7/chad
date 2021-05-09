import requests
from bs4 import BeautifulSoup

response = requests.get('https://askdjango.github.io/lv1/')

html = response.text

soup = BeautifulSoup(html, 'html.parser')

for tag in soup.select('li[class=course]'):
    print(tag.text)