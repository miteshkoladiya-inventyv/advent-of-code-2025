import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class part1 {
    public static void main(String[] args) throws IOException {
        int position = 50;  
        int countZero = 0;   

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                char direction = line.charAt(0);    
                int steps = Integer.parseInt(line.substring(1));

                if (direction == 'R') {
                    position = (position + steps) % 100;
                } else if (direction == 'L') {
                    position = (position - steps + 100) % 100;
                }

                if (position == 0) {
                    countZero++;
                }
            }

    

        System.out.println("Password: " + countZero);
    }
}
