class Questionario {
	
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) //para ifs/elses/for/whiles posso passar apenas um comando sem precisar de chaves
			System.out.println(i);  //OK
			System.out.println(i);  //NOT OK - essa linha está fora do contexto do for
		System.out.println("finished");
	}
}