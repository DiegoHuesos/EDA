#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Problema de las n reinas:
"""

def nReinas(n):
    pos = [0]*n     #List of positions
    dis = [1]*n     #List of possible numbers
    cont = [0]      #Counter
    nReinasPriv(pos, 0, cont)  #Call of the private recursive method
    

def nReinasPriv(pos, i, cont):

    if(i > len(pos) ):
        print("a")
        return
    else:
       
        if( i == len(pos) ):
            print("c")
            if( valid(pos, i) ):
                print("d")
                cont[1] = cont[0]+1
                print(pos)
                print(cont[0])
                print("\n")  
        else:
            print("e")
            pos[i] = pos[i]+1;
            nReinasPriv(pos, i+1, cont)

     
            
def valid(pos, i):
    dist=pos[i]+i
    print(dist)
    a=0
    flag=True
    while( a < i and flag):
        if(pos[a]+a == dist):
            flag=False
        else:
            a=a+1
        
    if(a<i):
        return False
    else:
        return True
    
    

def nReinas(n):
    pos = [0]*n     #List of positions
    dis = [1]*n     #List of possible numbers
    cont = [0]      #Counter
    nReinasPriv(pos, 1, cont)  #Call of the private recursive method
    
def nReinasPriv(pos, i, cont):

    