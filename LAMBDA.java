/**
 * annonymouse
 */
interface annonymouse {

    void meth1(int a);
  //  void meth2();
}

public class LAMBDA {
    public static void main(String[] args) {
        //ANNOTIONS-> GIVES METADATA ABOUT THE PROGRAMME 
       // @SuppressWarnings("deprication")
       //FRIST LETS LEARN ABOUT ANONYMOUS CLASSES :
       /*THESE CLASSES HELP US TO BUILD CONSIZES AND COMPACT CLASSES.
        * RATHER THAN MAKING A COMPLETE CLASS OUT OF AN INTERFACE WE CAN DIRECTLY USE THEM IN THE MAIN ITSELF
        */
        // annonymouse a=new annonymouse() {
            
        //    public  void meth1()
        //     {
        //         System.out.println("bol bhosadike ");
        //     }

        //    public void meth2()
        //     {
        //         System.out.println("hii");
        //     }
        // };
        // a.meth1();//above is an example of anonymouse classes where in we make a reference of the interface
        //and directly use in main class 
        //LAMBDA EXPRESSION
       annonymouse an= (a)->
       {
        System.out.println("HI I AM METH1 FROM LAMBDA "+a);
       };

       an.meth1(4);
//LAMBDA EXPRESSIONS CAN BE USED ON FUNCTIONAL INTERFCES (WHICH HAS ONLY ONE METHOD) AND DIECTLY USD IN MAIN
//WHILE AVOIDING CREATION OF NEW CLASS JUST TO IMPLEMENT THE INTERFACESSS
    }
}
