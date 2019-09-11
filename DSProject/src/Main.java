
public class Main {
	
	public static void main(String[] args) {
		HashTable htable = new HashTable();
		
		Student s1 = new Student("umair", "15-123", 3.4);
		Student s2 = new Student("ali", "15-453", 3.1);
		Student s3 = new Student("uzair", "15-233", 3.2);
		Student s4 = new Student("awais", "15-321", 3.9);
		
		int s1key = htable.toHashCode(s1.getRoll_no());
		int s2key = htable.toHashCode(s2.getRoll_no());
		int s3key = htable.toHashCode(s3.getRoll_no());
		int s4key = htable.toHashCode(s4.getRoll_no());
		
		
		htable.insert(s1key, s1);
		htable.insert(s2key, s2);
		htable.insert(s3key, s3);
		htable.insert(s4key, s4);
		
		htable.deleteStd(s1.getRoll_no());
		
		htable.showData();
		
//		Student new_std2 = htable.fetchStdInfo(s2.getRoll_no());
//		if(new_std2.getName().equals(s2.getName())) {
//			System.out.println("Equal");
//		}
	
	}
}
