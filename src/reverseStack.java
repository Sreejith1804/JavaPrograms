import java.util.*;

class customStack{
    int top1,top2;
    int[] stack1;
    int[] stack2;
    customStack(int size){
        stack1 = new int[size];
        stack2 = new int[size];
        top1=-1;
        top2=-1;
    }
    public void push(int data,int stackNum){
        if(stackNum==1) {
            if (top1 == stack1.length - 1) {
                System.out.println("Overflow!!");
            } else {
                stack1[++top1] = data;
            }
        } else if (stackNum==2) {
            if(top2==stack1.length-1){
                System.out.println("Overflow!!");
            }
            else{
                stack2[++top2]=data;
            }
        }
    }

    public int pop(){
        if(top1==-1){
            System.out.println("Stack is empty!!");
            return 0;
        }
        else{
            return stack1[top1--];
        }
    }

//    public void RevStack(int data){
//        if(top2==stack1.length-1){
//            System.out.println("Overflow!!");
//        }
//        else{
//            stack2[++top2]=data;
//        }
//    }

    public void display(){
        for (int i=0;i<=top2;i++) {
            System.out.print(stack2[i] + " ");
        }
    }
}


public class reverseStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        customStack list = new customStack(size);
        for (int i = 0; i <size ; i++) {
           list.push(sc.nextInt(),1);
        }
        for (int i = 0; i <size ; i++) {
            list.push(list.pop(),2);
        }

        list.display();
        sc.close();
    }
}
