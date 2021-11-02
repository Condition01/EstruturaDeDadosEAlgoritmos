package controller;

import java.util.Stack;

import model.Node;


public class Tree {
	public Node raiz;

	public Tree() {
		raiz = null;
	}

	public void inserir(Node p, int element) {
		if (p == null) {
			raiz = new Node(element);
		} else if (element < p.element) {
			if (p.esq != null) {
				inserir(p.esq, element);
			} else {
				p.esq = new Node(element);
			}
		} else {
			if (p.dir != null) {
				inserir(p.dir, element);
			} else {
				p.dir = new Node(element);
			}
		}
	}

	public void preOrdem(Node p) {
		if (p != null) {
			System.out.println(p.element + " ");
			preOrdem(p.esq);
			preOrdem(p.dir);
		}
	}

	public void posOrdem(Node p) {
		if (p != null) {
			posOrdem(p.esq);
			posOrdem(p.dir);
			System.out.println(p.element + " ");
		}
	}

	public void inOrdem(Node p) {
		if (p != null) {
			inOrdem(p.esq);
			System.out.println(p.element + " ");
			inOrdem(p.dir);
		}
	}

	public int treeSize(Node p) {
		if (p == null) {
			return 0;
		} else {
			int esq = treeSize(p.esq);
			int dir = treeSize(p.dir);

			if (esq > dir) {
				esq++;
				return esq;
			} else {
				dir++;
				return dir;
			}

		}

	}

	public boolean isBinary(Node pai, Node esq, Node dir) {
		if (esq == null && dir == null) {
			return true;
		} else if (esq == null) {
			if (dir.element > pai.element) {
				return isBinary(dir, dir.esq, dir.dir);
			} else {
				return false;
			}
		} else if (dir == null) {
			if (esq.element <= pai.element) {
				return isBinary(esq, esq.esq, esq.dir);
			} else {
				return false;
			}
		} else {
			boolean validacaoUm = isBinary(esq, esq.esq, esq.dir);
			boolean validacaoDois = isBinary(dir, dir.esq, dir.dir);
			if (validacaoUm != validacaoDois) {
				return false;
			} else {
				return true;
			}
		}

	}

	public int treeQuantElement(Node p) {
		if (p == null) {
			return 0;
		} else {
			return 1 + treeSize(p.esq) + treeSize(p.dir);
		}
	}

	public int treeSomaSeq(Node p) {
		if (p == null) {
			return 0;
		} else {
			return p.element + treeSomaSeq(p.esq) + treeSomaSeq(p.dir);
		}
	}
	

	public String printTree(Node p) {
		String retorno;
		retorno = "(";
		if (p != null) {
			retorno += " " + p.element + " ";
			retorno += printTree(p.esq);
			retorno += printTree(p.dir);
		}
		retorno = retorno + ") ";
		return retorno;
	}

	public void preOrder(Node pai){ //metodo polimorfico
		if(pai == null) return;
		Stack<Node> s = new Stack<>();
		s.add(pai);
		while(!s.isEmpty()) {
			pai = s.pop();
			System.out.println(pai.element);
			if(pai.dir != null) {
				s.push(pai.dir);
			}if(pai.esq != null) {
				s.push(pai.esq);
			}
		}
	}
	
	public void inOrder(Node pai) { //metodo polimorfico
		if(pai == null) return;
		Stack<Node> s = new Stack<>();
		while(true) {
			if(pai != null) {
				s.push(pai);
				pai = pai.esq;
			}else {
				if(s.isEmpty()) { break;}{ //mesma coisa que se eu tivesse dado um false num boolean
					pai = s.pop();
					System.out.println(pai.element);
					pai = pai.dir;
				}
			}
		}
		
	}
	
	public void posOrder(Node pai) { //metodo polimorfico
		if(pai == null) return;
		 Stack<Node> s1 = new Stack<>();
		 Stack<Node> s2 = new Stack<>();
		 s1.push(pai);
		 while(!s1.isEmpty()) {
			 pai = s1.pop();
			 s2.push(s1.pop());
			 if(pai.esq != null) {
				 s1.push(pai.esq);
			 }
			 if(pai.dir != null) {
				 s1.push(pai.dir);
			 }
		 }
		 while(!s2.isEmpty()) {
			 pai = s2.pop();
			 System.out.println(pai.element);
		 }
	}
	
	public boolean search(Node p, int element) {
		if(p!=null) {
			if(p.element == element) {
				return true;
			}else {
				if(element < p.element) {
					return search(p.esq, element);
				}else {
					return search(p.dir, element);
				}
			}
		}
		return false;	
	}
	
	public void remove(Node pai,Node filho, int element) {
		Node aux, r = null, r2 = null;
		if(filho==null) {
			System.err.println("Nó não achado!");
		}else if(filho.element == element) {
			if(filho == raiz) {
				raiz = null;
			}else {
				if(filho.dir == null && filho.esq != null) {
					if(pai.esq == filho) {
						pai.esq = filho.esq;
					}else if(pai.dir == filho) {
						pai.dir = filho.esq;
					}
				}else if(filho.esq == null && filho.dir != null) {
					if(pai.esq == filho) {
						pai.esq = filho.dir;
					}else if(pai.dir == filho) {
						pai.dir = filho.dir;
					}
				}else if(filho.esq == null && filho.dir == null){
					if(pai.esq == filho) {
						pai.esq = null;
					}else if(pai.dir == filho) {
						pai.dir = null;
					}
				}else {
					r = filho;
					aux = filho.dir;
					while (aux.esq != null) {
						r = aux;
						aux = aux.esq;
					}
					filho.element = aux.element;
					if (aux == filho.dir) {
						if(filho == pai.dir) {
							pai.dir = filho.dir;
						}else {
							pai.esq = filho.dir;
						}
					} else {
						r.esq = null;
					}			
				}
			}
		}else {
			if(element < filho.element) {
				if(filho != pai) {
					pai = filho;
				}
				filho = pai.esq;
				remove(pai, filho, element);
			}else {
				if(filho != pai) {
					pai = filho;
				}
				filho = pai.dir;
				remove(pai, filho, element);
			}
		}
	}


}
