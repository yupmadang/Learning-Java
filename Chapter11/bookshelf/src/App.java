public class App {
    public static void main(String[] args) throws Exception {
        Queue shlefQueue = new BookShelf();
        shlefQueue.enQueue("������1");
        shlefQueue.enQueue("������2");
        shlefQueue.enQueue("������3");

        System.out.println(shlefQueue.deQueue());
        System.out.println(shlefQueue.deQueue());
        System.out.println(shlefQueue.deQueue());

        
    }
}
