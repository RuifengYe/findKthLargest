import java.util.PriorityQueue;

class priorityQueueMethod {
    public static <AnyType> AnyType priority(AnyType[] targetArray,int k){
        AnyType output=null;
        int counter=0;
        if(targetArray==null||targetArray.length<k)
            throw new NullPointerException();
        PriorityQueue<AnyType> pq=new PriorityQueue<>(k);
        for(int i=0;i<targetArray.length;i++){
            pq.offer(targetArray[i]);
        }
        while(!pq.isEmpty()){
            counter++;
            output=pq.poll();
            if(counter==k)
                return output;
        }
        return output;
    }
}
