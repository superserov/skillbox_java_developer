public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        System.out.println("Murka weight: " + murka.getWeight());
        System.out.println("Murka status: " + murka.getStatus());

        while (!murka.getStatus().equals("Dead")) {
            murka.meow();
        }
        System.out.println("Murka weight: " + murka.getWeight());
        System.out.println("Murka status: " + murka.getStatus());

        Cat vasya = new Cat();
        System.out.println("Vasya weight: " + vasya.getWeight());
        System.out.println("Vasya status: " + vasya.getStatus());
        while (!vasya.getStatus().equals("Exploded")) {
            vasya.feed(100.00);
            System.out.println("Vasya weight: " + vasya.getWeight());
            System.out.println("Vasya feed weight: " + vasya.getFeedWeight());
        }
        System.out.println("Vasya status: " + vasya.getStatus());

        Cat felix = new Cat();
        System.out.println("Felix weight: " + felix.getWeight());
        felix.pee();
        System.out.println("Felix weight: " + felix.getWeight());
    }
}