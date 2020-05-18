package project;
import java.util.*;
import java.util.ArrayList;
public class ToDoList {
	public static void main(String args[])
    {
        boolean b = true;
        int remove = 0;
        ArrayList<String> multi = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        while(true)
        {
           System.out.println("Enter a task that is incomplete.");
           String s = input.nextLine();
           multi.add(s);
           for(int i = 0; i < multi.size(); i++)
           {
               System.out.println(i + 1 + ". " + multi.get(i));
           }
           System.out.println("Do you want to remove a completed task? Type No otherwise");
           String t = input.nextLine();
           if(t.equals("Yes"))
           {
               while(b)
               {
                   try
                   {
                       System.out.println("Enter the task number listed to take away");
                       int taskNumber = Integer.parseInt(input.nextLine());
                       multi.remove(taskNumber - 1);
                       remove++;
                       for(int i = 0; i < multi.size(); i++)
                       {
                           System.out.println(i + 1 + ". " + multi.get(i));
                       }
                       if(multi.size() == 0)
                       {
                           System.out.println("All tasks have been removed.");
                           break;
                       }
                   }
                   catch(Exception IndexOutOfBondsError)
                   {
                       System.out.println("Index out of bounds.");
                       break;
                   }
                   System.out.println("Do you want to remove another task?");
                   Scanner in = new Scanner(System.in);
                   String q = in.nextLine();
                   if(q.equals("Yes"))
                   {
                       b = true;
                   }
                   else
                   {
                       b = false;
                   }
               }
           }
           System.out.println("Do you want to enter another task?");
           Scanner i = new Scanner(System.in);
           String u = i.nextLine();
           if(u.equals("No"))
           {
               System.out.println("Tasks completed today. " + remove);
               System.out.println("Current tasks needing to be complete " + multi.size());
               if(multi.size() == 0)
               {
                   System.out.println("You completed all of your tasks.");
               }
               break;
           }
           else if(u.equals("Yes"))
           {
               continue;
           }
           else
           {
               System.out.println("Enter a valid input.");
           }
        }
    }
}
