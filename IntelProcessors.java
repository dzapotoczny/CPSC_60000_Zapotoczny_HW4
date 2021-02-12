import java.util.ArrayList;

public class IntelProcessors {
    ArrayList<ProcessorItem> intelItems;

    public IntelProcessors(){
        IntelOptions();
    }

    public void IntelOptions(){
        intelItems = new ArrayList<ProcessorItem>();

        addItem("Intel Core i9-10900K", 10, 20, "3.7 GHz", 444.99);
        addItem("Intel Core i7-10700K", 8, 16, "3.8 GHz", 344.99);
        addItem("Intel Core i5-10600", 6, 12, "4.1 GHz", 189.99);
        addItem("Intel Core i3-10100", 4, 8, "3.6 GHz", 114.99);

    }

    public void addItem(String name, int cores, int threads, String baseClock, double price){
        ProcessorItem intelItem = new ProcessorItem(name, cores, threads, baseClock, price);
        intelItems.add(intelItem);
    }
    public Iterator createIterator(){
        return new IntelIterator(intelItems);
    }
}
