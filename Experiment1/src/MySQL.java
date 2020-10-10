public class MySQL extends DataBase{
    public void registerMySQLDriver(){
        System.out.println("Register MySQL Driver!");
    }
    public void establishMySQLConnection(){
        System.out.println("Establish MySQL Connection!");
    }
    public void connect(){
        registerMySQLDriver();
        establishMySQLConnection();
        createExecuteStatements();
        executeStatement();
        processResults();
        freeResource();
    }
}
