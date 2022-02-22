public class Arrays {

	public static void main(String[] args) {
		Array numbers = new Array(3);
		numbers.insert(15);
		numbers.insert(37);
		numbers.insert(250);
		numbers.insert(1340);
		System.out.println(numbers.indexOf(1340));
		numbers.print();
	}

}
