package arrayprograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Array1DShifting {
	
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < testCases; i++) {
            
            String[] tokens = br.readLine().split(" ");
            
            int[] array = new int[Integer.parseInt(tokens[0])];
            int shift = Integer.parseInt(tokens[1]);
            
            String[] strArray = br.readLine().split(" ");
            
            for (int j = 0; j < array.length; j++) {
                
                array[j] = Integer.parseInt(strArray[j]);
            }
            
            shiftArray(array, shift);
        }
    }
    
    private static void shiftArray(int[] array, int shift) {
        
        int size = array.length;
        
        for (int i = (size - shift); i < size; i++)
            System.out.print(array[i] + " ");
        
        for(int i = 0; i <= shift; i++)
            System.out.print(array[i] + " ");
    }
}
