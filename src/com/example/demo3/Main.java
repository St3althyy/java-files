package com.example.demo3;

class SmartPhone {
    void touchScreen() {
        System.out.println("TouchScreen");
    }
}

class Simbian {
    void keyboard() {
        System.out.println("Keyboard");
    }
}

class IPhoneX extends SmartPhone {
    String name;

    public IPhoneX(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "iPhoneX{" + "name='" + name + '\'' + '}';
    }
}

class SamsungNote extends SmartPhone {
    String name;

    public SamsungNote(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SamsungNote{" + "name='" + name + '\'' + '}';
    }
}

class Nokia extends Simbian {
    String name;

    public Nokia(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nokia{" + "name='" + name + '\'' + '}';
    }
}

class Panasonic extends SmartPhone {
    String name;

    public Panasonic(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Panasonic{" + "name='" + name + '\'' + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        IPhoneX iPhoneX = new IPhoneX("iphone");
        printSmartphone(iPhoneX);
//        printSimbian(iPhoneX);

        Nokia nokia = new Nokia("nokia");
//        printSmartphone(nokia);
        printSimbian(nokia);
    }

    static <S extends SmartPhone> void printSmartphone(S s) {
        System.out.println(s);
    }

    static <S extends Simbian> void printSimbian(S s) {
        System.out.println(s);
    }
}
