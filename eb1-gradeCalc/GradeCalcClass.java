public class GradeCalcClass {
	public int grade1;
	public int grade2;
	public int grade3;
	
	public GradeCalcClass(){
		grade1 = 0;
		grade2 = 0;
		grade3 = 0;
	}
	public GradeCalcClass(int g1, int g2, int g3){
		grade1 = g1;
		grade2 = g2;
		grade3 = g3;
	}
	
	public int finalGrade(){
		if (grade1>=grade2){
			return grade1 + grade3;
		}else{
			return grade2+grade3;
		}
	}
	public String toString(){
		if (finalGrade()>=90){
			return "Final Grade: " + finalGrade() + "\n" + "A";
		}
		else if (finalGrade()>=80){
			return "Final Grade: " + finalGrade() + "\n" + "B";
		}
		else if (finalGrade()>=70){
			return "Final Grade: " + finalGrade() + "\n" + "C";
		}
		else if (finalGrade()>=60){
			return "Final Grade: " + finalGrade() + "\n" + "D";
		}else{
			return "Final Grade: " + finalGrade() + "\n" + "F";
		}
	}
}