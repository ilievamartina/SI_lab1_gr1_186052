import java.util.List;
import java.util.ArrayList;
class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer>labPoints=new ArrayList<>();

	//TODO constructor

	public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	//TODO seters & getters


	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public double getAverage() {
		//TODO
		double average = 0;
		for(Integer points : labPoints)
		{
			average += points;
		}
		return average/labPoints.size();
	}

	public boolean hasSignature() {
		//TODO
		if(labPoints.size() > 8)
		{
			return true;
		}
		return false;
	}
}
class Course {

    List<Student>studentsList=new ArrayList<>();


    public Course(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }
    public int signatures()//broj na potpisi
    {
        int total=0;
        for(Student t:studentsList)
        {
            if(t.hasSignature())
            {
                total +=1;
            }
        }
        return total;
    }
}
