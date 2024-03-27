package trab1;


public class NumeroPerfeito {
    public static void main(String argv[]) {
        int count = 0;
        int num = 1;

        while (count < 4) {
            int soma = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    soma += i;
                }
            }
            if (soma == num) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
