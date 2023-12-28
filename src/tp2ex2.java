public class tp2ex2 {
    public static void main(String args[]){
        fly2 l = new fly2();
        RedHeadDucks k = new RedHeadDucks(l);
        k.fly();

    }
}
interface iquack{
    void quack();
}
interface ifly{
    void fly();
}
abstract class duck{
    public void display(){
        System.out.println("kol");
    }
}
/*class RedheadDuck extends duck implements iquack, ifly{
    public void quack(){
        System.out.println("l");
    }
    public void fly(){
        System.out.println();
    }
}*/
class fly1 implements ifly{
    public void fly(){
        System.out.println("fly1");
    }
}
class fly2 implements ifly{
    public void fly(){
        System.out.println("fly2");
    }
}
class RedHeadDucks extends duck implements ifly {
    private ifly lfly;
    RedHeadDucks(ifly lol){
        this.lfly = lol;
    }
    public void fly(){
        lfly.fly();
    }

}