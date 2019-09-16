"""
Diego Hernandez Delgado
CU: 176262
EDA_Viernes
Profesor: Rafael Gamboa
Tarea2.- Ejercicio2: lectura de archivo (argv)
"""

import sys

#with open(sys.argv[1]) as f:

f = open(sys.argv[1])
str = f.read()
arr = str.replace('\n',' ').split(" ")
n = int( arr[0] )
	
for i in range (1, n*2, 2 ) :
	a = int(arr[i])
	b = int( arr[i+1])
	c = a + b
	print("Suma: %d "%c)
