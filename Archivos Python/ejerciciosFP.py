print("#### EJERCICIOS JAVA - PYTHON ####")

"""
Ejercicio 1: Calculadora Mejorada
Crea un programa que pida al usuario dos números y una operación (+, -, *, /). Luego, usa una estructura if-elif-else 
para realizar la operación correspondiente. Si el usuario introduce una operación no válida, muestra un mensaje de error.
"""

print("### CALCULADORA MEJORADA ###")

def sumar(num1, num2):
    return num1 + num2

def restar(num1, num2):
    return num1 - num2

def multiplicar(num1, num2):
    return num1 * num2

def dividir(num1, num2):
    return num1 / num2 if num2 != 0 else "Error: División entre 0"

# Diccionario de operaciones
operaciones = {
    "+": sumar,
    "-": restar,
    "*": multiplicar,
    "/": dividir
}

salir = False

while not salir:
    
        numero1 = float(input("Introduce el primer número: "))
        operacion = input("Elige una operación (+, -, *, /): ").strip()
        numero2 = float(input("Introduce el segundo número: "))

        if operacion in operaciones:
            resultado = operaciones[operacion](numero1, numero2)
            print("Resultado:", resultado)
        else:
            print("Por favor, introduce una operación válida.")

    

        seguir = input("¿Seguir operando? (Y/N): ").strip().lower()
        if seguir != "y":
            salir = True
            
print("\n")
  
"""
Ejercicio 2: Contador de Vocales
Pide al usuario una palabra y cuenta cuántas vocales (a, e, i, o, u) tiene. Usa un
bucle for y una lista para almacenar las vocales.
"""

print("### CUENTA VOCALES ###")

listaVocales = ['a','e','i','o','u']
nuevaLista=[]

letra = ""

palabraPedida = str(input("Introduce una palabra:\n"))
palabraPedida = palabraPedida.lower()

#Recorre cada letra de la palabra#

for letra in palabraPedida:
    #Si la letra es vocal, sumamos a la nuevaLista#
    if letra in listaVocales:
        nuevaLista.append(letra)

print(f"\nLa palabra '{palabraPedida}' tiene {len(nuevaLista)} vocales en total")

print("\nConteo de cada vocal: ")

for vocal in listaVocales:
    cantidadVocales = nuevaLista.count(vocal)
    print(f"{vocal.upper()}: {cantidadVocales}")

"""
Ejercicio 3: Manipulación de Listas
Crea una lista con al menos 10 números. Luego:
● Muestra la lista original.
● Muestra solo los números pares.
● Muestra la suma de todos los números de la lista.
● Reemplaza todos los números impares por 0 y muestra la lista modificada.
"""

listaNumeros = []
suma = 0

for i in range(10):
    num = int(input("Introduce un numero para la lista: "))
    listaNumeros.append(num)


print("\nLista Original")
print(listaNumeros)

print("\nNumeros pares")

for num in listaNumeros:
    if num%2 == 0:
        print(num)


for num in listaNumeros:
    suma += num

print("Suma: ",suma)

for i in range(len(listaNumeros)):
    if listaNumeros[i] % 2 != 0:       
        listaNumeros[i]=0
print("Lista Modificada")
print(listaNumeros)

"""
Ejercicio 4: Simulación de Login
Crea un programa que simule un inicio de sesión. Define un usuario y una contraseña
predefinidos. Luego, pide al usuario que ingrese su usuario y contraseña. Si son
correctos, muestra "Acceso concedido", de lo contrario, "Acceso denegado". Dale al
usuario 3 intentos antes de bloquear el acceso.
"""
print("### REGISTRO USUARIO ###")

username = str(input("Establece un Username: "))
contraseña = str(input("Establece una Contraseña: "))

print("### LOGIN ###")


intentos = True
i = 0
while(intentos):
    loginUserName = str(input("Logeate con tu Usuario: "))
    loginContraseña = str(input("Introduce tu Contraseña: "))
    if (loginUserName == username) and (loginContraseña == contraseña):
        print("Acceso concedido.")
        break
    elif (loginUserName != username) or (loginContraseña != contraseña):
        print("Acceso Denegado.")
        i +=1
        if i ==3:
            print("Login Bloqueado - Demasiados intentos fallidos")
            intentos = False
        
"""
Ejercicio 5: Números Primos
Crea una función que reciba un número y determine si es primo o no. Luego, pide un
número al usuario y usa la función para decirle si es primo.
"""

def esPrimo(num):
    primo = False
    
    for i in range(len(num)):
        if num%i == 0:
            print("No es primo")
            primo = False
            break
        else:
            primo =True
            
    return primo

esPrimo(11)

                
        
    

        
    

            
            

