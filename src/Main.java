public class Main {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        Mammal barsik = new Cat("барсик");
        ivan.speaker(barsik,"кис-кис");
        ivan.speaker(barsik,"кисуля!");
        barsik.speaker(ivan, "мур-мур!");
        barsik.speaker(ivan, "мррррр...");
    }
}