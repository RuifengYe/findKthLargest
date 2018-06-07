class quickSortMethod {
    public static <AnyType extends Comparable<AnyType>> AnyType quicksort(AnyType[] targetArray,int k){
        if(targetArray==null||targetArray.length<k)
            throw new NullPointerException();

    }
    private <AnyType extends Comparable<AnyType>> quicksortRecursive(AnyType[] targetArray,int k,int start,int end){
        int mid=start+end/2;
        swap(targetArray,mid,end);
        int i=start;
        int j=end-1;
        while(i<j)
        {
            while(targetArray[i].compareTo(targetArray[end])<0){
                i++;
            }
            while(targetArray[i].compareTo(targetArray[end])>0){
                j--;
            }
            swap(targetArray,i,j);
        }
        swap(targetArray,i,end);
    }
    private <AnyType extends Comparable<AnyType>> void swap(AnyType[] targetArray,int index1,int index2){
        AnyType tmp=targetArray[index2];
        targetArray[index2]=targetArray[index1];
        targetArray[index1]=tmp;
    }
}
