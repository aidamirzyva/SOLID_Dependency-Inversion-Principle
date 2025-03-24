package solid;

public class Application {
    public static void main(String[] args) {
        Database mysql = new MySQLDatabase();
        Database mongo = new MongoDatabase();

        UserService userServiceWithMySQL = new UserService(mysql);
        userServiceWithMySQL.saveUser("John Doe");

        UserService userServiceWithMongo = new UserService(mongo);
        userServiceWithMongo.saveUser("Jane Doe");
    }
}
