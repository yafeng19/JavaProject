public class StudentList {
    private Storage storage;
    private Student[] student;

    public StudentList() {
        setStorage(new TextFile());
    }
    public Storage getStorage() {
        return this.storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public String createInfo(Student [] student,Student createStudent,int count) {
        return getStorage().create(student,createStudent,count);      //返回此storage对象，并调用接口中的create()方法，返回操作结果
    }

    public void findAllInfo() {
        getStorage().findAll();     //返回此storage对象，并调用接口中的findAll()方法
    }

    public void findByStudentIdInfo(Student[] student, int count) {
        getStorage().findByStudentId(student, count);      //返回此storage对象，并调用接口中的findByStudentId(student,count)方法
    }

    public void findByStudentNameInfo(Student[] student, int count) {
        getStorage().findByStudentName(student, count);   //返回此storage对象，并调用接口中的findByStudentName(student,count)方法
    }

    public void updateInfo(Student[] student, Student updateStudent, int count) {
        getStorage().update(student, updateStudent, count);  //返回此storage对象，并调用接口中的update(student,updateStudent,count)方法
    }

    public void deleteInfo(Student[] student, Student deleteStudent, int count) {
        getStorage().delete(student, deleteStudent, count);  //返回此storage对象，并调用接口中的delete(student,deleteStudent,count)方法
    }
}
