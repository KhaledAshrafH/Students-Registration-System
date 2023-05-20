import java.util.ArrayList;

public class Student {
    String name,id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    ArrayList<String> courses;
    Student(){
        name="";
        id="";
        courses=new ArrayList<>();
    }
    Student(String name,String id){
        this.name= name;
        this.id=id;
        courses=new ArrayList<>();
    }
}
