import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Properties;

class Assign2 {
	public final static String[] Arguments = {"-cpu", "-dir", "-java", "-mem", "-os"};
	public static void main(String[] args) {
		for (String arg : args) {
			int index = Arrays.binarySearch(Arguments, arg);
			switch (index) {
				case 0:
					System.out.println("Processors \t: \t" + Runtime.getRuntime().availableProcessors());
					System.out.println();
					break;
				case 1:
					System.out.println("Working Directory \t:\t" + System.getProperty("user.dir"));
					System.out.println("User Home Directory \t:\t" + System.getProperty("user.home"));
					System.out.println();
					break;
				case 2:
					System.out.println("Java Vendor \t\t:\t" + System.getProperty("java.vendor"));
					System.out.println("Java Runtime \t\t:\t" + System.getProperty("java.runtime.name"));
					System.out.println("Java Version \t\t:\t" + System.getProperty("java.version"));
					System.out.println("Java VM Version \t:\t" + System.getProperty("java.vm.version"));
					System.out.println("Java VM Name \t\t:\t" + System.getProperty("java.vm.name"));
					System.out.println();
					break;
				case 3:
					System.out.println("Free Memory \t:\t"
							+ NumberFormat.getInstance(Locale.US).format(Runtime.getRuntime().freeMemory()));
					System.out.println("Total Memory \t:\t"
							+ NumberFormat.getInstance(Locale.US).format(Runtime.getRuntime().totalMemory()));
					System.out.println("Max Memory \t:\t"
							+ NumberFormat.getInstance(Locale.US).format(Runtime.getRuntime().maxMemory()));
					System.out.println();
					break;
				case 4:
					System.out.println("OS Name \t:\t" + System.getProperty("os.name"));
					System.out.println("OS Version \t:\t" + System.getProperty("os.version"));
					System.out.println();
					break;
				default:
					System.out.println(arg + " not a valid argument");
					System.out.println();
					break;
			}
		}
	}
}
