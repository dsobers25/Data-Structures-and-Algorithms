
public class HashTable {
	private StudentList[] arr;
	private int size;
	private int totalstudent;
	
	public HashTable() {
		size = 1000;
		arr = new StudentList[size];
	}
	
	public int toHashCode(String rollno) {
		int addasciis = 0;
		int codevalue = 0;
		for(int i = 0; i < rollno.length(); i++) {
			addasciis = addasciis + (int) rollno.charAt(i);
		}
		codevalue = addasciis % arr.length;
		return codevalue;
	}
	
	public boolean insert(int key, Student data) {
		if(arr[key] == null) {
			arr[key] = new StudentList();
		}
		arr[key].insertStd(data);
		totalstudent++;
		return true;
	}

	public int getTotal() {
		return totalstudent;
	}
	
	public Student fetchStdInfo(String rollno) {
		int key = toHashCode(rollno);
		if(arr[key] == null) {
			return null;
		} else {
			Student q = arr[key].fetchData(rollno);
			if(q != null) {
				return q;
			} else {
				return null;
			}
		}
	}
	
	public boolean deleteStd(String rollno) {
		boolean have = arr[toHashCode(rollno)].haveRollno(rollno);
		if(have) {
			int key = toHashCode(rollno);
			arr[key].deleteStudent(rollno);
			totalstudent--;
			return true;
		}
		return false;
	}
	
	public void showData() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				arr[i].showAll();
			}
		}
	}
	
	
}
