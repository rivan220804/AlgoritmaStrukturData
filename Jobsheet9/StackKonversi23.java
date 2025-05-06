package Jobsheet9;

public class StackKonversi23 {

        int[] tumpukanBiner;
        int top;
        int size;

        public StackKonversi23() {
            this.size = 32;
            tumpukanBiner = new int[size];
            top = -1;
        }
        
        public boolean isFull() {
            return top == -1;
        }
        
        public boolean isEmpty() {
            return top == -1;
        }
        
        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack penuh!");
            } else {
                top++;
                tumpukanBiner[top] = data;
            }
        }
    
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack kosong!");
                return -1;
            } else {
                int data = tumpukanBiner[top];
                top--;
                return data;
            }
        }
    }
    

