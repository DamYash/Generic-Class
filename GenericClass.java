class GenericClass<G>
{
	private G data;
	public GenericClass(G data)
	{
		this.data = data;
	}
	public G getData()
	{
		return this.data;
	}
}
public class GenericClassExample 
{
	public static void main(String[] args) 
	{
		GenericClass<Integer> intObj = new GenericClass<>(5);
		System.out.println("Generic Class returns: " + intObj.getData());
		
		GenericClass<String> stringObj = new GenericClass<>("Computer Programming");
		System.out.println("Generic Class returns: " + stringObj.getData());
	}
}


/* Output:

Generic Class returns: 5
Generic Class returns: Computer Programming

*/
