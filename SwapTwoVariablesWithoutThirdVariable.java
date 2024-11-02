/*
 * Author   : Hasnain Memon
 * Date     : 02/11/2024
 */
public class SwapTwoVariablesWithoutThirdVariable {

    private int num1;
    private int num2;

    public SwapTwoVariablesWithoutThirdVariable(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static void main(String[] args) {

        SwapTwoVariablesWithoutThirdVariable q1 = new SwapTwoVariablesWithoutThirdVariable(8, 12);
        System.out.println("Before Swapping:\nnum1 = " + q1.num1 + ", num2 = " + q1.num2);
        q1.num1 = q1.num1 + q1.num2;
        q1.num2 = q1.num1 - q1.num2;
        q1.num1 = q1.num1 - q1.num2;
        System.out.println("After Swapping:\nnum1 = " + q1.num1 + ", num2 = " + q1.num2);
    }
}
