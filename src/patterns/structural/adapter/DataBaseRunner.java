package patterns.structural.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {

        DataBase dataBase = new JavaApplicationToDataBaseAdapter();
        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.delete();
    }
}
