public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> linkedList = new LinkedList<>();

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        for (char c : input.toCharArray()) {
            linkedList.add(c);
        }
    }
}