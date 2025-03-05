import java.io.File;

public class Test {
    public static void main(String[] args) {
  
        File[] roots = File.listRoots();
        System.out.println("------------------------------");
        if (roots != null) {
            for (File root : roots) {
                long totalSpace = root.getTotalSpace(); 
                long freeSpace = root.getFreeSpace(); 
                
                System.out.println("Device Path: " + root.getAbsolutePath());
                System.out.println("Total Capacity: " + formatSize(totalSpace));
                System.out.println("Unused Capacity: " + formatSize(freeSpace));
                System.out.println("------------------------------");
            }
        } else {
            System.out.println("No storage devices found.");
            System.out.println("------------------------------");
        }
    }
    
    public static String formatSize(long size) {
        String[] units = {"B", "KB", "MB", "GB", "TB"};
        int unitIndex = 0;
        
        while (size >= 1024 && unitIndex < units.length - 1) {
            size /= 1024;
            unitIndex++;
        }
    
        return String.format("%.2f %s", (double) size, units[unitIndex]);
    }
}
