import java.util.*;

 class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }


    public void push(T item) {
        stack.add(item);
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
        intStack.push("ha");
        intStack.push("haha");
        intStack.push("hahahaha");
        System.out.println(intStack.pop());
       System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.size());
        
}

 }

