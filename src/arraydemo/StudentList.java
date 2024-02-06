
package arraydemo;

/**
 *
 * @author sartaj
 */
public class StudentList {
    public static void main(String[]args){
        Student s1 =new Student(1,"sartaj");
        Student[] list=new Student[3];
        list[0]=s1;
        list[1]=new Student(2,"anshu");
        list[2]= new Student(3,"gavy");
        for(int i=0;i<3;i++){
            System.out.println(list[i].getName());
        }
    }
}
