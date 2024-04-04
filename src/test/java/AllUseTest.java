import org.junit.Test;
import org.junit.Assert;

public class AllUseTest {
    public Sum solver;

    public AllUseTest() {
        this.solver = new Sum();
    }

    @Test
    public void test1() {
        Item[] input = {
                new Item(101, 1),
                new Item(50, 4)
        };
        Assert.assertEquals(this.solver.solve(input), 301, 0.001);
    }

    @Test
    public void test2() {
        Item[] input = {
                new Item(101, 1),
                new Item(50, 1)
        };
        Assert.assertEquals(this.solver.solve(input), 151, 0.001);
    }

    @Test
    public void test3() {
        Item[] input = {
                new Item(101, 1),
                new Item(50, 1),
                new Item(50, 1),
                new Item(50, 1),
                new Item(50, 2),
        };
        Assert.assertEquals(this.solver.solve(input), 261, 0.001);
    }

    @Test
    public void test4() {
        Item[] input = {
                new Item(101, 1),
                new Item(50, 2)
        };
        Assert.assertEquals(this.solver.solve(input), 201, 0.001);
    }
    @Test
    public void test5() {
        Item[] input = {
                new Item(101, 1),
                new Item(50, 1),
                new Item(100, 1),
        };
        Assert.assertEquals(this.solver.solve(input), 231, 0.001);
    }

    @Test
    public void test6() {
        Item[] input = {new Item(50, 1)};
        Assert.assertEquals(this.solver.solve(input), 50, 0.001);
    }
}
