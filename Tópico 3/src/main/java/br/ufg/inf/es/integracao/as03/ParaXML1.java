package br.ufg.inf.es.integracao.as03;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.util.ArrayList;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.binary.Token.Attribute;
import com.thoughtworks.xstream.io.xml.DomDriver;
import javax.swing.text.Document;
import javax.swing.text.Element;


public class ParaXML1{
	public static void main(String[] args) throws JsonProcessingException {
		//O Xstream está criado
                
                ObjectMapper objectMapper = new XmlMapper();
		XStream xstream = new XStream(new DomDriver());
		//Uma lista com vários "beans", objetos do tipo Alunos
		ArrayList<Alunos> dados = new ArrayList<Alunos>();
		//vamos adicionar uns dados para teste
		dados.add(new Alunos("José", "jose@inf.br"));
                dados.add(new Alunos("Joseé", "joe@inf.br"));
		//Agora vamos passar esses dados para XML
                objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
                String xmlx = objectMapper.writeValueAsString(dados);

                xstream.alias("aluno", Alunos.class);
		String xml = xstream.toXML(dados);
                
		System.out.println(xml);

                System.out.println(xmlx);
                
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