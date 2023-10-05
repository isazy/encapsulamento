package Projeto;

import Projeto.Cliente.Cliente;
import Projeto.Endereco.Endereco;
import Projeto.Tema.Tema;
import Projeto.itemTema.itemTema;

public class Principal{

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "conceição", "15998203348","787","990" );
		Tema tema = new Tema(2, "isabely",700.000, "azul");
		itemTema itemTema = new itemTema(3,"Freitag","legal");
		Endereco endereco = new Endereco(4, "90", 777,"tarrr", "rua dos bobo", "siri", "788", "899");
		
		
		

	}

}
