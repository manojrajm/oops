interface birds{
	void fly();
	void eat();

}
abstract class eagle implements birds {

       public void fly(){
       	System.out.println("Eagles are flies");
	}

	//public void eat(){
        //	System.out.println("Eagles are flies");
	//}
}
class phenixeagle extends eagle{
	public void eat(){
		System.out.println("phenix eagles eat snakes");
	}
}
class goldeagle extends phenixeagle{
	public void eat(){
		System.out.println("gold eagles eat fish");
	}
}
class family{
	public void permit(birds b){
	b.eat();
	b.fly();
	}
}






public class Pol{
   public static void main(String []args){
   //System.out.println("my name is manoj");
   phenixeagle e=new phenixeagle();
   goldeagle g =new goldeagle();
   family f = new family();
   f.permit(g);
      System.out.println("----------------------------------------");
   
   f.permit(e);
   /*e.eat();
   e.fly();
   g.eat();
   g.fly();*/
   }
  }
