package Assignment1;

class Matrix {
    private int[][] data;
    public void setData(int[][] data){
        this.data = data;
    }
    public int[][] getData(){
        return this.data;
    }
    public int getRows(){
        return this.data.length;
    }
    public int getColumns(){
        if(this.data != null){
            return this.data[0].length;
        }
        return 0;
    }
    public Matrix(int rows, int columns) {
        if(rows >= 1 && columns >= 1){
            data = new int[rows][columns];
        }else{
            throw new IllegalArgumentException();
        }
    }
    public Matrix(int[][] array){
        if(array != null && array.length >= 1 && array[0].length >= 1){
            data = array;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
