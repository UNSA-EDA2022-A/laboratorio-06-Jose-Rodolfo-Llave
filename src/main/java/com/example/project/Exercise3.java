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
        if(a.isEmpty()) {
    		return true;
    	} else {
    		return bstEstrictamenteBinario(a.root);
    	}
    }
    
    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(Node<T> node){
    	if(node.left == null && node.right == null) {
    		return true;
    	} else if ((node.left == null && node.right != null) || (node.left != null && node.right == null)) {
    		return false;
    	} else {
    		return bstEstrictamenteBinario(node.left) && bstEstrictamenteBinario(node.right);
    	}
    }
}
