package IOC;

interface Sim {
    void calling();

    void data();
}

class Airtel implements Sim {
    @Override
    public void calling() {
        System.err.println("Airtel Calling");
    }

    @Override
    public void data() {
        System.out.println("Airtel Data");
    }
}

class Jio implements Sim {
    @Override
    public void calling() {
        System.err.println("Jio Calling");
    }

    @Override
    public void data() {
        System.out.println("Jio Data");
    }
}

// running without spring IOC
public class IOC {
    public static void main(String[] args) {
        Sim sim = new Jio();
        sim.calling();
        sim.data();
    }
}
