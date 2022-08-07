public class Main {
    public static void main(String[] args) {
// task1
        int [] count = new int [3];
        for (int i = 0; i < 3; i++) {
           count[i]=i + 1;
        }

        double[] array2={1.57, 7.654, 9.986};
        boolean [] answers={true, true, false, true};
// task2
        for (int i = 0; i < count.length; i++)
        {
            System.out.print(count[i]);
            if (i < count.length-1)
            { System.out.print(",");
            } else System.out.println();
        }
        for (int i = 0; i < array2.length; i++)
        {
            System.out.print(array2[i]);
            if (i < array2.length-1)
            { System.out.print(",");
            } else System.out.println();
        }
        for (int i = 0; i < answers.length; i++)
        {
            System.out.print(answers[i]);
            if (i < answers.length-1)
            { System.out.print(",");
            } else System.out.println();
        }
// task3
        for (int i = count.length-1; i >= 0; i--)
        {
            System.out.print(count[i]);
            if (i > 0)
            { System.out.print(",");
            } else System.out.println();
        }
        for (int i = array2.length-1; i >= 0; i--)
        {
            System.out.print(array2[i]);
            if (i > 0)
            { System.out.print(",");
            } else System.out.println();
        }
        for (int i = answers.length-1; i >= 0; i--)
        {
            System.out.print(answers[i]);
            if (i >0 )
            { System.out.print(",");
            } else System.out.println();
        }

// task4
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 == 1) {
                count[i] = count[i] + 1;
            }
            System.out.print(count[i]);
            if (i < count.length - 1) {
                System.out.print(",");
            } else System.out.println();
        }
    }
}