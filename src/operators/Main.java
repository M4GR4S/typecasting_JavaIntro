package operators;

public class Main {
    public static void main(String[] args){

        Operators ops = new Operators();
//        int addResult = ops.add(10, 10);
//        int subtractResult = ops.subtract(10, 5);
//        int multiplyResult = ops.multiply(10, 10);
//        float divideResult = ops.divide(10, 3);
//        int modulusResult = ops.modulus(5, 3);
//        int negateResult = ops.negate(-10);
//        int positiveResult = ops.positive(-10);
        int incrementResult = ops.increment(10);
        int decrementResult = ops.decrement(10);
        boolean notResult = ops.not(true);

//        Operators.Operators.displayResults(addResult);
//        Operators.Operators.displayResults(subtractResult);
//        Operators.Operators.displayResults(multiplyResult);
//        Operators.Operators.displayResults(divideResult);
//        Operators.Operators.displayResults(modulusResult);
//        Operators.Operators.displayResults(negateResult);
//        Operators.Operators.displayResults(positiveResult);
        Operators.displayResults(incrementResult);
        Operators.displayResults(decrementResult);
        Operators.displayBooleanResults(notResult);
    }
}