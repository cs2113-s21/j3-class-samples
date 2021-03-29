public class TestLinkedList{

    public static void main(String args[]){

        LinkedList<String> l = new LinkedList<String>();

        l.addToHead("list");
        l.addToHead("the");
        l.addToHead("to");
        l.addToHead("strings");
        l.addToHead("adding");
        l.addToHead("I'm");
        

        //using a foreach iteration
        for(String s : l){
            System.out.print(s+" ");
        }
        System.out.println();

    }

}
