import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String name : completion){
            Integer count = map.getOrDefault(name, 0);
            count += 1;
            map.put(name, count);
        }
        
        String answer = "";
        for(String name: participant){
            Integer count = map.getOrDefault(name, 0);
            if(count == 0){
                return name;
            }else{
                map.put(name, count-1);
            }
        }
        
        return answer;
    }
}