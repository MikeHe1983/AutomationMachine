//package com.hcg.FactoryModel;

class FactoryModelTest {
	
	float a, b ;
	
	public FactoryModelTest(float a, float b) {
		
		System.out.println("This is FacoryModelTest");
		
		this.a = a;
		this.b = b;
	}
	
	public double Operator(char oper) {
		
		double res = 0;
		
		switch (oper) {
			
		   case '+' :
		   
		         //res = a+b;
				 AbstractOperator addOper = new AddOperation();
				 res = addOper.operator(a,b);
				 break;
		   
		   case '-' :
		   
		         AbstractOperator SubOper = new SubOperation();
		         res = SubOper.operator(a,b);
				 break;
		   
		    case '*' :
			
			     AbstractOperator MulOper = new MultiplyOperation();
		         res = MulOper.operator(a,b);
				 break;
			
			case '/' :
			
			     AbstractOperator DivOper = new DividOperation();
		         res = DivOper.operator(a,b);
				 break;
		}
	
	    return res;
	}
	
	
	
	public static void main(String []args) {
		
		//FactoryModelTest fmt = new FactoryModelTest(5f,3.5f);
		
		System.out.println("result is " + (new Context('l')).getOperator().operator(16f,0.8f));
		
	   
	}
}