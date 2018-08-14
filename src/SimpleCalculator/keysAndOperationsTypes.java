package SimpleCalculator;

/**
 * Created by vmishra on 8/2/2018.
 */
public class keysAndOperationsTypes {

    private static operationType prevOperationType;
    private static keyType prevKeyType;

    public operationType getPreviousOperationType() {
        return prevOperationType;
    }

    public void setPreviousOperationType(operationType ot) {
        prevOperationType = ot;
    }

    public keyType getPrevKeyType() {
        return prevKeyType;
    }

    public void setPrevKeyType(keyType kt) {
        prevKeyType = kt;
    }


    enum operationType {
        SUM, MINUS, MULTIPLICATION, DIVIDE;
    }

    enum keyType {NUMERIC, NON_NUMERIC;}
}
