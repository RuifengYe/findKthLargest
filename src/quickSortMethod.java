class quickSortMethod {
    public static <AnyType extends Comparable<AnyType>> AnyType quicksort(AnyType[] targetArray,int k){
        if(targetArray==null||targetArray.length<k)
            throw new NullPointerException();
      return new quickSortMethod().quicksortRecursive(targetArray,k,0,targetArray.length-1);
    }
    private <AnyType extends Comparable<AnyType>> AnyType quicksortRecursive(AnyType[] targetArray,int k,int start,int end){
        int mid=start+end/2;
        swap(targetArray,mid,end);
        int i=start;
        int j=end;
        while(i<j)
        {
            while(targetArray[i].compareTo(targetArray[end])<0){
                i++;
            }
            while(targetArray[j].compareTo(targetArray[end])>0){
                j--;
            }
            swap(targetArray,i,j);
        }
        swap(targetArray,i,end);
        if(i-start+1==k){
            return targetArray[i];
        }
        else if(i-start+1<k){
            return quicksortRecursive(targetArray,k-i+1,i+1,end);
        }
        return quicksortRecursive(targetArray, k, start, i-1);
    }
    private <AnyType extends Comparable<AnyType>> void swap(AnyType[] targetArray,int index1,int index2){
        AnyType tmp=targetArray[index2];
        targetArray[index2]=targetArray[index1];
        targetArray[index1]=tmp;
    }
}
