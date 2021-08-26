package factory.ex1;

public class OracleDB implements MyConnection{
    @Override
    public String getConnection() {
        return "Oracle DB COnnected";
    }

    @Override
    public String getDBVersion() {
        return "Oracle DB 11g";
    }
}
