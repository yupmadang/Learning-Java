public class Student {
    String name;
    String stdId;

    public Student(String stdId, String name){
        this.stdId = stdId;
        this.name = name;
    }

    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student std = (Student)obj;
            if(this.stdId == std.stdId){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
		return Integer.parseInt(stdId);
	}

    public String toString(){
        return stdId+":"+name;
    }
}
