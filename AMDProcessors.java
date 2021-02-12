public class AMDProcessors {
    static final int MAX_ITEMS = 4;
    int numberOfItems = 0;
    ProcessorItem[] amdItems;

    public AMDProcessors(){
        AMDOptions();
    }
    public void AMDOptions(){
        amdItems = new ProcessorItem[MAX_ITEMS];

        addItem("Ryzen 9 5950X", 16, 32, "3.4 GHz", 799.00);
        addItem("Ryzen 9 5900X", 12, 24, "3.7 GHz", 549.00);
        addItem("Ryzen 7 5800X", 8, 16, "3.8 GHz", 449.00);
        addItem("Ryzen 5 5600X", 6, 22, "3.7 GHz", 299.00);

    }

    public void addItem(String name, int cores, int threads, String baseClock, double price){
        ProcessorItem amdItem = new ProcessorItem(name, cores, threads, baseClock, price);
        if (numberOfItems >= MAX_ITEMS){
            System.err.println("Sorry, AMD processor list is full. Can't add item to list.");
        }else{
            amdItems[numberOfItems] = amdItem;
            numberOfItems += 1;
        }
    }
    public Iterator createIterator(){
        return new AMDIterator(amdItems);
    }
}
