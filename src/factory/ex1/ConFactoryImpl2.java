package factory.ex1;

public class ConFactoryImpl2{

    public static MyConnection getConnection(String dbType) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        String db_string="";
        return (MyConnection)Class.forName("factory.ex1.OracleDB").newInstance();
    }
}
