#esta version está bugeada  

from random import random
import time
a = [
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,4,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],

]

while  True:
    print()
    for i in range(len(a)):
        for j in range(len(a)):
            print(a[i][j],end = "")
        print()

    k = int(input("Ingresa el moviento  , sube 1, baja 2  derecha3, isquierda4  -> "))


    Ubicacion_Fichas = []
    for i in range(len(a)):
        for j in range(len(a)):
            if a[i][j] == 1 or a[i][j] == 2  or a[i][j] == 3  or a[i][j] == 4:
                Ubicacion_Fichas.append([a[i][j],i,j])
    
    if k == 1:

        for i in range(len(Ubicacion_Fichas)):
            if Ubicacion_Fichas[i][0] == 1:

                a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]] = 0
                #derecha
                if a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]+1] == 2:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]+1] = 1
                #isquierda
                if a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]-1] == 2:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]-1] = 1
                #Abajo
                if a[Ubicacion_Fichas[i][1]+1][Ubicacion_Fichas[i][2]] == 2:
                    a[Ubicacion_Fichas[i][1]+1][Ubicacion_Fichas[i][2]] = 1
                #arriba 
                if a[Ubicacion_Fichas[i][1]-1][Ubicacion_Fichas[i][2]] == 2:
                    a[Ubicacion_Fichas[i][1]-1][Ubicacion_Fichas[i][2]] = 1

            if Ubicacion_Fichas[i][0] == 3:
                
                if a[Ubicacion_Fichas[i][1]-1][Ubicacion_Fichas[i][2] ] == 0:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]] = 2
                    a[Ubicacion_Fichas[i][1]-1][Ubicacion_Fichas[i][2]] = 3

                if a[Ubicacion_Fichas[i][1] -1][Ubicacion_Fichas[i][2] ] == 4:
                    a[Ubicacion_Fichas[i][1] -1][Ubicacion_Fichas[i][2] ] == 2
                    a[Ubicacion_Fichas[i][1]-2][Ubicacion_Fichas[i][2] ] = 2
                    a[Ubicacion_Fichas[i][1]-3][Ubicacion_Fichas[i][2] ] = 3

                    a[10][10] = 4 



    if k == 2:
        for i in range(len(Ubicacion_Fichas)):
            if Ubicacion_Fichas[i][0] == 1:
                a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]] = 0
                #derecha
                if a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]+1] == 2:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]+1] = 1
                #Abajo
                if a[Ubicacion_Fichas[i][1]+1][Ubicacion_Fichas[i][2]] == 2:
                    a[Ubicacion_Fichas[i][1]+1][Ubicacion_Fichas[i][2]] = 1

            if Ubicacion_Fichas[i][0] == 3:
            
                if a[Ubicacion_Fichas[i][1] +1 ][Ubicacion_Fichas[i][2] ] == 0:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]] = 2
                    a[Ubicacion_Fichas[i][1]+1][Ubicacion_Fichas[i][2]] = 3

                
                if a[Ubicacion_Fichas[i][1] +1][Ubicacion_Fichas[i][2] ] == 4:
                    a[Ubicacion_Fichas[i][1] +1][Ubicacion_Fichas[i][2] ] == 2
                    a[Ubicacion_Fichas[i][1]+2][Ubicacion_Fichas[i][2] ] = 2
                    a[Ubicacion_Fichas[i][1]+3][Ubicacion_Fichas[i][2] ] = 3

                    a[5][19] = 4 



    if k == 3:
        for i in range(len(Ubicacion_Fichas)):
            if Ubicacion_Fichas[i][0] == 1:

                a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]] = 0
                #derecha
                if a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]+1] == 2:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]+1] = 1
                #isquierda
                if a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]-1] == 2:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]-1] = 1
                #Abajo
                if a[Ubicacion_Fichas[i][1]+1][Ubicacion_Fichas[i][2]] == 2:
                    a[Ubicacion_Fichas[i][1]+1][Ubicacion_Fichas[i][2]] = 1
                #arriba 
                if a[Ubicacion_Fichas[i][1]-1][Ubicacion_Fichas[i][2]] == 2:
                    a[Ubicacion_Fichas[i][1]-1][Ubicacion_Fichas[i][2]] = 1

            if Ubicacion_Fichas[i][0] == 3:
                if a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2] + 1] == 0:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]] = 2
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2] + 1] = 3
            
                if a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2] + 1] == 4:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2] + 1] == 2
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2] + 2] = 2
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2] + 3] = 3

                    a[13][5] = 4 

    if k == 4:
        for i in range(len(Ubicacion_Fichas)):
            if Ubicacion_Fichas[i][0] == 1:

                a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]] = 0
                #derecha
                if a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]+1] == 2:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]+1] = 1
                #isquierda
                if a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]-1] == 2:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]-1] = 1
                #Abajo
                if a[Ubicacion_Fichas[i][1]+1][Ubicacion_Fichas[i][2]] == 2:
                    a[Ubicacion_Fichas[i][1]+1][Ubicacion_Fichas[i][2]] = 1
                #arriba 
                if a[Ubicacion_Fichas[i][1]-1][Ubicacion_Fichas[i][2]] == 2:
                    a[Ubicacion_Fichas[i][1]-1][Ubicacion_Fichas[i][2]] = 1

            if Ubicacion_Fichas[i][0] == 3:
            
                if a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2] - 1] == 0:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2]] = 2
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2] - 1] = 3
                
                if a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2] - 1] == 4:
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2] - 1] = 2
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2] - 2] = 2
                    a[Ubicacion_Fichas[i][1]][Ubicacion_Fichas[i][2] - 3] = 3

                    a[10][5] = 4 
    



    
    print()

    
            

               
               
            



        
