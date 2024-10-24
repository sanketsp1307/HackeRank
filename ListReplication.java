import java.util.Scanner;
public class ListReplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

System.out.println("Please Enter a Index Number");

int input = sc.nextInt(); // 3

int[] array = new int[input];

for(int i=0;i<input;i++) {

System.out.println("Enter a new number :- ");

array[i]=sc.nextInt();

}

for(int j=0; j<input;j++) {

for(int i=0; i<input;i++) { 
    System.out.println(array[j]);
    }

}
    }
}