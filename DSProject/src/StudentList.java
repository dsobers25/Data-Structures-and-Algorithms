
public class StudentList {
	private Node h;
	public StudentList() {
		h = new Node();
		h.next = null;
		h.data = null;
	}
	
	public boolean insertStd(Student std) {
		Node n = new Node();
		n.data = std;
		n.next = h.next;
		h.next = n;
		return true;
	}
	
	public boolean haveRollno(String rollno) {
		Node a = h.next;
		boolean have = false;
		while(a != null) {
			if(rollno.contentEquals(a.data.getRoll_no())) {
				have = true;
			}
			a = a.next;
		}
		return have;
	}
	
	public Student fetchData(String rollno) {
		Student data = null;
		Node p = h.next;
		while(p != null) {
			if(p.data.getRoll_no().equals(rollno)) {
				data = p.data;
				break;
			}
			p = p.next;
		}
		return data;
	}
	
	public void deleteStudent(String rollno) {
		Node p = h;
		Node q = h.next;
		while(q!=null && !(q.data.getRoll_no().contentEquals(rollno))) {
			p=q;
			q = q.next;
		}
		if(q != null) {
			p.next = q.next;
		} else {
			// no data found
		}
	}
	
	public void showAll() {
		Node z = h.next;
		while(z != null) {
			System.out.println(z.data);
			z = z.next;
		}
	}
	
	class Node {
		private Student data;
		private Node next;
	}
}
