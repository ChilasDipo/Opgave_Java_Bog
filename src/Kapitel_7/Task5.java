package Kapitel_7;

public class Task5 {

    public static void calling(int[] numbers) {
        int odd = 0;
        int even = 0;

        Task5 opgave = new Task5();

        odd = opgave.oddoreven(numbers,false);
        even = opgave.oddoreven(numbers,true);
        System.out.println("odd =  " + odd + "    even =   " + even );
    }
    
    



    public int oddoreven( int[] numbers , boolean dummy){
    int even = 0 ;
    int odd = 0;
        for ( int num : numbers) {
            if(num == 0){
                continue;
            }
            else if(num%2==0) {
                even++;
            }else {odd++;}
        }
        if(dummy == true ){
            return even;
        }else if (dummy == false) {return odd;}
        return 0;
    }
    
    
    
}
