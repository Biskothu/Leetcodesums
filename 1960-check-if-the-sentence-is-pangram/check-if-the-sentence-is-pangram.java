class Solution {
    public boolean checkIfPangram(String sentence) {
        // Set set = new HashSet<>();
        // for(int i =0; i<sentence.length(); i++){
        //     set.add(sentence.charAt(i));
        // }
        // return set.size() == 26;

//Method 2

boolean[] arr = new boolean[26];
int index =0;
sentence= sentence.toLowerCase();
for(int i=0; i<sentence.length(); i++){
    char ch = sentence.charAt(i);
    if(ch >= 'a' && ch <= 'z'){
        index = ch -'a';
    }
    arr[index++] = true;
}
  for(int i=0;i<arr.length;i++) {
        if(arr[i] == false) {
            return false;
        }
    }

    return true;
}
    }
