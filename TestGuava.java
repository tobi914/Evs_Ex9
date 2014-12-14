package guava;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;



public class TestGuava 
{
	private String name;
	private int age;
	private boolean isStudent;
	private double weight;
	
	public TestGuava(String name, int age, boolean isStudent, double weight)
	{
		Preconditions.checkArgument(age > 0, "Age must be positive", age);
		Preconditions.checkArgument(weight > 0, "Weight must be positive", weight);
		this.name = name;
		this.age = age;
		this.isStudent = isStudent;
		this.weight = weight;
	}
	
	@SuppressWarnings("deprecation")
	public String toString()
	{
		return Objects.toStringHelper(this)
				.add("name", name)
				.add("age", age)
				.add("Is Student", isStudent)
				.add("weight", weight)
				.omitNullValues()
				.toString();
	}
	
	public static void main(String[] args)
	{
		TestGuava t1 = new TestGuava("Blab", 20, true, 76.09);
		//TestGuava t2 = new TestGuava("Blub", -3, false, -50);
		System.out.println(t1.toString());
		//System.out.println(t2.toString());
	}
	
}
