public class ForWhileDowhile {
    public static void main(String[] args){

        for(int i=1; i<=5; i++) {
            System.out.println(i);
        }
        
        System.out.println(); 

        int i = 1;
        while(i<=5) {
            System.out.println(i);
            i++;
        }

        System.out.println(); 
        
        int j=1;
        do{
            System.out.println(j);
            j++;
        } while(j <= 5);
    }
}
