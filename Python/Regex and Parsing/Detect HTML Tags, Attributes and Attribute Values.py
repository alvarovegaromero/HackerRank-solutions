# https://www.hackerrank.com/challenges/detect-html-tags-attributes-and-attribute-values/problem

from html.parser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_starttag(self, tag, attrs):
        print(tag)
        
        for att in attrs:
            print("-> " + att[0] + " > " + (att[1] if att[1] else "None"))

    def handle_startendtag(self, tag, attrs):
        print(tag)
        
        for att in attrs:
            print("-> " + att[0] + " > " + (att[1] if att[1] else "None"))

parser = MyHTMLParser()

html = ""
for i in range(int(input())):
    html += input() + "\n"
    
parser.feed(html)
