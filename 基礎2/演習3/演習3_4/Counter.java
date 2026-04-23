package 基礎2.演習3.演習3_4;

public class Counter {
    int id;
    static int totalCount;
    public Counter() {
        totalCount++;
        id = totalCount;
    }

    public void showInfo() {
        System.out.println("カウンターID: " + id);
    }

    public void showTotalCount() {
        System.out.println("総カウンター数: " + totalCount);
    }
    
}
