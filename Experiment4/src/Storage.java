public interface Storage {
    public String create(Student[] student, Student createStudent, int count);

    public String findAll();

    public void findByStudentId(Student[] student, int count);

    public void findByStudentName(Student[] student, int count);

    public void update(Student[] student, Student updateStudent, int count);

    public void delete(Student[] student, Student deleteStudent, int count);
}
