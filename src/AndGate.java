/**
 * Created by David on 2/10/2016.
 * And Gate to simulate logic of boolean Expression
 * input1       input2          output
 * 0            0               0
 * 0            1               0
 * 1            0               0
 * 1            1               1
 */


/****Note***: Vargas had a equals function that returned a boolean
 *            and a makeEquals function that took in an AndGate as a parameter.
 *            I couldn't see the use for these two functions so i didn't add them.
 */
public class AndGate {

    private boolean inputA;
    private boolean inputB;
    private boolean output;

    public AndGate()
    {
        //default.......
    }

    public void setInputs(boolean inputA, boolean inputB)
    {
        this.inputA = inputA;
        this.inputB = inputB;
        execute();
    }

    public boolean getA() {return inputA;}
    public boolean getB() {return inputB;}
    public boolean getOutput() {return output;}
    private void execute() {output = inputA && inputB;}

}
