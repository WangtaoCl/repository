import Component.Man;
import Component.ManDecoratorA;
import Component.ManDecoratorB;
import org.junit.Test;

public class TestDemo {

    
    @Test
    public void Test() {
        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        md1.setPerson(man);
        md1.eat();


    }
}
