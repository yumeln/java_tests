package lesson4.part1;

public class Hard2 {
        public static void main(String[] args) {
            int[] randomArray;
            randomArray = new int[10];
            for (int i = 0; i < randomArray.length; i++) {
                int a = (int) (Math.random() * 100);
                randomArray[i] = a;
                System.out.print(i + " ");
                System.out.println(a);
            }
            for (int i = 0; i < randomArray.length; i++) {
                for (int j = i + 1; j < randomArray.length; j++){
                    int tmp = 0;
                    if (randomArray[i] > randomArray[j])
                    {
                        tmp = randomArray[i];
                        randomArray[i] = randomArray[j];
                        randomArray[j] = tmp;

                    }
                }
            }

            for (int i = 0; i < randomArray.length; i++) {
                System.out.println(randomArray[i]);
            }
        }
}
