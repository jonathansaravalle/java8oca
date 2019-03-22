class Run{
	public static void main(String[] args){
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1.count); //15
		t2.setCount(1);
		System.out.println(Test.count); //1
	}
}

