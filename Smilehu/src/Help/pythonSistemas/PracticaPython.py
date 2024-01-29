#EJERCICIO 1

# Punto 1
l1 = ['a', 'c', 'd', 'a', 'l', 'm']
print("Número de veces que la lista contiene 'a':", l1.count('a'))
# Punto 2
l1.remove('d')
print("Lista después de eliminar 'd':", l1)
# Punto 3
l1.insert(2, 'p')
print("Lista después de añadir 'p' en la posición 2:", l1)
# Punto 4
l1.sort()
print("Lista ordenada:", l1)


#EJERCICIO 2

# Punto 2
pizza = {
    'Nombre': 'Pizza Margarita',
    'Ingredientes': ['tomate', 'mozzarella', 'albahaca'],
    'Precio': 10.99
}
# Obtener una lista con las claves
claves_pizza = list(pizza.keys())
print("Lista de claves del diccionario pizza:", claves_pizza)



#EJERCICIO 3
# Punto 3
numeros = {15, 5, 21, 3, 10}

# Subpunto 1
maximo = max(numeros)
minimo = min(numeros)
print("Máximo valor del conjunto:", maximo)
print("Mínimo valor del conjunto:", minimo)

# Subpunto 2
longitud = len(numeros)
print("Longitud del conjunto:", longitud)




#EJERCICIO 4
# Punto 4
dni = input("Ingresa tu DNI: ")
primera_cifra = int(dni[0])
ultima_cifra = int(dni[-1])

if primera_cifra > ultima_cifra:
    print("La primera cifra es mayor que la última.")
elif primera_cifra < ultima_cifra:
    print("La primera cifra es menor que la última.")
else:
    print("La primera y última cifra son iguales.")




#EJERCICIO 5
    # Punto 5
dni = [int(digit) for digit in input("Ingresa tu DNI como una secuencia de dígitos: ")]
cifra_mayor = max(dni)
posicion_cifra_mayor = dni.index(cifra_mayor)

print("La cifra mayor es", cifra_mayor, "y se encuentra en la posición", posicion_cifra_mayor)



#EJERCICIO 6
# Punto 6
def es_palindromo(palabra):
    palabra = palabra.lower()
    return palabra == palabra[::-1]

palabra = input("Ingresa una palabra para verificar si es un palíndromo: ")
if es_palindromo(palabra):
    print("La palabra es un palíndromo.")
else:
    print("La palabra no es un palíndromo.")




#EJERCICIO 7
    # Punto 7
suma_impares = 0
for num in range(1, 101, 2):
    suma_impares += num

print("La suma de los números impares del 0 al 100 es:", suma_impares)



#EJERCICIO 8
# Punto 8
def encontrar_diferencias(cadena1, cadena2):
    diferencias = []
    for i in range(len(cadena1)):
        if cadena1[i] != cadena2[i]:
            diferencias.append(cadena1[i])
    return diferencias

cadena1 = "Me llamo mouredev"
cadena2 = "Me llemo mouredov"
diferencias = encontrar_diferencias(cadena1, cadena2)
print("Caracteres diferentes:", diferencias)



#EJERCICIO 9
# Punto 9
def convertir_temperatura(temperatura, unidad):
    if unidad == 'F':
        return (temperatura * 9/5) + 32
    elif unidad == 'K':
        return temperatura + 273.15
    else:
        return "Unidad no válida"

temperatura_celsius = float(input("Ingresa la temperatura en Celsius: "))
unidad_deseada = input("Ingresa la unidad deseada (F/K): ")
resultado = convertir_temperatura(temperatura_celsius, unidad_deseada)
print(f"{temperatura_celsius}°C es igual a {resultado}°{unidad_deseada}")





#EJERCICIO 10
# Punto 10
def calcular_imc(peso, altura):
    try:
        imc = peso / (altura ** 2)
        return imc
    except ZeroDivisionError:
        return "La altura no puede ser cero."
    except Exception as e:
        return f"Error: {e}"

try:
    peso = float(input("Ingresa tu peso en kg: "))
    altura = float(input("Ingresa tu altura en metros: "))
    resultado_imc = calcular_imc(peso, altura)
    print("Tu índice de masa corporal (IMC) es:", resultado_imc)
except ValueError:
    print("Por favor, ingresa valores numéricos para peso y altura.")
