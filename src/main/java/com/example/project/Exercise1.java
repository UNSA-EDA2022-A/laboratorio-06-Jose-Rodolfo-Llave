package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){
        //Si ambos nodos son nulos quiere decir que el nodo padre no tiene hijos es decir, su
    	//nodo antecesor es un nodo hoja.
    	if(a1 == null && a2 == null) {
    		return true;
        //Basta con que un nodo de cualquier arbol sea nulo y el otro, y viceversa, retornara false
    	} else if((a1!= null && a2 == null) || (a1 == null && a2 != null)) {
    		return false;
    	    }
    	    //Si son nodos padre pasaran a los hijos mediante recursividad
    	return bstSimilares(a1.left, a2.left) && bstSimilares(a1.right, a2.right);
    }
}
