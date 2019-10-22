
package factorymethod;

/**
 *
 * @author Heidi
 */
public class Paviaani extends AterioivaOtus{

    @Override
    public Juoma createJuoma() {
        return new BanaaniPirtelö();
    }
    
}
