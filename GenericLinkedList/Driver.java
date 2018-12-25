// A simple driver to test the LinkedList class
public class Driver
{
    public static void main(String[] args){
        new Driver();
    }
    public Driver()
    {
      LinkedList<Integer> testList= new LinkedList<Integer>();
      
      /*System.out.println("trying to print empty list");
      testList.print();
      testList.append(7);
      testList.print();
      System.out.println(testList.removeTop());
      System.out.println("trying to print empty list");
      testList.print();
      */
      System.out.println("trying to find 6 in empty list: " + testList.contains(6));
      
      testList.append(5);
      System.out.println("trying to print list with 1 item");
      testList.print();
      
      testList.append(6);
      testList.append(7);
      System.out.println("trying to print list with 1+ items");
      testList.print();
      System.out.println("trying to find 6 in populated list: " + testList.contains(6));
      System.out.println("removing top of list: " + testList.removeTop());
      System.out.println("current List Size: " + testList.getSize());
      testList.print();
      System.out.println("removing top of list: " + testList.removeTop());
      System.out.println("current List Size: " + testList.getSize());
      testList.print();
      System.out.println("removing top of list: " + testList.removeTop());
      System.out.println("current List Size: " + testList.getSize());
      testList.print();
      System.out.println("removing top of list: " + testList.removeTop());
      System.out.println("current List Size: " + testList.getSize());
      testList.print();
      
      
      
    }


}
