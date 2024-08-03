public class attBruna {
    public static void main(String[] args) {
        int congruentNumbers[] = new int[8];
        int index = 0;
        for (int i = 0; ;i++) {
            int num = 13 * i + 6;
            if ( num > 100 ) {
                break;
            }

            if ( num >= 1 ) {
                congruentNumbers[index] = num;
                index++;
            }
        }

        System.out.println("Números entre 1 e 100 que são congruentes: ");
        for (int i = 0; i < index; i++) {
            System.out.println(congruentNumbers[i]);
        }
    }
}
