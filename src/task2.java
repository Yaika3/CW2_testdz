public class task2 {
    private static int countOccurrences(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }

        return counter;
    }

    public static void task (String[] args)
    {
        String str = "Azkl'fnhknhAmnvzc'mkvmnA";
        char ch = 'A';

        System.out.println("Character " + ch + " occurs " + countOccurrences(str, ch) + " times.");
    }
}
