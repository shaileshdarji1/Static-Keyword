public class Main {
    public static void main(String[] args) {
        Website.visit();
        System.out.println(Website.visitCount);

        Website.HomePage homePage = new Website.HomePage();
        System.out.println(Website.visitCount);
    }
}
