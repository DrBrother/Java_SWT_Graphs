import view.MainWindow;
//import com.company.model.functions.TripledXFunction;
//import com.company.view.MainWindow;
import functions.TripledXFunction;


public class Main {
    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        TripledXFunction first = new TripledXFunction(10,-10, 2);
        window.chartField.addChart(
                "3X-3", first.getXes(),
                first.getYes());
        window.run();
    }
}
