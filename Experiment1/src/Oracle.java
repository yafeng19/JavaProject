public class Oracle extends DataBase{
    public void registerOracleDriver(){
        System.out.println("Register Oracle Driver!");
    }
    public void establishOracleConnection(){
        System.out.println("Establish Oracle Connection!");
    }
    public void connect(){
        registerOracleDriver();
        establishOracleConnection();
        createExecuteStatements();
        executeStatement();
        processResults();
        freeResource();
    }
}
