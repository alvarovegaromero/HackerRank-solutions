# https://www.hackerrank.com/challenges/html-parser-part-1/problem

from html.parser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_starttag(self, tag, attrs):
        print("Start :", tag)
        
        for att in attrs:
            print("-> " + att[0] + " > " + (att[1] if att[1] else "None"))
    
    def handle_endtag(self, tag):
        print("End   :", tag)
    
    def handle_startendtag(self, tag, attrs):
        print("Empty :", tag)
        
        for att in attrs:
            print("-> " + att[0] + " > " + (att[1] if att[1] else "None"))        
        
parser = MyHTMLParser()

for _ in range(int(input())):
    parser.feed(input())
