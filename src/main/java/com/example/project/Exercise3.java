package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
        //Si el arbol esta vacio, entonces es estrictamente binario
        if(a.isEmpty()) {
    		return true;
        //Si no esta vacio, se procede a verificar
    	} else {
    		return bstEstrictamenteBinario(a.root);
    	}
    }
    
    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(Node<T> node){
        //El caso base es cuando los hijos de los nodos sean nulos, es decir sea un nodo hoja. Entonces retornara true
    	if(node.left == null && node.right == null) {
    		return true;
        //Si el nodo presenta un hijo nulo y otro no nulo, o viceversa, entonces no se cumple la condicion
    	} else if ((node.left == null && node.right != null) || (node.left != null && node.right == null)) {
    		return false;
        //Si el nodo presenta hijos no nulos, se invoca nuevamente a la funcion, para analizar cada hijo
    	} else {
    		return bstEstrictamenteBinario(node.left) && bstEstrictamenteBinario(node.right);
    	}
    }
}
