package question04;

class Parent {
    private static void privateMethod() {
        System.out.println("Parent's privateMethod");
    }

    static void staticMethod() {
        System.out.println("Parent's staticMethod");
    }
}

class Child extends Parent {
    private static void privateMethod() { // This is a new method, not an override
        System.out.println("Child's privateMethod");
    }

    static void staticMethod() { // This is a new method, not an override
        System.out.println("Child's staticMethod");
    }
}

public class MethodOverrideExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.staticMethod(); // Output: Parent's staticMethod

        Child child = new Child();
        child.staticMethod(); // Output: Child's staticMethod

        Parent parentChild = new Child();
        parentChild.staticMethod(); // Output: Parent's staticMethod

        // parentChild.privateMethod(); // This will not compile as privateMethod() is not accessible
    }
}
