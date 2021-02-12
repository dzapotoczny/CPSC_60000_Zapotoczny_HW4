public class AMDIterator implements Iterator{
    ProcessorItem[] items;
    int pos = 0;

    public AMDIterator(ProcessorItem[] items){
        this.items = items;
    }

    public Object next(){
        ProcessorItem processorItem = items[pos];
        pos += 1;
        return processorItem;
    }

    public boolean hasNext() {
        return pos < items.length && items[pos] != null;
    }

}
