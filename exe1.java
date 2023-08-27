import javax.swing.JOptionPane;

public class exe1 {
    public static void main(String[] args) {

        // Criando o vetor
        int[] numbers = new int[15];
        
        // Definindo algumas variaveis
        int counter, pairCounter = 0;

        //Fazendo as perguntas dos números 
        for(counter = 0; counter < 15; counter++) {
            numbers[counter] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (counter + 1) + "° número: "));         
        } 

        
        for(counter = 0; counter < 15; counter++) {
            //Verificando caso o N° seja 0
            if(numbers[counter] == 0) 
            {}

            //Verificando os N° pares.
            else if(numbers[counter] % 2 == 0) 
            {
                // Bônus: um contador pra saber quantos N° pares tem.
                pairCounter++;

                JOptionPane.showMessageDialog(null, "O numero " + numbers[counter] + " é par! A sequência até agora tem "  + pairCounter+ " par");
            }
        }
    }
}
