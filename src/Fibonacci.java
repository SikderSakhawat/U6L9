/*public class Fibonacci
{
    // instance variable
    private int[] sequence;


    public Fibonacci(int sequenceLen){
        sequence = new int[sequenceLen];
        sequence[0] = 0;
        sequence[1] = 1;
        for(int i = 2; i < sequenceLen; i ++){
            sequence[i] = sequence[i-1] + sequence[i - 2];
        }
    }



    public int[] getSequence(){
        return sequence;
    }


    public int getIndexOf(int searchVal){
        for(int i = 0; i < sequence.length; i++){
            if (sequence[i] == searchVal) return i;
        }
        return -1;
    }



    public void extendBy(int howManyMore){
        int[] newArr = new int[sequence.length + howManyMore];
        newArr[0] = 0;
        newArr[1] = 1;
        for(int i = 2; i < newArr.length; i++){
            newArr[i] = newArr[i-1] + newArr[i-2];
        }
        sequence = newArr;
    }
}*/