package controller;

public class Deque {
	private int deque[];
	private int inicioDir, inicioEsq;
	private int fimDir, fimEsq;
	
	public Deque(int size) {
		this.deque = new int[size];
		this.inicioDir = deque.length;
		this.fimDir = deque.length;
		this.inicioEsq = -1;
		this.fimEsq = -1;
	}
	
	public boolean isEmptyDir() {
		return this.fimDir == this.deque.length;
	}
	
	public boolean isEmptyEsq() {
		
		return this.fimEsq == -1;
	}
	
	public boolean isFull() {
		return this.fimEsq+1 == this.fimDir;
	}
	
	public void insertEsq(int element) throws FullDequeException{
		if(isFull()) {
			throw new FullDequeException();
		}else if(isEmptyEsq()) {
			this.inicioEsq++;
			this.deque[++this.fimEsq] = element;
		}else {
			this.deque[++this.fimEsq] = element;
		}
	}
	
	public int removeEsq() throws EmptyDequeException{
		int temp;
		if(isEmptyEsq()) {
			throw new EmptyDequeException();			
		}else if(this.inicioEsq == this.fimEsq) {
			temp = this.deque[fimEsq];
			this.fimEsq--;
			this.inicioEsq--;
			return temp;
		}else {
			temp = this.deque[this.fimEsq];
			for(int i=this.inicioDir;i<this.fimEsq;i++) {
				this.deque[i] = this.deque[i+1];
			}
			this.fimEsq--;
			return temp;
		}
	}
	
	public void insertDir(int element) throws FullDequeException{
		if(isFull()) {
			throw new FullDequeException();
		}else if(isEmptyDir()) {
			this.inicioDir--;
			this.deque[--this.fimDir] = element;
		}else {
			this.deque[--this.fimDir] = element;
		}
	}
	public int removeDir() throws EmptyDequeException{
		int temp;
		if(isEmptyDir()) {
			throw new EmptyDequeException();		
		}else if(this.inicioDir == this.fimDir) {
			temp = this.deque[this.fimDir];
			this.inicioDir++;
			this.fimDir++;
			return temp;
		}else {
			temp = this.deque[this.fimDir];
			for(int i=this.inicioDir;i>fimDir;i--) {
				this.deque[i] = this.deque[i-1];
			}
			this.fimDir++;
			return temp;
		}
	}
	
	public int showFrontEsq() throws EmptyDequeException{
		if(isEmptyEsq()) {
			throw new EmptyDequeException();
		}
		return this.deque[this.inicioEsq];
	}
	
	public int showFrontDir() throws EmptyDequeException{
		if(isEmptyDir()) {
			throw new EmptyDequeException();
		}
		return this.deque[this.inicioDir];
	}
	
	public int getSizeDir() {
		return isEmptyDir() ? 0 : (this.inicioDir - this.fimDir)+1;
	}
	
	public int getSizeEsq() {
		return isEmptyEsq() ? 0 : (this.fimDir)+1;
	}
}
