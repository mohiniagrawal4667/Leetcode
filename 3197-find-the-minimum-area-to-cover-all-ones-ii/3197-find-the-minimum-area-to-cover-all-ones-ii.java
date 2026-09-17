class Solution {
    public int minimumSum(int[][] grid) {
return Find_the_maximum_area_to_cover(grid);
    }
     public static int Find_the_maximum_area_to_cover(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int ans = Integer.MAX_VALUE;
        //CASE1
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j + 1 < n; j++) {
                ans = Math.min(ans,
                        res(arr, 0, 0, i, m - 1)
                                + res(arr, i + 1, 0, j, m - 1)
                                + res(arr, j + 1, 0, n - 1, m - 1));
            }
        }
        //CASE2
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j + 1 < m; j++) {
                ans = Math.min(ans,
                        res(arr, 0, 0, n - 1, i)
                                + res(arr, 0, i + 1, n - 1, j)
                                + res(arr, 0,j + 1, n - 1, m - 1));
            }
        }
        //CASE3
        for(int i=0;i+1<n;i++){
            for(int j=0;j+1<m;j++){
                ans=Math.min(ans,
                        res(arr,0,0,i,j)
                                +res(arr,0,j+1,i,m-1)
                                +res(arr,i+1,0,n-1,m-1));
            }
        }
        //CASE4
for(int i=0;i+1<n;i++){
    for(int j=0;j+1<m;j++){
        ans=Math.min(ans,
                res(arr,0,0,i,m-1)
                        +res(arr,i+1,0,n-1,j)
                        +res(arr,i+1,j+1,n-1,m-1));
    }
}
//CASE5
            for(int i=0;i+1<n;i++){
                for(int j=0;j+1<m;j++){
                    ans=Math.min(ans,
                            res(arr,0,0,n-1,j)
                                    +res(arr,0,j+1,i,m-1)
                                    +res(arr,i+1,j+1,n-1,m-1));
                }
            }
            //CASE6
            for(int i=0;i+1<n;i++){
                for(int j=0;j+1<m;j++){
                    ans= Math.min(ans,
                            res(arr,0,0,i,j)
                    +res(arr,i+1,0,n-1,j)
                    +res(arr,0,j+1,n-1,m-1));
                }
            }
            return ans;
    }
     public static int res(int[][] arr, int cr, int cc, int er,int ec){
            int minr=Integer.MAX_VALUE;
            int minc=Integer.MAX_VALUE;
            int maxr= Integer.MIN_VALUE;
            int maxc= Integer.MIN_VALUE;


            for(int i=cr;i<=er;i++){
                for(int j=cc;j<=ec;j++){
                    if(arr[i][j]==1){
                        minr=Math.min(minr,i);
                        minc=Math.min(minc,j);
                        maxr=Math.max(maxr,i);
                        maxc= Math.max(maxc,j);
                    }
                }
            }
            int r=maxr-minr+1;
            int c= maxc-minc+1;
            return r*c;

        }
}
