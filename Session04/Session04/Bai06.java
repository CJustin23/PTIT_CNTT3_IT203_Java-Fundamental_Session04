import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai06 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";
        String[] blacklist = { "tệ", "ngu ngốc", "không đáng đọc" };
        String regex = "(?i)\\b(" + String.join("|", blacklist) + ")\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(review);
        StringBuffer filteredReview = new StringBuffer();

        while (matcher.find()) {
            String word = matcher.group();
            String stars = "*".repeat(word.length());
            matcher.appendReplacement(filteredReview, stars);
        }
        matcher.appendTail(filteredReview);
        String result = filteredReview.toString();
        if (result.length() > 200) {
            int cutIndex = result.lastIndexOf(" ", 200);
            if (cutIndex == -1) {
                cutIndex = 200;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(result.substring(0, cutIndex));
            sb.append("...");
            result = sb.toString();
        }

        System.out.println("Review sau khi xử lý: " + result);
    }
}