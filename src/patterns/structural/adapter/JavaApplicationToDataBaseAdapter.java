package patterns.structural.adapter;

public class JavaApplicationToDataBaseAdapter extends JavaApplication implements DataBase {

    @Override
    public void insert() {
        insertObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
