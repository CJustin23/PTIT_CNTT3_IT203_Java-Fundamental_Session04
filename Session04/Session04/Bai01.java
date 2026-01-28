public class Bai01 {
    public static void main(String[] args) {
        String title = "   lập TRÌNH java   cơ bản   ";
        String author = "nguyễn   văn   a";
        title = title.trim();
        title = title.replaceAll("\\s+", " ");
        title = title.toUpperCase();

        author = author.trim();
        author = author.replaceAll("\\s+", " ");
        String[] words = author.split(" ");
        StringBuilder formattedAuthor = new StringBuilder();
        for (String word : words) {
            formattedAuthor.append(
                    word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " "
            );
        }
        author = formattedAuthor.toString().trim();

        System.out.println("[" + title + "] - Tác giả: " + author);
    }
}