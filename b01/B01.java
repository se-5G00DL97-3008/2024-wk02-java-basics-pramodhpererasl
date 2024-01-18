public class B01{
    public static void main(String[] args){
        for(int x=99; x>=1; x--){
            System.out.println(x + " bottles of beer on the wall, " + x + " bottles of beer.");

            if (x!= 1) {
                System.out.println("Take one down and pass it around, " + (x-1) + " bottles of beer on the wall.");
            } else {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
            }

        }


    }

}