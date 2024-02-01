#EJERCICIO1

def invertir_diccionario(diccionario):

    if len(diccionario) != 1:
        raise ValueError("El diccionario debe contener exactamente un elemento valor.")

    clave, valor = next(iter(diccionario.items()))
    return {valor: clave}

# Ejemplo 
diccionario_original = {'a': 1}
diccionario_invertido = invertir_diccionario(diccionario_original)
print(diccionario_invertido)




#Ejercicio2

def buscar_clave_valor(diccionario, valor):

    claves = []
    for clave, val in diccionario.items():
        if val == valor:
            claves.append(clave)
    return claves

# Ejemplo 
diccionario_ejemplo = {'a': 1, 'b': 2, 'c': 1, 'd': 3}
valor_buscar = 2
resultado = buscar_clave_valor(diccionario_ejemplo, valor_buscar)
print("Claves con el valor", valor_buscar, ":", resultado)  





#Ejercicio3
def rotar_lista(lista, k):

    if not lista:
        return []

    k %= len(lista)  
    return lista[-k:] + lista[:-k]


# Ejemplo 
lista_ejemplo = [1, 2, 3, 4, 5]
k = 3
resultado = rotar_lista(lista_ejemplo, k)
print("Lista original:", lista_ejemplo)
print("Lista rotada", k, "posiciones hacia la derecha:", resultado)





#Ejercicio4
def filtrar_palabras(lista_palabras, n):

    return [palabra for palabra in lista_palabras if len(palabra) > n]


# Ejemplo 
lista_palabras = ["gato", "perro", "elefante", "ratón", "león"]
n = 4




resultado = filtrar_palabras(lista_palabras, n)
print("Palabras con más de", n, "caracteres:", resultado)  

#Ejercicio5
def particionar_lista(lista_numeros, x):
 
    menores = []
    mayores_iguales = []
    for num in lista_numeros:
        if num < x:
            menores.append(num)
        else:
            mayores_iguales.append(num)
    return menores + mayores_iguales

# Ejemplo
lista_numeros = [5, 2, 8, 3, 9, 1, 7]
x = 5
resultado = particionar_lista(lista_numeros, x)
print("Lista dividida con", x, "como divisor:", resultado)  