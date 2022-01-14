class Solution {
    public int[] plusOne(int[] digits) {
        //new method will decide if digit can be updated

        boolean addition = false;
        int index = digits.length -1;
        while(!addition){
            if(digits[index]!=9){
                digits[index] += 1;
                addition = true;
                return digits;
            }else if(index>0){
                digits[index] = 0;
                index -= 1;
            }else{
                int[] copy = Arrays.copyOf(digits,digits.length+1);
                copy[0]=1;
                return copy;
            }
            }

//            if(index==0 && !addition){
//                int[] copy = Arrays.copyOf(digits,digits.length+1);
//                copy[0]=1;
//                for(int i=1; i<copy.length; i++){
//                    copy[i]=digits[i-1];
//                }
//                return copy;
//            }


        //initial method converts into a number, adds 1, then converts back to array
        //not particularly efficient and also has problem if number exceeds maximum length
//        long number = 0;
//        long counter = 1;
//
//        for(int i= digits.length -1;i>=0;i--){
//            number += digits[i]*counter;
//            counter = counter * 10;
//        }
//
//        number += 1;
//
//        int[] answer = new int[String.valueOf(number).length()];
//
//        for(int i=0; i<String.valueOf(number).length(); i++){
//            answer[i] = Integer.parseInt(String.valueOf(String.valueOf(number).charAt(i)));
//        }
//
//        return answer;


        return new int[]{0};
    }
}