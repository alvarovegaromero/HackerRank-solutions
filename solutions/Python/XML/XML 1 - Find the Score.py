# https://www.hackerrank.com/challenges/xml-1-find-the-score/problem

import sys
import xml.etree.ElementTree as etree

def get_attr_number(node):
    
    count = int(len(node.attrib.keys()))
        
    for child in node:
        count += get_attr_number(child) #recursive call until leaf

    return count

if __name__ == '__main__':
    sys.stdin.readline()
    xml = sys.stdin.read()
    tree = etree.ElementTree(etree.fromstring(xml))
    root = tree.getroot()
    print(get_attr_number(root))
