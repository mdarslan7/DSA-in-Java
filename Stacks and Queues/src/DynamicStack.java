public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();                //it will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size);            //it will call CustomStack(size)
    }

    @Override
    public boolean push(int item) throws StackException {
        if(this.isFull()) {
            //double the array size
            int[] temp = new int[data.length * 2];
            //copy all previous items
            for(int i=0; i<data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        //at this point we know that array is not full
        return super.push(item);
    }
}