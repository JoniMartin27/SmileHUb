#EJERCICIO1

def invertir_diccionario(diccionario):
    """
    Args:
    diccionario (dict): El diccionario a invertir.

    Returns:
    dict: El diccionario invertido.
    """
    if len(diccionario) != 1:
        raise ValueError("El diccionario debe contener exactamente un elemento valor.")

    clave, valor = next(iter(diccionario.items()))
    return {valor: clave}

# Ejemplo 
diccionario_original = {'a': 1}
diccionario_invertido = invertir_diccionario(diccionario_original)
print(diccionario_invertido)  # Salida: {1: 'a'}





#Ejercicio2

def buscar_clave_valor(diccionario, valor):
    """
    Toma un diccionario y un valor como argumentos, y devuelve una lista con todas las claves que tienen ese valor.

    Args:
    diccionario (dict): El diccionario en el que buscar.
    valor: El valor a buscar en el diccionario.

    Returns:
    list: Una lista con todas las claves que tienen el valor especificado.
    """
    claves = []
    for clave, val in diccionario.items():
        if val == valor:
            claves.append(clave)
    return claves

# Ejemplo 
diccionario_ejemplo = {'a': 1, 'b': 2, 'c': 1, 'd': 3}
valor_buscar = 2
resultado = buscar_clave_valor(diccionario_ejemplo, valor_buscar)
print("Claves con el valor", valor_buscar, ":", resultado)  # Salida: ['a', 'c']






#Ejercicio3
def rotar_lista(lista, k):

    if not lista:
        return []

    k %= len(lista)  # Para evitar rotaciones innecesarias si k es mayor que el tamaño de la lista
    return lista[-k:] + lista[:-k]


# Ejemplo 
lista_ejemplo = [1, 2, 3, 4, 5]
k = 3
resultado = rotar_lista(lista_ejemplo, k)
print("Lista original:", lista_ejemplo)
print("Lista rotada", k, "posiciones hacia la derecha:", resultado)  # Salida: [4, 5, 1, 2, 3]




#Ejercicio4
def filtrar_palabras(lista_palabras, n):
    """
    Toma una lista de palabras y un número entero n, y devuelve una nueva lista que contiene
    solo las palabras que tienen más de n caracteres.

    Args:
    lista_palabras (list): La lista de palabras a filtrar.
    n (int): El número mínimo de caracteres que deben tener las palabras.

    Returns:
    list: Una nueva lista que contiene las palabras que tienen más de n caracteres.
    """
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

# Ejemplo de uso
lista_numeros = [5, 2, 8, 3, 9, 1, 7]
x = 5
resultado = particionar_lista(lista_numeros, x)
print("Lista particionada con", x, "como pivote:", resultado)  # Salida: [2, 3, 1, 5, 8, 9, 7]