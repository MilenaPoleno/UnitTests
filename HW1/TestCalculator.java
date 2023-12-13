package unittests.HW1;

import org.assertj.core.util.VisibleForTesting;
import static org.assertj.core.api.Assertions.*;

public class TestCalculator {
    public static void main(String[] args) {
        assertThat( Calculator.calculateDiscount( 4000, 10 ) ).isEqualTo( 3600 );

        assertThatThrownBy( () -> Calculator.calculateDiscount( -3000, 10 ) )
                .isInstanceOf( ArithmeticException.class );

        assertThatThrownBy( () -> Calculator.calculateDiscount( 4000, 100 ) )
                .isInstanceOf( ArithmeticException.class );
    }
}