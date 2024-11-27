class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count =0;
        for(int i=0; i<items.size(); i++){
            List<String> currentList = items.get(i);
            if(ruleKey.equals("type") &&ruleValue.equals(currentList.get(0))){
                count++;
            }
            else if(ruleKey.equals("color")&&ruleValue.equals(currentList.get(1))){
               count++;         
            }  
          else if(ruleKey.equals("name")&&ruleValue.equals(currentList.get(2))){
            count++;
        }
    }
    return count;
}
}