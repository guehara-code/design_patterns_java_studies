
interface DbConnectionInterface {
    public int connect();
}

class MySqlConnection implements DbConnectionInterface {
    public int connect() {
        return 1;
    }
}

public class PasswordReminder {
    private DbConnectionInterface dbConnection;

    public PasswordReminder(DbConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}
