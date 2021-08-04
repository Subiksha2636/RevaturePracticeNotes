package com.subis.day2;

class Course1 implements Cloneable{
	private int CourseId;
	private String CourseName;
	private double Duration;
	double coursemark;
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public double getDuration() {
		return Duration;
	}
	public void setDuration(double duration) {
		Duration = duration;
	}
	Course1(){
		
		coursemark = 100;
		
		System.out.println("Super class" +coursemark);
	}
	Course1(int CourseId ,String CourseName, double Duration)
	{
		
		this.CourseId=CourseId;
		this.CourseName=CourseName;
		this.Duration=Duration;
	}
	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", CourseName=" + CourseName + ", Duration=" + Duration + "]";
	}
	
	
	
}


public class ObjClass {
	public static void main(String[] args) throws CloneNotSupportedException{
		Course1 nd = new Course1(1,"java",9.00);
		Course1 fd =new Course1();
		Course1 md = nd;
		System.out.println(nd);
		System.out.println(nd.equals(fd));
		System.out.println(nd.equals(md));
		System.out.println(md.equals(nd));
		
		System.out.println(md);
		//hashcode
		System.out.println(nd.hashCode() +"  "  +fd.hashCode()+"  "  + md.hashCode());
		//getclass
		System.out.println(nd.getClass());
		//clone
		Course1 fe = (Course1)fd.clone();
		System.out.println(fe);
		
		
	}

}
