package com.jinjeop.calculator;

import java.util.Scanner;

import com.jinjeop.calculator.impl.Child1;
import com.jinjeop.calculator.impl.Child2;
import com.jinjeop.calculator.impl.IChild;
import com.jinjeop.calculator.newcal.AddCal;
import com.jinjeop.calculator.newcal.DivCal;
import com.jinjeop.calculator.newcal.MulCal;
import com.jinjeop.calculator.newcal.NewCalculator;
import com.jinjeop.calculator.newcal.RemCal;
import com.jinjeop.calculator.newcal.SubCal;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 입력: ");
		int firstNum = scanner.nextInt();
		
		System.out.println("두 번째 정수 입력: ");
		int secondNum = scanner.nextInt();
		
		System.out.println("연산자 선택 : 1)ADD 2)SUB 3)MUL 4)DIV 5)REM");
		int selectedOperation = scanner.nextInt();
		
		NewCalculator newCalculator = new NewCalculator();
		if (selectedOperation == 1) {
//			newCalculator.add(firstNum, secondNum);
			newCalculator.calculate(firstNum, secondNum,new AddCal());
		} else if(selectedOperation == 2) {
			//newCalculator.sub(firstNum, secondNum);
			newCalculator.calculate(firstNum, secondNum,new SubCal());
		} else if(selectedOperation == 3) {
			//newCalculator.mul(firstNum, secondNum);
			newCalculator.calculate(firstNum, secondNum,new MulCal());
		} else if(selectedOperation == 4) {
			//newCalculator.div(firstNum, secondNum);
			newCalculator.calculate(firstNum, secondNum,new DivCal());
		} else if(selectedOperation == 5) {
			newCalculator.calculate(firstNum, secondNum,new RemCal());
		}
		
		
		//IChild child1 = new Child1();
		//IChild child2 = new Child2();
		
	}
}
