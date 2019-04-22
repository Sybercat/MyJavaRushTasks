package com.javarush.task.task20.task2022;


import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public Solution() throws FileNotFoundException {
        stream = new FileOutputStream(fileName);

    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        //out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);

        //in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Solution solution = new Solution();
        solution.writeObject("Shalom!\\r\\n");
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("/Users/aleks/Desktop/1.obj"));
        oos.writeObject(solution);

        ObjectInputStream ois = new ObjectInputStream((new FileInputStream("/Users/aleks/Desktop/1.obj")));
        Solution solution2 = (Solution) ois.readObject();
        solution2.writeObject("Shalom again!");


    }
}
