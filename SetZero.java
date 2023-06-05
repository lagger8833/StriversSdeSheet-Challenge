public class SetZero {
	public static void setZeroes(int[][] matrix) {
        int col0 = 1, m = matrix.length, n = matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if( j != 0) matrix[0][j] = 0;
                    else col0 = 0;
                }
            }
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if((matrix[0][j] == 0 || matrix[i][0] == 0) && (matrix[i][j] != 0)){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int i=0; i<n; i++){
                matrix[0][i] = 0;
            }
        }
        if(col0 == 0){
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
    }
	public static void main(String[] args) {
		  int [][] matrix = {{7,19,3},{4,21,0}};
		  setZeroes(matrix);
		  for(int i=0; i<matrix.length; i++){
		  	for(int j=0; j<matrix[0].length; j++){
		  		System.out.println(matrix[i][j]);
		  	}
		  }
	}
}
    
