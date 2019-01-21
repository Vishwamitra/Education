package SimpleCalculator;


public class functions extends keysAndOperationsTypes {


    private float sum(float a, float b) {
        float answer;
        answer = a + b;
        return answer;
    }

    private float minus(float a, float b) {
        float answer;
        answer = a - b;
        return answer;
    }

    private float multiply(float a, float b) {
        float answer;
        answer = a * b;
        return answer;
    }

    private float divide(float a, float b) {
        float answer;
        answer = a / b;
        return answer;
    }

    public float callOperation(operationType ot, float a, float b) {

        switch (ot) {
            case MINUS:
                return minus(a, b);
            case SUM:
                return sum(a, b);
            case MULTIPLICATION:
                return multiply(a, b);
            case DIVIDE:
                return divide(a, b);
        }
        return 0;
    }
}
