import java.util.*;
import java.io.*;
public class maximumPairwiseProduct{
	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }


		public static long getMaxPairwiseProduct(int[] arrNum){
			long firstMaxNum = -1;
			long secondMaxNum = -1; 
			int firstMaxNumPos = 0;


			//Gets the first max number in the array arrNum
			for(int i = 0;i<arrNum.length;i++){
				if(arrNum[i]>firstMaxNum){
					firstMaxNum=arrNum[i];
					firstMaxNumPos = i;
				}
			}
			//System.out.println(firstMaxNum);
			//Gets the second max number in the array arrNum
			for(int i =0;i<arrNum.length;i++){
				if(arrNum[i]>secondMaxNum&&i!=firstMaxNumPos){
					secondMaxNum=arrNum[i];
				}
			}
			//System.out.println(secondMaxNum);
			return firstMaxNum*secondMaxNum;
		}

    public static void main(String[] args){
			FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
		}


        
    
}
