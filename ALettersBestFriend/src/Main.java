public class Main {
    public static void main(String[] args) {
        System.out.println(bestFriend("he headed to the store",'h','e'));//t
        //System.out.println(bestFriend("i found an ounce with my hound",'o','u'));//t
        //System.out.println(bestFriend("we found your dynamite",'d','y'));//f
        //System.out.println(bestFriend("a test",'t','e'));//f
        //System.out.println(bestFriend("",'x','y'));//t


    }

    public static boolean bestFriend(String txt, char a, char b) {
        char[] arr=txt.toCharArray();
        boolean status=true;
        for(int i=1;i<arr.length;i++){
            if (arr[i-1]==a) {
                if(arr[i]==b)
                    status=true;
                else{
                    status=false;
                    break;
                }
            }
            if(arr[arr.length-1]==a)
                status=false;

        }
        return status;
    }

}