final class Student{
    private final String name;
    private final int id;
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
 class Test{
     public static void main(String[] args) {
         Student t1 = new Student("marco", 1);
         Student t2 = new Student("Mario",2);
         System.out.println(t1.getName());
         System.out.println(t2.getId());
     }
 }