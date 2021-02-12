public class ProcessorItem {
    String name;
    int cores;
    int threads;
    String baseClock;
    double price;

    public ProcessorItem(String name, int cores, int threads, String baseClock, double price){
        this.name = name;
        this.cores = cores;
        this.threads = threads;
        this.baseClock = baseClock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    public String getBaseClock() {
        return baseClock;
    }

    public double getPrice() {
        return price;
    }
}
