package weekone.weektwo;

import java.util.function.Predicate;

class Employee {
    //example 2  predicate interface


        String name;
        int age;
        int salary;

     public Employee(String sai, int i, int j) {
         name=sai;
         age=i;
         salary=j;
     }
 }


class demo{
     public static void main(String[] arg){
        Employee emp = new Employee("sai",45,443);
         Predicate<Employee> predicate = e->(e.age>2 && e.salary>20);
         System.out.println(predicate.test(emp));
     }
}
