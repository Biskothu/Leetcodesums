class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         int[][] flipped = new int[image.length][image[0].length];

         for(int i=0; i<image.length;i++){
           int n = image.length;
            int idx =0;
            for(int j =n-1; j>=0; j--){
              flipped[i][idx++]  =image[i][j]; 
            }
         }
         for(int i =0; i<image.length; i++){
            for(int j =0; j<image[0].length; j++){
                if(flipped[i][j] == 0){
                    flipped[i][j] = 1;
                }else{
                    flipped[i][j] = 0;
                }
            }
         }
         return flipped;
        
    }
}