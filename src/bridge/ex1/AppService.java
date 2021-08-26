package bridge.ex1;

public class AppService {
    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public String registerEmp(int id){
        String resp=dao.save(id);
        return resp;
    }
}
