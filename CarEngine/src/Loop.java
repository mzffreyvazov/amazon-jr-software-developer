public class Loop {
    public static void main(String[] args) {
        int x = 12;

        if(x > 10 ) {
            System.out.print("A");

            switch(x){
                case 12:
                    System.out.print("B");
                    break;
                case 14:
                    System.out.print("D");
                    break;
            }


        } else {
            System.out.print("Z");
        }

    }
}
