package jogo;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n2,n3,n4,n5;
		char l1,l2;
		// Perguntando o nome do jogador
		System.out.println("Qual o seu nome?");
		String nome = input.nextLine();
		// Desejando boas vindas
		System.out.println("Seja bem vindo ao jogo das escolhas, " + nome);
		//condi��o de inicio pra saber como vai come�ar
		System.out.println("Voc� quer saber como funciona o jogo?"
				+"\n(s) sim"
				+"\n(n) n�o");
		l1 = input.next().charAt(0);
		if (l1 == 's') {
			System.out.println("Ok ent�o vamos come�ar");
		}else if (l1 == 'n') {
			System.out.println("Fim do jogo");
		}else {
			System.out.println("Resposta inv�lida");
			System.exit(0);
		}
		System.out.println("O jogo � simples eu vou te fazer perguntas"
				+ " e de a cordo com suas respostas a hist�ria ter� um desfecho diferente");
		//come�ando o jogo
		System.out.println("---------------------------------------------------");
		System.out.println("Digite 's' e pressione enter pra come�ar");
		l2 = input.next().charAt(0);
		if (l2 == 's') {
			//primeiro jogo
			System.out.println("Voc� acaba de acordar em lugar estranho, na sua frente tem uma mesa "
					+ "\n com duas caixas e um bilhete escrito: "
					+ "\n 'Voc� tem duas caixas e uma escolha, uma delas tem uma surpresa e na outra tem um g�s venenoso"
					+ "\n se voc� burlar as regras est� fora!!'");
			System.out.println("ESCOLHA:"
					+ "\n (1) Abrir caixa da esquerda"
					+ "\n (2) Abrir caixa da direita");
			n2 = input.nextInt();
			if (n2 == 1) {
				System.out.println("voc� abriu a caixa com o veneno e morreu");
				System.out.println("fim de jogo");
				System.exit(0);
			}else if (n2 == 2) {
				System.out.println("voc� abriu a caixa premiada! parab�ns voc� ganhou um peda�o de carne");
			}else {
				System.out.println("o caractere digitado n�o � v�lido");
				System.exit(0);
			}
			//segundo jogo
			System.out.println("Voc� v� uma porta e decide sair, vc percebe que est� em uma floresta escura e est� de noite");
			System.out.println("ESCOLHA:"
					+"\n(1) Sair da casa"
					+"\n(2) Esperar ficar de manh�");
			n3 = input.nextInt();
			//primeira ida pro final 
			switch (n3) {
			case 1:
				System.out.println("Voc� come�ou a correr e avistou um lobo que come�ou a te perseguir o que voc� faz?"
						+ "\n (1) joga o peda�o de carne pra ele"
						+ "\n (2) Sobe em uma �rvore");
				n4 = input.nextInt();
				if (n4 == 1) {
					System.out.println("ele se distraiu e voc� consegue fugir e vencer o jogo");
					System.out.println("Meus parab�ns");
					System.exit(0);
				}else if (n4 == 2) {
					System.out.println("O lobo agora est� debaixo da arvore esperando voc� descer e pelo tempo voc� perde o jogo");
					System.out.println("boa sorte na pr�xima");
					System.exit(0);
				}else {
					System.out.println("o caractere digitado n�o � v�lido");
					System.exit(0);
				}
				//segunda ida pro final
			case 2:
				System.out.println("voc� escolheu esperar, mas no meio da noite voc� come�a a ouvir passos do lado de fora da casa");
				System.out.println("oque voc� faz?"
						+ "\n(1) Espera pra ver oque acontece"
						+ "\n(2) Ir l� checar pra ver o que t� acontecendo");
				n5 = input.nextInt();
				if (n5 == 1) {
					System.out.println("Fez a melhor escolha, com o tempo os passos foram sumindo e pela manh� chegaram policiais pra te salvar");
					System.out.println("Parab�ns voc� venceu o jogo");
				}else if(n5 == 2){
					System.out.println("Admiro a coragem mas tinha um ca�ador do lado de fora que te matou assim que te viu");
					System.out.println("Espero que ven�a na proxima");
					System.exit(0);
				}else {
					System.out.println("O caractere digitado n�o � v�lido");
					System.exit(0);
				}
			}
		}else {
			System.out.println("O caractere digitado n�o � v�lido");
			System.exit(0);
		}
		input.close();
	}

}
