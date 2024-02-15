// Array to store objects

class student
{
    String name;
    int rollno;
}

public class objarr
{
    public static void main(String... args)
    {
        student obj = new student();
        student obj1 = new student();

        obj.name = "Rahul Pandey";
        obj.rollno = 17;

        obj1.name = "Krijan Thapa";
        obj1.rollno = 7;

        student[] info = new student[2];
        info[0] = obj;
        info[1] = obj1;

        for(int i = 0 ; i < info.length ; i++)
        {
            System.out.println(info[i].name + " " + info[i].rollno);
        }
    }
}