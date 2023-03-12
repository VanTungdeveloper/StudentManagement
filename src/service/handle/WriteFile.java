package service.handle;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteFile {
    public static void writeListStudentToFile(List students) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("test/students.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(students);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
