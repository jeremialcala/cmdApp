package org.jeremi;

public class BinaryNode {
    int data;
    int level = 0;
    BinaryNode left, right;
    int left_tot, right_tot = 0;

    public BinaryNode(int data){
        this.data=data;
    }

    public int getData(){
        return data;
    }

    public void add(int value){
        if(value <=data){
            if(left == null){
                left = new BinaryNode(value);
            }else{
                left.add(value);
            }
            left_tot++;
        }else{
            if(right == null){
                right = new BinaryNode(value);
            }else{
                right.add(value);
            }
            right_tot++;
        }
        level++;
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } if (value <= data) {
            if(left != null){
                return left.contains(value);
            }else{
                return false;
            }
        } else {
            if(right != null) {
                return right.contains(value);
            }else{
                return false;
            }
        }
    }

    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
        System.out.println(data);
        if(right != null){
            right.printInOrder();
        }
    }

    public void printLevel(){
        if(left != null){
            left.printLevel();
        }
        System.out.println(level);
        if(right != null){
            right.printLevel();
        }
    }
}
