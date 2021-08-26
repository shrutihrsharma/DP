package factory.ex1;

public class MySQLDB implements MyConnection{
    @Override
    public String getConnection() {
        return "MySQL DB Connected";

    }

    @Override
    public String getDBVersion() {

        return "MySQL 7.0.1";
    }
}
