package mathOperation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Addition implements MathOperation {
    public double oparate(double x, double y) {
        return x + y;
    }
}
