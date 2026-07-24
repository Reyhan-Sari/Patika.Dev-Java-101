public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	int verbalNote;
	double verbalEffectRate;
	
	Course(String name, String code, String prefix, Double verbalEffectRate){
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.verbalNote = 0;
		this.verbalEffectRate = verbalEffectRate;
	}
	
	void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
			
		}else {
			System.out.println("Öğretmen Ve Ders Bölümleri Uyuşmuyor");
		}
		this.teacher = teacher;
		
	}
	
	void printTeacher() {
		this.teacher.print();
	}
	
	void addVerbalNote() {
		if (verbalNote >= 0 && verbalNote <= 100) {
			this.verbalNote = verbalNote;
		}
	}
	
	double calculateAverage() {
		return (verbalNote * verbalEffectRate)+(note*(1-verbalEffectRate));
	}
	
}
