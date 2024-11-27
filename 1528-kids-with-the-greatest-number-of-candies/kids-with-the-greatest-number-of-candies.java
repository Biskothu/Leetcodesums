class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxInCandies = 0;
        
        List<Boolean> ans = new ArrayList<>();
        for(int i=0; i<candies.length;i++){
            if(candies[i] > maxInCandies){
                maxInCandies = candies[i];
            }
        }
        for(int i =0; i<candies.length; i++){
            
            if(candies[i]+ extraCandies >= maxInCandies){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}