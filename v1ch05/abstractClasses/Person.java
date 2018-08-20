package abstractClasses;

public abstract class Person
{
   public abstract String getDescription();
   private String name;

   public Person(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }
   
   public String testJin() {
	   return "JinJin1";
   }//自己加的
   /**在这里写一个具体的方法，按照书本p162的写法让people[0]来访问这个方法，能够成功调用。即抽象类里的具体方法是通过具体子类被调用  （抽象类本身不能被实例化，所以不可能直接调用，只能通过子类）*/
}
