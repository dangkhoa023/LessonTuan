package baitaptuan1;

public class ReverseWords {
    public static String reverseWords(String sentence) {
        // Tách câu thành các từ bằng dấu cách làm delimiter
        String[] words = sentence.split( " ");

        // Khởi tạo một chuỗi rỗng để chứa câu đã đảo ngược
        String reversedSentence = "";

        // Lặp qua mảng các từ theo thứ tự ngược lại
        for (int i = words.length - 1; i >= 0; i--) {
            // Nối từng từ vào chuỗi đã đảo ngược, cách nhau bởi dấu cách
            reversedSentence += words[i];

            // Nếu từ hiện tại không phải là từ cuối cùng, thêm một dấu cách
            if (i > 0) {
                reversedSentence += " ";
            }
        }

        return reversedSentence;
    }

    public static void main(String[] args) {
        String input1 = "reverse this word";
        String input2 = "Hello world, how are you?";

        String output1 = reverseWords(input1);
        String output2 = reverseWords(input2);

        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + output1);

        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + output2);
    }
}
