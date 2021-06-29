package matriz;

import java.io.*;

public class Contador extends Thread {

    private int inicio;
    private int fim;
    private String palavra;
    private int vezes = 0;

    public Contador(int begin, int end, String word) {
        this.inicio = begin;
        this.fim = end;
        this.palavra = word;
    }

    @Override
    public void run() {
        for (int i = inicio; i <= fim; i++) {
            //Adicionar a pasta dataset ao diretório raíz do projeto
            File file = new File("dataset" + File.separator + i + ".txt");
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
                String line = reader.readLine();
                while(line != null){
                    if(line.equals(palavra))
                        vezes++;
                    line = reader.readLine();
                }
                reader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Erro ao executar!");
            }
        }
    }

    public int getVezes(){
        return vezes;
    }
}
