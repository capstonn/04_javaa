package v20250423.ch12.sec03.exam02;

public class Student {
    private String name;
    private int no;

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public int getNo() { return no;}

    public String getName() { return name;}

    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student target) {
            if(no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
        }
        return false;
    }
}