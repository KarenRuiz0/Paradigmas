// Definir la función iterarLista

 
/* REDUCE */ 
// Reduce es una función de órden superior que recibe una función 
// como parámetro que es aplicada a cada elemento de la lista
def iterarLista(lista: List[Int]): Int = {
  lista.reduce( (x, y) => x + y )
}

/* FILTER */ 
// Filter devuelve una nueva lista que contiene solo aquellos elementos
// que satisfacen la condición especificada.
def mayorQue(lista: List[Int], condicion: Int): List[Int] = {
  lista.filter( (x) => x >= condicion )
}

/* FOR-EACH */
// Es una función de órden superior que recibe una función que
// debe tomar un entero como parámetro y no devolver ningún valor útil (Unit).

def forEach(lista: List[Int], funcion: Int => Unit): Unit = {
  lista.foreach(funcion)
}

/* GROUPBY */
// GroupBy es una función de órden superior que agrupa
// los elementos de la lista según el resultado de la función
// especificada como clave, devolviendo un mapa donde las claves son los
// resultados de la función y los valores son listas de elementos que
// tienen la misma clave.
def apariciones(frase: String, n: Int): Int = {
  frase
    .toLowerCase()
    .split(" ")
    .groupBy(x => x) 
    .values
    .filter(x => x.length >= n)
    .size
}

def fjuegos(numeros: List[String]): List[String] = numeros match {
  case Nil => numeros
  case x::xs if ( x == "1" ) => "algo"::fjuegos(xs)
  case x::xs if ( x == "4" ) => "ritmos"::fjuegos(xs)
  case x::xs if ( x == "10" ) => "elUltimo"::fjuegos(xs)
  case x::xs if ( x == "7" ) => fjuegos(xs)
  case x::xs => x::fjuegos(xs)
}

object MyApp extends App {
  //val list = List(1, 2, 3, 4, 5, 22, 30, 40)
  //val list = List("argentina", "peru", "chile","cuba","china","Irán")
  //val list = List("1", "4", "1", "5", "7", "10", "2")
  
  
  //val result = iterarLista(list)
  //val result = mayorQue(list, 5)
  //val result = forEach(list, elemento => println(elemento))
  //val result = apariciones("pedro pedro pedro pedro pe la la la la pe pe h h h h ka ka ka ka q q q q", 4)
  //val result = fjuegos(list)
  //println(s"$result")
}
