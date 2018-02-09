
public class Quiz {
	
int numberOne;
int numberTwo;
double answer;

public Quiz() {
	
}

public Quiz(int numberOne, int numberTwo, double answer) {
	
	this.numberOne = numberOne;
	this.numberTwo = numberTwo;
	this.answer = answer;
}

public int getNumberOne() {
	return numberOne;
}

public void setNumberOne(int numberOne) {
	this.numberOne = numberOne;
}

public int getNumberTwo() {
	return numberTwo;
}

public void setNumberTwo(int numberTwo) {
	this.numberTwo = numberTwo;
}

public double getAnswer() {
	return answer;
}

public void setAnswer(double answer) {
	this.answer = answer;
}

@Override
public String toString() {
	return "Quiz [numberOne=" + numberOne + ", numberTwo=" + numberTwo + ", answer=" + answer + "]";
}


}
