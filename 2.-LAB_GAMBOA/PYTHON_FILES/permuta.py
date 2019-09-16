# -*- coding: utf-8 -*-
"""
Permutar números:
"""

c=[0]
disp=[1,1,1,1]
p=[1,1,1,1]
k=1
n=3



def permuta(p, disp, k, n, c):
    if k > n:
        c[0] = c[0] + 1
        print( str(c[0]) + "-> " + str(p[1:]) )
    else:
        for w in range(1, n+1):
            if disp[w] == 1:
                disp[w]= 0
                p[k] = w
                permuta(p, disp, k+1, n, c)
                disp[w]=1                


permuta(p, disp, k, n, c)