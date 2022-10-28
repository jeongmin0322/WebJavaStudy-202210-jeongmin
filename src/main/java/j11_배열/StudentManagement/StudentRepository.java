package j11_배열.StudentManagement;

public class StudentRepository {
    private Student[] students; //학생들을 저장할 수 있는 배열

    public StudentRepository() {
        students = new Student[0];
    }

    public void addStudent(Student student)  {
        int index = indexOfEmpty(); //빈자리를 찾아서 index에 넣음

        if(index == -1){ //만약 공간이 없다면
             index = increaseArray(); //늘려줌
         }

        students[index] = student; //비어있는애한테 넣어줌
    }

    //배열공간확인, n번째 공간 비었다 이런거..
    private int indexOfEmpty(){
        for(int i=0; i< students.length; i++){
            if(students[i] == null){
                return i; //빈자리를 넘겨줌
            }
        }

        return -1; //비어있는 공간이 없다. //14번째로감
    }

    private int increaseArray(){ //공간 하나를 늘리기~~
        Student[] tempArray = new Student[students.length+1]; //임시temp라고 마니씀
        for(int i=0; i< students.length; i++){
            tempArray[i] = students[i];
        }
        students = tempArray;

        return students.length-1; //비어있는 인덱스 번호를 가리킴
    }
    public Student[] getStudents(){ //이 메소드를 통해서만 students를 바깥으로 데려갈수있음
        return students;

    }

    public int findStudentByName(String name) {
        for(int i=0; i< students.length; i++){
            if(students[i] != null){
                if(students[i].getName().equals(name)){
                    return i;
                }
            }
        }
        return -1;
    }
    public Student getStudent(int index) {
        return students[index];
    }

    public Student removeStudent(int index) {
        Student student = students[index];
        students[index] = null;
        return student;
    }

    public Student updateStudent(int index, Student updateStudent){
        Student student = students[index];
        student.updateStudent(updateStudent);
        return student;
    }
}


