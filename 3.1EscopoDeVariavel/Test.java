class Test {

	//Variaveis de instancia - Variaveis do objeto
	String name;

	//Variaveis estaticas (static) - Variaveis referenciadas pela mesma instancia de classe
	static int count = 15;

	//Variaveis locais - Variaveis dentro de bloco
	public void m1(String s){
		//String s = ""; //Variaveis com mesmo nome dentro do mesmo escopo compile error;
		
		String name = "m1"; //shadowing
		this.name = name;   //usando a palavra chave .this consigo referenciar a variavel 
		
	}

	public void m2(){
		//System.out.print(s); //Onde a variavel foi instanciada? compilation error
		m1("teste");
	}
	
	public void setCount(int i){
		count = i;
		//Outras formas de fazer a mesma coisa incluem:
		//this.count = i;
		//Test.count = i;
	}
}
