public class Client {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First set of data: \nMyra\nLucy\n");

        System.out.println(fileWriter + "\n\n");

        // lets save the file
        caretaker.save(fileWriter);

        // now write something else
        fileWriter.write("Second set of data: \nJason\n");

        // checking file contents
        System.out.println(fileWriter + "\n\n");

        // lets undo to last save
        caretaker.undo(fileWriter);

        // checking file contents
        System.out.println(fileWriter + "\n\n");
    }
}
