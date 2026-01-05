import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class part2 {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new FileReader("input2.txt"));
            String line=br.readLine().trim();
            System.out.println(line);
            String[] ranges=line.split(",");

            long sum=0; 

            for(String range:ranges){

                String[] parts=range.split("-");

                long start=Long.parseLong(parts[0]);

                long end=Long.parseLong(parts[1]);
        
                }

                
            }
           // System.out.println(sum);
    }
