package br.com.caelum.certification;
//Package - separam e organizam classes.

//Apenas UMA package pode ser definida por arquivo e DEVE ser a PRIMEIRA INSTRUÇÃO do arquivo.

//Quando nenhuma package for definida, a classe pertence ao DEFAULT PACKAGE.
//Todas as classes do DEFAULT PACKAGE se enxergam e podem ser utilizadas entre si, porém não podem ser importadas para uso em outros pacotes.

import java.util.Date;
//import - permitem usar classes já existentes.

//O import NÃO PODE SER DECLARADO APÓS DEFINIÇÃO de classe.
//Ex: class Person{}
//    import package.import; -> ERRO de COMPILAÇÃO!!!

class Person{
//Classe - forma no Java onde definimos os atributos e comportamentos de um objeto.

//Uma classe pode implementar diversas interfaces ao mesmo tempo, porém só pode extender apenas uma classe.

//Variáveis, métodos e construtores são chamados de MEMBROS da classe.
//Podemos ter membros de tipos diferentes com o mesmo nome, Ex: variável chamada "b" e método chamada "b".

	String firstName;
	String lastName;
	//Variáveis - guardam valores.

	//Para declarar variáveis, <TIPO> <NOME_VARIAVEL>.

	//Essas são variáveis de instância, cada instância de objeto têm suas variáveis definidas.
	//Para variáveis com mesma referência para diversas instâncias de objeto, usar a palavra "static".
	//Ex: static String lastName; -> todas as instâncias do objeto "Person" terão o valor da variável "lastName" compartilhadas entre elas.

	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//Contrutores - métodos especiais.

	//Uma classe pode possuir 0 ou vários contrutores.

	//A diferença entre o método e o construtor é que o construtor NÃO TEM RETORNO e POSSUI O NOME DA CLASSE.
	//Apesar do construtor retornar NADA, é possível o contrutor ter um RETURN vazio.
	//Ex: Person(String firstName){
	//        if(firstName.equals(""){
	//            return;
	//        }
	//        this.firstName = firstName;
	//    }

	//O construtor é executado no momento em que o objeto é instanciado.
	//O contrutor executado dependende do que é passado como parâmetro ao instânciar.
	//Ex: Person person1 = new Person()                   -> Construtor Person()
	//    Person person2 = new Person("Bob", "Lannister") -> Construtor Person(String, String)

	public String getFullName(){
	//    "String getFullName()" -> ASSINATURA DO METODO
		return this.firstName + " " + this.lastName;
	}
	//Métodos - funções que interagem com outras variáveis e/ou objetos.

        //Para declarar métodos, <TIPO_RETORNO> <NOME_METODO>(<PARAMETRO(S)>)
	//OBS: Parâmetros são opcionais

	//A assinatura é composta pelo <NOME_METODO>(<TIPOS_PARAMETROS>), DESCONSIDERANDO o tipo de retorno.
	//A assinatura deve ser única para cada método. Caso haja mais de uma assinatura, ocorre um COMPILE ERROR.
} 

interface Authenticable{
//Interfaces - Um contrato/padrão a ser seguido.

//Podemos declarar interfaces através da palavra reservada "interface".

//A interface não possui nenhuma implementação, mas define as assinaturas de métodos e suas constantes.

	final int PASSWORD_LENGTH = 8; // constante indicado pela palavra-chave "final" e nome de variável toda em maiúscula.

	void authenticate(String login, String password);
}

//É possível definir mais de uma classe/interface em um arquivo .java, porém com algumas regras:
//    - Podem ser definidos em qualquer ordem;
//    - Se existir alguma classe/interface pública, o nome do arquivo deve ser o mesmo dessa classe/interface;
//    - Só pode existir uma classe/interface por arquivo;
//    - Se não houver nenhuma classe/interface pública, o arquivo pode ter qualquer nome; 

//Válido:
//
//file1.java
//interface First{}
//class Second{}
//
//Third.java
//public class Third{}
//interface Fourth{}
//
//Não Válidos:
//
//Fifth.java
//class Fifth{}
//public interface Sixth{}
//
//AlreadyExists.java
//class AlreadyExists{}
//interface AlreadyExists{}

