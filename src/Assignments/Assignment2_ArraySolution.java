package Assignments;

public class Assignment2_ArraySolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][][] data = {
				{//Sem 1
			{"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng"},
            {"Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)" }
		
		},
				{//Sem 2
			{"Mathematics II", "Mechanics", "Environmental Sci", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
            {"Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(48)", "Pass(90)" }
		
		},
				{//Sem 3
			{"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog"},
            {"Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)" }
		
		},
				{//Sem 4
			{"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng", "Software Engineering"},
            {"Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)" },
		
		},
				{//Sem 5
			{"Probability and Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
            {"Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)" }
		
		},
	};


		// Print Semester 2,  Subject 4 and Subject 5 names.
		System.out.println(data [1][0][3]);
		System.out.println(data [1][0][4]);
		
		
		// Print the Status/Marks of Semester 4,  Subject 3 and Subject 6.
		System.out.println(data [3][0][2]);
		System.out.println(data [3][0][5]);
		
	}

}
