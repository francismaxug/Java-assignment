public class Verse {

    public static void printVerse(int day) {
        switch (day) {
            case 1:
                System.out.println("Genesis 1:1-5");
                break;
            case 2:
                System.out.println("Genesis 1:6-8");
                break;
            case 3:
                System.out.println("Genesis 1:9-13");
                break;
            case 4:
                System.out.println("Genesis 1:14-19");
                break;
            case 5:
                System.out.println("Genesis 1:20-23");
                break;
            case 6:
                System.out.println("Genesis 1:24-31");
                break;
            case 7:
                System.out.println("Genesis 2:1-3");
                break;
            default:
                System.out.println("Invalid day. Please enter a number between 1 and 7.");
        }
    }
}