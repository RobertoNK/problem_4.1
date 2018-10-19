import java.util.Scanner;

public class Problem2_1 {
// PROBLEM 1 FROM CHAPTER 4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double grade, total = 0, minGrade=200;
		for(int i = 0; i < 6 ; i++) {
			System.out.println("Enter quiz grade: ");
			grade = input.nextDouble();
			total = total + grade;
			/*
			if(grade < minGrade) {
				minGrade = grade;
			}
		*/
			minGrade = Math.min(grade, minGrade);
		}
		total = total - minGrade;
		System.out.println("Average: "+ total /5);
		
	}

}
