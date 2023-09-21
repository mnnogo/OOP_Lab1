import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите текст: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int minRusLetter = 'А';
        int maxRusLetter = 'я';

        for (int i = 0; i < str.length(); i++)
        {
            // если русская буква
            if (minRusLetter <= str.charAt(i) && str.charAt(i) <= maxRusLetter)
            {
                System.out.print(str.charAt(i) + "  ");
            }
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++)
        {
            // если заглавная
            if (str.charAt(i) >= minRusLetter && str.charAt(i) <= (int)('Я'))
            {
                int letterplace = ((int)str.charAt(i) - (int)'А' + 1);
                System.out.printf("%-3d", letterplace);
            }
            // если прописная
            else if (str.charAt(i) >= (int)('а') && str.charAt(i) <= maxRusLetter)
            {
                int letterplace = ((int)str.charAt(i) - (int)'а' + 1);
                System.out.printf("%-3d", letterplace);
            }
        }
    }
}