package factory.ex1;

public class ConFactoryImpl /*implements ConnFactory*/{
    //@Override
    public static MyConnection getConnection(String dbType) {

        if(dbType.equals("oracle")){
            return new OracleDB();
        }else if(dbType.equals("mysql")){
            return new MySQLDB();
        }else {
            throw new RuntimeException("db not supported");
        }
    }
}
