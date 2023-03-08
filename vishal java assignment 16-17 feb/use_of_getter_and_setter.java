//Program to demonstrate the use of getter and setter methods in Java.



public class use_of_getter_and_setter
{
    private int salary;

    void setSalary(int s)
    {
        if(s < 0 )
        {
            s = -s;
        }

        this.salary = s;
    }


    int getSalary()
    {
        return this.salary;
    }

    public storeSalaryDB(int salary)
    {
         System.out.println("The ")
    }

    public static void main(String args[])
    {
        use_of_getter_and_setter obj = new use_of_getter_and_setter();

      obj.setSalary(-50000);

      int salary = obj.getSalary();

      obj.storeSalaryDB(salary);

    }
}