
    import org.testng.Assert;
    import org.testng.annotations.BeforeClass;
    import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.Test;

    public class CalcTest {

        private Calc calc = new Calc();

        @Test
        public void testSum() throws Exception {
            Assert.assertEquals(5, calc.sum(2,3));


        }

        @Test
        public void testSum1() throws Exception {
            Assert.assertEquals(7, calc.sum(2,3));


        }

        @BeforeMethod
        public void setUp() throws Exception {
            System.out.println("@BeforeMethod");
        }

        @BeforeClass
        public void beforeClass() throws Exception {
            System.out.println("@BeforeClass");
        }
    }

