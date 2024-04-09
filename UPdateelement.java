import java.util.ArrayList;

 class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        String oldValue = "Green";
        String newValue = "Apple";
        if (colors.contains(oldValue)) {
            int index = colors.indexOf(oldValue);
            colors.set(index, newValue);
            System.out.println("Updated ArrayList: " + colors);
        } else {
            System.out.println("Element not found.");
        }
    }
}
