/**
 * Интерфейс Product предоставляет методы для установки названия, цены и рейтинга продукта.
 */
interface Product {
    /**
     * Устанавливает название продукта.
     * @param name название продукта.
     */
    void setProductName(String name);

    /**
     * Устанавливает цену продукта.
     * @param price цена продукта.
     */
    void setPrice(double price);

    /**
     * Устанавливает рейтинг продукта.
     * @param rating рейтинг продукта.
     */
    void setRating(int rating);
}

/**
 * Класс ProductA представляет конкретный продукт и реализует интерфейс Product.
 */
class ProductA implements Product {
    private String productName;
    private double price;
    private int rating;

    @Override
    public void setProductName(String name) {
        this.productName = name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }
}

/**
 * Класс ProductB представляет другой вариант продукта и реализует интерфейс Product.
 */
class ProductB implements Product {
    private String productName;
    private double price;
    private int rating;

    @Override
    public void setProductName(String name) {
        this.productName = name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }
}

/**
 * Класс ProductC представляет еще один вариант продукта и реализует интерфейс Product.
 */
class ProductC implements Product {
    private String productName;
    private double price;
    private int rating;

    @Override
    public void setProductName(String name) {
        this.productName = name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }
}

/**
 * Интерфейс User предоставляет методы для установки логина и пароля пользователя.
 */
interface User {
    /**
     * Устанавливает логин пользователя.
     * @param login логин пользователя.
     */
    void setLogin(String login);

    /**
     * Устанавливает пароль пользователя.
     * @param password пароль пользователя.
     */
    void setPassword(String password);
}

/**
 * Класс UserA представляет конкретного пользователя и реализует интерфейс User.
 */
class UserA implements User {
    private String login;
    private String password;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}

/**
 * Класс UserB представляет другой вариант пользователя и реализует интерфейс User.
 */
class UserB implements User {
    private String login;
    private String password;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}

/**
 * Класс UserC представляет еще один вариант пользователя и реализует интерфейс User.
 */
class UserC implements User {
    private String login;
    private String password;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}

/**
 * Класс UserProduct представляет объект, который может быть как пользователем, так и продуктом.
 * Реализует интерфейсы Product и User.
 */
class UserProduct implements Product, User {
    private String productName;
    private double price;
    private int rating;
    private String login;
    private String password;

    @Override
    public void setProductName(String name) {
        this.productName = name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Выводит сообщение о покупке продукта данным пользователем.
     */
    public void purchase() {
        System.out.println(this.login + " купил " + this.productName);
    }
}

/**
 * Главный класс Main, демонстрирующий создание объектов и выполнение операций.
 */
public class Main {
    public static void main(String[] args) {
        // Создание продукта типа ProductA
        ProductA productA = new ProductA();
        productA.setProductName("Product A");
        productA.setPrice(20.0);
        productA.setRating(4);

        // Создание пользователя типа UserA
        UserA userA = new UserA();
        userA.setLogin("User A");
        userA.setPassword("password123");

        // Создание объекта UserProduct
        UserProduct userProduct = new UserProduct();
        userProduct.setProductName("Product B");
        userProduct.setPrice(30.0);
        userProduct.setRating(5);
        userProduct.setLogin("User B");
        userProduct.setPassword("securepass");

        // Покупка продукта пользователем
        userProduct.purchase();
    }
}
