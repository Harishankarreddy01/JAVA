package ClassesAndObjects;

/*1. Initializing Static Fields
  2. Initializing Instance Fields
*/

/*Initializing Static Fields:
 * ->Instance variables can be initialized in constructors, where error handling or other logic can be used. 
 * To provide the same capability for class variables, the Java programming language includes static initialization blocks.
 * 
 * ->A static initialization block is a normal block of code enclosed in braces, { }, and preceded by the static keyword. Here is an example:
        static {
            // whatever code is needed for initialization goes here
        }
    A class can have any number of static initialization blocks, and they can appear anywhere in the class body. 
    The runtime system guarantees that static initialization blocks are called in the order that they appear in the source code.

    ->There is an alternative to static blocks — you can write a private static method:

    class Whatever {
        public static varType myVar = initializeClassVariable();
            
        private static varType initializeClassVariable() {

            // initialization code goes here
        }
    }
    The advantage of private static methods is that they can be reused later if you need to reinitialize the class variable.

 */

 /*Initializing Instance Members
  * 2 alternatives to initialize an instance variable other than constructor: 1. Initializer blocks, 2. Final methods

->Initializer blocks for instance variables look just like static initializer blocks, but without the static keyword:

    {
        // whatever code is needed for initialization goes here
    }
    
    -> The Java compiler copies initializer blocks into every constructor. Therefore, this approach can be used to share a block of code between multiple constructors.

-> A final method cannot be overridden in a subclass. 
    Here is an example of using a final method for initializing an instance variable:

    class Whatever {
        private varType myVar = initializeInstanceVariable();
            
        protected final varType initializeInstanceVariable() {

            // initialization code goes here
        }
    }

    This is especially useful if subclasses might want to reuse the initialization method. The method is final because calling non-final methods during instance initialization can cause problems.

  */

  /*EXAMPLE FOR STATIC BLOCK AND PRIVATE-STATIC METHOD TO INITIALIZE CLASS VARIABLE.
   * class DatabaseManager {
    private static ConnectionPool connectionPool;

    // Static block to initialize the connection pool
    static {
        connectionPool = initializeConnectionPool();
    }

    // Private static method to initialize the connection pool
    private static ConnectionPool initializeConnectionPool() {
        ConnectionPool pool = new ConnectionPool();
        pool.setMaxConnections(10);
        pool.setDatabaseUrl("jdbc:mysql://localhost:3306/mydb");
        return pool;
    }

    // Method to get the shared connection pool
    public static ConnectionPool getConnectionPool() {
        return connectionPool;
    }
}

class ConnectionPool {
    private int maxConnections;
    private String databaseUrl;

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    @Override
    public String toString() {
        return "ConnectionPool [maxConnections=" + maxConnections + ", databaseUrl=" + databaseUrl + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        // Accessing the shared connection pool
        ConnectionPool pool1 = DatabaseManager.getConnectionPool();
        System.out.println(pool1);

        // All instances share the same connection pool
        ConnectionPool pool2 = DatabaseManager.getConnectionPool();
        System.out.println(pool2);
        
    }
}

   */