import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean ascending = true;
        boolean descending = true;
        boolean inOrder = true;
        
        int currentInput = scanner.nextInt();
        int nextInput;
        
        do {
            nextInput = scanner.nextInt();
            
            if (nextInput == 0) {
                break;
            }
            
            if (nextInput < currentInput) {
                descending = false;
                if (!ascending) {
                    inOrder = false;
                    break;
                }
            } else if (nextInput > currentInput) {
                ascending = false;
                if (!descending) {
                    inOrder = false;
                    break;
                }
            }
            
            currentInput = nextInput;
        } while (true);
        System.out.print(inOrder);
    }
}