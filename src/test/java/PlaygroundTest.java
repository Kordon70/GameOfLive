import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * User: arne
 * Date: 10/7/13
 * Time: 2:46 PM
 */
public class PlaygroundTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testInitialisation() throws Exception {
        boolean[][] initialCells = {{true,true},{false,true}};
        Playground playground = new Playground(initialCells);

        boolean[][][] goal = {{{true, false},{true, false}},{{false, false},{true, false}}};
        assertThat(playground.getPlayground(),is(goal));
    }

}
