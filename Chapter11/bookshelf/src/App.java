public class App {
    public static void main(String[] args) throws Exception {
        Queue shlefQueue = new BookShelf();
        shlefQueue.enQueue("À×À×ÀÌ1");
        shlefQueue.enQueue("À×À×ÀÌ2");
        shlefQueue.enQueue("À×À×ÀÌ3");

        System.out.println(shlefQueue.deQueue());
        System.out.println(shlefQueue.deQueue());
        System.out.println(shlefQueue.deQueue());

        
    }
}
