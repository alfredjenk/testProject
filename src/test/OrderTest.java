

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import main.Order;
import main.MenuItem;

public class OrderTest {


    @Test
    public void testGetNumberOfItems() {

        
        //1. Get obj to be tested

        Order o = new Order();

        //2. Call the method being tested (on the obj)

        int items = o.getNumberOfItems();

        //3. Verify the results (use asertions)

        assertEquals(items, 0);


        
    }

    @Test
    public void testGetNumberOfItemsNotEmpty() {

        //1. Get obj to be tested

        Order o = new Order();
        MenuItem cheeseburger = new MenuItem("cheeseburger", 7.25);

        //2. Call the method being tested (on the obj)

        o.addItem(cheeseburger);

        int items = o.getNumberOfItems();

        //3. Verify the results (use asertions)

        assertEquals(items, 1);

    }

    @Test

    public void testComputeSubTotal() {


        Order o = new Order();
        MenuItem cheeseburger = new MenuItem("cheeseburger", 7.25);
        o.addItem(cheeseburger);

        double subtoal = o.getSubtotal();
        assertEquals(7.25, subtoal, 0.05); //when using double, use a thrid param "delta" for tolerance of error
    } 
    @Test
    public void testComputeSubTotalEmpty() {


        Order o = new Order();
        double subtoal = o.getSubtotal();
        assertEquals(0, subtoal, 0.05); //when using double, use a thrid param "delta" for tolerance of error
    } 
    @Test
    public void testComputeSubTotalMany() {


        Order o = new Order();
        MenuItem cheeseburger = new MenuItem("cheeseburger", 7.25);
        MenuItem ice = new MenuItem("ice", 0.25);
        MenuItem ice2 = new MenuItem("ice2", 0.25);
        o.addItem(cheeseburger);
        o.addItem(ice);
        o.addItem(ice2);

        double subtoal = o.getSubtotal();
        assertEquals(7.75, subtoal, 0.05); //when using double, use a thrid param "delta" for tolerance of error
    } 


}