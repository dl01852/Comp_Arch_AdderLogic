/**
 * Created by David on 2/10/2016.
 */
public class Main {

    public static void main(String[] args)
    {
       FullAdder fullAdder = new FullAdder();


        fullAdder.setInputs(false,false,false);//1
        fullAdder.setInputs(false,false,true);//2
        fullAdder.setInputs(false,true,false);//3
        fullAdder.setInputs(false,true,true);//4
        fullAdder.setInputs(true,false,false);//5
        fullAdder.setInputs(true,false,true);//6
        fullAdder.setInputs(true,true,false);//7
        fullAdder.setInputs(true,true,true);//8

    }
}
