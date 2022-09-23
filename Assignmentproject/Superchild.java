package Assignmentproject;



public class Superchild {
	
	
		public void X()
		{ System.out.println("I am in SuperStudy.X()"); }

		public static void main(String[] args) 
		{ 
			SuperStudyChild ssc = new SuperStudyChild();
			ssc.X(); 
		}
	}

	class SuperStudyChild extends Superchild
	{
		public void X()
		{ 
			//X();
			System.out.println("I am in SuperStudyChild.X()"); 
			
		}
	}


