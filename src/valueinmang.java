import java.util.Scanner;

public class valueinmang {
    public static void main(String[] args) {
        String[] studen ={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập tên studen: ");
        String name = scanner.nextLine();
        boolean isexist = false;
        for (int i = 0; i < studen.length;i++){
            if (studen[i].equals(name)){
                System.out.println("position of the studen in the list : " + name + " is: " + (i + 1));
                isexist = true;
                break;
            }
        }
        if (!isexist)
            System.out.println("not found " + name + " in the list .");
    }
}
