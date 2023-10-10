import java.util.*;

 class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }


    public void push(T item,int size) {
       if (stack.size()<size)
        {
        stack.add(item);
        }
        else{
            System.out.println("Stack is full!");
        }
        
    }

   
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T top = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return top;
    }

 

  
    public boolean isEmpty() {
        return stack.isEmpty();
    }

   
    public int size() {
        return stack.size();
    }
    


public static void main(String args[])
{
    
GenericStack<String> intStack = new GenericStack<>();
Scanner input= new Scanner(System.in);
System.out.print("Enter size of stack:");

int size=input.nextInt();
input.close();
        intStack.push("ha",size);
        intStack.push("haha",size);
        intStack.push("hahahaha",size);
        System.out.println(intStack.pop());
       System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.size());
        
}

 }

