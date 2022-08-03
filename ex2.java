public class ex2 {
    public static boolean div (int num) throws Exception{

        if(num % 5!=0){throw new Exception ("false");
        }

        return true;}
    public static void main(String[] args) {

        try {boolean result= div(10);
            if (result){
                System.out.println("true");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }   }