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
  
    


