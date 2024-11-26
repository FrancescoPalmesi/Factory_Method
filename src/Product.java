abstract class Product {
    public abstract void use();
}

class ConcreteProductA extends Product {
    public void use() {
        System.out.println("Using Product A");
    }
}

class ConcreteProductB extends Product {
    public void use() {
        System.out.println("Using Product B");
    }
}

abstract class Creator {
    public abstract Product factoryMethod();
}

class ConcreteCreatorA extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}