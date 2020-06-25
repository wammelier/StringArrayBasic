import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {

        String answer = "";
        String temp = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++){
            if(!completion.equals(participant)){
                temp = participant[i];
            }
        }//end of for

        if(!temp.equals("")){
            answer = temp;
        }else{
            answer = participant[participant.length-1];
        }

        return answer;
    }
}