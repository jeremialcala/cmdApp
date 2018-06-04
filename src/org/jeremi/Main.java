package org.jeremi;

public class Main {

    public static void main(String[] args) {
        int[] array = {32,44,22,1,6,3,7,9,31,20};
        BinaryNode three = null;
        LinkedNode node = null;
        for(int elem: array){
            if(three == null){
                three= new BinaryNode(elem);
                node = new LinkedNode(elem);
            }else{
                three.add(elem);
                node.add(elem);
            }
        }

        //three.printInOrder();
        //System.out.println(three.contains(5));
        three.printLevel();
        if(three.left_tot > three.right_tot){
            System.out.println("Left heavy three" + three.left_tot);
        }else{
            System.out.println("Right heavy three" + three.right_tot);
        }
        System.out.println(three.left_tot);
        System.out.println(three.right_tot);
        //node.printLevels();
    }
}
