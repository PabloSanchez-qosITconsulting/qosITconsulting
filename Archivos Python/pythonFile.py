n = 4

print(n)

nota_1=2
nota_2 = 5
nota_media = (nota_1+nota_2)/2



print("una linea \nSalto de Linea")

cadena = "Hola"

print(cadena)

print(cadena*2)
print("\n")
print("MINI EJERCICIO - ESPACIOS")
cadena1="Esto son diez espacios:"
cadena2=" "*10
print(cadena1 + cadena2 +" fin")

#Acceder a posiciones de cadena#

palabra = "Pythoon"
letra = palabra[1]
letra2 = palabra[4]
print("\n")
print(palabra)
print("Captar letras especificas")
print("palabra[1]: " + letra)
print("palabra[4]: " + letra2)
print("\n")
print("Captar secuencia de letras")
letras = palabra[0:2]  #De 0 a 2-1#
print("palabra[0:2]: " + letras)

#En Pythoon no se pueden reasiganr valores a una cadena como hacemos en JAVA palabra[0]="N" no es correcto#


print("########## LISTAS ########")

#Lista de cualquier tipo de datos#

numeros = [1,2,3,4,5]
print(numeros)
datos = [4,"una cadena",3.14,-15,"otra cadena","1",1]
print(datos)
#Longitud Lista#
len(datos)
print(datos)
print("\n")
#Puede acceder tambien de dcha a izq con -1#
datos[1]
print(datos)
datos[0:2]
print(datos)
datos[-7:-1]
print(datos)
print("\n")
numeros + [6,7,8,9]
print(numeros)
print("\n")

pares=[2,4,5,8,10]
pares[2]=6
print(pares)

pares.append(12)
print(pares)
letras=['a','b','c','d','e','f']
print(letras[:3])
letras[:3] = ['A','B','C']
print(letras[:3])

a = [1,2,3]
b = [4,5,6]
c = [7,8,9]

r = [a,b,c]

#Accedemos a B y luego al 5
print(r[1])
print(r[1][1])
#Accedemos a C y luego a 9#
print(r[-1])
print(r[-1][-1])

print("====== BOOLEAN TYPES ======")
print(1+1 == 3)

print(1 + 1 == 2)

print(3 > 2 )

print(3 != 2)

printa = 10
printb = 5

printa == b*2

l1 = [0,1,2]
l2 =[2,3,4]

print(l1 == l2)

print(len(l1) == len(l2))

print("############# AND, OR , NOT #############")
print ("not True")
print (not True)
print("True and True")
print(True and True)
print("False and True")
print(False and True)
print("False or True")
print(False or True)

c = "Hola Mundo"
print(len(c) >= 20 and c[0]=='H')
print(len(c) >= 20 or c[0]=='H')

#Para otros tipos de datos hay que utilizar funcion#

c = "Lectura"

print(c[0] == 'H' or c[0] == 'h')

a = 5
print(a)
a = a+2
print(a)
a += 2
print(a)


print("##### ESTRUCTURAS FLUJOS DE CONTROL ########")

print("IF")
print("\n")
if True:
    print("Hola")
    print("Otra Linea")
    print("Siempre tabulado")
    print("\n")
a = 5

#CUIDADO CON LAS ANIDACIONES#
if a==2:
    print("a vale 2")
if a==5:
    print("a vale 5")
print("\n")
n = 5
print("IF/ELSE")
print(n)
if n % 2 == 0:
    print("N es par")
else:
    print("N es impar")
    
    comando = "OTRA COSA"
    
if comando == "ENTRAR":
    print("Bienvenido al sistema")
elif comando == "SALUDAR":
    print("Hola")
elif comando == "SALIR":
    print("Saliendo")
else:
    print("Nada")
    
nota = float(input("Introduce una nota: "))
    
if nota < 5:
    print("Suspenso")
elif nota > 5 and nota < 6:
    print("Bien")
elif nota > 6 and nota < 8:
    print("Notable")
else:
    print("Sobresaliente")
    print("\n")
    print("##### BUCLES WHILE/FOR ######")
    
c = 0
    
while c <= 6:
    c +=1
    print("c vale: ",c)


for i in range(1,11):
    print(f"Tabla del {i}: ")
    for j in range(1,11):
        print(f"{i} x {j} = {i * j}")


numero = int(input("Introduce un numero: "))
print(f"Tabla del {numero}: ")
for i in range(1,11):
    print(f"{numero} x {i}= {numero*i}")


print("\n")
print("####### FUNCIONES ######")

def saludo():
    print("Hola, como estas?")

saludo()

def sumar(a,b):
    return (a + b)

resultado = sumar(3,4)
print("La suma es: ",resultado)

def esPar(num):
    if (num % 2) == 0:
        print("Es par")
    else:
        print("No es par")
        
numeroPrueba = 7

print(esPar(numeroPrueba))

def esParV2(num):
    return  num % 2 == 0
    