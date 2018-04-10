public class Context {
	
	
	AbstractOperator operator = null ;
	
	public Context( char oper) {
		
		switch (oper) {
			
		   case '+' :
		   
		         //res = a+b;
				 operator = new AddOperation();
				 break;
		   
		   case '-' :
		   
		         operator = new SubOperation();
				 break;
		   
		    case '*' :
			
			     operator = new MultiplyOperation();
				 break;
			
			case '/' :
			
			     operator = new DividOperation();
				 break;
			
			default :
			
			     operator = new DefaultOperation();
				 break;
		}
	}
	
	public AbstractOperator getOperator(){
		
		return operator;
	}
	
}