public class Variables {
    public static void main(String[] args){
        //String + variable
        String name = "John";
        System.out.println("Hello " + name);

        // String + String
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //Number + Number
        int x = 5;
        int y = 6;
        System.out.println(x + y); 

        //String + Number = String | https://www.w3schools.com/java/java_strings_numbers.asp
        String p = "Super";
        int q = 6;
        System.out.println(p + q); 
        System.out.println("(p + q) is ::" + (p+q).getClass().getName());

        // will generate an error: cannot assign a value to a final or constant variable
        final int myNum = 15;
        //myNum = 20;  
        System.out.println(myNum);


        // Real life example
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);
    }

}
