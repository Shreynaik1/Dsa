public class LinearSearch {
    public static void main(String[] args) {
    String name="RANO RANA NI RITE";
    char ch='x';
    boolean found = false;
    for (int i = 0 ; i < name.length() ; i++){
        if(name.charAt(i)==ch){
            System.out.println("elem found at " + i);
            found=true;
            break;
        }
    }
    if(!found){
        System.out.println("not found");
    }

    }


}
