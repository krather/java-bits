import java.util.Scanner;
public class GradeCalculator {
	public static Scanner keyIn = new Scanner(System.in);
	
	public static double[] getPercentages() {
		double[]Percents;
		int size;
		System.out.println("How many different categories?");
		size = keyIn.nextInt();
		Percents =  new double[size];
		for (int i = 0; i < size; i++) {
			if ((i+1) % 10  > 3) {
				System.out.println("Please enter the " + (i+1) + "th percentage as decimal: ");
			}
			else if ((i+1) % 10  == 3) {
				System.out.println("Please enter the " + (i+1) + "rd percentage as decimal: ");
			}
			else if ((i+1) % 10  == 2) {
				System.out.println("Please enter the " + (i+1) + "nd percentage as decimal: ");
			}
			else if ((i+1) % 10  == 1) {
				System.out.println("Please enter the " + (i+1) + "st percentage as decimal: ");
			}
		Percents[i] = keyIn.nextDouble();
		}
		return Percents;
	}
	
	public static double[] getWeights(int x) {
		double[]weights;
		weights =  new double[x];
		for (int i = 0; i < weights.length; i++) {
			if ((i+1) % 10  > 3) {
				System.out.println("Please enter the " + (i+1) + "th weight as decimal: ");
			}
			else if ((i+1) % 10  == 3) {
				System.out.println("Please enter the " + (i+1) + "rd weight as decimal: ");
			}
			else if ((i+1) % 10  == 2) {
				System.out.println("Please enter the " + (i+1) + "nd weight as decimal: ");
			}
			else if ((i+1) % 10  == 1) {
				System.out.println("Please enter the " + (i+1) + "st weight as decimal: ");
			}
		weights[i] = keyIn.nextDouble();
		}
		return weights;
	}
	
	public static double[] getTotal(double[]x, double[]y) {
		double[]total = new double[x.length];
		for (int i = 0; i < x.length; i++) {
			total[i] = x[i] * y[i];
		}
		return total;
	}
	
	public static double calcGrade(double[] x, double[]y) {
		int weightSum = 0;
		double gradeSum = 0, grade = 0;
		for (int i = 0; i < y.length; i++) {
			weightSum += (int)(y[i]*100);
			gradeSum += x[i]*100;
		}
		grade = gradeSum/weightSum;
		return grade;
	}
	
	public static void main(String[] args) {
		double[]percentages;
		double[]total;
		double grade;
		percentages = getPercentages();
		for (int i= 0; i < percentages.length; i++)
		System.out.println(percentages[i]);
		double[]weights;
		weights = getWeights(percentages.length);
		total = getTotal(weights, percentages);
		grade = calcGrade(total, weights);
		System.out.println("You have a " + (grade* 100) + " in the class.");
	}
}