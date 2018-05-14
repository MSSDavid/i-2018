package br.ufg.inf.es.integracao.as03;

import java.util.ArrayList;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.binary.Token.Attribute;
import com.thoughtworks.xstream.io.xml.DomDriver;
import javax.swing.text.Document;
import javax.swing.text.Element;

public class ParaXML{
	public static void main(String[] args) {
		//O Xstream está criado
		XStream xstream = new XStream(new DomDriver());
		//Uma lista com vários "beans", objetos do tipo Alunos
		ArrayList<Alunos> dados = new ArrayList<Alunos>();
		//vamos adicionar uns dados para teste
		dados.add(new Alunos("José", "jose@inf.br"));
                dados.add(new Alunos("Joseé", "joe@inf.br"));
		//Agora vamos passar esses dados para XML
                

                xstream.alias("aluno", Alunos.class);
		String xml = xstream.toXML(dados);
                
		System.out.println(xml);
                
	}	
        
        public static class Alunos{
	private String nome;
	private String email;
	public Alunos(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	@Override
	public String toString() {	
		return nome + " - " + email;
	}
	public String getNome(){
		return this.nome;
	}
	public String getEmail(){
		return this.email;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setEmail(String email){
		this.email = email;
	}	
                        }
}