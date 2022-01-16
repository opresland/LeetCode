class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set column1 = new HashSet();
        Set column2 = new HashSet();
        Set column3 = new HashSet();
        Set column4 = new HashSet();
        Set column5 = new HashSet();
        Set column6 = new HashSet();
        Set column7 = new HashSet();
        Set column8 = new HashSet();
        Set column9 = new HashSet();

        Set box1 = new HashSet();
        Set box2 = new HashSet();
        Set box3 = new HashSet();
        Set box4 = new HashSet();
        Set box5 = new HashSet();
        Set box6 = new HashSet();
        Set box7 = new HashSet();
        Set box8 = new HashSet();
        Set box9 = new HashSet();

        //Checks each row
        for(int l = 0; l<board.length; l++){
            Set rowSet = new HashSet();
            for(int i=0; i<board[l].length; i++){
                String lineAsString = new String(board[l]);

                if(board[l][i]!='.'){
                    //adds item to box, checks if duplicates
                    if(l<=2){ //first row of boxes

                        if(lineAsString.indexOf(board[l][i])<3){
                            System.out.println(board[l][i]+" added to box 1");
                            if(!box1.add(Integer.parseInt(Character.toString(board[l][i])))) {
                                System.out.println("Duplicate in box 1");
                                return false;
                            }
                        }else if(lineAsString.indexOf(board[l][i])<6){
                            System.out.println(board[l][i]+" added to box 2");
                            if(!box2.add(Integer.parseInt(Character.toString(board[l][i])))) {
                                System.out.println("Duplicate in box 2");
                                return false;
                            }
                        }else if(lineAsString.indexOf(board[l][i])<9){
                            System.out.println(board[l][i]+" added to box 3");
                            if(!box3.add(Integer.parseInt(Character.toString(board[l][i])))) {
                                System.out.println("Duplicate in box 3");
                                return false;
                            }
                        }
                    }else if(l<=5){ //second row of boxes

                        if(lineAsString.indexOf(board[l][i])<3){
                            System.out.println(board[l][i]+" added to box 4");
                            if(!box4.add(Integer.parseInt(Character.toString(board[l][i])))) {
                                System.out.println("Duplicate in box 4");
                                return false;
                            }
                        }else if(lineAsString.indexOf(board[l][i])<6){
                            System.out.println(board[l][i]+" added to box 5");
                            if(!box5.add(Integer.parseInt(Character.toString(board[l][i])))) {
                                System.out.println("Duplicate in box 5");
                                return false;
                            }
                        }else if(lineAsString.indexOf(board[l][i])<9){
                            System.out.println(board[l][i]+" added to box 6");
                            if(!box6.add(Integer.parseInt(Character.toString(board[l][i])))) {
                                System.out.println("Duplicate in box 6");
                                return false;
                            }
                        }
                    }else{ //third row of boxes

                        if(lineAsString.indexOf(board[l][i])<3){
                            System.out.println(board[l][i]+" added to box 7");
                            if(!box7.add(Integer.parseInt(Character.toString(board[l][i])))) {
                                System.out.println("Duplicate in box 7");
                                return false;
                            }
                        }else if(lineAsString.indexOf(board[l][i])<6){
                            System.out.println(board[l][i]+" added to box 8");
                            if(!box8.add(Integer.parseInt(Character.toString(board[l][i])))) {
                                System.out.println("Duplicate in box 8");
                                return false;
                            }
                        }else if(lineAsString.indexOf(board[l][i])<9){
                            System.out.println(board[l][i]+" added to box 9");
                            if(!box9.add(Integer.parseInt(Character.toString(board[l][i])))) {
                                System.out.println("Duplicate in box 9");
                                return false;
                            }
                        }
                    }


                    //adds item to column, checks if duplicates
                    if((lineAsString.indexOf(board[l][i])+1)==1){
                        if(!column1.add(Integer.parseInt(Character.toString(board[l][i])))) {
                            System.out.println("Duplicate in column 1");
                            return false;
                        }
                    }
                    if((lineAsString.indexOf(board[l][i])+1)==2){
                        if(!column2.add(Integer.parseInt(Character.toString(board[l][i])))) {
                            System.out.println("Duplicate in column 2");
                            return false;
                        }
                    }
                    if((lineAsString.indexOf(board[l][i])+1)==3){
                        if(!column3.add(Integer.parseInt(Character.toString(board[l][i])))) {
                            System.out.println("Duplicate in column 3");
                            return false;
                        }
                    }
                    if((lineAsString.indexOf(board[l][i])+1)==4){
                        if(!column4.add(Integer.parseInt(Character.toString(board[l][i])))) {
                            System.out.println("Duplicate in column 4");
                            return false;
                        }
                    }
                    if((lineAsString.indexOf(board[l][i])+1)==5){
                        if(!column5.add(Integer.parseInt(Character.toString(board[l][i])))) {
                            System.out.println("Duplicate in column 5");
                            return false;
                        }
                    }
                    if((lineAsString.indexOf(board[l][i])+1)==6){
                        if(!column6.add(Integer.parseInt(Character.toString(board[l][i])))) {
                            System.out.println("Duplicate in column 6");
                            return false;
                        }
                    }
                    if((lineAsString.indexOf(board[l][i])+1)==7){
                        if(!column7.add(Integer.parseInt(Character.toString(board[l][i])))) {
                            System.out.println("Duplicate in column 7");
                            return false;
                        }
                    }
                    if((lineAsString.indexOf(board[l][i])+1)==8){
                        if(!column8.add(Integer.parseInt(Character.toString(board[l][i])))) {
                            System.out.println("Duplicate in column 8");
                            return false;
                        }
                    }
                    if((lineAsString.indexOf(board[l][i])+1)==9){
                        if(!column9.add(Integer.parseInt(Character.toString(board[l][i])))) {
                            System.out.println("Duplicate in column 9");
                            return false;
                        }
                    }

                    //checks if duplicate in row
                    System.out.println(Integer.parseInt(Character.toString(board[l][i])));
                    if(!rowSet.add(Integer.parseInt(Character.toString(board[l][i])))){
                        System.out.println("Duplicate in line");
                            return false;
                        }
                    }
                }
            }

        System.out.println(column1);
        System.out.println(column2);
        System.out.println(column3);
        System.out.println(column4);
        System.out.println(column5);
        System.out.println(column6);
        System.out.println(column7);
        System.out.println(column8);
        System.out.println(column9);
        
        return true;
    }
}