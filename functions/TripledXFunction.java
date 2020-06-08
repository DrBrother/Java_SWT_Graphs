package functions;

import com.model.Function;

public class TripledXFunction extends Function {
    public TripledXFunction(int topValue, int bottomValue, int aParam) {
        super(topValue, bottomValue, aParam);
    }

    @Override
    public double calculateY(double x) {
        return 3*x- 3;
    }
}
