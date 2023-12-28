public class tp2ex1 {
    public static void main(String args[]){
        stack idk = new stack();
        System.out.println(idk.LastInStack());
        idk.AddElement(1);
        System.out.println(idk.LastInStack());
        idk.AddElement(2);
        System.out.println(idk.LastInStack());
        idk.RemoveElement();
        System.out.println(idk.LastInStack());
        idk.RemoveElement();
        System.out.println(idk.LastInStack());
        idk.AddElement(2);
        System.out.println(idk.LastInStack());
    }
}
class element{
    int val;
    element next;
    element(int x){
        val = x;
        next = null;
    }
}
class stack{
    element first;
    stack(){
        first = new element(0);
    }
    stack(int x) {
        first = new element(x);
    }
    void AddElement(int x){
        element temp = new element(x);
        temp.next = first;
        first = temp;
    }
    void RemoveElement(){
        first = first.next;
    }
    int LastInStack(){
        return first.val;
    }
    boolean StackIsEmpty(){
        return first==null;
    }

    boolean StackIsFull(){
        return !StackIsEmpty();
    }

}