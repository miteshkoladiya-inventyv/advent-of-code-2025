import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class part1 {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new FileReader("input1.txt"));
            String line=br.readLine().trim();
            System.out.println(line);
            String[] ranges=line.split(",");

            long sum=0; 

            for(String range:ranges){

                String[] parts=range.split("-");

                long start=Long.parseLong(parts[0]);

                long end=Long.parseLong(parts[1]);

                for(long i=start;i<=end;i++){
                    String s=Long.toString(i);
                    
                    int len=s.length();

                    if(len%2==0){

                        String firstHalf=s.substring(0,len/2);
                        
                        String secondHalf=s.substring(len/2);

                        if(firstHalf.equals(secondHalf)){
                            sum+=i;
                        }
                    }
                }
            }
            System.out.println(sum);
    }
}
