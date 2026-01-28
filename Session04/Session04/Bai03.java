import java.time.LocalDate;

public class Bai03 {
    public static void main(String[] args) {
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        long startSB = System.nanoTime();

        StringBuilder report = new StringBuilder();
        report.append("BÁO CÁO MƯỢN SÁCH\n");
        report.append("Ngày tạo: ").append(LocalDate.now()).append("\n");
        for (String t : transactions) {
            report.append("Giao dịch: ").append(t).append("\n");
        }
        long endSB = System.nanoTime();
        long timeSB = endSB - startSB;
        long startStr = System.nanoTime();
        String reportStr = "";
        reportStr += "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportStr += "Ngày tạo: " + LocalDate.now() + "\n";
        for (String t : transactions) {
            reportStr += "Giao dịch: " + t + "\n";
        }
        long endStr = System.nanoTime();
        long timeStr = endStr - startStr;

        System.out.println(report.toString());
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + timeSB);
        System.out.println("Số thời gian thực thi đối với String: " + timeStr);
    }
}