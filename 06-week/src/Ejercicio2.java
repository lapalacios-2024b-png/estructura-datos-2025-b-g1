public class Ejercicio2 {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.insertarFinal(1);
        lista.insertarFinal(3);
        lista.insertarPosicion(2, 2); // Insertar 2 en posición 2
        lista.insertarPosicion(0, 1); // Insertar 0 al inicio
        System.out.println("Lista después de inserciones en posiciones específicas:");
        lista.mostrar();
    }
}
//AUTOR: LUIS ALEJANDRO PALACIOS VALENCIA, FECHA: 090/08/2025