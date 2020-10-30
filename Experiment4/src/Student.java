public class Student {
    private int no;
    private String name;
    private String gender;
    private String studentId;
    private String mobilePhoneNumber;
    private String memo;
    private Storage storage;

    public Student(){
        setStorage(new TextFile());
    }
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Storage getStorage() {
        return this.storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void createInfo() {
        getStorage().create();      //返回此storage对象，并调用接口中的create()方法
        System.out.println("createTest");
    }
    public void findAllInfo(){

    }
    public void findByStudentIdInfo(Student[] student, int count){
        getStorage().findByStudentId(student,count);      //返回此storage对象，并调用接口中的findByStudentId(student)方法
    }
    public void findByStudentNameInfo(){
        getStorage().findByStudentName();   //返回此storage对象，并调用接口中的findByStudentName()方法
    }
}
