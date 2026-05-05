class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        for(int i=0; i<m; i++)
        {
            if(matrix[0][i]==0)
                firstRow = true;
        }

        for(int i=0; i<n; i++)
        {
            if(matrix[i][0]==0)
                firstCol = true;
        }

        // mark zeroth row and column element as zero if zero encountered in the matrix
        for(int i=1; i<n; i++)
        {
            for(int j=1; j<m; j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // update the elements to according to zeroth row or column. 
        for(int i=1; i<n; i++)
        {
            for(int j=1; j<m; j++)
            {
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        // checking to update firstRow and firstCol if needed 
        if(firstRow)
        {
            for(int i=0; i<m; i++)
            {
                matrix[0][i] = 0;
            }
        }
        if(firstCol)
        {
            for(int i=0; i<n; i++)
            {
                matrix[i][0] = 0;
            }
        }
    }
}