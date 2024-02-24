public class OutputForLoops {

    public static void main(String[] args) {

        int numRows = 5;
        int numCols = 5;

        //Outer loop for number of rows

        for (int row = 1; row <= numRows; row ++) {

            //Inner loop for asterisks

            for (int col = 1; col <= numCols; col++)
            {
                System.out.print("*");
            }

            //Moves to next line

            System.out.println();

        }
    }
}