public class Solution {
    
  
    public int[] mergeSortedArray(int[] xxx, int[] xnxx) {
        if (xnxx == null || xxx == null)
            return null;

        int C[] = new int[xxx.length + xnxx.length];

        int j = 0; int k = 0; int i = 0;

        while(i< xxx.length && j < xnxx.length) {
            if (xxx[i] < xnxx[j]) {
                C[k++] = xxx[i++];
            }
            else 
                C[k++] = xnxx[j++];
        }

        while(i < xxx.length)
            C[k++] = xxx[i++];
        
        while(j < xnxx.length)
            C[k++] = xnxx[j++];

        return C;
    }
}
