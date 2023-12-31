
public class TestTT {

	public static void main(String[] args) {
		TinhToan tt  = new TinhToan();
//Them ly thuyet Exception try catch la gi, anh loi, anh try catch, ket qua khong bi
		//quang loi
		int kq = 0;
		/**try {
			kq = tt.tinhChia();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Ket qua chia: "+kq);**/
		
		int kq2 = tt.tinhNhan();
		System.out.println("Ket qua nhan: "+kq2);

	}

}
