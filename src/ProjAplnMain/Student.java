package ProjAplnMain;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Student {

		public String name, cls;
		private String StudId, libId;
		private int credits, roll, age;
		private char section;
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStudId() {
			return StudId;
		}

		public void setStudId(String StudId) {
			this.StudId = StudId;
		}

		public String getLibId() {
			return libId;
		}

		public void setLibId(String libId) {
			this.libId = libId;
		}

		public String getCls() {
			return cls;
		}

		public void setCls(String cls) {
			this.cls = cls;
		}

		public char getSection() {
			return section;
		}

		public void setSection(char section) {
			this.section = section;
		}
		
		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public int getCredits() {
			return credits;
		}

		public void setCredits(int credits) {
			this.credits = credits;
		}

		public Student(String name, String StudId, String libId, int roll, int credits, String cls, int age, char section) {
			super();
			this.name = name;
			this.StudId = StudId;
			this.libId = libId;
			this.roll = roll;
			this.credits = credits;
			this.cls = cls;
			this.age = age;
			this.section = section;
		}
		
		public Student() {
		}

		public String[] addStudent(String[] args) {
			System.out.println("Student_Id will be genrated automatically once we will feed students details.");
			System.out.println("Enter Name Of Student:");
			Scanner obj2 = new Scanner(System.in);
			setName(obj2.nextLine());
			System.out.println("Enter Student Class & Section");
			setCls(obj2.nextLine());
		    setSection(obj2.next().charAt(0));
		    System.out.println("Enter Student Age");
		    setAge(obj2.nextInt());
		    System.out.println("Enter Student Roll:");
		    setRoll(obj2.nextInt());
		    credits=500;
			System.out.println("Your By default credits is set to 500 units.");
			StudId=getStudent( name , cls, age, section);
			System.out.println("Your Generated Student Unique Id is:"+StudId);
			obj2.close();
			String[] addStudent1= {name,StudId,Integer.toString(credits),cls,Integer.toString(roll),Integer.toString(age),Character.toString(section)};
			return addStudent1;
		}
		
		private String getStudent(String name, String cls, int age, char section) {
			String letter = new String(name+cls+age+section);
			String StudI=getShuffleword(letter);
			return StudI;
		}

		private String getShuffleword(String letter) {
			String shuffle=letter;
			int wordSize=letter.length();
			int shuffleCount = 10;
			for(int i=0;i<shuffleCount;i++) {
				int post1= ThreadLocalRandom.current().nextInt(0,wordSize);
				int post2= ThreadLocalRandom.current().nextInt(0,wordSize);
				shuffle=swapCharacters(shuffle,post1,post2);
			}
			return shuffle;
		}

		private String swapCharacters(String shuffle, int post1, int post2) {
			char[] charArray=shuffle.toCharArray();
			char temp=charArray[post1];
			charArray[post1]=charArray[post2];
			charArray[post2]=temp;
			return new String(charArray);
		}

		public void speak() {
			System.out.println("Hello There! This is detail of Student: "+StudId+".");
			System.out.println("My name is "+name+".");
			System.out.println("My Lib_Id is "+libId+".");
			System.out.println("I am doing my study in Class:'"+cls+"' Section:'"+section+"'.");
			System.out.println("I am "+age+" years old.");
		}

		public void delStudent() {
			
			
		}

}
