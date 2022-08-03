public class hw4 {

    //hw1:
    int arr[]={4,7,5,6,-1,3};
        try {
        int smallNum = getSmallPositive(arr);
        System.out.println(smallNum);
    }catch (Exception ex){
        ex.printStackTrace();
    }

        }
        // hw2:


    public static void main(String[] args) {

        //1:
        int arr[]={4,7,5,6,-1,3};
        try {
            int smallNum = getSmallPositive(arr);
            System.out.println(smallNum);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        //2:
        try {
            Customer customer1 = new Customer(12412, "Waleed", 'f');
            System.out.println("Name: "+customer1.getName()+" Id: "+customer1.getID()
                    +" Gender: "+customer1.getGender());
            Customer customer2=new Customer(4111,"Fiasil",'b');
            System.out.println(customer2.toString());


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int getSmallPositive(int[] num)throws RuntimeException{
        int small=Integer.MAX_VALUE;
        for (int i = 0; i <num.length ; i++) {
            if(num[i]<0){
                throw new RuntimeException("There is a negative number!");
            }
            if(num[i]<small){
                small=num[i];
            }
        }
        return small;
    }

