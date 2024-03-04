package Tercera_Evaluacion.Personaje;

public class mainApp {
    
}

/*Ejercicio 3 - Clase Abstracta Personaje
Crea una clase abstracta llamada Personaje. 

Propiedades privadas
nombre, vida y fuerza

Métodos abstractos (sin implementar)
atacar(Personaje objetivo)
recibirAtaque(int cantidad)
Métodos no abstractos (implementados)
estaVivo() : Devuelve true o false dependiendo de si el personaje tiene vida.
toString() : Sobreescribir el método. Pinta el nombre y vida del personaje.


A continuación, crearemos tres clases nuevas, extendiendo la clase abstracta. Estas serán: Guerrero, Mago.

Propiedades privadas
resistencia : Para el Guerrero
energia : Para el Mago

Crear el constructor para cada clase con todos los parámetros.


Sobreescribir métodos abstractos
Atacar del Guerrero
 Hace que el objetivo reciba un ataque con la fuerza del guerrero.
Atacar del Mago
 Si la energía del mago es mayor de 4, gastala para hacer que el objetivo reciba un ataque con la fuerza del mago multiplicada por 2. En caso contrario, muestra un mensaje por pantalla.

Recibir ataque al Guerrero
 Se resta a la cantidad de daño recibida la resistencia del guerrero. Si el resultado de la cantidad de daño es mayor a 0, restar dicho daño a la vida del guerrero.
Recibir ataque al Mago
 Resta la cantidad de daño recibida a la vida del mago.




Classe Main() 

Crear un Mago y un Guerrero con cada constructor

Utilizar los métodos para simular una pequeña pelea.


Ejemplo:

guerrero.atacar(mago);
System.out.println(mago.toString());

mago.atacar(guerrero);
System.out.println(guerrero.toString());

System.out.println(guerrero.estaVivo());
 */