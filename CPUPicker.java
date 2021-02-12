public class CPUPicker {
    AMDProcessors amdProcessors;
    IntelProcessors intelProcessors;

    public CPUPicker(AMDProcessors amdProcessors, IntelProcessors intelProcessors){
        this.amdProcessors = amdProcessors;
        this.intelProcessors = intelProcessors;
    }

    public void printMenu() {
        Iterator amdIterator = amdProcessors.createIterator();
        Iterator intelIterator = intelProcessors.createIterator();
        System.out.println("CPU's\n---\nAMD:");
        printMenu(amdIterator);
        System.out.println("\nIntel:");
        printMenu(intelIterator);
    }
    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            ProcessorItem processorItem = (ProcessorItem)iterator.next();
            System.out.print(processorItem.getName() + ", ");
            System.out.print(processorItem.getCores() + " cores, ");
            System.out.print(processorItem.getThreads() + " threads, ");
            System.out.print("Base clock: " + processorItem.getBaseClock() + ", ");
            System.out.println("$" + processorItem.getPrice() + ", ");
        }
    }
}
