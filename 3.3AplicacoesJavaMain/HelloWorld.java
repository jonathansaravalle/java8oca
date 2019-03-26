public class HelloWorld {

	public static void main(String[] args) {
	//Método main
	//
	//O método main precisa:
	//
	//    - Ser public
	//    - Ser static
	//    - Ser void
	//    - Ter o nome 'main'
	//    - Receber como parâmetro um ARRAY ou VARARGS de String
	//    - Ex: String[] ou String...
	//
	//Variações permitidas:
	//
	//static public/public static
	//static public void main(String[] args)
	//
	//parâmetro com outro nome
	//public static void main(String... listaDeEntrada)
	//
	//variação de array
	//public static void main(String args[])
	
	
	//Compilação e Execução
	//
	//Para compilar, usar o comando 'javac HelloWorld.java'
	//Para executar, usar o comando 'java HelloWorld'
	//    *Note que:
	//    para compilar, dizemos o nome do ARQUIVO INTEIRO;
	//        *podemos escolher a versão da do Java em que o código foi escrito. Ex: javac MyClass.java -source 1.3
	//    para executar, dizemos o nome da CLASSE.
	//
	//Podemos passar parâmetros e argumentos na linha de comando.
	//
	//Para passar parâmetros/propriedades de execução, declaramos variáveis antes da CLASSE ao executar o comando java.
	//Ex: java -key1=abc -Dkey2=def Foo xpto bar
	//    neste caso:
	//        key1=abc   -> parâmetro
	//        -Dkey2=def -> propriedade (devido ao -D)
	//        Foo        -> classe executável
	//        xpto bar   -> argumentos main
	//
	//Para passar argumentos via linha de comando é só informar após o nome da classe separados por espaços.
	//Ex: java HelloWorld Test
	
		System.out.println("Hello World! ");
		System.out.println("Foram passados " + args.length + " argumentos.");

		if(args.length > 0){
			for(int i = 0; i < args.length; i++){
				System.out.println("Argumento " + i + ": " + args[i]);
			}
		}
	}

	//Pacotes (Packages)
	//
	//Em projetos grandes e/ou profissionais, o uso de pacotes é muito comum.
	//O pacote neste caso é representada pela pasta 'certification'.
	//
	//Considerando que estamos na pasta 3.3AplicacoesJavaMain:
	//
	//    Para compilarmos uma classe dentro de um pacote, usamos o comando 'javac NOME_PACOTE/NOME_ARQUIVO'.
	//    Ex: javac certification/Test.java
	//
	//    Para executarmos uma classe que possui um método main e que está localizado detnro de um pacote, usamos o comando 'java NOME_PACOTE.NOME_CLASSE'.
	//    Ex: java certification.Test

	//Classpath
	//
	//O classpath é necessário para que os comandos javac e java encontrem as classes.
	//As classes feitas pelo programador são encontradas pelo classpath.
	//
	//O classpath é formado por diretórios, jars e zips que contenham as classes e pacotes da aplicação.
	//Por padrão, o classpath está configurado para o diretório corrente.
	//
	//Há duas maneiras de configurar o classpath:
	//    1- Configurar a variável de ambiente CLASSPATH no sistema operacional.
	//        Considerado uma má prática pois vira um classpath global, afetando qualquer execução java.
	//
	//    2- Com as opções -cp ou -classpath dos comandos javac ou java
	//        Ex: javac -cp /path/to/library.jar Test.java
	//            java -cp /path/to/library.jar Test
	//
	//        Podemos passar caminhos de outras pastas, Jars, zips
	//        usando o separador de parâmetros com:
	//          - Windows ';' (ponto vírgula)
	//          - Unix ':' (dois pontos)
	//         Ex: javac -cp /path/to/library.jar:/another/path/certification/Test.java
	//             java -cp /path/to/library.jar:/another/path/certification.Test
}
