public interface Storage {
    public void create();
    public void findAll();
    public void findByStudentId(Student[] student,int count);
    public void findByStudentName();
    public void update();
    public void delete();
}
