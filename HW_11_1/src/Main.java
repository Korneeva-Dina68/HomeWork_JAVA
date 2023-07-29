public class Main {
    public static void main (String[] args) {
        Cow cow = new Cow();
        cow.talk();


        Animal animal = new Animal() {
            @Override
            public void talk() {
                System.out.println("Moo-moo!");
            }
        };
        animal.talk();


        Animal animaly = ()-> System.out.println("Moo-moo!");
        animaly.talk();
    }
}
