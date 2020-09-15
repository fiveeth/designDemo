package 结构型模式.享元模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyihua
 * @date 2020-07-24 10:09
 */
public class ConnectionPool {
    private List<Connection> connections = new ArrayList<>();

    {
        for (int i = 0; i <= 5; i++) {
            connections.add(new Connection());
        }
    }

    public Connection getConnection() {
        for (Connection connection : connections) {
            if (!connection.isAlive()) {
                connection.setAlive(true);
                return connection;
            }
        }
        return new Connection();
    }
}
