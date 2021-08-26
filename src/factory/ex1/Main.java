package factory.ex1;

public class Main {
    public static void main(String[] args) throws Exception{
       // MyConnection conn= new MySQLDB();
       // ConnFactory fac=new ConFactoryImpl();
        MyConnection conn=ConFactoryImpl2.getConnection("mysql");

        System.out.println(conn.getConnection());
        System.out.println(conn.getDBVersion());
    }
}
