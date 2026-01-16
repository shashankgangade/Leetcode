class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> arr;
        int m = matrix.size();
        int n = matrix[0].size();
        int left = 0;
        int right = matrix[0].size()-1;
        int top =  0;
        int bottom = matrix.size()-1;
           if (matrix.empty()) return arr; 
           if(m==1){
            for (int i = 0;i<n;i++)
            {
                arr.push_back(matrix[0][i]);
            }
            return arr;
           }

        while( top<= bottom && left<=right){
            int i = left;
        while(i<=right)
        {
                arr.push_back(matrix[top][i]);
                i++;
        }
        top++;
        int j = top;
        while(j<=bottom)
        {
             arr.push_back(matrix[j][right]);
             j++;

        }
        right = right -1;
        int k = right;
        if(top<= bottom){
        while(k>=left)
        {
            arr.push_back(matrix[bottom][k]);
            k--;
        }
        }
        bottom = bottom-1;
        int l = bottom;
        if(left<=right){
        while(l >= top){
            arr.push_back(matrix[l][left]);
            l--;
        }
        left = left +1;
        } 
    } 
       return  arr;
    }
};