
public class MinhaThread extends Thread {
private int num;
private String nome;

public MinhaThread(int num , String nome ) {
	this.num = num;
	this.nome = nome;
	start();
}
public void run() {
for( num=0;num<99999;num++);
System.out.println(nome + "contador" + num);
	}
}
