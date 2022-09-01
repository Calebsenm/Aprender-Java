# Crea el algoritmo de una matriz amplificada


M = []

while True:
    Numero_Filas = int(input("Ingresa en numero de filas -> "))
    Numero_Columnas = int(input("Ingresa el numero de Columnas -> "))

    #llenado de la matriz

    for i in range(Numero_Filas):
        M.append([])
        for j in range(Numero_Columnas):
            M[i].append(0)

            print(M[i][j],end = " ")
        print()

    for i in range(Numero_Filas):
        for j in range(Numero_Columnas):
            M[i][j] = int(input(f"ingresa el nunero de la posicion - {i+1} {j+1} -> "))
        print()
    
    for i in range(Numero_Filas):
        for j in range(Numero_Columnas):
            
            if j == Numero_Columnas -1:
                print(f"|  {M[i][j]} ", end = " ")
            else:
                print(M[i][j],end = " ")
        print()


    Dict = {}
    #primer paso convertir la primera fila a uno 
    for i in range(Numero_Filas):
        Dict[M[i][0]] = M[i]

    print(Dict)




