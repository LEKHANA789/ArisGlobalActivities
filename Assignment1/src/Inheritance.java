
public class Inheritance {
	
//Multilevel Inheritance
	public static void main(String[] args) {
		BabyDog b=new BabyDog(); //multilevel
		b.weep();
		b.bark();
		b.eat();
		
		Dog1 d=new Dog1();//singlelevel
		d.bark();
		d.eat();
		
	}
	}

		class Animal1{
			void eat() {
				System.out.println("eating...");
			}
		}
			class Dog1 extends Animal1{
				void bark() {
					System.out.println("barking...");
				}
			}
			class BabyDog extends Dog1{
				void weep() {
					System.out.println("weeping");
				}
			}




