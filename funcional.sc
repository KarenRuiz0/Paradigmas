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

def apariciones(frase: String, n: Int): Int = {
  frase
    .toLowerCase()
    .split(" ")
    .groupBy(x => x) 
    .values
    .filter(x => x.length >= n)
    .size
}

object MyApp extends App {
  //val list = List(1, 2, 3, 4, 5, 22, 30, 40)
  val list = List("argentina", "peru", "chile","cuba","china","Irán")
  
  //val result = iterarLista(list)
  //val result = mayorQue(list, 5)
  //val result = forEach(list, elemento => println(elemento))
  val result = apariciones("pedro pedro pedro pedro pe la la la la pe pe h h h h ka ka ka ka", 4)
  println(s"$result")
}
