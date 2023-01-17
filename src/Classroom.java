/*public class Classroom
{
    private Student[] classRoster;

    public Classroom(int numStudents)
    {
        classRoster = new Student[numStudents];
    }

    {
        return classRoster;
    }

    public boolean addStudent(Student student){
        for(int i = 0; i < classRoster.length; i++){
            if(classRoster[i] == null){
                classRoster[i] = student;
                return true;
            }
        }
        return false;
    }

    public double classExamAverage() {
        int sum = 0;
        int counter = 0;
        for(Student child : classRoster){
            if(child != null){
                for(int grade : child.getExamScores()){
                    sum+= grade;
                    counter++;
                }
            }
        }
        return (double)sum / counter;
    }

    public void printRoster() {
        for(Student child : classRoster){
            if(child != null) System.out.println(child.getLast() + "," + child.getFirst());
        }
    }
}*/
