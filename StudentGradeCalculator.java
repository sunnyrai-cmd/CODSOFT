
import java.util.Scanner;

public class StudentGradeCalcuator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Subjects ");
        int numberSubject = sc.nextInt();
        int[] arr = new int[numberSubject];
        int totalmarks=0;
        for (int i=0;i<numberSubject;i++) {
            System.out.println("Enter Marks Of subbjects " + i+1 + " = " );
            arr[i]=sc.nextInt();
            totalmarks=totalmarks+arr[i];
        }
        System.out.println("Totalmarks of subjects :" + totalmarks);
        
        double avgMarks = totalmarks/numberSubject;
        System.out.println("The Average of Marks is : " + avgMarks +"%");
        char grade;
        if(avgMarks>=90){
            grade='A';
        }
        else if(avgMarks>=80){
            grade='B';
        }
        else if(avgMarks>=70){
            grade='C';
        }
        else if(avgMarks>=60){
            grade='D';
        }
        else{
            grade='F';
        }
        System.out.println("The Grade is = " + grade);
    }
    
}
