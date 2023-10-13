package Searching;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Priyanshu";
        char target = 'i';
        System.out.println(search1(name, target));
        System.out.println(search2(name, target));
    }

    static int search1(String str, char ch){
        if(str.isEmpty()){
            return -1;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                return i;
            }
        }
        return -1;
    }

    static int search2(String str, char ch){
        if(str.isEmpty()){
            return -1;
        }
        for(char i : str.toCharArray()){
            if(i == ch){
                return i; // Char Value Returned
            }
        }
        return -1;
    }
}
