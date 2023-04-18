public class Website {
    static int visitCount = 0;

    static {
        System.out.println("Website is loading....");
    }

    static void visit() {
        System.out.println("Thank you for visiting my website");
        visitCount++;
    }

    //Nested class
    static class HomePage {
        public HomePage() {
            visitCount++;
            System.out.println("Thank you for visiting my homepage");
        }
    }
}
