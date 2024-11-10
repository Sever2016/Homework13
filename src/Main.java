public class Main {
    public static void main(String[] args) {

        Book theCountOfMonteCristo = new Book("Граф Монте-Кристо", new Author("Александр", "Дюма"), 1846);
        Book annaKarenina = new Book("Анна Каренина", new Author("Лев", "Толстой"), 1877);
        Book copyAnnaKarenina = new Book("Анна Каренина", new Author("Виктор", "Сметанин"), 2010);
        Author dmitry = new Author("Дмитрий", "Песков");
        Author sergey = new Author("Сергей", "Сафонов");
        Author sergey2 = new Author("Сергей", "Сафонов");

        System.out.println(dmitry.toString());
        System.out.println(annaKarenina.toString());

        if (sergey2.equals(sergey)) {
            System.out.println("Проверка работоспособности equals авторов прошла успешно");
        }

        if (annaKarenina.equals(copyAnnaKarenina)) {
            System.out.println("Equals книг работает правильно");
        }

        if (annaKarenina.hashCode() == copyAnnaKarenina.hashCode()) {
            System.out.println("HashCode равен у разных писателей одной книги");
        }

        if (sergey2.hashCode() == sergey.hashCode()) {
            System.out.println("HashCode равен у одинаковых авторов");
        }
    }
}