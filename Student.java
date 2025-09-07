public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private String index_no;

    public Student(String name, int age, String email, String index_no) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.index_no = index_no;
    }

    public Student(int id, String name, int age, String email, String index_no) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.index_no = index_no;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getIndex() { return index_no; }

    @Override
    public String toString() {
        return id + ": " + name + " (" + age + ") - " + email + " - " + index_no;
    }
}
