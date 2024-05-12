package com.pixel.dsstack;

public class StackClass {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class Stack {
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
    }
    public static void main(String[] args) {

    }
}
