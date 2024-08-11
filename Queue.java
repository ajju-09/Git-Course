class Queue1{
    int[] arr = new int[5];
    int size;
    int rear;
    int front;
    public void enQueue(int data){
        if(isFull()){
            System.out.println("The Queue is Full no more insertion");
        }
        else{
        arr[rear] = data;
        rear = (rear + 1) % 5;
        size++;
        }
    }

    public int deQueue(){
        int data = arr[front];
        if(isEmpty()){
            System.out.println("The Queue is empty");
        }
        else{
        front++;
        size = (size + 1) % 5;
        }
        return data;
        
    }

    public int Size(){
        return size;
    }

    public boolean isEmpty(){
        return Size()==0;
    }

    public boolean isFull(){
        return Size()==5;
    }

    public void show(){
        System.out.print("Elements : ");
        for(int i=0; i<=size; i++){
            System.out.print(arr[(front+i)%5]+" ");
        }
    }

}

public class Queue {
    public static void main(String[] args) {
        Queue1 queue1 = new Queue1();
        queue1.enQueue(45);
        queue1.enQueue(12);
        queue1.enQueue(33);
        queue1.enQueue(54);

        queue1.deQueue();
        queue1.deQueue();

        queue1.enQueue(34);
        queue1.enQueue(55);

        queue1.show();
    }
    
}
