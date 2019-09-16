"""
Diego Hernandez Delgado
CU: 176262
EDA_Viernes
Profesor: Rafael Gamboa
Tarea2.- Ejercicio1: STDIN
"""

n= int( input("Cantidad de pares a sumar:" ) )

for i in range ( n ) :
	a = input( "\nNumA: ")
	b = input( "NumB: ")
	print("Suma: " + str(int(a)+int(b)) )
