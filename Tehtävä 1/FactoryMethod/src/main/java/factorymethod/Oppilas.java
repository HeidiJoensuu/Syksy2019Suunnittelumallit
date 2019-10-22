
package factorymethod;

/**
 *
 * @author Heidi
 */
public class Oppilas extends AterioivaOtus{

    @Override
    public Juoma createJuoma() {
        return new Pillimehu();
    }
    
}
