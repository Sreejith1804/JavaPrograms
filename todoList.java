import java.util.LinkedList;
import java.util.Scanner;

class todoList{
    LinkedList<String> list;
    public  todoList(){
        list = new LinkedList<>();
        list.add("Reading");
        list.add("Running");
        list.add("Washing");
        list.add("Cooking");
        list.add("Problem-solving");
       
    }
    public void display(){
        if(list.isEmpty()){
            System.out.println("The list is empty");
        }
        else{
            for(int i=0;i<list.size();i++){
                System.out.println((i+1)+"."+list.get(i));
            }
        }
    }
   
    public void addTask(String task){
        list.add(task);
        System.out.println("The task"+task+"added successfully");
       
    }
   
    public void check(int taskNo){
        if(taskNo<=0 || taskNo>list.size()){
            System.out.println("Invalid task number!!");
        }
        else{
            String task = list.remove(taskNo-1);
            System.out.println("The task"+task+"completed");
            }
        }
    }
   

public class Main
{
public static void main(String[] args) {
int choice;
Scanner sc = new Scanner(System.in);
todoList tdl = new todoList();
do{
System.out.println("\nDo you want to add task or exit\n1.Display\n2.Add\n3.Status\n4.Exit");
choice = sc.nextInt();


    switch(choice){
        case 1:
            tdl.display();
            break;
           
        case 2:
            System.out.println("Enter a task:");
            String task = sc.nextLine();
            tdl.addTask(task);
            break;
           
       case 3:
            tdl.display();
            System.out.println("Enter a task no:");
            int taskNo = sc.nextInt();
            tdl.check(taskNo);
            break;
           
       case 4:
           System.out.println("Exiting.....");
           break;
           
        default:
           System.out.println("Invalid choice!!!");
           
    }
}while(choice!=4);

}
}
