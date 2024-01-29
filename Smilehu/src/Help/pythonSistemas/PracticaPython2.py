#EJERCICIO 1
# Contando números "step" menores a un millón
count = 0
for num in range(1, 1000000):
    num_str = str(num)
    if all(abs(int(num_str[i]) - int(num_str[i+1])) == 1 for i in range(len(num_str)-1)):
        count += 1
print("Cantidad de números 'step' menores a un millón:", count)


#EJERCICIO 2
# Eliminando vocales del texto ingresado por el usuario
texto = input("Ingrese un texto: ")
vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}
texto_sin_vocales = ''.join(letra for letra in texto if letra not in vocales)
print("Texto sin vocales:", texto_sin_vocales)


#EJERCICIO 3
# Calculando velocidad a partir de distancia y tiempo
def calcular_velocidad(distancia, tiempo):
    velocidad = distancia / tiempo
    return velocidad

distancia = float(input("Ingrese la distancia recorrida (en metros o kilómetros): "))
tiempo = float(input("Ingrese el tiempo empleado (en segundos o horas): "))

velocidad = calcular_velocidad(distancia, tiempo)
print("La velocidad obtenida es:", velocidad, "unidades por segundo o kilómetro, dependiendo de las unidades ingresadas.")



#EJERCICIO 4
# Comprobando si dos palabras riman
def riman(palabra1, palabra2):
    if palabra1[-3:] == palabra2[-3:]:
        print("Las palabras riman.")
    elif palabra1[-2:] == palabra2[-2:]:
        print("Las palabras riman un poco.")
    else:
        print("Las palabras no riman.")

palabra1 = input("Ingrese la primera palabra: ")
palabra2 = input("Ingrese la segunda palabra: ")

riman(palabra1, palabra2)



#EJERCICIO 5
import random

def duplicado(lista):
    return len(lista) != len(set(lista))

# Generando lista de 23 números aleatorios del 1 al 100
numeros_aleatorios = [random.randint(1, 100) for _ in range(23)]

# Comprobando si existen elementos duplicados
if duplicado(numeros_aleatorios):
    print("La lista tiene elementos duplicados.")
else:
    print("La lista no tiene elementos duplicados.")



#EJERCICIO 6
def elimina_duplicados(lista):
    return list(set(lista))

# Ejemplo de uso:
original = [1, 2, 2, 3, 4, 5, 5, 6]
unicos = elimina_duplicados(original)
print("Lista original:", original)
print("Lista sin duplicados:", unicos)
