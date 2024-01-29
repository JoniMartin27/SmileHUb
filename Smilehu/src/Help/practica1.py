'''
Ejercicio 1
Escribe un programa que permita crear dos listas de palabras y que, a continuación, escriba las
siguientes listas (en las que no debe haber repeticiones):
● Lista de palabras que aparecen en las dos listas.
● Lista de palabras que aparecen en la primera lista, pero no en la segunda.
● Lista de palabras que aparecen en la segunda lista, pero no en la primera.
'''

#Pedir los datos al usuario
lista1 = input("Ingrese la primera lista de palabras separadas por espacios: ").split()
lista2 = input("Ingrese la segunda lista de palabras separadas por espacios: ").split()


# Para eliminar repeticiones
conjunto1 = set(lista1)
conjunto2 = set(lista2)


#Palabras en ambas listas
en_ambas = list(conjunto1.intersection(conjunto2))
#Palabras que no estas en la segunda
en_primera_no_en_segunda = list(conjunto1.difference(conjunto2))
#Palabras que no estan en la primera
en_segunda_no_en_primera = list(conjunto2.difference(conjunto1))



# Imprimir las listas

print("Palabras que aparecen en ambas listas:", en_ambas)
print("Palabras que aparecen en la primera lista pero no en la segunda:", en_primera_no_en_segunda)
print("Palabras que aparecen en la segunda lista pero no en la primera:", en_segunda_no_en_primera)


'''

Ejercicio 2
Escribe un programa que pregunte por una muestra de números, los guarde en una lista y
muestre por pantalla su media.
'''

 # Pedir al usuario que ingrese una muestra de números separados por espacios
numeros = input("Ingrese una muestra de números separados por espacios: ").split()

    # Convertir los números a tipo float
numeros = [float(numero) for numero in numeros]

    # Calcular la media de los números
media = sum(numeros) / len(numeros)

    # Mostrar la media por pantalla

print("La media de los números ingresados es:", media)



'''
Ejercicio 3
Escribe un programa en Python que lea una lista de países y sus capitales por
teclado y los guarde en un diccionario.
Escribe un programa en Python que busque todos los países que comienzan por
una letra determinada, los añada en una lista y los imprima
Escribe un programa en Python que calcule la superficie total de los países del
diccionario, para ello se debe solicitar la superficie de cada pais.
'''

# Crear un diccionario de países y capitales
paises_capitales = {}
num_paises = int(input("Ingrese el número de países que desea agregar: "))
for _ in range(num_paises):
    pais = input("Ingrese el nombre del país: ")
    capital = input("Ingrese la capital del país: ")
    paises_capitales[pais] = capital

# Imprimir el diccionario de países y capitales
print("Diccionario de países y capitales:", paises_capitales)

# Buscar países que comienzan con una letra determinada
letra = input("Ingrese la letra por la que desea buscar países: ").capitalize()
paises_con_letra = [pais for pais in paises_capitales.keys() if pais.startswith(letra)]
print("Países que comienzan con la letra", letra + ":", paises_con_letra)

# Calcular la superficie total de los países
superficie_total = 0
for pais in paises_capitales:
    superficie = float(input(f"Ingrese la superficie de {pais} en km²: "))
    superficie_total += superficie

# Imprimir la superficie total de los países
print("Superficie total de los países:", superficie_total, "km²")

'''

Ejercicio 4
Escribe un programa en Python que lea una cadena de texto por teclado y
compruebe que no contiene caracteres especiales. Si la cadena contiene caracteres
especiales, el programa debe mostrar un mensaje de error.
Teniendo en cuenta el método: isalnum() devuelve True si la cadena está formada
únicamente por caracteres alfanuméricos, False de lo contrario
'''

cadena = input("Introduce una cadena numerica: ")

if cadena.isalnum():
    print("La cadena contiene unicamente números.")
else:
    print("La cadena contiene algo más que numeros.")

'''
Ejercicio 5
Escribe una función en Python que tome un rango de números y devuelva un
conjunto con los números primos dentro de ese rango.

'''
def numeros_primos_en_rango(rango):
    primos = set()
    for num in range(max(2, rango[0]), rango[1] + 1):
        es_primo = True
        for i in range(2, int(num ** 0.5) + 1):
            if num % i == 0:
                es_primo = False
                break
        if es_primo:
            primos.add(num)
    return primos

# Ejemplo de uso:
rango = (10, 30)
print("Números primos en el rango", rango, ":", numeros_primos_en_rango(rango))