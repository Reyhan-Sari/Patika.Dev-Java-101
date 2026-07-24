public class Main {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "234");
		Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
		Teacher t3 = new Teacher("Külyutmaz", "BIO", "1111");
		
		Course tarih = new Course("Tarih", "101", "TRH",0.30);
		tarih.addTeacher(t1);
		
		Course fizik = new Course("Fizik", "102", "FZK",0.20);
		fizik.addTeacher(t2);
		
		Course biyo = new Course("Biyoloji", "101", "BIO",0.25);
		biyo.addTeacher(t3);
		
		Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
		s1.addBulkExamNote(100, 78, 50);
		s1.addBulkExamNote(90, 80, 70);
		s1.isPass();
		
		Student s2 = new Student("Güdük Necmi", "444", "4", tarih, fizik, biyo);
		s2.addBulkExamNote(50, 30, 70);
		s2.addBulkExamNote(60, 50, 80);
		s2.isPass();
	}
}
