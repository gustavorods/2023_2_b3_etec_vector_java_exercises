import javax.swing.JOptionPane;

public class exe2 {
    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        int counter = 0;

        // Recebendo os valores
        for(counter = 0 ; counter < 10; counter++) {
             numbers[counter] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (counter + 1) + "° número: "));
        }

        // Imprimindo os valores 
        for (counter = 0; counter < 10; counter++  ) {
            JOptionPane.showMessageDialog(null, "O " + (counter + 1) + "° número é: " + numbers[counter]);
        } 
    }
}