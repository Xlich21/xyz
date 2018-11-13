public class Data {
    public static void main(String[] args) {
        int myAge = 32;
        float weight = 60.5f;
        double height = 356.6;
        long distance = 1234124151325153215l;
        char gender = 'm';
        char test = 9;
        boolean isStudent = false;
        boolean hasJob = true;
        int test2 = (int) weight;

        boolean noMoreCoffee = true;
        if (noMoreCoffee) {
            //System.out.println("Refill");
            //System.out.println("Make Coffee");
        }

        boolean happy = false;
        if (happy) {
            //System.out.println ("Clap your hands!");
        } else {
            //System.out.println ("Don't worry!");
        }
        boolean itIsRaining = false;
        boolean itIsSunny = false;
        boolean itIsSnowing = false;
        if (itIsRaining) {
            //System.out.println("Take an umbrella");
        } else if (itIsSunny) {
            //System.out.println("Take your sunglasses");
        } else if (itIsSnowing) {
            //System.out.println("Play with snow");
        } else {
            //System.out.println("I don't know!");
        }
        boolean i = false;
        boolean j = true;
        if (i = j) {
            //System.out.println("Sunt Egale");
        } else {
            //System.out.println("Nu sunt egale");
        }
        int p = 0;
        while (p < 3) {
            //System.out.println(p);
            p++;
        }

        char number = 0;
        while (number <= 127) {
            System.out.print((int) number);
            System.out.print(' ');
            System.out.println(number);
            number++;
        }


        int Age = 0;
        if (Age < 7) {
            System.out.println("Generation alpha");
        } else if (Age > 6 && Age < 21) {
            System.out.println("Generation Z");
        } else if (Age > 20 && Age < 36) {
            System.out.println("Generation Y");
        } else if (Age > 35 && Age < 51) {
            System.out.println("Generation X");
        } else if (Age > 50 && Age < 70) {
            System.out.println("Baby Boomers");
        } else {
            System.out.println("Builders");
        }


    }

}
