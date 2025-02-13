# Link: https://www.hackerrank.com/challenges/class-1-dealing-with-complex-numbers/problem

import math
from math import sqrt #importing square root

class Complex(object): 
    def __init__(self, real, imaginary):
        self.real = real 
        self.imaginary = imaginary
        
    def __add__(self, no):
        real = self.real + no.real
        imaginary = self.imaginary + no.imaginary
        return Complex(real, imaginary)
        
    def __sub__(self, no):
        real = self.real - no.real
        imaginary = self.imaginary - no.imaginary
        return Complex(real, imaginary)
            
    def __mul__(self, no): #using resulting formula for multiplication 
        real = (self.real * no.real) - (self.imaginary * no.imaginary)
        imaginary = (self.real * no.imaginary) + (self.imaginary * no.real)
        return Complex(real, imaginary)

    def __truediv__(self, no):
        #using https://www.cuemath.com/numbers/division-of-complex-numbers/
        den = no.real**2 + no.imaginary**2
        real = round((self.real*no.real + self.imaginary*no.imaginary) / den, 2)
        imaginary = round((self.imaginary*no.real - self.real*no.imaginary) / den, 2)
        return Complex(real, imaginary)         

    def mod(self):
        real = sqrt(self.real**2 + self.imaginary**2)
        return Complex(real, 0)
    
    def __str__(self):
        if self.imaginary == 0:
            result = "%.2f+0.00i" % (self.real)
        elif self.real == 0:
            if self.imaginary >= 0:
                result = "0.00+%.2fi" % (self.imaginary)
            else:
                result = "0.00-%.2fi" % (abs(self.imaginary))
        elif self.imaginary > 0:
            result = "%.2f+%.2fi" % (self.real, self.imaginary)
        else:
            result = "%.2f-%.2fi" % (self.real, abs(self.imaginary))
        return result
