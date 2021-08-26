package factory.ex1;

public interface ConnFactory {

    public MyConnection getConnection(String dbType);
}
