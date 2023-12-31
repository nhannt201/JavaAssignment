public class Main {
	public static void main(String[] args) {
		Person alice = new Person();
		alice.setName("Alice");
		alice.setAge(36);
		
        Person bob = alice;
        bob.setName("Bob");
        System.out.println(
        		String.format("Alice's name: %1$s \nBob's name: %2$s",
        				alice.getName(),
        				bob.getName()));
	}

}
class Person
{
	private String name;
	private int age;
    public String getName() {
    	return name;
    }
    public void setName(String newName) {
        this.name = newName;
      }
    public int getAge() {
    	return age;
    }
    public void setAge(int newAge) {
        this.age = newAge;
      }
}
