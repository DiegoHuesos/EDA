#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep 20 12:34:06 2019

@author: huesos
"""
#==============Programa Conta===================#
class Conta:
    def __init__(self, empresa):
        self.name = empresa
        
    def __str__(self):
       return 'Choro al invocarlo'
   
    def altaCta(self, numCta, nombreCta, natCta):
        pass
    
    
        
        
#==============Programa Principal===================#
conta = Conta('MiEmpreza S.A.')

conta.altaCta(100100, 'Bancos', 'D')
conta.altaCta(100200, 'Clientes', 'D')
conta.altaCta(100300, 'Inventario', 'D')
conta.altaCta(100100, 'Bancos', 'D')
conta.altaCta(200100, 'Proveedores', 'A')
conta.altaCta(300000, 'Kapital', 'A')
conta.altaCta(100100, 'Ventas', 'A')
conta.altaCta(100100, 'Costo de lo vendido', 'D')

print(conta) #balance


#=================================#
#poliza1 = Poliza('30/Sep/2019', 'Constitución de mi miEmpresa S.A.')
#poliza1.abono(300000, 100000)
#poliza1.cargo(100100, 100000)
#
#conta.registra(poliza1)
#
print(conta)