import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Declarar un hashmap
        //Map es una palabra reservada
            //MAP es una interfaz
            //<CLAVE-VALOR>
                                                 //Hash se utiliza para hacer busquedas en el map
        Map <Integer,String> mapaEmpleados = new HashMap<>();

        //Método put, para agregar maa valores
        mapaEmpleados.put(1523,"orlando");
        mapaEmpleados.put(1524, "Jesus");
        mapaEmpleados.put(1525, "Javier");
        mapaEmpleados.put(1526, "Roberto");
        mapaEmpleados.put(1527, "Juan");

        //Método containsvalue, para verificar si exsite un valor especifico
        boolean estaValor = mapaEmpleados.containsValue("Jose");
        if (estaValor == true){
            System.out.println("El valor buscado esta");
        }else{
            System.out.println("El valor buscado no esta");
        }

        if (mapaEmpleados.containsKey(1524) == true){
            System.out.println("La clave buscada esta");
        }else{
            System.out.println("La clave buscada no esta");
        }

        //Imprimir los valores de nuestro map
        System.out.println(mapaEmpleados.values());
        System.out.println(mapaEmpleados.keySet());

        //Método get, obtener el valor (value) por medio la clave especifica
        String nombre = mapaEmpleados.get(1529);
        System.out.println(nombre);

        if (nombre == null){
            System.out.println("No existe este nombre");
        }


        //Borrar un valor del mapa, este es por medio de la clave (key)
        mapaEmpleados.remove(1525);//Javier
        System.out.println(mapaEmpleados.values());



    }
}

/*
    COLECCIONES:

        -Son estructuras similares a los arreglos pero su principal característica es que son dinámicos,
         su tamaño y cantidad de elementos puede variar en el tiempo.
        -En java, se emplean mediante la INTERFAZ "Collections", que permite implementar una serie de métodos comunes
         como son: AÑADIR, ELIMINAR, OBTENER EL TAMAÑO DE LA COLECCIÓN, etc.
        -Tienen el tamaño que se quiera y la capacidad de manera dinamica ajustandose a lo que se requiera.

        Tipos principales de Collections:
            -LIST           De los mas utilizados
            -SET
            -QUEUE
            -MAP            De los mas utilizados


        *ARRAYLIST:
            -Las lista son un conjunto de elementos relacionados entre si que tienen un determinado orden.
            -Su tamaño es dinámico (puede cambiar en el tiempo).

            *CARACTERISTICAS:

                >Es un tipo de CLASE ESPECIAL que se representa como una matriz dinámica qu e permite almacenar elementos.
                >Hereda de la clase AbstractList, la cual implementa la Interfaz List.
                >Permite colecciones o elementos duplicados.
                >El orden de los registros es el orden que fueron insertados.
                >Permite acceso aleatorio (tiene índice)
                >Manipulacion lenta (se necesita recorrer todo el arraylist para hacer un cambio).
                >Solo se pueden agregar (inserción) elementos a la lista

            -En java existen diferentes tipos de listas:
                +ArrayList  (FIFO)
                +LinkedList (FIFO)
                +Stack      (LIFO)

            Tipo de orden que pueden tener las listas:
                -FIFO: First in First Out (El primero en entrar es el primero en salir)
                -LIFO: Last in First Out (El ultimo que entro va a ser el primero en salir)


        *LINKEDLIST: (Lista Enlazada)

            -Tipo de CLASE ESPECIAL
            -Representan a una LISTA DOBLEMEMTE ENLAZADA (forma de recorrerlo de ida y vuelta, ambas direcciones)
            -Permite duplicados
            -Mantiene el orden de inserción
            -Manipulación más rápida
            -Puede ser usada/tratada no solo como lista, sino también como PILA, o como COLA
            -Permite hacer INSERCIONES o ELIMINACIONES al principio o al final de la colección
             (por eso es que puede ser tratado como una pila o cola), ejemplo agregar al inicio con el INDICE[0]
                >Podemos agregar registros al principio y al final

                [0]    [1]<---[2]<---[3]
                [0]--->[1]--->[2]--->[3]


        *Diferencias entre ARRAYLIIST y LINKEDLIST:


        Linked List:

       null <---[0]    [1]<---[2]<---[3]
                [0]--->[1]--->[2]--->[3]--->null
                head                tail



        Array = vector

        [0]--->[1]--->[2]--->[3]--->[4]

        Los arraylist si tienen una posicion como los vectores, solo se agregan al final
        En cambio las linkedlist no ya que se puede agregar otro elemento en cualquier lugar

        Para borrar un elemento en el arraylist se debe indicar la posicion [2] mediante el metodo remove,
        luego reacomoda los demas valores para ocupar esa posicion vacia.
        En cambio en la linkedlist se elimina el elemento y se reacomodan los punteros que señalan los elementos


        LAS PILAS (STACKS)
            -Representan a las pilas en la vida real (pila de objetos)
            -Las pilas cumplen con el modelo LIFO (El ultimo en entrar sera el primero en salir)
            -Las pilas tienen sus propios metodos diferentes a arraylist y linkedist




        MAP:
                    (ID)            (VALOR)
                    KEYS            VALUES

                    A -------------->  A'
                    B -------------->  B'
                    C -------------->  C'
                                                        {JSON}

            -Es una colección que se caracteriza de pares clave-valor, donde cada clave está asociada
             a un único valor
            -MAP en java no puede contener claves duplicadas (NO SE PUEDEN REPETIR CLAVES).
            -Permite acceso rapido a los valores a través de las claves.
            -Se pueden devolver json mas estructurados
            -MAP es una INTERFAZ (puede inplementarse de varias formas: hashmap, treemap, linkedmap, etc)

            -Java proporciona diferentes implementaciones de Map:
                +HASHMAP
                +TREEMAP
                +LINKEDMAP
                +ENTRE OTRAS...



             METODOS DE MAP:
                > put (C CLAVE, V VALOR): Agregar una clave y su valor a la collection MAP.
                > get (OBJECT CLAVE) Buscar el valor por medio de la clave especifica y lo devuelve.
                > containsKey (OBJECT CLAVE): Verifica si el Map contiene la clave especificada.
                > containsValue (OBJECT VALOR): Buscar y comprobar si el Map contiene el valor especificado.
                > remove (OBJECT CLAVE): Elimina el registro (clave y valor) por medio de la clave.
                > keySet (): Devuelve un conjunto de todas las claves que exsiten en el Map.
                > values(): Devuelve una colección de todos los valores que contiene el Map.

 */