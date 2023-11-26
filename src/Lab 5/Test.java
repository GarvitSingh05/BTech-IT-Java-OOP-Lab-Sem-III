class A {
    public int a = 100;
}

class B extends A {
    public int a = 80;
}

class C extends B {
    public int a = 60;
}

class D extends C {
    public int a = 40;
}

class E extends D {
    public int a = 10;

    public void show() {
        int a = 0;
        // Display the values of all 'a' variables
        System.out.println("Value of a in E: " + this.a);
        System.out.println("Value of a in D: " + super.a);
        System.out.println("Value of a in C: " + ((C) this).a);
        System.out.println("Value of a in B: " + ((B) this).a);
        System.out.println("Value of a in A: " + ((A) this).a);


        System.out.println("Value of local variable a: " + a);
    }
}

class Test {
    public static void main(String args[]) {
        new E().show(); // This is an example of an anonymous object
        A a1 = new E();
        D d1 = (D) a1;
    }
}
