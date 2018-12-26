package lesson12.Task2;

import java.io.*;

//

public class Cloner {
    public <T> T clone(T value) {
        T cloneValue;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (ObjectOutputStream objOut = new ObjectOutputStream(out)) {
            objOut.writeObject(value);
            byte[] objBytes = out.toByteArray();

            ByteArrayInputStream in = new ByteArrayInputStream(objBytes);
            ObjectInputStream objIn = new ObjectInputStream(in);
            cloneValue = (T) objIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new CloningException(e.getMessage());
        }
        return cloneValue;
    }
}
