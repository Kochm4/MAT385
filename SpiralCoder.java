import java.util.Scanner;

public class SpiralCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Excluding spaces, your message must be no more than 16 characters");
        System.out.println("Enter Message to be Encoded:");
        String rawMessage = scanner.nextLine();

        //String rawMessage = "invisible writing";
        //Test phrase

        String message = rawMessage.replaceAll(" ", "");
        if (message.length() > 16){
            System.out.println("Your message has too many characters");
            System.exit(0);
        }
        System.out.println("Message without spaces: ");
        System.out.println(message);
        System.out.println("");

        System.out.println("Message inserted into matrix:");
        int size = 4;
        int k = 0;
        char[][] matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                if (k < message.length()){
                    matrix[i][j] = message.charAt(k);
                    k++;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j]==0){
                    break;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println("");

        }
        System.out.println("");
        System.out.println("Your spiral coded message is: ");

        for (int j = 0; j < size; j++) {
            if (matrix[0][j]==0){
                break;
            }
            System.out.print(matrix[0][j]);
        }
        for (int i = 1; i < size; i++){
            if (matrix[i][size-1]==0){
                break;
            }
            System.out.print(matrix[i][size-1]);
        }
        for (int j = size-2; j >= 0; j--) {
            if (matrix[size-1][j]==0){
                break;
            }
            System.out.print(matrix[size-1][j]);
        }
        for (int i = size-2; i >= 1; i--){
            if (matrix[i][0]==0){
                break;
            }
            System.out.print(matrix[i][0]);
        }
        for (int j = 1; j < size-1; j++) {
            if (matrix[1][j]==0){
                break;
            }
            System.out.print(matrix[1][j]);
        }
        for (int i = 2; i < size-1; i++){
            if (matrix[i][size-2]==0){
                break;
            }
            System.out.print(matrix[i][size-2]);
        }
        for (int j = size-3; j >= 1; j--) {
            if (matrix[size-2][j]==0){
                break;
            }
            System.out.print(matrix[size-2][j]);
        }
    }
}

