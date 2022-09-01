
A  = [2,99,9987,4,1,4,7,6,4,8,9,5,6]
B = []
C =  []
# mira la cantidad de los numeros
for i in range(len(A)):
    for j in range(len(A)):
        if A[i] < A[j]:
            B.append(A[i])
            
            for lk in B:
                if lk not in C:
                    C.append(lk)

Numero1 = 0
Numero2 = 0
Contador = 0
Numeros = []
#Cuenta la  Cantidad de los numeros
while True:
    while True:
        if B[Numero1] == B[Numero2]:
            Contador += 1   
        Numero2 += 1
        if Numero2 == len(B):
            break
    Numeros.append([B[Numero1],Contador])
    Numeros.append    
    Numero1 += 1
    Numero2 = 0
    Contador = 0

    if Numero1 == len(B)-1:
        break
#Reordena lo Repetido
Datos = []
for elemento in Numeros:
    if elemento not in Datos:
        Datos.append(elemento)

print(Datos)

N = Datos

Number = N[0]



for x in N:
    if Number[1] > x[1]:
        Number[1] = x[1]

print(Number[1])
