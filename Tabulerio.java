package br.unisinos;

public class Tabuleiro {
	private int[][] tabuleiro;
	private int[][] revelados;

	// 0=AGUA
	// 1=PORTA AVIOES
	// 2=CRUZADOR
	// 3=SUBMARINOI
	// -1=TIRO

	public Tabuleiro() {
		tabuleiro = new int[10][15];
		geraTabuleiro();

	}

	//DONE
	private void geraTabuleiro() {
		setPortaAviao();
		setCruzador();
		setSubmarino();
	}
								
	//DONE
	private void setPortaAviao() {
		for (int i = 0; i < 3; i++) {
			if ((int) (Math.random() * 3) < 2) {
				// horizontal
				int linha = (int) (Math.random() * 10);
				int coluna = (int) (Math.random() * 10);
				// muda o tabuleiro
				boolean doesntFits;
				do {
					doesntFits = false;
					for(int j=coluna;j< coluna +5;j++){
						if(tabuleiro[linha][j]==1){
							doesntFits=true;
						}
					}
					if(doesntFits==true){
						linha = (int) (Math.random() * 10);
						coluna = (int) (Math.random() * 10);
					}
				} while(doesntFits==true);
				for (int j = coluna; j < coluna + 5; j++) {
					tabuleiro[linha][j] = 1;
				}
			} else {
				// vertical
				int linha = (int) (Math.random() * 5);
				int coluna = (int) (Math.random() * 15);
				// muda o tabuleiro
				// testa se sobrepoe
				boolean doesntFits;
				do {
					doesntFits = false;
					for (int j = linha; j < linha + 5; j++) {
						if (tabuleiro[j][coluna] == 1)
							doesntFits = true;
					}
					if (doesntFits == true) {
						linha = (int) (Math.random() * 5);
						coluna = (int) (Math.random() * 15);

					}
				} while (doesntFits == true);
				for (int j = linha; j < linha + 5; j++) {
					tabuleiro[j][coluna] = 1;
				}
			}

		}

	}

	//INCOMPLETO
	private void setCruzador() {
		for (int i = 0; i < 3; i++) {
			if ((int) (Math.random() * 3) < 2) {
				// horizontal
				int linha = (int) (Math.random() * 10);
				int coluna = (int) (Math.random() * 10);
				// muda o tabuleiro
				boolean doesntFits;
				do {
					doesntFits = false;
					for(int j=coluna;j< coluna +5;j++){
						if((tabuleiro[linha][j]==1) || (tabuleiro[linha][j]==2)){
							doesntFits=true;
						}
					}
					if(doesntFits==true){
						linha = (int) (Math.random() * 10);
						coluna = (int) (Math.random() * 10);
					}
				} while(doesntFits==true);
				for (int j = coluna; j < coluna + 5; j++) {
					tabuleiro[linha][j] = 2;
				}
			} else {
				// vertical
				int linha = (int) (Math.random() * 5);
				int coluna = (int) (Math.random() * 15);
				// muda o tabuleiro
				// testa se sobrepoe
				boolean doesntFits;
				do {
					doesntFits = false;
					for (int j = linha; j < linha + 5; j++) {
						if (tabuleiro[j][coluna] == 1 || tabuleiro[j][coluna]==2)
							doesntFits = true;
					}
					if (doesntFits == true) {
						linha = (int) (Math.random() * 5);
						coluna = (int) (Math.random() * 15);

					}
				} while (doesntFits == true);
				for (int j = linha; j < linha + 5; j++) {
					tabuleiro[j][coluna] = 2;
				}
			}

		}

	}

	//INCOMPLETO
	private void setSubmarino() {

		for (int i = 0; i < 3; i++) {
			if ((int) (Math.random() * 3) < 2) {
				// horizontal
				int linha = (int) (Math.random() * 10);
				int coluna = (int) (Math.random() * 10);
				// muda o tabuleiro
				boolean doesntFits;
				do {
					doesntFits = false;
					for(int j=coluna;j< coluna +5;j++){
						if((tabuleiro[linha][j]==1) || (tabuleiro[linha][j]==2 || tabuleiro[linha][j]==3)){
							doesntFits=true;
						}
					}
					if(doesntFits==true){
						linha = (int) (Math.random() * 10);
						coluna = (int) (Math.random() * 10);
					}
				} while(doesntFits==true);
				for (int j = coluna; j < coluna + 5; j++) {
					tabuleiro[linha][j] = 3;
				}
			} else {
				// vertical
				int linha = (int) (Math.random() * 5);
				int coluna = (int) (Math.random() * 15);
				// muda o tabuleiro
				// testa se sobrepoe
				boolean doesntFits;
				do {
					doesntFits = false;
					for (int j = linha; j < linha + 5; j++) {
						if (tabuleiro[j][coluna] == 1 || tabuleiro[j][coluna]==2 || tabuleiro[j][coluna]==3)
							doesntFits = true;
					}
					if (doesntFits == true) {
						linha = (int) (Math.random() * 5);
						coluna = (int) (Math.random() * 15);

					}
				} while (doesntFits == true);
				for (int j = linha; j < linha + 5; j++) {
					tabuleiro[j][coluna] = 3;
				}
			}

		}

	}
	
	//DOCUMENTADO 
	public int realizaJogada(int jogador, int linha, int coluna) {
		// RETORNOS
		// -2 ERRO ja lançou um tiro no mesmo local
		// -1 acertou a agua
		// 1 acertou um PrA
		// 2 acertou CRU
		// 3 acertou SUB
		if (jogador == 1) { // CPU
			if (tabuleiro[linha][coluna] == -1) {
				// Alvo ja atingido, retorna um erro
				return -2;
			} else if (tabuleiro[linha][coluna] == 1) {

			} else if (tabuleiro[linha][coluna] == 2) {

			} else if (tabuleiro[linha][coluna] == 3) {

			}
			return -1;
		}
		// JOGADOR
		return -1;

	}

	//INCOMPLETO
	private int calculaCordenadas(int linha, int coluna) {

		return -1;
	}

	//DONE
	public void showMap(int version) {
		// VERSION
		// 1 CPU - MAPA COM NEVOA
		// 2 CPU - MAPA COM PARTES REVELADAS
		// 3 PLAYER - MAPA COMPLETO
		// ELSE - DO NOTHING

		if (version == 1) {
			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					System.out.print(" | ~");
				}
				System.out.print(
						" |\n -------------------------------------------------------------\n");
			}

		} else if (version == 2) {

		} else if (version == 3) {
			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					if (tabuleiro[i][j] == 0) {
						System.out.print(" | ~");
					} else if (tabuleiro[i][j] == 1) {
						System.out.print(" | P");
					} else if (tabuleiro[i][j] == 2) {
						System.out.print(" | C");
					} else {
						System.out.print(" | S");
					}
				}
				System.out.print(
						" |\n -------------------------------------------------------------\n");
			}
		}

	}
}
