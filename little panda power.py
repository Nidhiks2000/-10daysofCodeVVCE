#!/bin/python3
from __future__ import division

import os
import sys

# Complete the solve function below.


def gcd(a, b):
    
   // this function will  Return Greatest Common divisor
    
    while b is not 0:
        a, b = b, a % b
    return a

def exgcd(a, b):
    
    // this function will Return (g, x, y), g is gcd of a and b and
   // formula : x * a + y * b = g
    
    if b is 0:
        return (a, 1, 0)
    else:
        g, x, y = exgcd(b, a % b)
        return (g, y, x - (a // b) * y)


def modinv(a, m):
    
   
    //Return module inverse of a * x = 1 (mod m)
   
    if gcd(a, m) is not 1: raise Exception("Not coprime")
    _, x, y = exgcd(a, m)
    return (m + x % m) % m

def solve(a, b, x):
    if b > 0:
        return pow(a, b, x)
    else:
        return pow(modinv(a, x), -b, x)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        abx = input().split()

        a = int(abx[0])

        b = int(abx[1])

        x = int(abx[2])

        result = solve(a, b, x)

        fptr.write(str(result) + '\n')

    fptr.close()
