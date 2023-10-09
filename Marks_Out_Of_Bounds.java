class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}

class Result {
    private String name;
    private int seatNo;
    private String date;
    private int centerNumber;
    private int marks;

    public Result(String name, int seatNo, String date, int centerNumber, int marks) throws MarksOutOfBoundsException {
        this.name = name;
        this.seatNo = seatNo;
        this.date = date;
        this.centerNumber = centerNumber;

        if (marks < 0 || marks > 100) {
            throw new MarksOutOfBoundsException("Marks should be between 0 and 100.");
        }

        this.marks = marks;
    }

    public void displayResult() {
        System.out.println("Result:");
        System.out.println("Name: " + name);
        System.out.println("Seat No: " + seatNo);
        System.out.println("Date: " + date);
        System.out.println("Center Number: " + centerNumber);
        System.out.println("Marks: " + marks);
    }
}

public class Marks_Out_Of_Bounds {
    public static void main(String[] args) {
        try {
            Result studentResult = new Result("Ami", 123, "2023-10-09", 5678, 85);
            studentResult.displayResult();

        } catch (MarksOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}