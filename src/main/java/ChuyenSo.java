public class ChuyenSo {
    public static String chuyenDoi(int so) {
        int[] giaTri = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] kyHieu = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        if (so <= 0 || so > 3999) {
            return "Không thể chuyển đổi";
        }

        StringBuilder ketQua = new StringBuilder();

        for (int i = 0; i < giaTri.length; i++) {
            while (so >= giaTri[i]) {
                ketQua.append(kyHieu[i]);
                so -= giaTri[i];

            }
        }
        return ketQua.toString();
    }

    public static void main(String[] args) {

        System.out.println(chuyenDoi(3999));
    }
}