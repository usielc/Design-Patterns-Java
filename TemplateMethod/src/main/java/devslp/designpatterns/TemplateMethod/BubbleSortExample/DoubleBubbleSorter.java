package devslp.designpatterns.TemplateMethod.BubbleSortExample;

public class DoubleBubbleSorter extends BubbleSorter{
    private double [] array = null;

    public void sort(double [] theArray) {
        array = theArray;
        length = theArray.length;
        doSort();
    }

    @Override
    protected boolean outOfOrder(int index) {
        return (array[index-1] > array[index]);
    }

    @Override
    protected void swap(int index) {
        double temp = array[index-1];
        array[index-1] = array[index];
        array[index] = temp;
    }
}
