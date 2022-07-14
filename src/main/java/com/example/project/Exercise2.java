package com.example.project;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstIguales(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstIguales(BST<T> a1, BST<T> a2){
        //Si ambos estan vacios retorna verdadero.
    	if(a1.isEmpty() && a2.isEmpty()) {
    		return true;
    	//Si uno de los arboles esta vacio y el otro no retornara falso
    	} else if (a1.isEmpty() || a2.isEmpty()){
    		return false;
    	//Si ambos no es tan vacios se comprueba la igualdad
    	} else {
    		return bstIguales(a1.root, a2.root);
    	}
    }
    
    public <T extends Comparable<T>> boolean bstIguales(Node<T> a1, Node<T> a2){
    	//Si ambos nodos son nulos quiere decir que el nodo padre no tiene hijos es decir, su
    	//nodo antecesor es un nodo hoja.
    	if(a1 == null && a2 == null) {
    		return true;
    	//Basta con que un nodo de cualquier arbol sea nulo y el otro, y viceversa, retornara false
    	//Sin embargo, hay una condicion mas y es que si el dato del nodo del arbol a1 es diferente 
    	//al otro dato, tambien retornara false
    	} else if((a1!= null && a2 == null) || (a1 == null && a2 != null) || (a1.data != a2.data)) {
    		return false;
    	}
    	//Si son nodos padre y ademas los datos de ambos nodos de los arboles son iguales
    	//pasaran a los hijos mediante recursividad
    	return bstIguales(a1.left, a2.left) && bstIguales(a1.right, a2.right);

    }
}
