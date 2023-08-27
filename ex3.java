import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args) {
    
        Double[] elements = new Double[10];
        Double[] reverseElements = new Double[10];
        int counter;

        // Recebendo os valores
        for(counter = 0; counter < 10; counter++) {
            elements[counter] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (counter + 1) + "° número:"));
        }
        
        // Imprimindo ele na ordem normal 
        for(counter = 0; counter < 10; counter++) {
            JOptionPane.showMessageDialog(null, "Os valores na ordem normal ficam desse jeito: " + elements[counter]);
        }  

        // Imprimindo eles na ordem inversa 
        for(counter = 0; counter < 10; counter++) {
            reverseElements[counter] = elements[(9 - counter)]; // Lógica: o primeiro valor do lista inversa (reverseElements), vai ser igual ao ultimo valor da lista normal (elements).
            JOptionPane.showMessageDialog(null, "Os valores na ordem inversa ficam desse jeito: " + reverseElements[counter]);
        }
    }   
}
