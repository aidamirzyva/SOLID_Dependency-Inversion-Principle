package nosolid;

public class UserService {

    private MySQLDatabase database;

    public UserService() {
        this.database = new MySQLDatabase();
    }

    public void saveUser(String userData) {
        database.save(userData);
    }
}
