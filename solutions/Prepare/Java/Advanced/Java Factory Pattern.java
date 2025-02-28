//https://www.hackerrank.com/challenges/java-factory/problem

class FoodFactory {
    public Food getFood(String order) {
        if(order.equals("pizza")) {
            return new Pizza();
        } else if (order.equals("cake")) {
            return new Cake();
        }
        
        return null; // If this is reached, then order was not valid

    }//End of getFood method
}//End of factory class