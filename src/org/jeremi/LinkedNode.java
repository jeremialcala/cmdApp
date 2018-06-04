package org.jeremi;

public class LinkedNode {

    private int data;
    private LinkedNode node;
    private int level = 0;

    public LinkedNode(int data) {
        this.data = data;
    }

    public void add(int value) {
        if (this.node == null) {
            this.node = new LinkedNode(value);
        } else {
            this.node.add(value);
        }
        this.node.level = level++;
    }

    public void printContent() {
        System.out.println(data);
        if (node.hasNext()) {
            node.printContent();
        }
    }

    public void printLevels() {
        System.out.println(level + " " + data);
        if (node.hasNext()) {
            node.printLevels();
        }
    }

    public int myLevel(int parentLevel) {
        return level;
    }

    public int contains(int value) {
        if (value == data) {
            return level;
        } else {
            if (node.hasNext()) {
                return node.contains(value);
            } else {
                return -1;
            }
        }
    }

    public int nodeValue() {
        if (node.hasNext()) {
            return node.data;
        }
        return -1;
    }

    public boolean hasNext() {
        if (node != null) {
            return true;
        }
        return false;
    }

}
