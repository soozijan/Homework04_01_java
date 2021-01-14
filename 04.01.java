public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random ();

        myFunc ();
        numbers1To100 ();
        zugiOrNot ();
        //Targil 4:
        System.out.println ("Please enter a number");
        int number = scanner.nextInt ();
        zugiOrNotEtgar (number);




    }
       //Targil 1:
       public static void myFunc()   {
        System.out.println ("Hello world");
    }
       //Targil 2:
        public static void numbers1To100 ()   {
         for (int index = 1; index <= 100; index++)   {
             System.out.println (index);
         }
        }

        //Targil 3:
       public static void zugiOrNot ()   {
        Scanner scanner = new Scanner (System.in);
        int number;
        System.out.println (" Please Enter a number");
        number = scanner.nextInt ();
        if (number % 2 == 0)   {
                System.out.println ("zugi");
        }
        else   {
            System.out.println ("Not zugi");
        }

        }

        //Targil 4:
        public static void zugiOrNotEtgar(int number)   {
        if (number % 2 == 0)   {
            System.out.println ("Zugi");
        }
        else {
            System.out.println ("Not zugi");
        }

        }
