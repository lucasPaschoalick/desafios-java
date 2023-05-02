package br.com.target.exerciciosEstagio;

import java.util.Scanner;

public class Desafios {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {		
		int n;
		do {
			System.out.print("Digite qual questão deseja executar (1, 2, 3, 4, 5) ou digite 0 para sair: ");
			n = scanner.nextInt();
			
			switch(n) {
			case 0:
				scanner.close();
				System.exit(n);
            case 1:
                questao1();
                break;
			case 2:
				questao2();
				break;
			case 3:
				questao3();
				break;
			case 4:
				questao4();
				break;
			case 5:
				questao5();
				break;
			default:
				System.out.print("Essa questão não existe!");
				break;
			}
		}
		while(n != 0);		
	}
	
		
	//  Questão 1
	// O valor da variável SOMA ao final do processamento será de 91.
    public static void questao1(){
        System.out.println("O valor da variável SOMA ao final do processamento será de 91!");
    }
	
	
	
	//	Questão 2
	public static void questao2() {
		
		System.out.print("Informe um número: ");
		
		//	Recupera o numero inserido pelo console
		int n = scanner.nextInt();		
		int first = 0, second = 1, result = 0;
		
		//	Realiza o calcula da sequência de Fibonacci
		while (result < n) {
			result = first + second;
			first = second;
            second = result;
        }

		//	Se o resultado da soma for igual ao valor digitado, então ele está na sequência
		//	Se o resultado da soma não for igual ao valor digitado, então ele não está na sequência
		if (result == n) {
            System.out.println("O número pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número não pertence à sequência de Fibonacci.");
        }
		
	}
	
	
	
	//	Questão 3
	// a) 1, 3, 5, 7, ___					// Resposta: 9	
	// b) 2, 4, 8, 16, 32, 64, ____			// Resposta: 128	
	// c) 0, 1, 4, 9, 16, 25, 36, ____		// Resposta: 49	
	// d) 4, 16, 36, 64, ____				// Resposta: 100	
	// e) 1, 1, 2, 3, 5, 8, ____			// Resposta: 13	
	// f) 2, 10, 12, 16, 17, 18, 19, ____	// Resposta: 200
	
	public static void questao3() {
		int[] arrInt = {9, 128, 49, 100, 13, 200};
		String [] arrStr = {"a)", "b)", "c)", "d)", "e)", "f)"};
		
		// Laço for para imprimir as respostas da questão 3
		System.out.println("Respostas Questão 3");
		for(int i = 0; i< arrInt.length; i++) {
			System.out.printf("%s %d\n",arrStr[i], arrInt[i]);
		}
		
	}
	
	
	
	//	Questão 4
	public static void questao4() {
	/*
		Para calcular o ponto de encontro entre os 2 veículos, admitindo Ribeirão Preto como ponto de referência, temos que:
		
		distCarro = velocidadeCarro * tempoCarro;
		
		onde,
		velocidadeCarro = 110 km/h
		
		Para o caminhão que sai a uma distância de 100km do ponto de referência:
		
		distCaminhao = 100 - velocidadeCaminhao * tempoCaminhao;
		
		onde,
		
		Velocidade média considerando 10 min a mais dos pedágios
		tempoCaminhao = 100/80 = 1,25h para percorrer 100km a 80km/h
		tempoCaminhao + pedagios = 1,25h + 0,17h = 1,42h;
		
		velocidadeCaminhao = 100km/1,42h = 70,6 km/h;
		
		Para chegar no ponto de encontro é necessário igualar as equações do carro e do caminhão
		
		tempoCarro = distCarro/velocidadeCarro
		tempoCaminhao = (distCaminhao-100)/-velocidadeCaminhao;
		
		Para o ponto de encontro:
		distCarro = distCaminhao = dist;
		dist/velocidadeCarro = (dist-100)/-velocidadeCaminhao;
		-velocidadeCaminhao * dist = velocidadeCarro * (dist-100);
		dist = (velocidadeCarro*100)/velocidadeCarro + velocidadeCaminhao
		dist = (110 * 100) / (110 + 70,6);
		dist = 60,9 km;
	*/
		
		System.out.println("A distância da cidade de Ribeirão Preto em que os veículos se cruzam é de 60.9 km, ambos estarão à mesma distância de Ribeirão Preto.");    
	}
	
	
	
	//	Questão 5
	public static void questao5() {

        System.out.println("Informe uma string: ");
        
        //	Recupera a string inserida pelo console
        String original = scanner.next();

        //	String para armazenar a string original invertida
        String reverse = "";

        //	Percorre a string original de trás para frente, adicionando cada caracter na string invertida.
        for (int i = original.length() - 1; i >= 0; i--) {
        	reverse += original.charAt(i);
        }

        System.out.println("A string invertida é: " + reverse);
    }
}
