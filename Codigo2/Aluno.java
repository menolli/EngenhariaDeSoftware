package src;

import java.util.List;

public class Aluno {
String RA;

public Aluno(String nome) {
	super();
	//precisa ir no banco e criar o aluno
	this.RA = nome;
	
}

public String getNome() {
	return RA;
}

public void setNome(String nome) {
	this.RA = nome;
}

public boolean verficaAluno()
{   //Se o RA � null � retorna erro - m�todo aleat�rio
	if(this.RA.equals("10"))
	 return false;
else
	return true;
}

public boolean verificaDebito()
{       //instancia um objeto d�bito
        Debito debito = new Debito( Integer.parseInt(this.RA)); 
	/* Aqui voc� deve chamar o metodo verificaDebito da classe debito*/
}

//Metodo que delega a funcionalidade de emprestar para a classe emprestimo
public boolean emprestar(List<Livro> livros)
{   /* Aqui voc� deve intanciar um objeto emprestimo */
	/* Aqui voc� deve chamar o metodo emprestar da classe empresitmo*/
	
	
	
}
}
