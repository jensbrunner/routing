package ch.jens.routing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class BackendSelectorTest {


    @Test
    void selectsServersRoundRobin() {
        var selector = new BackendSelector(List.of("A", "B", "C"));

        assertEquals("A", selector.nextServer());
        assertEquals("B", selector.nextServer());
        assertEquals("C", selector.nextServer());
        assertEquals("A", selector.nextServer());
    }
}
