public class ArrayException {
    public static void main(String[] args) {
        int abc[] = {10, 20, 30};
        try {
            System.out.println(abc[4]);
        }
        catch(Exception f){
            System.out.println("Array Index of Out off BonEs");
        }
    }
}
