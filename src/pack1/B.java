package pack1;

import pack2.C;
import pack2.D;

public class B extends A {
    public int B1;
    private int B2;
    protected int B3;
    int B4;

    public void TesteA(){
        A a = new A();
    }
    public void TesteB(){
        B b = new B();
    }
    public void TesteC(){
        C c = new C();
    }
    public void TesteD(){
        D d = new D();
    }
}
