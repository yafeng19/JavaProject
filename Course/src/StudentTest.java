import java.util.Date;

class Student{
    private String name;
    private char sex;
    private String nativePlace;
    private String major;
    private Date birth;
    private String address;

    public Student(){
        //System.out.println("对象生成成功！");
    }
    public Student(String name){
        this();
        this.name = name;
    }
    public Student(String name, char sex){
        this(name);
        this.sex = sex;
    }
    public Student(String name, char sex, String nativePlace){
        this(name, sex);
        this.nativePlace = nativePlace;
    }
    public Student(String name, char sex, String nativePlace, String major, Date birth, String address){
        /*
        this.name = name;
        this.sex = sex;
        this.nativePlace = nativePlace;
        */
        this(name, sex, nativePlace);
        this.major = major;
        this.birth = birth;
        this.address = address;
        this.toString1();
    }

    public void toString1() {
        System.out.print(
                "name='" + name + '\'' +
                        ", sex=" + sex +
                        ", nativePlace='" + nativePlace + '\'' +
                        ", major='" + major + '\'' +
                        ", birth=" + birth +
                        ", address='" + address + '\'' );
    }
}
public class StudentTest {
    public static void main(String args[]){
/*
        stu.setName("张三");
        stu.setSex('m');
        stu.setNativePlace("山东省威海市");
        stu.setMajor("软件工程");
        stu.setBirth(new Date(946656000000L));
        stu.setAddress("北京市");
        stu.toString1();
*/
        Student stu1 = new Student("张三",'m',"山东省威海市","软件工程",new Date(946656000000L),"北京市");
        Student stu2 = stu1;
    }
}




/*
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getNativePlace() {
        return nativePlace;
    }
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void readingBook(){
        System.out.println("reading book");
    }
    public void experiment(){
        System.out.println("experiment");
    }
    public void attendClass(){
        System.out.println("attend class");
    }
    public void doExercise(){
        System.out.println("do exercise");
    }
*/