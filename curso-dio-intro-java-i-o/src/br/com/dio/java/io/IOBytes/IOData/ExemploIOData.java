package br.com.dio.java.io.IOBytes.IOData;

import java.io.*;
import java.util.Scanner;

/*
Crie um arquivo “peca-de-roupa.bin” e armazene:
1. Nome do produto, tamanho (P/M/G/U),quantidade e preço.
2. Leia este arquivo e imprima no console.
*/
public class ExemploIOData {
    public static void incluirProduto() throws IOException {
        File f = new File("C:\\estudos\\curso-dio-intro-java-i-o/peca-roupa.bin");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner scan = new Scanner(System.in);

        ps.printf("Nome da peça: ");
        String nome = scan.nextLine();
        dos.writeUTF(nome);

        ps.printf("Tamanho da peça (P/M/G/U): ");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);

        ps.printf("Quantidade: ");
        int quant = scan.nextInt();
        dos.writeInt(quant);

        ps.print("Preço: ");
        double preco = scan.nextDouble();
        dos.writeDouble(preco);

        ps.printf("O arquivo '%s' foi criado com '%d' bytes no diretório '%s'. \n" , f.getName(), f.length(), f.getAbsolutePath());

        lerProduto(f.getPath());

        dos.close();
        scan.close();
        ps.close();

    }
    public static void lerProduto(String caminhoArquivo) throws IOException {
        File f = new File(caminhoArquivo);
        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.printf("\nNome..........: %s\n", nome);
        System.out.printf("Quantidade..........: %s\n", tamanho);
        System.out.printf("Tamanho..........: %s\n", quantidade);
        System.out.printf("Preço..........: %s\n", preco);
        System.out.print("Total do valor das peças: " + (quantidade*preco));

        dis.close();

    }

    public static void main(String[] args) throws IOException {
        incluirProduto();
    }

}
