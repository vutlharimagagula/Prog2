/**
 *
 * @author Vutlharhi.
 */

public abstract class Consoles implements IConsoles {
    private String consoleType;
    private String storeName;
    private int totalSales;
    
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}