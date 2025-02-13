# https://www.hackerrank.com/challenges/html-parser-part-2/problem

from  html.parser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_comment(self, data):
        if data:
            if '\n' in data:
                print('>>> Multi-line Comment')
                print(data)
            else:
                print('>>> Single-line Comment')
                print(data)
                
    def handle_data(self, data):
        if data and data != '\n':
            print(">>> Data")
            print(data)


parser = MyHTMLParser()

html = ""
for i in range(int(input())):
    html += input() + "\n"
    
parser.feed(html)
