
import java.util.*;
 class Node {
        char ch;
        int count;

        public Node(char ch) {
            this.ch = ch;
            this.count = 1;
        }
        public int getValue()
        {
            return this.count;
        }
    }
class FirstNonRepeatingCharacter {

    private static List<Node> charlist = new ArrayList<>();
   
    public static void sort()
    {
      Collections.sort(charlist, Comparator.comparing(Node::getValue));
    }
    
    public static void insert(char ch) {
       boolean flag=false;
       int index=0;
       for (int i=0;i<charlist.size();i++)
       {
        if (charlist.get(i).ch==ch) 
        {
            flag=true;
            index=i;
        }
       }
           
         if (flag==true)
         {
                Node node=charlist.get(index);
                node.count++;
         }    
        
        else {
            Node node = new Node(ch);
            charlist.add(node);
            
        }
        sort();
    }

    public static char findFirstNonRepeating() {
            
            Node node = charlist.get(0);
            if (node.count == 1) {
                return node.ch;
                
            } 
           
        else{
        return '#'; 
        }

       
    }

    public static void main(String[] args) {
        
        insert('a');
        insert('b');
        insert('b');
        System.out.println("First non-repeating character: " + findFirstNonRepeating()); // Output: b
        
    }
}