import java.util.HashMap;
import java.util.Map;

public class ChuyenLaMa {
    public static int chuyenLaMaSangSo(String chuoiLaMa) {
        Map<Character, Integer> bangLaMa = new HashMap<>();
        bangLaMa.put('I', 1);
        bangLaMa.put('V', 5);
        bangLaMa.put('X', 10);
        bangLaMa.put('L', 50);
        bangLaMa.put('C', 100);
        bangLaMa.put('D', 500);
        bangLaMa.put('M', 1000);

        int ketQua = 0;
        int giaTriTruocDo = 0;

        for (int i = chuoiLaMa.length() - 1; i >= 0; i--) {
            int giaTriHienTai = bangLaMa.get(chuoiLaMa.charAt(i));

            if (giaTriHienTai < giaTriTruocDo) {
                ketQua -= giaTriHienTai;
            } else {
                ketQua += giaTriHienTai;
            }

             giaTriTruocDo = giaTriHienTai;
        }

        return ketQua;
    }

    public static void main(String[] args) {

        System.out.println(chuyenLaMaSangSo("IV"));
        System.out.println(chuyenLaMaSangSo("XCLV"));
        System.out.println(chuyenLaMaSangSo("MCC"));
    }
}