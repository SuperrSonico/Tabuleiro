package br.unisinos;

public class Teste {
    public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.showMap(0);
		System.out.println();
		System.out.println("  --  --  --  --  --  ");
		System.out.println();
		tabuleiro.showMap(1);
		System.out.println();
		System.out.println("  --  --  --  --  --  ");
		System.out.println();
		tabuleiro.showMap(3);
		
	}

}
