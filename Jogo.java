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
		//condição de inicio pra saber como vai começar
		System.out.println("Você quer saber como funciona o jogo?"
				+"\n(s) sim"
				+"\n(n) nâo");
		l1 = input.next().charAt(0);
		if (l1 == 's') {
			System.out.println("Ok então vamos começar");
		}else if (l1 == 'n') {
			System.out.println("Fim do jogo");
		}else {
			System.out.println("Resposta inválida");
			System.exit(0);
		}
		System.out.println("O jogo é simples eu vou te fazer perguntas"
				+ " e de a cordo com suas respostas a história terá um desfecho diferente");
		//começando o jogo
		System.out.println("---------------------------------------------------");
		System.out.println("Digite 's' e pressione enter pra começar");
		l2 = input.next().charAt(0);
		if (l2 == 's') {
			//primeiro jogo
			System.out.println("Você acaba de acordar em lugar estranho, na sua frente tem uma mesa "
					+ "\n com duas caixas e um bilhete escrito: "
					+ "\n 'Você tem duas caixas e uma escolha, uma delas tem uma surpresa e na outra tem um gás venenoso"
					+ "\n se você burlar as regras está fora!!'");
			System.out.println("ESCOLHA:"
					+ "\n (1) Abrir caixa da esquerda"
					+ "\n (2) Abrir caixa da direita");
			n2 = input.nextInt();
			if (n2 == 1) {
				System.out.println("você abriu a caixa com o veneno e morreu");
				System.out.println("fim de jogo");
				System.exit(0);
			}else if (n2 == 2) {
				System.out.println("você abriu a caixa premiada! parabéns você ganhou um pedaço de carne");
			}else {
				System.out.println("o caractere digitado não é válido");
				System.exit(0);
			}
			//segundo jogo
			System.out.println("Você vê uma porta e decide sair, vc percebe que está em uma floresta escura e está de noite");
			System.out.println("ESCOLHA:"
					+"\n(1) Sair da casa"
					+"\n(2) Esperar ficar de manhã");
			n3 = input.nextInt();
			//primeira ida pro final 
			switch (n3) {
			case 1:
				System.out.println("Você começou a correr e avistou um lobo que começou a te perseguir o que você faz?"
						+ "\n (1) joga o pedaço de carne pra ele"
						+ "\n (2) Sobe em uma árvore");
				n4 = input.nextInt();
				if (n4 == 1) {
					System.out.println("ele se distraiu e você consegue fugir e vencer o jogo");
					System.out.println("Meus parabéns");
					System.exit(0);
				}else if (n4 == 2) {
					System.out.println("O lobo agora está debaixo da arvore esperando você descer e pelo tempo você perde o jogo");
					System.out.println("boa sorte na próxima");
					System.exit(0);
				}else {
					System.out.println("o caractere digitado não é válido");
					System.exit(0);
				}
				//segunda ida pro final
			case 2:
				System.out.println("você escolheu esperar, mas no meio da noite você começa a ouvir passos do lado de fora da casa");
				System.out.println("oque você faz?"
						+ "\n(1) Espera pra ver oque acontece"
						+ "\n(2) Ir lá checar pra ver o que tá acontecendo");
				n5 = input.nextInt();
				if (n5 == 1) {
					System.out.println("Fez a melhor escolha, com o tempo os passos foram sumindo e pela manhã chegaram policiais pra te salvar");
					System.out.println("Parabéns você venceu o jogo");
				}else if(n5 == 2){
					System.out.println("Admiro a coragem mas tinha um caçador do lado de fora que te matou assim que te viu");
					System.out.println("Espero que vença na proxima");
					System.exit(0);
				}else {
					System.out.println("O caractere digitado não é válido");
					System.exit(0);
				}
			}
		}else {
			System.out.println("O caractere digitado não é válido");
			System.exit(0);
		}
		input.close();
	}

}
