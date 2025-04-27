package Assignment1;

interface MatrixPrinter {
    String printMatrix(Matrix matrix);
}
class MatrixOutlinePrinter implements MatrixPrinter{
    public String printMatrix(Matrix matrix) {
        int rows = Matrix.getRows();
        int columns = Matrix.getColumns();

        StringBuilder s = new StringBuilder();

        s.append("+");
        s.append("-".repeat(Math.max(0, columns)));
        s.append("+\n");
        for(int i = 0; i < rows; i++){
            s.append(printRow(matrix, i));
        }
        s.append("+");
        s.append(" ".repeat(Math.max(0, columns)));
        s.append("+");
        return s.toString();
    }
    protected String printRow(Matrix matrix, int rowIndex){
        int columns = Matrix.getColumns();
        StringBuilder s = new StringBuilder();
        s.append("|");
        s.append(" ".repeat(Math.max(0, columns)));
        s.append("|\n");
        return s.toString();
    }
}
class BoolMatrixPrinter extends MatrixOutlinePrinter{
    @Override
    protected String printRow(Matrix matrix, int rowIndex){
        int columns = Matrix.getColumns();
        int rows = Matrix.getRows();
        int[][] data = Matrix.getData();
        StringBuilder s = new StringBuilder();
        s.append("|");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if (data[i][j] == 0){
                    s.append(" ");
                }else if(data[i][j] == 1){
                    s.append("#");
                }else{
                    throw new IllegalArgumentException();
                }
            }
        }
        s.append("|\n");
        return s.toString();
    }

}
