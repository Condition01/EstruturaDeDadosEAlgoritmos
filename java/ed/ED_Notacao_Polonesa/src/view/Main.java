package view;

import controller.StaticStack;

public class Main {
	public static void main(String[] args) {
		String inf = "A*(B+(C*(D+(E*(F+G)))))";
		StaticStack pilha = new StaticStack(20);
		String posfixa = "";
		
		for(int i=0;i<inf.length();i++) {	
			if(isOperator(Character.toString(inf.charAt(i)))) {
				if(pilha.topo > -1) {
					if(Character.toString(inf.charAt(i)).equals(pilha.pilha[pilha.topo])) { //qualquer valor igual ele faz
						
						posfixa = posfixa + pilha.pilha[pilha.topo];
						pilha.desimpilhar();
						pilha.empilhar(Character.toString(inf.charAt(i)));
						
					}else if(typeChar(Character.toString(inf.charAt(i))) && typeCharDois(pilha.pilha[pilha.topo])) { //faz a hyerarquia com valores diferentes
						
						posfixa = posfixa + pilha.pilha[pilha.topo];
						pilha.desimpilhar();
						pilha.empilhar(Character.toString(inf.charAt(i)));
						
					}else if (typeChar(Character.toString(inf.charAt(i))) && typeChar(pilha.pilha[pilha.topo])) { // ve se tem nivel de hyerarquia similar + - 
						
						posfixa = posfixa + pilha.pilha[pilha.topo];
						pilha.desimpilhar();
						pilha.empilhar(Character.toString(inf.charAt(i)));
						
					}else if (typeCharDois(Character.toString(inf.charAt(i))) && typeCharDois(pilha.pilha[pilha.topo])) { // ve se tem nivel de hyerarquia similar * - 
						
							posfixa = posfixa + pilha.pilha[pilha.topo];
							pilha.desimpilhar();
							pilha.empilhar(Character.toString(inf.charAt(i)));	
							
					}else if (Character.toString(inf.charAt(i)).equals(")")) {	
						while(!pilha.pilha[pilha.topo].equals("(")) {
							if(Character.toString(inf.charAt(i)).equals(pilha.pilha[pilha.topo])) { //qualquer valor igual ele faz
								
								posfixa = posfixa + pilha.pilha[pilha.topo];
								pilha.desimpilhar();
	
							}else if(typeChar(Character.toString(inf.charAt(i))) && typeCharDois(pilha.pilha[pilha.topo])) { //faz a hyerarquia com valores diferentes
								
								posfixa = posfixa + pilha.pilha[pilha.topo];
								pilha.desimpilhar();

							}else if (typeChar(Character.toString(inf.charAt(i))) && typeChar(pilha.pilha[pilha.topo])) { // ve se tem nivel de hyerarquia similar + - 
								
								posfixa = posfixa + pilha.pilha[pilha.topo];
								pilha.desimpilhar();

							}else if (typeCharDois(Character.toString(inf.charAt(i))) && typeCharDois(pilha.pilha[pilha.topo])) { // ve se tem nivel de hyerarquia similar * -
								
									posfixa = posfixa + pilha.pilha[pilha.topo];
									pilha.desimpilhar();

							}
							
							posfixa = posfixa + pilha.pilha[pilha.topo];
							pilha.desimpilhar();
							
						}
						
						pilha.desimpilhar();
						
					}else {
						
						pilha.empilhar(Character.toString(inf.charAt(i)));
						
					}
					
					StaticStack aux = new StaticStack(1);
					aux.empilhar(pilha.pilha[pilha.topo]);
					pilha.desimpilhar();
					
					if(pilha.topo > -1 && aux.pilha[aux.topo].equals(pilha.pilha[pilha.topo])) { //qualquer valor igual ele faz
						
						posfixa = posfixa + pilha.pilha[pilha.topo];
						pilha.desimpilhar();
						pilha.empilhar(aux.pilha[aux.topo]);
						aux.desimpilhar();
						
					}else if(pilha.topo > -1 && typeChar(aux.pilha[aux.topo]) && typeCharDois(pilha.pilha[pilha.topo])) { //faz a hyerarquia com valores diferentes
						
						posfixa = posfixa + pilha.pilha[pilha.topo];
						pilha.desimpilhar();
						pilha.empilhar(aux.pilha[aux.topo]);
						aux.desimpilhar();
						
					}else if (pilha.topo > -1 && typeChar(aux.pilha[aux.topo]) && typeChar(pilha.pilha[pilha.topo])) { // ve se tem nivel de hyerarquia similar + - 
						
						posfixa = posfixa + pilha.pilha[pilha.topo];
						pilha.desimpilhar();
						pilha.empilhar(aux.pilha[aux.topo]);
						aux.desimpilhar();
						
					}else if (pilha.topo > -1 && typeCharDois(aux.pilha[aux.topo]) && typeCharDois(pilha.pilha[pilha.topo])) { // ve se tem nivel de hyerarquia similar * - 
						
						posfixa = posfixa + pilha.pilha[pilha.topo];
						pilha.desimpilhar();
						pilha.empilhar(aux.pilha[aux.topo]);
						aux.desimpilhar();
						
					}else {
						
						pilha.empilhar(aux.pilha[aux.topo]);
						aux.desimpilhar();
					}

				}else {
					
					pilha.empilhar(Character.toString(inf.charAt(i)));
					
				}	
			}else if(isOperand(Character.toString(inf.charAt(i)))) {
				
				posfixa = posfixa + inf.charAt(i);
				
			}
		}
		while(pilha.topo > -1) {
			
			posfixa = posfixa + pilha.pilha[pilha.topo];
			pilha.desimpilhar();
			
		}
		
		System.out.println(posfixa);
		
	}
	static boolean isOperand(String i) {
		if(!i.equals("*")&&!i.equals("/")&&!i.equals("-")&&!i.equals("+")&&!i.equals("(")&&!i.equals(")")) {
			
			return true;
			
		}
		
		return false;
		
	}
	static boolean isOperator(String i) {	
		if(i.equals("*")||i.equals("/")||i.equals("-")||i.equals("+")||i.equals("(")||i.equals(")")){
			
			return true;
			
		}
		
		return false;
	}
	static boolean typeChar(String i) {	
		if(i.equals("+")) {
			
			return true;
			
		}else if(i.equals("-")) {
			
			return true;
			
		}
		
		return false;
		
	}
	static boolean typeCharDois(String i) {
		if(i.equals("*")) {
			
			return true;
		
		}else if(i.equals("/")) {
			
			return true;
			
		}
		
		return false;
		
	}
}
